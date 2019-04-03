package com.demo.domain;

import java.io.Serializable;

/**
 * @Auther: fanyao
 * @Date: 2019/3/21 15:52
 * @Description: 返回请求封装类
 */
public class HttpResult<T> implements Serializable {
    public int resultCode;
    public String message;
    public T data;

    public HttpResult(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public HttpResult(int resultCode, T data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    public HttpResult(int resultCode, String message, T data) {
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
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
}
