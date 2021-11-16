package com.mindtree.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.Tc_001_PageObject;
import com.mindtree.PageObject.Tc_002_PageObject;
import com.mindtree.PageObject.Tc_003_PageObject;
import com.mindtree.PageObject.Tc_004_PageObject;

public class Tc_004_Runner extends Base{
	public static Logger log = LogManager.getLogger(Tc_004_Runner.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Successfully validated the url");
		
	}
	
	@Test
	public void Case1() throws InterruptedException {
		Tc_004_PageObject tc4 = new Tc_004_PageObject(driver);
		
		tc4.christmas_gift().click();
		tc4.product().click();
		tc4.add_to_cart().click();
		log.info("Successfully added a christmas gift product to the cart");
		
		
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}


