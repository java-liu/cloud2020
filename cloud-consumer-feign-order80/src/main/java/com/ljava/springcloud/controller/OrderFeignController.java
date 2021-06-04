package com.ljava.springcloud.controller;

import com.ljava.springcloud.entity.CommonResult;
import com.ljava.springcloud.entity.Payment;
import com.ljava.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 消费者Controller
 * @Author: Liuys
 * @CreateDate: 2021/6/4 10:48
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;


    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openFeign-ribbon ,客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
