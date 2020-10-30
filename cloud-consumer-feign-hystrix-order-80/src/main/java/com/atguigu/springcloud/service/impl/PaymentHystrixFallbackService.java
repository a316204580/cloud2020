package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 *
 * @author PaulFang
 * @date 2020/10/28
 */
@Component
public class PaymentHystrixFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return " -- paymentInfo_OK --  fallback";
    }

    @Override
    public String paymentInfo_TIMEOUT(Integer id) {
        return " -- paymentInfo_TIMEOUT --   fallback ";
    }
}