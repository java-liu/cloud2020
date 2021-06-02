package com.ljava.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 手写一个轮询Ribbon算法
 * @Author: Liuys
 * @CreateDate: 2021/6/2 15:18
 * @Version: 1.0
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAtomicIncrement(){
        int current;
        int next;
        //自旋锁
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******第几次访问,次数next:" + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAtomicIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
