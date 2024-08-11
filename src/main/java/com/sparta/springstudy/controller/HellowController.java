package com.sparta.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {


    @GetMapping("/api/hello")
    public String hello() {
        return  "Hello World!";
    }
}
