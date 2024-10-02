package com.example.firstdemo.controller;

import com.example.firstdemo.domain.User;
import com.example.firstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class Controller {

    @Autowired
    UserService userService;
    @PostMapping("addUser")
    public ResponseEntity<?> addUser(@RequestBody User user){

        User newUser = userService.saveUser(user);

        return ResponseEntity.status(200).body(newUser);
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll(){
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.status(200).body(userList);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        System.out.println("id is " +id);
        userService.deleteUser(id);
        return ResponseEntity.status(200).body(null);
    }

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
