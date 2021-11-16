package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class Tc_006_UI {
	
	public static By home_decor = By.xpath("//*[@title='Home Decor']");
	
	public static By product = By.xpath("//*[@data-id='7044608557254']");
	
	public static By add_to_cart = By.name("add");
	
	public static By remove = By.xpath("//button[text()='Remove']");
}
