package com.mindtree.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindree.reusableComponent.Base;

import com.mindtree.PageObject.Tc_001_PageObject;
import com.mindtree.Utilities.Excel;



public class Tc_001_Runner extends Base{
	public static Logger log = LogManager.getLogger(Tc_001_Runner.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Successfully validated the url");
		
	}
	
	@Test
	public void Case1() {
		Excel excel = new Excel("C:\\Users\\Debjeet\\eclipse-workspace\\Comprehensive\\Excel\\Hybrid Excel.xlsx");
		Tc_001_PageObject tc1 = new Tc_001_PageObject(driver);
		
		tc1.sign_in().click();
		tc1.email().sendKeys(excel.getData(0, 1, 1));
		tc1.password().sendKeys("@Debjeet123");
		tc1.submit().click();
		log.info("Successfully entered correct details and clicked on sign in");
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}


