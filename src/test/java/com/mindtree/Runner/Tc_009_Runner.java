package com.mindtree.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features//Tc_009.feature",
		glue = "com.mindtree.StepDefinition"
		
		)
public class Tc_009_Runner extends AbstractTestNGCucumberTests {

}
