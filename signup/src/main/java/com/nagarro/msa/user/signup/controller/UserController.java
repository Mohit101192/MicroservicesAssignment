package com.nagarro.msa.user.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.msa.user.signup.model.MSAUser;
import com.nagarro.msa.user.signup.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@GetMapping("/user")
	public MSAUser fetchUser(@RequestParam("username") String username)
	{
		
		return userService.loadUserByUsername(username);
	}
	
}
