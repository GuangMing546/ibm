package com.wyu.ibm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wyu.ibm.mapper")
public class IbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbmApplication.class, args);
    }

}
