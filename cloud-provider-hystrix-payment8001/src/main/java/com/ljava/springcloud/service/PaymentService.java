package com.ljava.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/4 17:05
 * @Version: 1.0
 */
@Service
public class PaymentService {
    /***
     * 正常访问,OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池: " + Thread.currentThread().getName() + " paymentInfo_OK,id:"+ id + "\t";
    }

    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " paymentInfo_OK,id:"+ id + "\t"+"耗时(s)"+timeNumber+"秒钟!";
    }
}
