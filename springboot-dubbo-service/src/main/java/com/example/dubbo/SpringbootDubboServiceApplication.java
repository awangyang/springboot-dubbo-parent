package com.example.dubbo;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@MapperScan("com.example.dubbo.mapper")
@SpringBootApplication
public class SpringbootDubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboServiceApplication.class, args);
    }

}
