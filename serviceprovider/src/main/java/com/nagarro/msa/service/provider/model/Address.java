package com.nagarro.msa.service.provider.model;

import lombok.Data;

@Data
public class Address {

	private String addressLine1;
	private String addressLine2;
	private String pincode;
	private String city;
	private String state;
	private String landmark;
	private String mobileNo;
	
}
