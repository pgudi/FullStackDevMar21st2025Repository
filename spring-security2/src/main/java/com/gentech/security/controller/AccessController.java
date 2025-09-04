package com.gentech.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AccessController {

    @GetMapping("/home")
    public String homePage()
    {
        return "It is a Home Page of our Application!!";
    }

    @GetMapping("/user/home")
    public String userHomePage()
    {
        return "It is a User Home Page of our Application!!";
    }

    @GetMapping("/admin/home")
    public String adminHomePage()
    {
        return "It is a Admin Home Page of our Application!!";
    }
}
