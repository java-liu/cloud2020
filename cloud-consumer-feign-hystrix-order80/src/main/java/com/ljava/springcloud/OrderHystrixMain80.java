package com.ljava.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: hystrix order服务
 * @Author: Liuys
 * @CreateDate: 2021/6/7 11:22
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
