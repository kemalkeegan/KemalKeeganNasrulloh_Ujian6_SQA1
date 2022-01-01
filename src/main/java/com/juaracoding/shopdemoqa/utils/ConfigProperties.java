package com.juaracoding.shopdemoqa.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${usernamex}")
	private String username;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;

	@Value("${color1}")
	private String color1;
	
	@Value("${size1}")
	private String size1;
	
	@Value("${color2}")
	private String color2;
	
	@Value("${size2}")
	private String size2;
	
	@Value("${search}")
	private String search;
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${company}")
	private String company;
	
	@Value("${country}")
	private String country;

	@Value("${address1}")
	private String address1;
	
	@Value("${address2}")
	private String address2;
	
	@Value("${city}")
	private String city;
	
	@Value("${state}")
	private String state;
	
	@Value("${postcode}")
	private String postcode;
	
	@Value("${phone}")
	private String phone;
	
	@Value("${ordernotes}")
	private String ordernotes;

	public String getBrowser() {
		return browser;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getColor1() {
		return color1;
	}

	public String getSize1() {
		return size1;
	}

	public String getColor2() {
		return color2;
	}

	public String getSize2() {
		return size2;
	}

	public String getSearch() {
		return search;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCompany() {
		return company;
	}

	public String getCountry() {
		return country;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getPhone() {
		return phone;
	}

	public String getOrdernotes() {
		return ordernotes;
	}
	
	
}
