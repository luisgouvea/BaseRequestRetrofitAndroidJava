package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.manager;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthCallback;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.add.SingleSaleAddCallback;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.add.SingleSaleAddRequest;

public class RequestManager {

    private AuthRequest authRequest;
    private SingleSaleAddRequest singleSaleAddRequest;

    public RequestManager() {
    }

    public void authRequest(AuthCallback callback, String password, String email) {
        this.authRequest = new AuthRequest(callback);
        authRequest.authRequest(password, email);
    }

    public void addSingleSale(SingleSaleAddCallback callback, double amount, int status) {
        this.singleSaleAddRequest = new SingleSaleAddRequest(callback);
        singleSaleAddRequest.addSingleSale(amount, status);
    }
}
