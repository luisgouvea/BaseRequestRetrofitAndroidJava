package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.singleSale.SingleSale;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.ServicesURL;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SingleSaleMethodsInterface {
    @POST(ServicesURL.SINGLE_SALE_ADD)
    Call<ResponseAPI> addSingleSale(@Body SingleSale singleSale);
}
