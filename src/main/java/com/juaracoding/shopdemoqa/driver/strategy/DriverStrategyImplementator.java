package com.juaracoding.shopdemoqa.driver.strategy;

import com.juaracoding.shopdemoqa.utils.Constants;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
		
		case Constants.FIREFOX:
			return new Firefox();
		
		default:
			return null;
		}
	}
}
