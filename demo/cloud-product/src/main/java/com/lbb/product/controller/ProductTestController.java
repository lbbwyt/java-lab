package com.lbb.product.controller;

import com.lbb.product.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductTestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/product/ping")
    public String TestUserClient() {
        return this.userClient.Ping();
    }
}
