/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: StudentAddress
 * Author: yuyongjun
 * Date: 2020/7/13 15:44
 * Description:
 */

package com.guazi.boot.spring.model.po;

/**
 * @author: yuyongjun
 * @date: 2020/7/13 15:44
 * @since:1.0.0
 */
public class StudentAddress {

    private Long id;
    private String address;
    private Long studentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

}
