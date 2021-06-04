package com.ljava.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/4 10:38
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign80.class, args);
    }
}
