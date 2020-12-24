/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: Response
 * Author: yuyongjun
 * Date: 2020/5/7 23:41
 * Description: response
 */

package com.guazi.boot.spring.common;

/**
 * @author: yuyongjun
 * @date: 2020/5/7 23:41
 * @since:1.0.0
 */
public class RestResult<T> {

    private int code;

    private String message;

    private T data;

    public RestResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
}
