package com.qa.mobileapp.common;

import java.io.File;
import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.condition.ConditionRunner.Context;


public abstract class BasePage {
	protected AppiumDriver driver;
	public static boolean f11 = false;
	protected final By dismissLocationLocator = By.xpath("//android.widget.Button[contains(@text,'Dismiss')]");

	public By getDismissLocationLocator() {
		return dismissLocationLocator;
	}

	protected final By exitAppTitleLocator = By.name("Exit App");

	public By getExitAppTitleLocator(){
		return exitAppTitleLocator;
	}

	private final By homeScreenLocator = By.name("Dashboard");
	public By getHomeScreenLocator(){
		return homeScreenLocator;
	}

	public BasePage(AppiumDriver driver){
		this.driver = driver;
	}

	public void dismissLocation(int timeoutInSeconds){
		clickWhenVisible(dismissLocationLocator, timeoutInSeconds);
		GlobalUtil.wait(2);
	}

	public void dismissLocation(){
		clickWhenVisible(dismissLocationLocator);
	}

	public WebElement clickWhenVisible(By locator, int timeOutInSeconds){
		WebElement element = waitVisible(locator, timeOutInSeconds);
		if(element != null){
			element.click();
		}
		return element;
	}

	public WebElement clickWhenVisible(By locator){
		return clickWhenVisible(locator, GlobalUtil.StandardInterval);
	}

	public WebElement waitVisible(By locator, int timeOutInSeconds){
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		try{
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(Exception ex){
			System.out.println("Element not found.");
		}
		return element;
	}

	public WebElement waitVisible(By locator){
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, GlobalUtil.StandardInterval);
		try{
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(Exception ex){
			System.out.println("Element not found.");
		}
		return element;
	}
	
//	public Toast makeText (Context context, int resId, int duration)
//	{
//		return null;
//	}
	
	public String trimString(String oldStr, String replaceWith)
	{
		
		 String newStr= oldStr.replaceAll(oldStr,replaceWith);
			return newStr;	
	}
	
	/* public void testToastMessages(String img) throws Exception {
	        // get and capture the picture of the img element used to display the barcode image
	        WebElement testImage = driver.findElement(By.id(img));
	        File imageFile = ImageTextExtracter.captureElementPicture(testImage);
	 
	        // get the Tesseract direct interace
	        //Tesseract instance = new Tesseract();
	 
	        // the doOCR method of Tesseract will retrive the text
	        // from image captured by Selenium
	        String result = instance.doOCR(imageFile);
	 
	    }*/
	}
	



