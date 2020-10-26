package com.MDMC.steps;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.MDMC.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyChartSteps extends CommonMethods {

	@Given("I click MyChart")
	public void i_click_MyChart() {
	    click(mChart.mChartBottom);
	}

	@Given("I click Existing User")
	public void i_click_Existing_User() throws InterruptedException {
		//scrollIntoElement(mChart.existingUser);
		click(mChart.existingUser);
		Thread.sleep(3000);
	}

	@When("I give my username and pasword")
	public void i_give_my_username_and_pasword() throws InterruptedException {
	   Set<String> windows=driver.getWindowHandles();
	   Iterator<String>ids=windows.iterator();
	   String parent=ids.next();
	   String child=ids.next();
	   
	   driver.switchTo().window(child);
	   mChart.myChartUser.sendKeys("janset123");
	   mChart.password.sendKeys("Asiye..12");
	   Thread.sleep(3000);
	  
	}

	@When("I click submit")
	public void i_click_submit() {
	    mChart.submit.click();
	}

	@When("I click View Test Results")
	public void i_click_View_Test_Results() {
		click(mChart.viewTest);
	}

	@Then("I see Test Results page")
	public void i_see_Test_Results_page() {
	   String text=mChart.header.getText();
		Assert.assertEquals("Test Results", text);
	}


}
