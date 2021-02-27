package com.nagarro.msa.cartandorder.config;

import java.util.concurrent.ConcurrentHashMap;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nagarro.msa.cartandorder.model.Cart;

@Configuration
public class AppConfig {

	@Bean("cartTable")
	@Scope("singleton")
	public ConcurrentHashMap<String, Cart> cartTable()
	{
		return new ConcurrentHashMap<String,Cart>();
	}
	
	
}
