package com.echo.sp.op.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Select;

@Getter
@Setter
@ToString
public class Student {

    private String name;
    private String subject;
    private Integer score;
    private  Integer calss;
}
