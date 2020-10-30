package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author PaulFang
 * @date 2020/10/29
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigServerMain3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMain3355.class, args);
    }
}
