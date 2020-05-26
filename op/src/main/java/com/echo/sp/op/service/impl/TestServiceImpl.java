package com.echo.sp.op.service.impl;

import com.echo.sp.op.dao.TestDao;
import com.echo.sp.op.service.TestService;
import com.echo.sp.op.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao dao;

   public List<Student> queryStudent(String name){
      return  dao.queryStudent(name);
   }
}
