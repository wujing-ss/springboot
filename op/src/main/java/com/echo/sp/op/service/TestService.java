package com.echo.sp.op.service;

import com.echo.sp.op.vo.Student;

import java.util.List;

public interface TestService {

    List<Student> queryStudent(String name);
}
