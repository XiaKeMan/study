/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: HelloController
 * Author: yuyongjun
 * Date: 2020/11/26 16:44
 * Description: test
 */

package com.guazi.boot.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yuyongjun
 * @date: 2020/11/26 16:44
 * @since:1.0.0
 */

@RestController
public class HelloController {


    @RequestMapping("/index")
    public String index() {
        String result = "Hello,world!";
        System.out.println(result);
        return result;
    }

    @RequestMapping("/index2")
    public String index2() {
        String result = "Hello,world! 2";
        System.out.println(result);
        return result;
    }


}


