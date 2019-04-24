package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.util;

import com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util.ResponseAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.Primitives;

import java.lang.reflect.Type;

import retrofit2.Response;

public class LibraryUtil {

//    public static <T> T parseResponseAPI(Response<ResponseAPI> rawResponse, Class<T> classToParse) {
//
//        ResponseAPI responseAPI = rawResponse.body();
//        Gson gSerializer = new GsonBuilder()
//                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
//
//        String json = gSerializer.toJson(responseAPI.getResponseDetail());
//
//        Object object = gSerializer.fromJson(json, (Type) classToParse);
//
//        return Primitives.wrap(classToParse).cast(object);
//    }

    public static <T> T parseResponseAPIToObject(ResponseAPI responseAPI, Class<T> classToParse){

        Gson gSerializer = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();


        String json = gSerializer.toJson(responseAPI);

        Object object = gSerializer.fromJson(json, (Type) classToParse);

        return Primitives.wrap(classToParse).cast(object);
    }

    public static ResponseAPI parseResponseAPI(Response<ResponseAPI> rawResponse){
        ResponseAPI responseAPI = rawResponse.body();

        return responseAPI;
    }

    public static Boolean hasErrorResponseAPI (ResponseAPI responseAPI) {
        if (responseAPI == null) {
            return true;
        }
        if (responseAPI.isHasError() == false && responseAPI.getResponseDetail() != null) {
            return false;
        }
        return true;
    }
}
