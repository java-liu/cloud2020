package com.ljava.springcloud.service;

import com.ljava.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/5/26 16:23
 * @Version: 1.0
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
