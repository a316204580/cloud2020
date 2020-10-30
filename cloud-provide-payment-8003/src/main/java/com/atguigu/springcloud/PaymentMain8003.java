package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * EnableEurekaClient 开启eureka Client
 *
 * @author PaulFang
 * @date 2020/10/27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8003.class, args);
    }

}
