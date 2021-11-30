package com.example.jpa.service;

import java.util.Optional;

import com.example.jpa.model.User;
import com.example.jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class UserService {
    @Autowired
    UserRepository repo;

    public User saveUser(User entity) {
        return repo.saveUser(entity);

    }    

    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }

    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }

    public Iterable<User> findAll() {
       return repo.findAll();
    }
    
}