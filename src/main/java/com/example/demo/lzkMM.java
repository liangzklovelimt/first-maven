package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lzkMM {

    @RequestMapping("/lzk")
    public String test(){
        return "hello my name is zhaokang liang";
    }
}
