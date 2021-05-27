package com.ljava.springcloud.controller;

import com.ljava.springcloud.entity.CommonResult;
import com.ljava.springcloud.entity.Payment;
import com.ljava.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: PaymentCroller
 * @Author: Liuys
 * @CreateDate: 2021/5/26 16:29
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentCroller {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*****payment插入结果:" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return new CommonResult(400,"插入数据失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****payment查询结果:" + payment +"O(∩_∩)O哈哈~");
        if(payment != null){
            return new CommonResult(200,"查询数据成功",payment);
        }else{
            return new CommonResult(400,"查询数据失败,查询ID:" + id, null);
        }
    }
}
