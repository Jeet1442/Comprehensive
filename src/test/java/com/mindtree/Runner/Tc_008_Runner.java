package com.mindtree.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features//Tc_008.feature",
		glue = "com.mindtree.StepDefinition"
		
		)
public class Tc_008_Runner extends AbstractTestNGCucumberTests {

}
