package com.rongpingkeji.common.util.http;


import java.util.HashMap;

public class ResponseMessage<T> {

    private String code;
    private String message;
    private T data;

    public ResponseMessage() {
    }

    public ResponseMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseMessage(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = (data == null) ? (T) new HashMap<>() : data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return this.code.equals(ResponseMessageCodeEnum.SUCCESS.getCode());
    }
}
