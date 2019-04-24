package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models;

public class AuthenticationRequest {
    public String Email;
    public String Password;
    public String Fingerprint;
    public String Device;
    public String IPAddress;
    public String FirebaseToken;
    public DeviceType DeviceType;

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setFingerprint(String fingerprint) {
        Fingerprint = fingerprint;
    }

    public void setDevice(String device) {
        Device = device;
    }

    public void setFirebaseToken(String firebaseToken) {
        FirebaseToken = firebaseToken;
    }

    public void setDeviceType(DeviceType deviceType) {
        DeviceType = deviceType;
    }


    public String getEmail() {
        return Email;
    }
    public DeviceType getDeviceType() {
        return DeviceType;
    }
}
