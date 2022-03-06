package com.lbb.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserTestController {


    //通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/user/ping")
    public String Ping() {

        return "micro user : pong," + this.useLocalCache;
    }

}
