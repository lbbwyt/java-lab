package com.lbb.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProductApplication.class, args);
    }
}
