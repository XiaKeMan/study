package com.guazi.boot.spring.service;


import com.guazi.boot.spring.model.po.StudentAddress;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/8/30 20:06
 */

public interface StudentAddressService {

    List<StudentAddress> getByUId(Long uId) throws Exception;

    int insert(StudentAddress address) throws Exception;


}
