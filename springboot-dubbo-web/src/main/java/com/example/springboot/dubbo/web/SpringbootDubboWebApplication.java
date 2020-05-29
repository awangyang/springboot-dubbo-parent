package com.example.springboot.dubbo.web;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class} )
@EnableDubbo
public class SpringbootDubboWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboWebApplication.class, args);
    }

}
