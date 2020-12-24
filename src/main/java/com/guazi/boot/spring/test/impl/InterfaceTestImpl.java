/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: InterfaceTestImpl
 * Author: yuyongjun
 * Date: 2020/12/9 19:49
 * Description: test
 */

package com.guazi.boot.spring.test.impl;

import com.guazi.boot.spring.test.InterfaceTest;

/**
 * @author: yuyongjun
 * @date: 2020/12/9 19:49
 * @since:1.0.0
 */

public class InterfaceTestImpl implements InterfaceTest {

    @Override
    public void say(String content) {
        System.out.println("test " + content);
    }

}
