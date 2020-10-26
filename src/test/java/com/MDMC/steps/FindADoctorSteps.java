package com.MDMC.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.MDMC.pages.FindADoctorPageElements;
import com.MDMC.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class FindADoctorSteps extends CommonMethods {

	
	@Given("I go to find a doctor page")
	public void i_go_to_find_a_doctor_page() throws InterruptedException {
			click(findD.findADoctor);
		
	}

	@When("I enter doctor's deatails")
	public void i_enter_doctor_s_deatails(DataTable findAdoctor) throws InterruptedException {
	    List<Map<String,String>> mapfindD=findAdoctor.asMaps();
	    for(Map<String,String>mapD:mapfindD) {
		
	    	Select speciality=new Select(findD.speciality);
	    	speciality.selectByVisibleText(mapD.get("SPECIALTY"));
		
	    	Select location=new Select(findD.distance);
	    	location.selectByVisibleText(mapD.get("LOCATION"));
		
	    	sendText(findD.zipCode, mapD.get("ZipCode"));
		
	    	Select languages=new Select(findD.language);
	    	languages.selectByVisibleText(mapD.get("LANGUAGE"));
		
	    	Select genders=new Select(findD.gender);
	    	genders.selectByVisibleText(mapD.get("GENDER"));
		
	    	Thread.sleep(1000);
	    }	
		
	}

	@Then("I click  the doctor I  found")
	public void i_click_the_doctor_I_found() throws InterruptedException {
	    
		findD.physianResult.click();
		Thread.sleep(1000);
	}
	
	@Then("I enter specialty  {string}")
	public void i_enter_specialty(String speciality) {
	    sendText(findD.speciality,speciality);
	}

	
	@Then("I enter {string}")
	public void i_enter (String name) {
	   sendText(findD.physicianName, name);
	}

	@SuppressWarnings("deprecation")
	@Then("i verify if he speaks {string}")
	public void i_verify_if_he_speaks(String language) {
	   Assert.assertEquals(language, findD.speakLanguage);
		
	}
	
}
