package com.MDMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MDMC.testbase.BaseClass;

public class CareerPageElements {

	@FindBy(xpath="//ul[@id='SecondaryNav1']/li[3]/a")
	public WebElement careersB;
	
	@FindBy(xpath="//div[@id='MainContent']/p[3]/a")
	public WebElement crOppertunities;
	
	@FindBy(id="search_location")
	public WebElement sLocation;
	
	@FindBy(id="search_category")
	public WebElement sCategory;
	
	@FindBy(id="jobsearch")
	public WebElement jobsearch;
	
	@FindBy(xpath="//div[@id='listings']/div[1]/h3/span")
	public WebElement jobHeader;
	
	@FindBy(id="modal40296")
	public WebElement ApplyB;
	
	@FindBy(xpath="//h3[@class='simple card-heading']/span")
	public WebElement headerSignin;
	
	@FindBy(id="yesButton")
	public WebElement yesButton;
	
	@FindBy(xpath="//*[@id='filters']/div/div[1]/div/div[1]/div/div[2]/ul/a[5]")
	public WebElement emergency;
	
	@FindBy(xpath="//*[@id='searches']/div/div/form/div/div[1]/div/input")
	public WebElement Qwhat;
	
	@FindBy(xpath="//*[@id='searches']/div/div/form/div/div[2]/div/div[3]/div/div/input")
	public WebElement Qwhere;
	
	@FindBy(id="radiusChooser")
	public WebElement withinButtom;
	
	@FindBy(xpath="//*[@id='searches']/div/div/form/div/div[2]/div/div[2]/div/ul/li[7]/a")
	public WebElement distance;
	
	@FindBy (xpath="//button[@class='form-control btn btn-primary']")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id='searchResults']/div/div/div/div/span[3]")
	public WebElement result;
	
	
	
	
	
	public CareerPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
