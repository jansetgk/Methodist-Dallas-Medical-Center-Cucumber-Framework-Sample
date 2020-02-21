package com.MDMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MDMC.testbase.BaseClass;
import com.MDMC.utils.CommonMethods;


public class HomePageElements extends CommonMethods {

	@FindBy(xpath="//section[@id='HospitalBannerArea']/ul/li/div/a")
	public WebElement aboutFacility;

	@FindBy(xpath="//nav[@id='SideNav']/ul/li/a")
	public WebElement aboutMHS;
	
	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li/a/span")
	public WebElement about;
	
	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li[2]/a/span")
	public WebElement findADoctor;
	
	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li[3]/a/span")
	public WebElement mDInstitues;
	
	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li[4]/a/span")
	public WebElement medicalServices;
	
	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li[5]/a/span")
	public WebElement patientsVisiters;
	
	@FindBy(xpath="//nav[@id='TopNavigation']/ul/li[7]/a/span")
	public WebElement giving;
	
	@FindBy(xpath="//div[@id='HospitalHeaderArea']/div/div[2]/div[2]/span/icon")
	public WebElement searchIcon;
	
	@FindBy(id="SiteSearch_ITM0_C")
	public WebElement searchText;
	
	@FindBy(id="SiteSearch_ITM0_ctl02")
	public WebElement searcButton;
	
	public HomePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
