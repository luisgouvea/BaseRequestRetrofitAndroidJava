package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.authentication;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.DeviceType;

public class AuthenticationRequest {
    public String email;
    public String password;
    public String fingerprint;
    public String device;
    public String firebaseToken;
    public DeviceType deviceType;

    public void setEmail(String email) {
        email = email;
    }

    public void setPassword(String password) {
        password = password;
    }

    public void setFingerprint(String fingerprint) {
        fingerprint = fingerprint;
    }

    public void setDevice(String device) {
        device = device;
    }

    public void setFirebaseToken(String firebaseToken) {
        firebaseToken = firebaseToken;
    }

    public void setDeviceType(DeviceType deviceType) {
        deviceType = deviceType;
    }


    public String getEmail() {
        return email;
    }
    public DeviceType getDeviceType() {
        return deviceType;
    }
}
