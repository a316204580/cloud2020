package com.atguigu.springcloud.service;

/**
 *
 * @author PaulFang
 * @date 2020/10/28
 */
public interface PaymentService {

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TIMEOUT(Integer id);

    public String paymentCircuitBreaker(Integer id);
}
