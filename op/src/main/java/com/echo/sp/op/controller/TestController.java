package com.echo.sp.op.controller;

import com.echo.sp.op.service.TestService;
import com.echo.sp.op.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService service;
    @RequestMapping("/s1")
    public List<Student>query(@RequestBody String name){
        return  service.queryStudent(name);

    }
}
