package com.ljava.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: boot配置类
 * @Author: Liuys
 * @CreateDate: 2021/5/27 10:24
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    //applicationContext.xml <bean id ="" class ="">
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
