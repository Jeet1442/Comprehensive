package com.mindtree.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features//Tc_010.feature",
		glue = "com.mindtree.StepDefinition"
		
		)
public class Tc_010_Runner extends AbstractTestNGCucumberTests {

}
