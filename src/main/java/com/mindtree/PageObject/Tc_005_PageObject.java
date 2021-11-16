package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.Tc_001_UI;
import com.mindtree.UIStore.Tc_002_UI;
import com.mindtree.UIStore.Tc_003_UI;
import com.mindtree.UIStore.Tc_004_UI;
import com.mindtree.UIStore.Tc_005_UI;



public class Tc_005_PageObject {
	
	WebDriver driver;
	public Tc_005_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement about_us() {
		return driver.findElement(Tc_005_UI.about_us);
	}
	
	public WebElement title() {
		return driver.findElement(Tc_005_UI.title);
	}
	
	public WebElement back() {
		return driver.findElement(Tc_005_UI.back);
	}
	
	
	
	
	
	
	
	
	

}
