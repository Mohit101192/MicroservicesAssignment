package com.nagarro.msa.user.signup.service;

import com.nagarro.msa.user.signup.model.MSAUser;

public interface UserService {

	public MSAUser loadUserByUsername(String username);
	
	
}
