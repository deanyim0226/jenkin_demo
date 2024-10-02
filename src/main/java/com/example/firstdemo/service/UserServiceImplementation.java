package com.example.firstdemo.service;

import com.example.firstdemo.domain.User;
import com.example.firstdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    UserRepository userRepository;


    @Override
    public User saveUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
