package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models.util;

public class ResponseAPI<T> {
    private T responseDetail;
    private boolean hasError;
    public String error;
    public String errorCode;

    public static final String errorBase = "Erro génerico do aplicativo";
    public static final String codeBase = "4444444";

    public ResponseAPI() {
        this.setError(ResponseAPI.errorBase);
        this.setErrorCode(ResponseAPI.codeBase);
        this.setHasError(true);
        this.setResponseDetail(null);
    }

    public void setResponseDetail(T responseDetail) {
        this.responseDetail = responseDetail;
    }

    public T getResponseDetail() {
        return responseDetail;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public boolean isHasError() {
        return hasError;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
