package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.manager.RequestManager;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.singleSale.SingleSale;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.add.SingleSaleAddCallback;

public class RequestClient extends RequestManager implements SingleSaleAddCallback {

    private SingleSaleAddCallback singleSaleAddCallback = this;

    public RequestClient() {

    }

    public void execute() {
        addSingleSale(singleSaleAddCallback, 12.3, 2);
    }

    @Override
    public void requestSingleSaleAddSuccess(SingleSale authenticationRequest) {

    }

    @Override
    public void requestSingleSaleAddFailed(ResponseAPI errorResponseAPI) {

    }
}
