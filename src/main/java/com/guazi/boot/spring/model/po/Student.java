/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: Student
 * Author: yuyongjun
 * Date: 2020/5/8 01:00
 * Description:
 */

package com.guazi.boot.spring.model.po;

import java.io.Serializable;

/**
 * @author: yuyongjun
 * @date: 2020/5/8 01:00
 * @since:1.0.0
 */
public class Student implements Serializable {

    private Long id;
    private String sname;
    private Integer gender;
    private Integer age;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
