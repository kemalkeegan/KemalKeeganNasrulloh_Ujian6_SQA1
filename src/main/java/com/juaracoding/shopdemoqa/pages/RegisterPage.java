package com.juaracoding.shopdemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > p > a")
	private WebElement btnDismiss;
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2) > a")
	private WebElement MyAccount;
	
	@FindBy(id = "reg_username")
	private WebElement txtUser;
	
	@FindBy(id = "reg_email")
	private WebElement txtEmail;
	
	@FindBy(id = "reg_password")
	private WebElement txtPass;
	
	@FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
	public void goToMyAccount() {
		btnDismiss.click();
		MyAccount.click();	
	}
	
	public void Registerpage(String reg_username, String reg_email, String reg_password) {
		txtUser.sendKeys(reg_username);
		txtEmail.sendKeys(reg_email);
		txtPass.sendKeys(reg_password);
		btnRegister.click();
	}
	
}
