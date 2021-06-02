package com.ljava.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/2 15:17
 * @Version: 1.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
