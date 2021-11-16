package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore.Tc_007_UI;
import com.mindtree.UIStore.Tc_008_UI;
import com.mindtree.UIStore.Tc_009_UI;
import com.mindtree.UIStore.Tc_010_UI;

public class Tc_010_PageObject {
	
	WebDriver driver;
	public Tc_010_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement contact_us() {
		return driver.findElement(Tc_010_UI.contact_us);
	}
	
	public WebElement name() {
		return driver.findElement(Tc_010_UI.name);
	}
	
	public WebElement email() {
		return driver.findElement(Tc_010_UI.email);
	}
	
	public WebElement message() {
		return driver.findElement(Tc_010_UI.message);
	}
	
	public WebElement send() {
		return driver.findElement(Tc_010_UI.send);
	}
}
