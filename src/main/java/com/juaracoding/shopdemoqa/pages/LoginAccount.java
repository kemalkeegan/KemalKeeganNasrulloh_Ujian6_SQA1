package com.juaracoding.shopdemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class LoginAccount {

private WebDriver driver;
	
	public LoginAccount() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_login")
	private WebElement txtuser;
	
	@FindBy(id = "user_pass")
	private WebElement txtpass;
	
	@FindBy(id = "wp-submit")
	private WebElement btnsubmit;
	
	public void gotoLoginAccount(String user_login, String user_pass) {
		txtuser.sendKeys(user_login);
		txtpass.sendKeys(user_pass);
		btnsubmit.click();
	}
}
