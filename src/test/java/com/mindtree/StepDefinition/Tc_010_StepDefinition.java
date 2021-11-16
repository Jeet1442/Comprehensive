package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.Tc_007_PageObject;
import com.mindtree.PageObject.Tc_008_PageObject;
import com.mindtree.PageObject.Tc_009_PageObject;
import com.mindtree.PageObject.Tc_010_PageObject;

import io.cucumber.java.en.*;

public class Tc_010_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Tc_010_StepDefinition.class.getName());
	
	@Given("User enters the proper url of the website as given")
	public void user_enters_the_proper_url_of_the_website_as_given() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully validated the url");
	}

	@When("User clicks on Contact Us link at the bottom of the page")
	public void user_clicks_on_contact_us_link_at_the_bottom_of_the_page() {
		Tc_010_PageObject tc10 = new Tc_010_PageObject(driver);
		tc10.contact_us().click();
	}

	@And("Enter no email only enters name and message")
	public void enter_no_email_only_enters_name_and_message() {
		Tc_010_PageObject tc10 = new Tc_010_PageObject(driver);
		tc10.name().sendKeys("Debjeet");
		tc10.message().sendKeys("Bye");
	}

	@Then("User clicks on send to send the message")
	public void user_clicks_on_send_to_send_the_message() {
		Tc_010_PageObject tc10 = new Tc_010_PageObject(driver);
		tc10.send().click();
		log.info("Successfully validated contact us page with invalid data");
		
		driver.close();
	    
	}

	
}