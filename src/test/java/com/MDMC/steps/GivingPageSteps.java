package com.MDMC.steps;

import com.MDMC.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GivingPageSteps extends CommonMethods {
	
	@Given("I navigate for giving page")
	public void i_navigate_for_giving_page() throws InterruptedException {
	    click(homePE.giving);
	    Thread.sleep(1000);
	    
	}

	@Then("I click volunteer link")
	public void i_click_volunteer_link() throws InterruptedException  {
		//scrollIntoElement(givenPE.volunteerLink);
		scrollDown(300);
		click(givenPE.volunteerLink);
		Thread.sleep(1000);
	}

	@Then("I click Why Volunteer? link")
	public void i_click_Why_Volunteer_link() throws InterruptedException {
		
		jsClick(givenPE.whyVolunteer);
		Thread.sleep(1000);
	}

	@Then("I click Volunteer Opportunities")
	public void i_click_Volunteer_Opportunities() throws InterruptedException {
		jsClick(givenPE.volunteerOpportunities);
		Thread.sleep(1000);
	}

	@Then("I click Junior Volunteer")
	public void i_click_Junior_Volunteer() throws InterruptedException {
		jsClick(givenPE.juniorVolunteers);
		Thread.sleep(1000);
	}

	@Then("I click Apply online")
	public void i_click_Apply_online() throws InterruptedException {
		jsClick(givenPE.apllyOnline);
		Thread.sleep(2000);
	}

	@Then("answer first Question")
	public void answer_first_Question() throws InterruptedException {
	   
		givenPE.firstTextArea.sendKeys("I want to help people");
		Thread.sleep(1000);
	}

	@Then("navigate back")
	public void navigate_back() {
	   driver.switchTo().window("https://www.methodisthealthsystem.org/giving/");
	}


}
