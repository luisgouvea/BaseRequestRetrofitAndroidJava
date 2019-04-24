package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.requests.AuthCallback;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.requests.AuthRequest;

public class MainActivity extends AppCompatActivity implements AuthCallback {

    /* == CALLBACKS == */
    AuthCallback authCallback = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestListUser();
    }

    public void requestListUser() {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest();
        authenticationRequest.Password = "fff";
        AuthRequest authRequest = new AuthRequest(authCallback);
        authRequest.authRequest(authenticationRequest);
    }


    @Override
    public void requestAuthSuccess(AuthenticationRequest authenticationRequest) {

    }

    @Override
    public void requestAuthFailed(ResponseAPI errorResponseAPI) {

    }
}
