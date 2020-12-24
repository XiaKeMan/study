/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: StudentAddressServiceImpl
 * Author: yuyongjun
 * Date: 2020/7/13 15:54
 * Description:
 */

package com.guazi.boot.spring.service.impl;

import com.guazi.boot.spring.dao.mapper.StudentAddressMapper;
import com.guazi.boot.spring.model.po.StudentAddress;
import com.guazi.boot.spring.service.StudentAddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yuyongjun
 * @date: 2020/7/13 15:54
 * @since:1.0.0
 */
@Service
public class StudentAddressServiceImpl implements StudentAddressService {

    @Resource
    private StudentAddressMapper studentAddressMapper;

    @Override
    public List<StudentAddress> getByUId(Long uId) throws Exception {
//        throw new Exception("test");
        return studentAddressMapper.getByUId(uId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public int insert(StudentAddress address) throws Exception {
//        throw new Exception("test");
        return studentAddressMapper.insert(address);
    }




}
