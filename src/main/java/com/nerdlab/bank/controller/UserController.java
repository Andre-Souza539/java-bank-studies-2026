package com.nerdlab.bank.controller;

import com.nerdlab.bank.model.User;
import com.nerdlab.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    public final UserService service;

    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }

    @GetMapping
    public List<User> list(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public User getById(@PathVariable String id){
        return service.findById(id);
    }

}
