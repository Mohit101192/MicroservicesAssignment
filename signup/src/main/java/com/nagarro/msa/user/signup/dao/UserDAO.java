package com.nagarro.msa.user.signup.dao;

import com.nagarro.msa.user.signup.model.User;

public interface UserDAO {

	
	public User loadUserByUsername(String username);
}
