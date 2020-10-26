package com.MDMC.runners;

import org.junit.runner.RunWith;

/**
 * APIRunner class which we have specified path to all feature files in features
 * and specified path to our API steps practice package
 * so that we dont execute our hooks which will initialize our WebDriver and open browser
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
			glue = {"com.MDMC.API" }, 
			dryRun = false,
			tags = "@APITEST")// since i don't have access to MDMC-API , I used to one I have access as a sample purpose

public class APIRunner {

}
