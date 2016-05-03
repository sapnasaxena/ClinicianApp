package com.qa.mobileapp.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
	protected AppiumDriver driver;
	public static boolean f11 = false;
	protected final By dismissLocationLocator = By.name("Dismiss");

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
		GlobalUtil.wait(2);
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
}


