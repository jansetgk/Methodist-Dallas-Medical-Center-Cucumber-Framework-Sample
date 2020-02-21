package com.MDMC.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="srs/test/resources/features"
		,glue="com/MDMC/steps"
		,dryRun=false
		,plugin= {"pretty"
				,"html:target/MDMC/cucumber-default-report"
				,"json:target/cucumber.json"
				,"rerun:target/failed.txt"}
		,monochrome=true
		,tags= {"@smoke"}
		)

public class SmokeRunner {

}
