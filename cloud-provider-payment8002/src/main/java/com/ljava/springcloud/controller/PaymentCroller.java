package com.ljava.springcloud.controller;

import com.ljava.springcloud.entity.CommonResult;
import com.ljava.springcloud.entity.Payment;
import com.ljava.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

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
    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody String serial){
        Payment payment = new Payment();
        payment.setSerial(serial);
        int result = paymentService.create(payment);
        log.info("*****payment插入结果:" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功,serverPort:"+ port,result);
        }else{
            return new CommonResult(400,"插入数据失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****payment查询结果:" + payment +"O(∩_∩)O哈哈~");
        if(payment != null){
            return new CommonResult(200,"查询数据成功,serverPort:"+ port,payment);
        }else{
            return new CommonResult(400,"查询数据失败,查询ID:" + id, null);
        }
    }

     @GetMapping("/payment/lb")
     public String getPaymentLB(){
        return port;
     }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
