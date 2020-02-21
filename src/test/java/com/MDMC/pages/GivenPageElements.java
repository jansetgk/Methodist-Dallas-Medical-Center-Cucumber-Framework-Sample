package com.MDMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MDMC.utils.CommonMethods;

public class GivenPageElements extends CommonMethods {

	@FindBy(xpath="//nav[@id='AdvancedSideNav']/ul/li[4]/a")
	public WebElement volunteerLink;
	
	@FindBy(xpath="//nav[@id='SideNav']/ul/li[5]/a")
	public WebElement whyVolunteer;
	
	@FindBy(xpath="//nav[@id='SideNav']/ul/li[4]/a")
	public WebElement volunteerOpportunities;
	
	@FindBy(xpath="//nav[@id='SideNav']/ul/li[3]/a")
	public WebElement juniorVolunteers;
	
	@FindBy(xpath="//nav[@id='SideNav']/ul/li[1]/a")
	public WebElement apllyOnline;
	
	@FindBy (id="CO1")
	public WebElement firstTextArea;
	
	
	public GivenPageElements() {
		PageFactory.initElements(driver, this);
	}
}
