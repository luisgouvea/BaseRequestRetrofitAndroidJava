package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.authentication;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.AuthenticationRequest;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.services.ServicesURL;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthMethodsInterface {

    //@POST("/api/Usuario/ListAllUsuarioAddAtivVincExecutor")
    @POST(ServicesURL.BASE_URL)
    Call<ResponseAPI> authenticate(@Body AuthenticationRequest authenticationRequest);
}