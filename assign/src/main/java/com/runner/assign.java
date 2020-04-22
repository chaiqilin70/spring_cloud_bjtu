package com.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.controller","com.service","com.dao"})//手动指定bean组件扫描范围
public class assign {

    public static void main(String[] args) {
        SpringApplication.run(assign.class, args);
    }
}
