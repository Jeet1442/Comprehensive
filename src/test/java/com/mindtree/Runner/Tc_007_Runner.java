package com.mindtree.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features//Tc_007.feature",
		glue = "com.mindtree.StepDefinition"
		
		)
public class Tc_007_Runner extends AbstractTestNGCucumberTests {

}
