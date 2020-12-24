/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: StudentMapper
 * Author: yuyongjun
 * Date: 2020/5/8 01:33
 * Description:
 */

package com.guazi.boot.spring.dao.mapper;


import com.guazi.boot.spring.model.po.StudentAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentAddressMapper {

    @Select("select * from student_address where student_id = #{studentId}")
    List<StudentAddress> getByUId(Long uId);

    @Insert(value = {
            "<script> ",
            "insert into student_address(address,student_id) values (#{address},#{studentId}) ",
            "</script> ",
    })
    @Options(useGeneratedKeys = true, keyColumn = "id")
    int insert(StudentAddress address);

}
