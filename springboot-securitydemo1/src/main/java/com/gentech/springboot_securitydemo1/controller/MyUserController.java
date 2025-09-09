package com.gentech.springboot_securitydemo1.controller;

import com.gentech.springboot_securitydemo1.entity.MyUser;
import com.gentech.springboot_securitydemo1.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserController {
    @Autowired
    private MyUserRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register/user")
    public MyUser registerUser(@RequestBody MyUser user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
