package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.manager.RequestManager;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.authentication.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.singleSale.SingleSale;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication.AuthCallback;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.singleSale.add.SingleSaleAddCallback;

public class MainActivity extends AppCompatActivity implements AuthCallback, SingleSaleAddCallback {

    RequestManager requestManager;

    /* == CALLBACKS == */
    AuthCallback authCallback = this;
    SingleSaleAddCallback singleSaleAddCallback = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestManager = new RequestManager();
        requestListUser();
        requestAddSingleSale();
    }

    public void requestListUser() {
        requestManager.authRequest(authCallback, "12345","algumacoisa@ig.com.br");
    }

    public void requestAddSingleSale() {
        requestManager.addSingleSale(singleSaleAddCallback, 12.44,1);
    }


    /*
    Autenticar usuario
     */
    @Override
    public void requestAuthSuccess(AuthenticationRequest authenticationRequest) {

    }

    @Override
    public void requestAuthFailed(ResponseAPI errorResponseAPI) {

    }


    /*
    Adicionar Cobranca avulsa
     */
    @Override
    public void requestSingleSaleAddSuccess(SingleSale authenticationRequest) {

    }

    @Override
    public void requestSingleSaleAddFailed(ResponseAPI errorResponseAPI) {

    }
}
