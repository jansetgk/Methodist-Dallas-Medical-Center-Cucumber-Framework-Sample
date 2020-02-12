package com.MDMC.steps;

import com.MDMC.pages.HomePageElements;
import com.MDMC.testbase.BaseClass;
import com.MDMC.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends CommonMethods{

	HomePageElements hpe; 
	
	@Given("I open browser and navigate to the MDMC")
	public void i_open_browser_and_navigate_to_the_MDMC() {
	   BaseClass.setUp();
	}

	@When("I click on AboutOurFacility button")
	public void i_click_on_AboutOurFacility_button() throws InterruptedException {
		hpe=new HomePageElements();
		hpe.aboutFacility.click();
		Thread.sleep(2000);
	}

	@When("I click on AboutMethodistHealthSystem Button")
	public void i_click_on_AboutMethodistHealthSystem_Button() throws InterruptedException {
		hpe=new HomePageElements();
		hpe.aboutMHS.click();
		Thread.sleep(2000);
	}

	@Then("I close browser")
	public void i_close_browser() {
	    BaseClass.tearDown();
	}


}
