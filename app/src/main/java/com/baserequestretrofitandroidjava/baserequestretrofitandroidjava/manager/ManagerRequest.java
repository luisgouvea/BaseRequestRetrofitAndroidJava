package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.manager;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthCallback;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthRequest;

public class ManagerRequest {

    private AuthRequest authRequest;

    public ManagerRequest() {
    }

    public void authRequest(AuthCallback callback, String password, String email) {
        this.authRequest = new AuthRequest(callback);
        authRequest.authRequest(password, email);
    }
}
