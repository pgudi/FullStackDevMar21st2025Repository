package com.gentech.security4.controller;

import com.gentech.security4.service.MyUserDetailsService;
import com.gentech.security4.webtoken.JwtService;
import com.gentech.security4.webtoken.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@GetMapping("/home")
	public String handleHomePage()
	{
		return "Home Page has displayed Successfully";
	}

	@GetMapping("/user")
	public String handleUserHomePage()
	{
		return "The User Home Page has displayed Successfully";
	}
	
	@GetMapping("/admin")
	public String handleAdminHomePage()
	{
		return "The Admin Home Page has displayed Successfully";
	}
	
	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody LoginForm loginForm)
	{
		Authentication authentication=authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginForm.username(), loginForm.password()));
		if(authentication.isAuthenticated())
		{
			return jwtService.generateToken(myUserDetailsService.loadUserByUsername(loginForm.username()));
		}
		else
		{
			throw new UsernameNotFoundException("Invalid Credentails!!!");
		}
	}
}
