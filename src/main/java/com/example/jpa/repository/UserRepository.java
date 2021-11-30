package com.example.jpa.repository;
import com.example.jpa.repository.IUserRepository;

import java.util.Optional;

import com.example.jpa.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public class UserRepository {

    @Autowired
    IUserRepository repo;

    public User saveUser(User entity) {
        return repo.save(entity);
    }

    public Iterable<User> findAll() {
        return repo.findAll();
    }

    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }

    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }
}