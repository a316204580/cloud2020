package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 *
 * @author PaulFang
 * @date 2020/10/27
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    public String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper: " + serverPort + UUID.randomUUID();
    }

}
