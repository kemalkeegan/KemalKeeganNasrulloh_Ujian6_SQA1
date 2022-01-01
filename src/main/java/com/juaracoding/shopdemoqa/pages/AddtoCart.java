package com.juaracoding.shopdemoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class AddtoCart {
private WebDriver driver;
private Select choose;
	
	public AddtoCart() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#post-8 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--orders > a")
	private WebElement btnOrders;
	
	@FindBy(css = "#post-8 > div > div > div > div.woocommerce-message.woocommerce-message--info.woocommerce-Message.woocommerce-Message--info.woocommerce-info > a")
	private WebElement btnBrowseProduct;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-meta > div.woocommerce.product.compare-button > a")
	private WebElement btnCompareProduct;
	
	@FindBy(css = "#DataTables_Table_0 > tbody > tr.add-to-cart.odd > td > a")
	private WebElement btnSelectOption;
	
	@FindBy(id = "pa_color")
	private WebElement ChooseColor;
	
	@FindBy(id = "pa_size")
	private WebElement ChooseSize;
	
	@FindBy(css = "#product-1281 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnAddtoCartShoes;
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > a")
	private WebElement btnSearch;
	
	@FindBy(css = "#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
	private WebElement txtSearchProduct;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1323.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.last.instock.sale.shipping-taxable.purchasable.product-type-variable > div > h3 > a")
	private WebElement btnGlasses;
	
	@FindBy(css = "#product-1323 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnAddtoCartGlasses;
	
	public void GotoProduct() {
		btnOrders.click();
		btnBrowseProduct.click();

	}
	
	public void addShoes(String color, String size) {
		btnCompareProduct.click();
		try {
			 Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().frame(0);
		btnSelectOption.click();
		try {
			 Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		choose = new Select(ChooseColor);
		choose.selectByVisibleText("Black");	
		choose = new Select(ChooseSize);
		choose.selectByVisibleText("37");
		btnAddtoCartShoes.click();
	}
	
	public void Search(String glasses) {
		btnSearch.click();
		txtSearchProduct.sendKeys(glasses);
		txtSearchProduct.sendKeys(Keys.ENTER);
	}
	
	public void addGlasses(String color, String size) {
		btnGlasses.click();
		choose = new Select(ChooseColor);
		choose.selectByVisibleText("White");		
		choose = new Select(ChooseSize);
		choose.selectByVisibleText("One");
		btnAddtoCartGlasses.click();
	}
	

}
