package com.nagarro.msa.user.signup.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.msa.user.signup.dao.UserDAO;
import com.nagarro.msa.user.signup.model.AuthorityMSA;
import com.nagarro.msa.user.signup.model.MSAUser;
import com.nagarro.msa.user.signup.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public MSAUser loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		return convertUser(userDAO.loadUserByUsername(username));
	}

	private MSAUser convertUser(User user) {
		
		MSAUser msaUser = new MSAUser();
		
		if(user!=null)
		{
			List<AuthorityMSA> authorityList = new ArrayList<>();
			
			AuthorityMSA authorityMSA = new AuthorityMSA();
			authorityMSA.setAuthority("user");
			authorityList.add(authorityMSA);
			
			msaUser.setUsername(user.getUsername());
			msaUser.setPassword(user.getPassword());
			
			msaUser.setAccountNonExpired(true);
			msaUser.setAccountNonLocked(true);
			msaUser.setCredentialsNonExpired(true);
			msaUser.setEnabled(true);
			msaUser.setAuthorities(authorityList);
			
			
		}
		return msaUser;
	}
}
