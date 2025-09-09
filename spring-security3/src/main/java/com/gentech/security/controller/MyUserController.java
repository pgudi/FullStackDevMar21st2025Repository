package com.gentech.security.controller;

import com.gentech.security.entity.MyUser;
import com.gentech.security.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyUserController {
    @Autowired
    private MyUserRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public MyUser registerUser(@RequestBody MyUser user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user);
    }

}
