package com.ljava.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: Payment
 * @Author: Liuys
 * @CreateDate: 2021/5/26 14:52
 * @Version: 1.0
 */
@Data
//全参构造
@AllArgsConstructor
//空参构造
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
