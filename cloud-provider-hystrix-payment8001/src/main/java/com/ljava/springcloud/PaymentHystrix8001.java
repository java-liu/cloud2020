package com.ljava.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/4 17:04
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix8001.class,args);
    }
}
