package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.add;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.singleSale.SingleSale;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.InitialRetrofit;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.RequestBase;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit.RequestBaseInterface;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.SingleSaleMethodsInterface;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.util.LibraryUtil;

import retrofit2.Call;
import retrofit2.Response;

public class SingleSaleAddRequest extends RequestBase implements RequestBaseInterface {
    private SingleSaleAddCallback singleSaleAddCallbackReceive;
    private SingleSale singleSale;

    public SingleSaleAddRequest(SingleSaleAddCallback singleSaleAddCallback) {
        this.singleSaleAddCallbackReceive = singleSaleAddCallback;
    }

    public void addSingleSale(double amount, int status) {
        createObject(amount, status);
        this.requestDoInBackground();
    }

    private void createObject(double amount, int status) {
        singleSale = new SingleSale();
        if (LibraryUtil.doubleIsNull(amount)) {
            singleSale.amount = amount;
        }

        if (LibraryUtil.intIsNull(status)) {
            singleSale.status = status;
        }
    }

    @Override
    public void requestDoInBackground() {
        SingleSaleMethodsInterface singleSaleMethodsInterface = InitialRetrofit.getRetrofitFeature().create(SingleSaleMethodsInterface.class);
        Call<ResponseAPI> call = singleSaleMethodsInterface.addSingleSale(singleSale);
        executeRequestBase(call, this);
    }

    @Override
    public void requestPostExecute(Call<ResponseAPI> call, Response<ResponseAPI> responseRetrofit, Throwable t) {
        Object object = LibraryUtil.parseResponseAPI(responseRetrofit, SingleSale.class); // Response API ou SingleSale
        if (LibraryUtil.checkTypeResponseAPI(object)) {
            SingleSale singleSaleAdd = LibraryUtil.parseObjectToOtherObject(object, SingleSale.class);
            singleSaleAddCallbackReceive.requestSingleSaleAddSuccess(singleSaleAdd);
        } else {
            ResponseAPI responseAPI = LibraryUtil.parseObjectToOtherObject(object, ResponseAPI.class);
            singleSaleAddCallbackReceive.requestSingleSaleAddFailed(responseAPI);
        }
    }
}