package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.Tc_006_PageObject;
import com.mindtree.PageObject.Tc_007_PageObject;

import io.cucumber.java.en.*;

public class Tc_007_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Tc_007_StepDefinition.class.getName());
	
	@Given("The user is on the home page of the website")
	public void the_user_is_on_the_home_page_of_the_website() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully validated the url");
	}

	@When("User clicks on Top50 and the product page is displayed")
	public void user_clicks_on_top_and_the_product_page_is_displayed() {
		Tc_007_PageObject tc7 = new Tc_007_PageObject(driver);
		tc7.top_50().click();
	}

	@Then("Sort the product to Best Selling from the drop down menu")
	public void sort_the_product_to_best_selling_from_the_drop_down_menu() {
		Tc_007_PageObject tc7 = new Tc_007_PageObject(driver);
		tc7.sort().click();
		for(int i=0;i<2;i++) {
			tc7.sort().sendKeys(Keys.ARROW_DOWN);
		}
		tc7.sort().sendKeys(Keys.ENTER);
	}

	@And("Select any product")
	public void select_any_product() {
		Tc_007_PageObject tc7 = new Tc_007_PageObject(driver);
		tc7.product().click();
		log.info("Successfully sorted the product and selected a product");
		
		driver.close();
	  
	}

	

	
}