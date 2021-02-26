package com.nagarro.msa.user.signup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nagarro.msa.user.constants.IApplicationConstants;
import com.nagarro.msa.user.signup.dao.SignUpDAO;
import com.nagarro.msa.user.signup.model.SignUpResponse;
import com.nagarro.msa.user.signup.model.User;
import com.nagarro.msa.user.signup.model.UserValidation;

@Service
public class SignUpServiceImpl implements SignUpService{

	@Autowired
	private SignUpDAO signUpDAO;

	
	@Autowired
	@Qualifier("userMap")
	private Map<User, User> userMap;
	
	@Override
	public SignUpResponse signUp(User user) {
		
		SignUpResponse response = new SignUpResponse();
		UserValidation userValidation = validateUser(user);
		if(userValidation.isValid())
		{
			
			String message = signUpDAO.createUser(user);	
			List<String> messageList = new ArrayList<>();
			messageList.add(message);
			
			response.setMessageList(messageList);
			response.setStatus(IApplicationConstants.SUCCESS_STATUS);
			
		}
		
		else
		{
			response.setMessageList(userValidation.getFailureMessageList());
			response.setStatus(IApplicationConstants.FAIL_STATUS);
		}
		
		return response;
	}

	
	private UserValidation validateUser(User user)
	{
		UserValidation validateUser = new UserValidation();
		validateUser.setValid(true);
		
		if(user!=null && userMap.containsKey(user))
		{
			validateUser.setValid(false);
			
			if(userMap.get(user).getUsername().equalsIgnoreCase(user.getUsername()))
			{
				validateUser.getFailureMessageList().add(IApplicationConstants.USERNAME_DUPLICATE_MESSAGE);
			}
			if(userMap.get(user).getMobile().equalsIgnoreCase(user.getMobile()))
			{
				validateUser.getFailureMessageList().add(IApplicationConstants.MOBILE_DUPLICATE_MESSAGE);
			}
		}
		
		
		return validateUser;
	}
	
}
