/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: StudentMapper
 * Author: yuyongjun
 * Date: 2020/5/8 01:33
 * Description:
 */

package com.guazi.boot.spring.dao.mapper;


import com.guazi.boot.spring.model.po.Student;

import java.util.List;

public interface StudentMapper {


    List<Student> list();

    Student getById(Long uId);

    int insert(Student user);

    int deleteById(Long id);

}
