package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author PaulFang
 * @date 2020/10/27
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFiegnMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFiegnMain80.class, args);
    }
}
