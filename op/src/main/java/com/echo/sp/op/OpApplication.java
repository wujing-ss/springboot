package com.echo.sp.op;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpApplication {

    public static void main(String[] args) {
        System.out.println("hello");
        StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
        for ( StackTraceElement aaa :stackTrace
             ) {
            System.out.println(aaa.getMethodName());

        }
        SpringApplication.run(OpApplication.class, args);
    }

}
