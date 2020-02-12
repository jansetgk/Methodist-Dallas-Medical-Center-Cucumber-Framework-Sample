package com.MDMC.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.MDMC.pages.FindADoctorPageElements;
import com.MDMC.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FindADoctorSteps extends CommonMethods {


	FindADoctorPageElements obj= new FindADoctorPageElements();
	
	@Given("I go to find a doctor page")
	public void i_go_to_find_a_doctor_page() {
		obj.findADoctor.click();
	}

	@When("I enter doctor's deatails")
	public void i_enter_doctor_s_deatails(DataTable findAdoctor) throws InterruptedException {
	    List<Map<String,String>> findD=findAdoctor.asMaps();
	    for(Map<String,String>mapD:findD) {
		
	    Select speciality=new Select(obj.speciality);
		speciality.selectByVisibleText(mapD.get("SPECIALTY"));
		
		Select location=new Select(obj.distance);
		location.selectByVisibleText(mapD.get("LOCATION"));
		
		sendText(obj.zipCode, mapD.get("ZipCode"));
		
		Select languages=new Select(obj.language);
		languages.selectByVisibleText(mapD.get("LANGUAGE"));
		
		Select genders=new Select(obj.gender);
		genders.selectByVisibleText(mapD.get("GENDER"));
		
		Thread.sleep(1000);
	    }	
		
	}

	@Then("I click  the doctor I  found")
	public void i_click_the_doctor_I_found() throws InterruptedException {
	    
		obj.physianResult.click();
		Thread.sleep(1000);
	}
}
