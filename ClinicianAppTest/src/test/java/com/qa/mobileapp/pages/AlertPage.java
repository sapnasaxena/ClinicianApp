package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class AlertPage extends BasePage{

	public AlertPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/* Author: Lipsha satpathy
	 * Created date: 5 April 2016
	 * XPATH for Alert Page 
	 * */
	private final By alertPageScreenLocator = By.name("Alerts");
	private final By GenerallistLocator=By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By titlelocator = By.id("com.healthvista.clinicianapp.stage:id/title");
	private final By DateLocators = By.id("com.healthvista.clinicianapp.stage:id/date");
	private final By MessageLocators = By.id("com.healthvista.clinicianapp.stage:id/msg");
	
	
	public By getAlertScreenLocator()
	{
		return alertPageScreenLocator;
	}
	public By getGenerallistLocator()
	{
		return GenerallistLocator;
	}
	public By gettitlelocator()
	{
		return titlelocator;
	}
	public By getDateLocators()
	{
		return DateLocators;
	}
	public By getMessageLocators()
	{
		return  MessageLocators;
	}
	
	



public void onClickAlertScreenLocator()
{
	clickWhenVisible(getAlertScreenLocator());

}

public void onClickGenerallistLocator()
{
	clickWhenVisible(getGenerallistLocator());

}
}


