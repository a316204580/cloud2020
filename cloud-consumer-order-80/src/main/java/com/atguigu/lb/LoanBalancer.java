package com.atguigu.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 *
 * @author PaulFang
 * @date 2020/10/27
 */
public interface LoanBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
