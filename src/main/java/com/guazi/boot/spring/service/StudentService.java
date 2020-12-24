package com.guazi.boot.spring.service;


import com.guazi.boot.spring.model.po.Student;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/8/30 20:06
 */

public interface StudentService {

    List<Student> list();

    Student getById(Long uId);

    int insert(Student user) throws Exception;

    int deleteById(Long id);
}
