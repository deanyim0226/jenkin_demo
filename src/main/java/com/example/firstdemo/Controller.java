package com.example.firstdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

    @RequestMapping("api/health")
    public String sayHello(){
        return "API health is good";
    }

    @RequestMapping("api/ping")
    public String ping(){
        return "jenkin is working now";
    }

    @RequestMapping("api/testing")
    public String test(){
        return "testing is done";
    }

    @RequestMapping("api/update")
    public String update(){
        return "update is done";
    }
}
