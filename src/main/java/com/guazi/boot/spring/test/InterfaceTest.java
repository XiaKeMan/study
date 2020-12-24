/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: InterfaceTest
 * Author: yuyongjun
 * Date: 2020/12/9 19:47
 * Description:
 */

package com.guazi.boot.spring.test;

/**
 * @author: yuyongjun
 * @date: 2020/12/9 19:47
 * @since:1.0.0
 */

public interface InterfaceTest {

   void say(String content);

   default void sayHi() {
       System.out.println("I'm say Hi method!");
   }

}
