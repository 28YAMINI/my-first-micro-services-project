package com.stschool.microservices.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String heello(){
        return "Hello from Hello Service";
    }
}
