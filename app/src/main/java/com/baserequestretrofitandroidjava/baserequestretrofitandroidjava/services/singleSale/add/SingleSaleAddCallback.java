package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.add;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.singleSale.SingleSale;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;

public interface SingleSaleAddCallback {
    void requestSingleSaleAddSuccess(SingleSale authenticationRequest);
    void requestSingleSaleAddFailed(ResponseAPI errorResponseAPI);
}
