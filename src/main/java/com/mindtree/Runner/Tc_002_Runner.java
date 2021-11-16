package com.mindtree.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindree.reusableComponent.Base;

import com.mindtree.PageObject.Tc_001_PageObject;
import com.mindtree.PageObject.Tc_002_PageObject;
import com.mindtree.Utilities.Excel;

public class Tc_002_Runner extends Base{
	public static Logger log = LogManager.getLogger(Tc_002_Runner.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Successfully validated the url");
		
	}
	
	@Test
	public void Case1() throws InterruptedException {
		Excel excel = new Excel("C:\\Users\\Debjeet\\eclipse-workspace\\Comprehensive\\Excel\\Hybrid Excel.xlsx");
		Tc_002_PageObject tc2 = new Tc_002_PageObject(driver);
		
		tc2.sign_in().click();
		tc2.email().sendKeys(excel.getData(0, 1, 1));
		tc2.password().sendKeys(excel.getData(0, 1, 2));
		tc2.submit().click();
		log.info("Successfully entered wrong details and clicked on sign in");
		
		
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}


