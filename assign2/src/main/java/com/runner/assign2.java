package com.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author Evan
 */
@SpringBootApplication//申明这是一个Spring Boot项目
@EnableEurekaClient
@ComponentScan(basePackages = {"com.controller", "com.service","com.dao"})//手动指定bean扫描范围
public class assign2 {
    public static void main(String[] args) {
        SpringApplication.run(assign2.class, args);
    }

    /**
     * 向Spring容器中定义RestTemplate对象
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
