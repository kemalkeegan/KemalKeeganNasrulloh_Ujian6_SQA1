package com.juaracoding.shopdemoqa.utils;

public enum TestCases {
	
	T1("Testing to Login Page"),
	T2("Testing to Login Account"),
	T3("Testing Add to Cart Shoes"),
	T4("Testing Add to Cart Glasses"),
	T5("Testing to Cart Page");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	public String getTestName(){
		return testName;
	}
}
