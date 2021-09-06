package com.zp.uni.hmall;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.zp.uni.hmall.dao")
@EnableTransactionManagement
@SpringBootApplication
public class PddApplication {

    public static void main(String[] args) {
        SpringApplication.run(PddApplication.class, args);
    }


}
