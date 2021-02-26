package com.nagarro.msa.user.signup.dao;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.nagarro.msa.user.signup.model.User;


@Repository
public class SignUpDAOImpl implements SignUpDAO{

	@Autowired
	@Qualifier("userMap")
	private Map<User, User> userMap;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public String createUser(User user) {
		
		Optional<String> rawPasswordOp = Optional.ofNullable(user.getPassword());
		
		if(rawPasswordOp.isPresent())
		user.setPassword(passwordEncoder.encode(rawPasswordOp.get()));
		
		userMap.put(user, user);
		return "User Created Successfully";
	}

	
	
	
}
