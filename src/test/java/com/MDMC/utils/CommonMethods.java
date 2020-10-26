package com.MDMC.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MDMC.testbase.PageInitiliazer;


public class CommonMethods extends PageInitiliazer {

	/**
	 * This method will accept the alert
	 * 
	 * @throws NoAlertPresentException if alert is not present
	 */
	public static void acceptAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * This methods will dismiss the alert
	 * 
	 * @throws NoAlertPresentException if alert is not present
	 */
	public static void dismissAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not prresent");
		}
	}

	/**
	 * This method will get a text from the alert
	 * 
	 * @return text of the alert
	 * @throws NoAlertPresentException if alert is not present
	 */
	public static String getAlertText() {

		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
			return null;
		}
	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) {

		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param index
	 */
	public static void switchToFrame(int index) {

		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * This method will click on the element using JSExecutor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method will scroll until until specified element
	 * 
	 * @param element
	 */
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * This method will scroll page down
	 * 
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ")");
	}

	/**
	 * This method will scroll page up
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -" + pixel + ")");
	}

	/**
	 * This method will take a screenshot
	 * 
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot)driver;
		//create picture in a form of bytes --> we need it to attach it to our scenario
		byte[]picture=ts.getScreenshotAs(OutputType.BYTES);
	
		//taking a picture in a form of file and store it in the specified location
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HHmmss");
		String timeStamp = sdf.format(date.getTime());

		File file = ts.getScreenshotAs(OutputType.FILE);
		String scrshotFile = Constants.SCREENSHOTS_FILEPATH + fileName + timeStamp + ".png";

		try {
			FileUtils.copyFile(file, new File(scrshotFile));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}

		return picture;
	}
	/**
	 * This method will enter text
	 * 
	 * @param element
	 * @param value
	 */
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	/**
	 * This method will create an Object of WebDriverWait
	 * 
	 * @return WebDriverWait
	 */
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_LOAD_TIME);
		return wait;
	}

	/**
	 * This method will wait until element becomes clickable
	 * 
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait until element becomes visible
	 * 
	 * @param element
	 */
	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait until element becomes invisible
	 * 
	 * @param element
	 */
	public static void waitForInvisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.invisibilityOf(element));
	}
	/**
	 * This method will click on the element
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
	
	/**
	 * This method will move the mouse to given element
	 * 
	 * @param target
	 */
	public static void moveTo(WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(target);
	}

	/**
	 * This element does an action click to given element
	 * 
	 * @param target
	 */
	public static void actionsClick(WebElement target) {
		Actions action = new Actions(driver);
		action.click(target);
	}

	/**
	 * This method submits a form an waits the next page to be loaded
	 * 
	 * @param element
	 */
	public static void submit(WebElement element) {
		element.submit();
	}

	public static String getTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String formattedDate = sdf.format(date.getTime());
		return formattedDate;
	}
	
	/**
	 * This method select an option in drop down list by visible text
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	/**
	 * This method select an option in drop down list by value attribute
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method select an option in drop down list by index
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	

	/**
	 * This methods selects date from the calendar 
	 * @param element
	 * @param year
	 * @param month
	 * @param day
	 */

	public void selectDate(WebElement element, String year, String month, String day) {
		
		element.clear();
		element.click();

		WebElement mnth = driver.findElement(By.xpath("location of month"));
		Select mSelect = new Select(mnth);
		mSelect.selectByVisibleText(month);
		
		WebElement years=driver.findElement(By.xpath("location of year"));
		Select ySelect = new Select(years);
		ySelect.selectByVisibleText(year);

		List<WebElement> dayList = driver.findElements(By.xpath("location of days/th/td"));

		for (WebElement dy : dayList) {
			if (dy.getText().equals(day)) {
				dy.click();
				break;
			}
		}
	}
	
	
	/**
	 * This method will select value from DD
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDdValue(WebElement element, String visibleText) {
		Select select =new Select(element);
		List<WebElement>options=select.getOptions();
		boolean isFound=false;
		for(WebElement option : options) {
			if(option.getText().equals(visibleText)) {
				select.selectByVisibleText(visibleText);
				isFound=true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("Value " + visibleText + "was not found in the dropdown");
		}
	}
	
	/**
	 * This method will select value from dd
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDdValue(WebElement element, int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		boolean isFound = false;
		if (options.size() > index) {
			select.selectByIndex(index);
			isFound = true;
		}

		if (!isFound) {
			System.out.println("Value with index " + index + "was not selected");
		}
	}

	/**
	 * This method select an option in drop down list by value attribute
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectDDText(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options=select.getOptions();

		boolean isFound=false;
		
		for(WebElement option:options) {
			if(option.getText().equals(value)) {
				select.selectByVisibleText(value);
				isFound=true;
				break;
			}else if(option.getAttribute("value").contains(value)) {
				select.selectByValue(value);
				isFound=true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println(value+" is not found in the Dropdown List");
		}

	}
	
	
	/**
	 * This method will click on the radio based on the text
	 * 
	 * @param elements
	 * @param radioText
	 */
	public static void clickRadio(List<WebElement> elements, String radioText) {

		for (WebElement el : elements) {

			if (el.getText().equals(radioText)) {
				el.click();
				break;
			}
		}	
	}

	public static String jsonFile;
	/**
	 * This methods receives the filename of the jSon file and returns it in String format
	 * @param fileName
	 * @return
	 */
	     public static String readJson(String fileName) {
	    	 try {
	    		 
	    		 jsonFile = new String(Files.readAllBytes(Paths.get(fileName)));
	    		 
	    	 } catch(IOException e) {
	    		 
	    		 e.printStackTrace();
	    	 }
	    	 return jsonFile;
	    	 
	     }    
	     
}
	
	
	
	
	
	
	
	
