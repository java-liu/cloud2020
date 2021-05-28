package com.ljava.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: Json封装体
 * @Author: Liuys
 * @CreateDate: 2021/5/26 14:56
 * @Version: 1.0
 */
@Data
//全参构造
@AllArgsConstructor
//空参构造
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T    data;

    /**
     * 只有code和message的构造方法
     * @param code
     * @param message
     */
    public CommonResult(Integer code, String message){
        this(code, message,null);
    }
}
