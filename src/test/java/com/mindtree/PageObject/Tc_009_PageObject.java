package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore.Tc_007_UI;
import com.mindtree.UIStore.Tc_008_UI;
import com.mindtree.UIStore.Tc_009_UI;

public class Tc_009_PageObject {
	
	WebDriver driver;
	public Tc_009_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement contact_us() {
		return driver.findElement(Tc_009_UI.contact_us);
	}
	
	public WebElement name() {
		return driver.findElement(Tc_009_UI.name);
	}
	
	public WebElement email() {
		return driver.findElement(Tc_009_UI.email);
	}
	
	public WebElement message() {
		return driver.findElement(Tc_009_UI.message);
	}
	
	public WebElement send() {
		return driver.findElement(Tc_009_UI.send);
	}
}
