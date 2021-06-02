package com.ljava.springcloud;

import com.ljava.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description: 启动类
 * @Author: Liuys
 * @CreateDate: 2021/5/26 17:46
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
//引入自己的
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
