package com.ljava.springcloud.dao;

import com.ljava.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: PaymentDao
 * @Author: Liuys
 * @CreateDate: 2021/5/26 14:59
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
