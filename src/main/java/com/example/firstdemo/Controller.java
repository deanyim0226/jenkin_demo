package com.example.firstdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

    @RequestMapping("api/health")
    public String sayHello(){
        return "API health is good";
    }
}
