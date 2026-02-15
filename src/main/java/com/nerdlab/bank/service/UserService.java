package com.nerdlab.bank.service;

import com.nerdlab.bank.model.User;
import com.nerdlab.bank.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UsersRepository repository;

    public User save(User user) {
        LocalDateTime createdAt = LocalDateTime.now();
        user.setCreatedAt(createdAt);
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(UUID.fromString(id)).orElse(null);
    }
}
