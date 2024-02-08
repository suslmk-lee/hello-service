package com.kpaas.helloservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "name-service", url = "http://localhost:8081")
public interface NameServiceClient {

    @GetMapping("/name")
    String getName();
}
