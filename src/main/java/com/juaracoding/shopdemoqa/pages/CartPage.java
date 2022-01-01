package com.juaracoding.shopdemoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class CartPage {
private WebDriver driver;
	
	public CartPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-menu-item-cart")
	private WebElement btnCartPage;
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement btnCheckout;
	
	@FindBy(id = "billing_first_name")
	private WebElement txtFirstname;
	
	@FindBy(id = "billing_last_name")
	private WebElement txtLastname;
	
	@FindBy(id = "billing_company")
	private WebElement txtCompany;
	
	@FindBy(id = "select2-billing_country-container")
	private WebElement btnCountry;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtCountryinput;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtAddress1;
	
	@FindBy(id = "billing_address_2")
	private WebElement txtAddress2;
	
	@FindBy(id = "billing_city")
	private WebElement txtCity;
	
	@FindBy(id = "select2-billing_state-container")
	private WebElement btnState;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtStateInput;
	
	@FindBy(id = "billing_postcode")
	private WebElement txtPostcode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtPhone;
	
	@FindBy(id = "billing_email")
	private WebElement txtEmail;
	
	@FindBy(id = "order_comments")
	private WebElement txtOrderNotes;
	
	@FindBy(id = "terms")
	private WebElement btnCheckbox;
	
	@FindBy(id = "place_order")
	private WebElement btnPlaceOrder;
	
	public void gotoCartPage() {
		btnCartPage.click();
		btnCheckout.click();
	}
	
	public void BillingDetails(String firstname, String lastname, String company, String country, String address1, String address2, String city, String state, String postcode, String phone, String email, String ordernotes) {
		txtFirstname.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		txtCompany.sendKeys(company);
		
		btnCountry.click();
		txtCountryinput.sendKeys(country);
		txtCountryinput.sendKeys(Keys.ENTER);
		
		txtAddress1.sendKeys(address1);
		txtAddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		
		btnState.click();
		txtStateInput.sendKeys(state);
		txtStateInput.sendKeys(Keys.ENTER);
		
		
		txtPostcode.sendKeys(postcode);
		txtPhone.sendKeys(phone);
		txtEmail.clear();
		txtEmail.sendKeys(email);
		txtOrderNotes.sendKeys(ordernotes);
		
		btnCheckbox.click();
		try {
			 Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnPlaceOrder.click();
	}
}
