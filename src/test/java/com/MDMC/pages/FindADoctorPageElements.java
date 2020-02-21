package com.MDMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MDMC.testbase.BaseClass;

public class FindADoctorPageElements {

	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li[2]/a/span")
	public WebElement findADoctor;
	
	@FindBy(id="PhysicianResults_HDR0_SpecialtyIDs")
	public WebElement speciality;
	
	@FindBy(id="PhysicianResults_HDR0_Distance")
	public WebElement distance;
	
	@FindBy(id="PhysicianResults_HDR0_ZipCodeSearch")
	public WebElement zipCode;
	
	@FindBy(id="PhysicianResults_HDR0_LanguageIDs")
	public WebElement language;
	
	@FindBy(id="PhysicianResults_HDR0_Gender")
	public WebElement gender;
	
	@FindBy(xpath="//*[@id=\"PhysicianResults\"]/div[2]/article/div[1]/ul/li[2]/a/div[2]/span")
	public WebElement physianResult;
	
	@FindBy (id="PhysicianResults_HDR0_PhysicianName")
	public WebElement physicianName ;
	
	@FindBy (xpath="//div[@id='PhysicianBio']/div/div/div[2]/div/div/div[2]/strong")
	public WebElement speakLanguage;
	
	public FindADoctorPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
