/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: Test
 * Author: yuyongjun
 * Date: 2020/11/27 19:12
 * Description: test
 */

package com.guazi.boot.spring.test;

import com.guazi.boot.spring.test.impl.InterfaceTestImpl;

import java.lang.reflect.Method;

/**
 * @author: yuyongjun
 * @date: 2020/11/27 19:12
 * @since:1.0.0
 */

public class Test {

    public static void main(String[] args) throws NoSuchMethodException {
//        HashMultiset<String> mas = HashMultiset.create();
//
//        mas.add("hello");
//        mas.add("hello");
//        mas.add("world");
//
//        System.out.println(mas.count("hello"));


        Method[] methods = Test.class.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName() + "-->" + methods[i].getDeclaringClass() + "-->" + methods[i].isDefault());
        }

    }



}
