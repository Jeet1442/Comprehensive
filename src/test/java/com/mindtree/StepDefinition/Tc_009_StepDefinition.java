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

import io.cucumber.java.en.*;

public class Tc_009_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Tc_009_StepDefinition.class.getName());
	
	@Given("User enters the proper url of the website")
	public void user_enters_the_proper_url_of_the_website() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully validated the url");
	}

	@When("User clicks on Contact Us link")
	public void user_clicks_on_contact_us_link() {
		
		Tc_009_PageObject tc9 = new Tc_009_PageObject(driver);
		tc9.contact_us().click();
	}

	@And("Enter valid email along with name and message")
	public void enter_valid_email_along_with_name_and_message() {
		
		Tc_009_PageObject tc9 = new Tc_009_PageObject(driver);
		tc9.name().sendKeys("Debjeet");
		tc9.email().sendKeys("saha.deb45618@gmail.com");
		tc9.message().sendKeys("Hello");
	   
	}

	@Then("User sends the message")
	public void user_sends_the_message() throws InterruptedException {
		
		Tc_009_PageObject tc9 = new Tc_009_PageObject(driver);
		
		tc9.send().click();
		log.info("Successfully validated contact us page with valid data");
		
		driver.close();
	}
	
}