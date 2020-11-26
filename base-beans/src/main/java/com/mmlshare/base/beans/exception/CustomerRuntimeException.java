package com.mmlshare.base.beans.exception;

public class CustomerRuntimeException extends RuntimeException {

    private String message;

    public CustomerRuntimeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
