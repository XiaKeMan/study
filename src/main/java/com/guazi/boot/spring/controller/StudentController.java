package com.guazi.boot.spring.controller;

import com.guazi.boot.spring.common.RestResult;
import com.guazi.boot.spring.common.RestResultGenerator;
import com.guazi.boot.spring.model.po.Student;
import com.guazi.boot.spring.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/8/30 20:02
 */

@Controller
@RequestMapping("/user")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public RestResult getUserInfos(HttpServletRequest request, HttpServletResponse response) {
        List<Student> userList = studentService.list();
        return RestResultGenerator.createRestResultWithSuccess(userList);
    }

    @RequestMapping("/getById")
    @ResponseBody
    public RestResult findUesr(@RequestParam Long uId) {
        Student user = studentService.getById(uId);
        System.out.println(user);
        return RestResultGenerator.createRestResultWithSuccess(user);
    }

    @RequestMapping("/add")
    @ResponseBody
    public RestResult add(@RequestParam Integer age, @RequestParam Integer gender, @RequestParam String name) throws Exception {
        Student user = new Student();
        user.setAge(age);
        user.setGender(gender);
        user.setSname(name);
        System.out.println(user);
        int result = studentService.insert(user);
        return RestResultGenerator.createRestResultWithSuccess(result);
    }

    @RequestMapping("/delete")
    public String add(@RequestParam Long id) {
        studentService.deleteById(id);
        return "delete";
    }





}
