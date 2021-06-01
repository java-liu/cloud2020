package com.ljava.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/1 16:07
 * @Version: 1.0
 */
@RestController
@Slf4j
public class ConsumerConsuleController {
    private static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String paymentConsule(){
        String result  = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
