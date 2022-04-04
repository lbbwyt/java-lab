package com.lbb.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CloudUserApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CloudUserApplication.class, args);
        String userAge = applicationContext.getEnvironment().getProperty("useLocalCache");
        System.err.println("useLocalCache:"+userAge);
    }
}
