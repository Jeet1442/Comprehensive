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
import com.mindtree.PageObject.Tc_005_PageObject;

public class Tc_005_Runner extends Base{
	public static Logger log = LogManager.getLogger(Tc_005_Runner.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Successfully validated the url");
		
	}
	
	@Test
	public void Case1() throws InterruptedException {
		Tc_005_PageObject tc5 = new Tc_005_PageObject(driver);
		
		tc5.about_us().click();
		String title = tc5.title().getText();
		
		Assert.assertEquals(title, "About us");
		log.info("Successfully validated the title of the page");
		tc5.back().click();
		
		
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}


