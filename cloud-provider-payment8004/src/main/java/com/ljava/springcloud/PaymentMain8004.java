package com.ljava.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 用zk作注册中心
 * @Author: Liuys
 * @CreateDate: 2021/6/1 10:56
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient   //使用该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
