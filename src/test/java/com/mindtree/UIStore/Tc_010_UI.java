package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class Tc_010_UI {
	
	public static By contact_us = By.xpath("//a[text()='Contact us']");
	
	public static By name = By.xpath("//*[@type='text']");
	
	public static By email = By.xpath("//*[@type='email']");
	
	public static By message = By.name("contact[body]");
	
	public static By send = By.cssSelector("#contact_form > button");
			
	
	
}
