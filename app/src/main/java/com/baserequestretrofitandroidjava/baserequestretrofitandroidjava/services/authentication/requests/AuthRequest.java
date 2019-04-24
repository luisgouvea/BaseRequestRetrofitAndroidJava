package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.requests;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.RequestBaseInterface;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.RequestBase;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.InitialRetrofit;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthMethodsInterface;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.util.LibraryUtil;

import retrofit2.Call;
import retrofit2.Response;

public class AuthRequest extends RequestBase implements RequestBaseInterface {
    private AuthCallback authCallbackReceive;
    private AuthenticationRequest authenticationRequest;

    public AuthRequest(AuthCallback authCallback) {
        this.authCallbackReceive = authCallback;
    }

    public void authRequest(AuthenticationRequest authenticationRequest) {
        this.authenticationRequest = authenticationRequest;
        this.requestDoInBackground();
    }

    @Override
    public void requestDoInBackground() {
        AuthMethodsInterface authMethodsInterface = InitialRetrofit.getRetrofit().create(AuthMethodsInterface.class);
        Call<ResponseAPI> call = authMethodsInterface.authenticate(authenticationRequest);
        executeRequestBase(call, this);
    }

    @Override
    public void requestPostExecute(Call<ResponseAPI> call, Response<ResponseAPI> response, Throwable t) {
        if (response == null) {
            authCallbackReceive.requestAuthFailed(null);
        } else if (response.code() == 200) {
            ResponseAPI responseAPI = LibraryUtil.parseResponseAPI(response);
            if (LibraryUtil.hasErrorResponseAPI(responseAPI) == false) {
                AuthenticationRequest authenticationRequest = LibraryUtil.parseResponseAPIToObject(responseAPI, AuthenticationRequest.class);
                authCallbackReceive.requestAuthSuccess(authenticationRequest);
            } else {
                authCallbackReceive.requestAuthFailed(responseAPI);
            }
        } else {

        }
    }
}
