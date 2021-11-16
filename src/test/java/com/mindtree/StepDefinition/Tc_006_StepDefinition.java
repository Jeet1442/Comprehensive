package com.mindtree.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.Tc_006_PageObject;

import io.cucumber.java.en.*;

public class Tc_006_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Tc_006_StepDefinition.class.getName());
	

	
	  @Given("^The user is on the home page$")
	    public void the_user_is_on_the_home_page() throws Throwable {
		  driver = Initialize();
			String url = prop.getProperty("url"); 
		    driver.get(url);
		    log.info("Successfully validated the url");
	        
	    }

	    @When("^User clicks on the Home Decore option and the product page is displayed$")
	    public void user_clicks_on_the_home_decore_option_and_the_product_page_is_displayed() throws Throwable {
	    	
	    	Tc_006_PageObject tc6 = new Tc_006_PageObject(driver);
	    	tc6.home_decor().click();
	    }
	    
	    @And("^User selects any product$")
	    public void user_selects_any_product() throws Throwable {
	    	Tc_006_PageObject tc6 = new Tc_006_PageObject(driver);
	    	tc6.product().click();
	        
	    }

	    @Then("^Clicks on Add to Cart option$")
	    public void clicks_on_add_to_cart_option() throws Throwable {
	    	Tc_006_PageObject tc6 = new Tc_006_PageObject(driver);
	    	tc6.add_to_cart().click();
	        
	    }

	    @And("^Clicks on Remove$")
	    public void clicks_on_remove() throws Throwable {
	    	Tc_006_PageObject tc6 = new Tc_006_PageObject(driver);
	        tc6.remove().click();
	        log.info("Successfully added and removed product from the cart");
	        
	        driver.close();
	    }

	    

}
