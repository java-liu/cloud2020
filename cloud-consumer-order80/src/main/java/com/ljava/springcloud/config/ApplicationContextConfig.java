package com.ljava.springcloud.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: boot配置类
 * https://cloud.spring.io/spring-cloud-static/spring-cloud-commons/2.0.3.RELEASE/single/spring-cloud-commons.html#_multiple_resttemplate_objects
 * 有一个坑,支持Ip,域名,服务名调用的问题
 * 官方针对这种情况给出的方案是创建两个RestTemplate，在不同的的情况下区分使用
 * @Author: Liuys
 * @CreateDate: 2021/5/27 10:24
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    //applicationContext.xml <bean id ="" class ="">
    @Bean
    @LoadBalanced
    public RestOperations getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    @Primary
    public RestTemplate getRestTemplate1(){
        return new RestTemplate();
    }
}
