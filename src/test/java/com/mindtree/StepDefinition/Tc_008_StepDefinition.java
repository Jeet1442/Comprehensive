package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.Tc_007_PageObject;
import com.mindtree.PageObject.Tc_008_PageObject;

import io.cucumber.java.en.*;

public class Tc_008_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Tc_008_StepDefinition.class.getName());
	
	@Given("The user enters the proper website url")
	public void the_enters_the_proper_website_url() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully validated the url");
	}

	@When("User clicks on Gift Card")
	public void user_clicks_on_gift_card() {
		Tc_008_PageObject tc8 = new Tc_008_PageObject(driver);
		tc8.gift_card().click();
	   
	}

	@Then("User selects Rs1000 worth of gift cards")
	public void user_selects_rs1000_worth_of_gift_cards() {
		Tc_008_PageObject tc8 = new Tc_008_PageObject(driver);
		tc8.cost().click();
	   
	}

	 @And("^User makes the quantity as 3$")
	    public void user_makes_the_quantity_as_3() throws Throwable {
		 Tc_008_PageObject tc8 = new Tc_008_PageObject(driver);
	     for(int i=0;i<2;i++) {
	    	
	 		tc8.add().click();
	     }
	     log.info("Successfully verified gift card page");
		 driver.close();
	}

	
}