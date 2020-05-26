package com.echo.sp.op.dao;

import com.echo.sp.op.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {
    //@Select(" select * from student where name = #{name}")
    List<Student>queryStudent(String name);
}
