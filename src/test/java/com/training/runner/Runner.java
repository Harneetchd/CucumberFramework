package com.training.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (
		features= "/Users/harneetkaur/eclipse-workspace/CucumberFramework/features/Login.feature" , 
        glue    = {"com.training.steps"}, 
        plugin  = {"pretty","html:target/cucumber-reports/cucumber.html",
                            "json:target/cucumber-reports/cucumber.json"}
        //tags =  "@SmokeScenario"
		         )

 

public class Runner {
	
	

}
