package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore.Tc_007_UI;

public class Tc_007_PageObject {
	
	WebDriver driver;
	public Tc_007_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement top_50() {
		return driver.findElement(Tc_007_UI.top_50);
	}
	
	public WebElement sort() {
		return driver.findElement(Tc_007_UI.sort_by);
	}
	
	public WebElement product() {
		return driver.findElement(Tc_007_UI.product);
	}
	

}
