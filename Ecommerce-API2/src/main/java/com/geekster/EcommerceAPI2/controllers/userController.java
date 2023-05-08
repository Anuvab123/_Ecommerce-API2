package com.geekster.EcommerceAPI2.controllers;

import com.geekster.EcommerceAPI2.models.User;
import com.geekster.EcommerceAPI2.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {
    @Autowired
    IUserRepository userRepository;

    @PostMapping(value="/user")
    public void createUser(@RequestBody User user) {
         userRepository.save(user);
    }

    @GetMapping(value="/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userRepository.findUserByUserId(id);
    }
}
