package com.testLayerPackage;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageLayerPackage.HomePage;

public class TestFunctionalityforProductPurchase {

	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		HomePage homepage_objct = new HomePage(driver);
		homepage_objct.searchIteminSearchtextbox("Mens Watch");
		homepage_objct.clickOnProductlink();
		Thread.sleep(5000);
		//JavascriptExecutor js =  (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,5000)");
		//homepage_objct.clickOnAddToCartButton();
		homepage_objct.clickOnSearchTextbox("sunglass");
		
		
	}
	
	
	
	
	
	
}
