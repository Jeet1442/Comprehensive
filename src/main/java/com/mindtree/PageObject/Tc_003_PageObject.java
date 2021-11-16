package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.Tc_001_UI;
import com.mindtree.UIStore.Tc_002_UI;
import com.mindtree.UIStore.Tc_003_UI;



public class Tc_003_PageObject {
	
	WebDriver driver;
	public Tc_003_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement search_bar() {
		return driver.findElement(Tc_003_UI.search_bar);
	}
	
	
	
	public WebElement product() {
		return driver.findElement(Tc_003_UI.product);
	}
	
	public WebElement wishlist() {
		return driver.findElement(Tc_003_UI.wishlist);
	}
	
	
	

}
