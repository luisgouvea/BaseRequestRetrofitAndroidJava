package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.authentication.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.RequestBaseInterface;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.RequestBase;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.InitialRetrofit;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.util.LibraryUtil;

import retrofit2.Call;
import retrofit2.Response;

public class AuthRequest extends RequestBase implements RequestBaseInterface {
    private AuthCallback authCallbackReceive;
    private AuthenticationRequest authenticationRequest;

    public AuthRequest(AuthCallback authCallback) {
        this.authCallbackReceive = authCallback;
    }

    public void authRequest(String password, String email) {
        createObject(password, email);
        this.requestDoInBackground();
    }

    private void createObject(String password, String email) {
        authenticationRequest = new AuthenticationRequest();
        if (LibraryUtil.stringIsNull(password)) {
            authenticationRequest.password = password;
        }

        if (LibraryUtil.stringIsNull(email)) {
            authenticationRequest.email = email;
        }
    }

    @Override
    public void requestDoInBackground() {
        AuthMethodsInterface authMethodsInterface = InitialRetrofit.getRetrofitAuth().create(AuthMethodsInterface.class);
        Call<ResponseAPI> call = authMethodsInterface.authenticate(authenticationRequest);
        executeRequestBase(call, this);
    }

    @Override
    public void requestPostExecute(Call<ResponseAPI> call, Response<ResponseAPI> responseRetrofit, Throwable t) {
        Object object = LibraryUtil.parseResponseAPI(responseRetrofit, AuthenticationRequest.class); // Response API ou AuthenticationRequest
        if (LibraryUtil.checkTypeResponseAPI(object)) {
            AuthenticationRequest auth = LibraryUtil.parseObjectToOtherObject(object, AuthenticationRequest.class);
            authCallbackReceive.requestAuthSuccess(auth);
        } else {
            ResponseAPI responseAPI = LibraryUtil.parseObjectToOtherObject(object, ResponseAPI.class);
            authCallbackReceive.requestAuthFailed(responseAPI);
        }
    }
}
