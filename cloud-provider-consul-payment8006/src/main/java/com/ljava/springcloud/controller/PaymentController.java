package com.ljava.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/1 15:21
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;



    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
