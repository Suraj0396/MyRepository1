package com.PageLayerPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	 public HomePage(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//input[@id='inputValEnter']")
	 private WebElement ItemSearchtxtbox;
	
	 public void searchIteminSearchtextbox(String productname) {
		 ItemSearchtxtbox.sendKeys(productname +Keys.ENTER);
		 
	 }
	 @FindBy(xpath="(//a[@class='dp-widget-link noUdLine hashAdded'])[11]")
	 private WebElement select_the_productitem;
	
	 public void clickOnProductlink() {
		 select_the_productitem.click();
		 
	 }
	 @FindBy(xpath="//div[@id='add-cart-button-id']")
	 private WebElement click_addtocart_button;
	 
	 public void clickOnAddToCartButton() {System.out.println("handle exception");
		 click_addtocart_button.click();
	 }
	
	 @FindBy(xpath="//input[@id='inputValEnter']")
	 private WebElement clicksearchtextbox;
	 
	 public void clickOnSearchTextbox(String product) {System.out.println(product);
		 clicksearchtextbox.sendKeys(product);
 }

}
