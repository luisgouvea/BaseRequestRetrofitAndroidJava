package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.retrofit;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;

import retrofit2.Call;

public interface RequestBaseInterface {
    void requestDoInBackground();
    void requestPostExecute(Call<ResponseAPI> call, retrofit2.Response<ResponseAPI> response, Throwable t);
}
