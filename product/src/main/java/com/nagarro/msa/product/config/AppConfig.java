package com.nagarro.msa.product.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nagarro.msa.product.model.City;

@Configuration
public class AppConfig {

	
	
	@Bean
	public List<City> cityList()
	{
		List<City> cityList = new ArrayList<>();
		
		City city = new City();
		city.setCity("Delhi");
		city.setCityId(1);
		
		City city1 = new City();
		city1.setCity("Gurgaon");
		city1.setCityId(2);
		
		City city2 = new City();
		city2.setCity("Bangalore");
		city2.setCityId(3);
		
		City city3 = new City();
		city3.setCity("Noida");
		city3.setCityId(4);
		
		City city4 = new City();
		city4.setCity("Pune");
		city4.setCityId(5);
		
		City city5 = new City();
		city5.setCity("Hyderabad");
		city5.setCityId(6);
		
		
		City city6 = new City();
		city6.setCity("Mumbai");
		city6.setCityId(7);
		
		cityList.add(city);
		cityList.add(city1);
		cityList.add(city2);
		cityList.add(city3);
		cityList.add(city4);
		cityList.add(city5);
		cityList.add(city6);
		
		return cityList;
		
	}
	
	
}
