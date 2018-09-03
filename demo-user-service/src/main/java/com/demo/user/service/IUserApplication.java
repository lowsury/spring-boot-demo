package com.demo.user.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.demo.user")
@EnableTransactionManagement
@EnableFeignClients(basePackages = "com.demo.user")
@EnableDiscoveryClient
@MapperScan("com.demo.user.**.mapper")
public class IUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(IUserApplication.class, args);
    }
}