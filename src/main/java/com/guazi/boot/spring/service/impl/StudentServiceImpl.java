package com.guazi.boot.spring.service.impl;

import com.guazi.boot.spring.dao.mapper.StudentMapper;
import com.guazi.boot.spring.model.po.Student;
import com.guazi.boot.spring.model.po.StudentAddress;
import com.guazi.boot.spring.service.StudentAddressService;
import com.guazi.boot.spring.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/8/30 20:07
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;
    @Resource
    private StudentAddressService studentAddressService;

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public Student getById(Long uId) {
        return studentMapper.getById(uId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public int insert(Student user) throws Exception {
        int result = studentMapper.insert(user);
        StudentAddress studentAddress = new StudentAddress();
        studentAddress.setAddress(user.getSname());
        studentAddress.setStudentId(user.getId());
        studentAddressService.insert(studentAddress);

        List<StudentAddress> addresses = studentAddressService.getByUId(user.getId());
        System.out.println(addresses);
        return result;
    }

    @Override
    public int deleteById(Long id) {
        return studentMapper.deleteById(id);
    }
}
