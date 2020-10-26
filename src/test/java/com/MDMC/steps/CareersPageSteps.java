package com.MDMC.steps;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import com.MDMC.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CareersPageSteps extends CommonMethods {

	@Given("I click Careers link")
	public void i_click_Careers_link() {
		career.careersB.click();;
	}

	@Given("I click search our career opportunities")
	public void i_click_search_our_career_opportunities() {
		
		click(career.crOppertunities);
	}

	@Given("I choose location")
	public void i_choose_location() {
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>itW=windows.iterator();
		String parent=itW.next();
		String child=itW.next();
		driver.switchTo().window(child);
		
		Select slc=new Select(career.sLocation);
		slc.selectByVisibleText("Methodist Dallas Medical Center");
	}

	@Given("I choose Catagory")
	public void i_choose_Catagory() {
		Select slct=new Select(career.sCategory);
		slct.selectByValue("Nursing");
	}

	@Given("I click Search bottom")
	public void i_click_Search_bottom() {
		click(career.jobsearch);
	}

	@When("I cilck the first job appears on the list")
	public void i_cilck_the_first_job_appears_on_the_list() {
		click(career.jobHeader);
	}

	@When("I click the Apply bottom")
	public void i_click_the_Apply_bottom() {
		click(career.ApplyB);
		click(career.yesButton);
		
	}

	@Then("I see Sign In page")
	public void i_see_Sign_In_page() {
		String signInH=career.headerSignin.getText();
		Assert.assertEquals("Sign In", signInH);
	}

	@When("I choose the Department")
	public void i_choose_the_Department() {
		click(career.emergency);
	}

	@When("I fill What and Where")
	public void i_fill_What_and_Where() {
		career.Qwhat.sendKeys("Nursing");
		career.Qwhere.sendKeys("Dallas, TX, USA");
		
	}

	@When("I click search")
	public void i_click_search() {
		click(career.searchButton);
	}

	@Then("I see the results")
	public void i_see_the_results() {
		String searchResult=career.result.getText();
		Assert.assertEquals( "*Result", searchResult);
	}

}
