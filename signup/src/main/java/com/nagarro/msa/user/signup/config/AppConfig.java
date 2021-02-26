package com.nagarro.msa.user.signup.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nagarro.msa.user.signup.model.User;

@Configuration
public class AppConfig {

	private Map<User, User> userMap = new HashMap<>();
	
	
	@Bean("userMap")
	@Scope("singleton")
	public Map<User,User> userMapBean()
	{
		return userMap;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
