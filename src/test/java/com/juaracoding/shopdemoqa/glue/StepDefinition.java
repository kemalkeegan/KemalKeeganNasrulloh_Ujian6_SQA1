package com.juaracoding.shopdemoqa.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.shopdemoqa.pages.AddtoCart;
import com.juaracoding.shopdemoqa.pages.CartPage;
import com.juaracoding.shopdemoqa.pages.LoginAccount;
import com.juaracoding.shopdemoqa.pages.RegisterPage;
import com.juaracoding.shopdemoqa.utils.ConfigProperties;
import com.juaracoding.shopdemoqa.utils.Constants;
import com.juaracoding.shopdemoqa.utils.TestCases;
import com.juaracoding.shopdemoqa.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.juaracoding.shopdemoqa.driver.DriverSingleton;
import com.juaracoding.shopdemoqa.driver.config.AutomationFrameworkConfiguration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;


@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private RegisterPage registerPage;
	private LoginAccount loginaccount;
	private AddtoCart addtocart;
	private CartPage cartpage;
	ExtentTest extenttest;
	TestCases[] tests = TestCases.values();
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigProperties configProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		registerPage = new RegisterPage();
		loginaccount = new LoginAccount();
		addtocart = new AddtoCart();
		cartpage = new CartPage();
		extenttest = report.startTest(tests[Utils.testCount].getTestName());
	}
	
	// RegisterPage
	@Given("^User go to the Website")
	public void User_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extenttest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User click My Account")
	public void User_click_My_Account() {
		registerPage.goToMyAccount();
		extenttest.log(LogStatus.PASS, "User click My Account");
	}
	
	@When("^User input username email password and click register")
	public void User_input_username_email_password_and_click_register() {
		registerPage.Registerpage(configProperties.getUsername(), configProperties.getEmail(), configProperties.getPassword());
		extenttest.log(LogStatus.PASS, "User input username email password and click register");
	}
	
	@Then("^User go to login page")
	public void User_go_to_login_page() {
		extenttest.log(LogStatus.PASS, "User go to login page");
	}
	
	// LoginAccount
	@When("^User input username password and click Login")
	public void  User_input_username_password_and_click_Login() {
		loginaccount.gotoLoginAccount(configProperties.getUsername(), configProperties.getPassword());
		extenttest.log(LogStatus.PASS, "User input username password and click Login");
	}
	
	@Then("^User go to My Account")
	public void User_go_to_My_Account() {
		extenttest.log(LogStatus.PASS, "User go to My Account");
	}
	
	// AddtoCart 1 Shoes from Compare Product
	@When("^User click Orders and click Browse Product")
	public void  User_click_Orders_and_click_Browse_Product() {
		addtocart.GotoProduct();
		extenttest.log(LogStatus.PASS, "User click Orders and click Browse Product");
	}
	
	@When("^User click compare click select option and click addtocart")
	public void  User_click_compare_click_select_option_and_click_addtocart() {
		addtocart.addShoes(configProperties.getColor1(),configProperties.getSize1());
		extenttest.log(LogStatus.PASS, "User click compare click select option and click addtocart");
	}
	
	@Then("^User go to shoes page")
	public void User_go_to_shoes_page() {
		extenttest.log(LogStatus.PASS, "User go to shoes page");
	}
	
	// AddtoCart 1 Glasses from Search
	@When("^User click Search and type glasses")
	public void  User_click_Search_and_type_glasses() {
		addtocart.Search(configProperties.getSearch());
		extenttest.log(LogStatus.PASS, "User click Search and type glasses");
	}
		
	@When("^User click product click select option and click addtocart")
	public void  User_click_product_click_select_option_and_click_addtocart() {
		addtocart.addGlasses(configProperties.getColor2(),configProperties.getSize2());
		extenttest.log(LogStatus.PASS, "User click product click select option and click addtocart");
	}
		
	@Then("^User go to glasses page")
	public void User_go_to_glasses_page() {
		extenttest.log(LogStatus.PASS, "User go to glasses page");	
	}
	
	// Cart Page, Proceed to Checkout
	@When("^User click Cart Page and click Proceed to checkout")
	public void  User_click_Cart_Page_and_click_Proceed_to_checkout() {
		cartpage.gotoCartPage();
		extenttest.log(LogStatus.PASS, "User click Cart Page and click Proceed to checkout");	
	}
		
	@When("^User input billing detail and click Place Order")
	public void  User_input_billing_detail_and_click_Place_Order() {
		cartpage.BillingDetails(configProperties.getFirstname(), configProperties.getLastname(), configProperties.getCompany(), configProperties.getCountry(), configProperties.getAddress1(), configProperties.getAddress2(), configProperties.getCity(), configProperties.getState(), configProperties.getPostcode(), configProperties.getPhone(), configProperties.getEmail(), configProperties.getOrdernotes());
		extenttest.log(LogStatus.PASS, "User input billing detail and click Place Order");	
	}
		
	@Then("^User go to order details")
	public void User_go_to_order_details() {
		extenttest.log(LogStatus.PASS, "User go to order details");		
	}
	
	@After
	public void closeObject() {
		Utils.testCount++;
		report.endTest(extenttest);
		report.flush();
	}
}
