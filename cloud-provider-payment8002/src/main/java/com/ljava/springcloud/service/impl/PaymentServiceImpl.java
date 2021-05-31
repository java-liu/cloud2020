package com.ljava.springcloud.service.impl;

import com.ljava.springcloud.dao.PaymentDao;
import com.ljava.springcloud.entity.Payment;
import com.ljava.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/5/26 16:24
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
