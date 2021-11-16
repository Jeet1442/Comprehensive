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
import com.mindtree.Utilities.Excel;

public class Tc_003_Runner extends Base{
	public static Logger log = LogManager.getLogger(Tc_003_Runner.class.getName());
	
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
		Tc_003_PageObject tc3 = new Tc_003_PageObject(driver);
		
		tc3.search_bar().sendKeys(excel.getData(0, 1, 3));
		tc3.search_bar().sendKeys(Keys.ARROW_DOWN);
		tc3.search_bar().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		tc3.product().click();
		Thread.sleep(5000);
		tc3.wishlist().click();
		log.info("Successfully added product to the wishlist");
		
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}


