package com.demo.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients(basePackages = {
        "com.demo"
})
@EnableDiscoveryClient
@ComponentScan("com.demo")
public class DemoPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPortalApplication.class, args);
    }
}