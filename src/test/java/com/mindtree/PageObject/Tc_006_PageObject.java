package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.mindtree.UIStore.Tc_006_UI;

public class Tc_006_PageObject {
	
	WebDriver driver;
	public Tc_006_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement home_decor() {
		return driver.findElement(Tc_006_UI.home_decor);
	}
	
	public WebElement product() {
		return driver.findElement(Tc_006_UI.product);
	}
	
	public WebElement add_to_cart() {
		return driver.findElement(Tc_006_UI.add_to_cart);
	}
	
	public WebElement remove() {
		return driver.findElement(Tc_006_UI.remove);
	}
	

}
