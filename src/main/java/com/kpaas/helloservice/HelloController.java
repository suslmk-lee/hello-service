package com.kpaas.helloservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private NameServiceClient nameServiceClient;

    @GetMapping("/hello")
    public String getHello() {
        String name = nameServiceClient.getName();
        return "Hello, " + name + "!";
    }
}