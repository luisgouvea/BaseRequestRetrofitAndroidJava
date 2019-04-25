package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.manager.ManagerRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthCallback;

public class MainActivity extends AppCompatActivity implements AuthCallback {

    /* == CALLBACKS == */
    AuthCallback authCallback = this;
    ManagerRequest managerRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestListUser();
    }

    public void requestListUser() {
        managerRequest = new ManagerRequest();
        managerRequest.authRequest(authCallback, "fdsf","343434");
    }


    @Override
    public void requestAuthSuccess(AuthenticationRequest authenticationRequest) {

    }

    @Override
    public void requestAuthFailed(ResponseAPI errorResponseAPI) {

    }
}
