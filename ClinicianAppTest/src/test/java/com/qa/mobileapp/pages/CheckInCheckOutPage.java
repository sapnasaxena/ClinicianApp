package com.qa.mobileapp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;

public class CheckInCheckOutPage extends BasePage {

	public CheckInCheckOutPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

private final By checkInErrorOnAddApptLocator =By.name("Please CheckIn");
private final By dismissLocator = By.name("Dismiss");


public By getCheckInErrorOnAddApptLocator() {
	return checkInErrorOnAddApptLocator;
}


public By getDismissLocator() {
return dismissLocator;
}

public void onTapDismissButton()
{
clickWhenVisible(dismissLocator);
}


}
