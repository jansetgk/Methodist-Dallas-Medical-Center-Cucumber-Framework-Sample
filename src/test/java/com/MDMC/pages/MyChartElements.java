package com.MDMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MDMC.testbase.BaseClass;

public class MyChartElements {
	
	@FindBy(xpath="//ul[@id='SecondaryNav1']/li[2]/a")
	public WebElement mChartBottom;
	
	@FindBy(xpath="//div[@id='MainContent']/p[3]/a[2]")
	public WebElement existingUser;
	
	@FindBy(id="Login")
	public WebElement myChartUser;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(id="submit")
	public WebElement submit;
	
	@FindBy(xpath="//div[@id='links']/a[1]")
	public WebElement viewTest;
	
	@FindBy(xpath="//div[@id='main']/div[1]/h1")
	public WebElement header;
	
	
	public MyChartElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
