package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.Tc_001_UI;
import com.mindtree.UIStore.Tc_002_UI;
import com.mindtree.UIStore.Tc_003_UI;
import com.mindtree.UIStore.Tc_004_UI;



public class Tc_004_PageObject {
	
	WebDriver driver;
	public Tc_004_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement christmas_gift() {
		return driver.findElement(Tc_004_UI.christmas_gift);
	}
	
	
	
	public WebElement product() {
		return driver.findElement(Tc_004_UI.product);
	}
	
	public WebElement add_to_cart() {
		return driver.findElement(Tc_004_UI.add_to_cart);
	}
	
	
	
	
	

}
