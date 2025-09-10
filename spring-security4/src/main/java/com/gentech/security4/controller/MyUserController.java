package com.gentech.security4.controller;

import com.gentech.security4.entity.MyUser;
import com.gentech.security4.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserController {

	@Autowired
	private MyUserService service;
	
	@PostMapping("/register")
	public MyUser registerUser(@RequestBody MyUser user)
	{
		return service.registerUser(user);
	}
}
