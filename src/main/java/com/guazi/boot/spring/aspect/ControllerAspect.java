/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: ControllerAspect
 * Author: yuyongjun
 * Date: 2020/11/26 17:15
 * Description: tes
 */

package com.guazi.boot.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: yuyongjun
 * @date: 2020/11/26 17:15
 * @since:1.0.0
 */
@Aspect
@Component
public class ControllerAspect {

    @Before("execution(* index*()))")
    public void inspect() {
        System.out.println("i was executed before controller");
    }

}
