package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.authentication.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;

public interface AuthCallback {
    void requestAuthSuccess(AuthenticationRequest authenticationRequest);
    void requestAuthFailed(ResponseAPI errorResponseAPI);
}
