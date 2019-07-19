package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = GET)
    public String say(){
        return "hello China";
    }
}
