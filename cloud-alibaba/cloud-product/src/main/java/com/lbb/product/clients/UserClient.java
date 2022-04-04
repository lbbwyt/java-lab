package com.lbb.product.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("cloud-user")
public interface UserClient {
    @GetMapping("/user/ping")
    String Ping();
}
