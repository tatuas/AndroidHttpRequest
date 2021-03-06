package com.tatuas.android.httprequest;

public class GetResult {
    private String result;
    private int resultCode;
    private Error error;
    private String errorMessage;

    public GetResult(String result, int resultCode, Error error, String errorMessage) {
        this.result = result;
        this.resultCode = resultCode;
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getResultData() {
        return this.result;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public Error getErrorItem() {
        return this.error;
    }

    public enum Error {
        NETWORK_DISABLE, URL_FAILED, RESULT_DATA_ERROR, SSL_FAILED, REQUEST_ERROR
    }
}
