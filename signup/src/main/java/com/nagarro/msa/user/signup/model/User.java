package com.nagarro.msa.user.signup.model;

public class User {

	public User(String username)
	{
		this.username = username;
	}
	
	public User()
	{
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	private String firstName;
	private String lastName;
	private String username;
	private String dob;
	private String mobile;
	private String password;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof User )
		{
			User currUser = (User)obj;
			
			if(currUser.username.equalsIgnoreCase(username) || currUser.mobile.equals(mobile))
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return username.hashCode();
	}
	
}
