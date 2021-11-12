package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhello")
public class HelloWorld {

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}