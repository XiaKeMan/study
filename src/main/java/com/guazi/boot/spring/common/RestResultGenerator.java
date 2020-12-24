/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: Responses
 * Author: yuyongjun
 * Date: 2020/5/8 01:02
 * Description:
 */

package com.guazi.boot.spring.common;

/**
 * @author: yuyongjun
 * @date: 2020/5/8 01:02
 * @since:1.0.0
 */

public class RestResultGenerator {

    private RestResultGenerator() {
    }

    public static <T> RestResult<T> createRestResult(int code, String message, T data) {
        return new RestResult(code, message, data);
    }

    public static <T> RestResult<T> createRestResultWithSuccess(T data) {
        return createRestResult(0, "成功", data);
    }

    public static RestResult createFailResult(int code, String message) {
        return new RestResult(code, message, null);
    }

}
