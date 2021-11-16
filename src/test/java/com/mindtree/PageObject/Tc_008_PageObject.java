package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore.Tc_007_UI;
import com.mindtree.UIStore.Tc_008_UI;

public class Tc_008_PageObject {
	
	WebDriver driver;
	public Tc_008_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement gift_card() {
		return driver.findElement(Tc_008_UI.gift_card);
	}
	
	public WebElement cost() {
		return driver.findElement(Tc_008_UI.cost);
	}
	
	public WebElement add() {
		return driver.findElement(Tc_008_UI.add);
	}
	

}
