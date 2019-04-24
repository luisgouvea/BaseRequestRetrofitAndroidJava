package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.requests;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;

public interface AuthCallback {
    void requestAuthSuccess(AuthenticationRequest authenticationRequest);
    void requestAuthFailed(ResponseAPI errorResponseAPI);
}
