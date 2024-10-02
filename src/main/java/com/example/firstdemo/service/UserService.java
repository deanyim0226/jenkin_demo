package com.example.firstdemo.service;

import com.example.firstdemo.domain.User;

import java.util.List;

public interface UserService {

    public User saveUser(User newUser);
    public void deleteUser(int id);
    public List<User> getAllUsers();
}
