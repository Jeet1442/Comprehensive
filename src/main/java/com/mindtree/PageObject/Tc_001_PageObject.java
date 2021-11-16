package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.Tc_001_UI;



public class Tc_001_PageObject {
	
	WebDriver driver;
	public Tc_001_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement sign_in() {
		return driver.findElement(Tc_001_UI.sign_in);
	}
	
	public WebElement email() {
		return driver.findElement(Tc_001_UI.email);
	}
	
	public WebElement password() {
		return driver.findElement(Tc_001_UI.password);
	}
	
	public WebElement submit() {
		return driver.findElement(Tc_001_UI.submit);
	}
	

}
