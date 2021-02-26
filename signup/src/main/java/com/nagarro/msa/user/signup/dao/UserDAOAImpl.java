package com.nagarro.msa.user.signup.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nagarro.msa.user.signup.model.User;

@Repository
public class UserDAOAImpl implements UserDAO{

	@Autowired
	@Qualifier("userMap")
	private Map<User, User> userMap;
	
	@Override
	public User loadUserByUsername(String username) {
		return userMap.get(new User(username));
	}

}
