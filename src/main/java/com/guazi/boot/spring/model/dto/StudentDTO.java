/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: StudentDTO
 * Author: yuyongjun
 * Date: 2020/5/8 01:01
 * Description:
 */

package com.guazi.boot.spring.model.dto;

/**
 * @author: yuyongjun
 * @date: 2020/5/8 01:01
 * @since:1.0.0
 */
public class StudentDTO {

    private String sname;
    private Integer gender;
    private Integer age;
    private String note;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
