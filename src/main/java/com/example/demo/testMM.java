package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testMM {

    @RequestMapping("/")
    public String test(){
        return "hello";
    }
}
