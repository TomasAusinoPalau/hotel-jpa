package com.example.jpa.controller;


import java.util.Optional;

import com.example.jpa.model.User;
import com.example.jpa.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/username")
    public Optional<User> getByUsername(
        @RequestParam(value = "username") String username) {
            return service.findByUsername(username);
        }

    @GetMapping("/id")
    public Optional<User> getById(
        @RequestParam(value = "id") Long id) {
            return service.findById(id);
        }
    

    @PostMapping("/addUser")
    public User adduser(
        @RequestBody User user) {
            return service.saveUser(user);
    }

    

}
