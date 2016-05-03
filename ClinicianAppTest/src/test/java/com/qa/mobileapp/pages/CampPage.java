package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CampPage extends BasePage {

	public CampPage(AppiumDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By campNameLocator = By.name("Camp"); 
	private final By campLocationLocator = By.id("com.healthvista.clinicianapp.stage:id/campLoc");
	private final By addLeadBtnLocator = By.id("com.healthvista.clinicianapp.stage:id/leadBtn");
	private final By addPatientBtnLocator = By.id("com.healthvista.clinicianapp.stage:id/patientBtn");
	
	public By getCampNameLocator()
	{
		return campNameLocator;
	}

	public By getCampLocationLocator()
	{
		return campLocationLocator;
	}
	
	public By getAddLeadBtnLocator()
	{
		return addLeadBtnLocator;
	}

	public By getAddPatientBtnLocator()
	{
		return addPatientBtnLocator;
	}

	//Functions
	public void onClickCampNavBar()
	{
		clickWhenVisible(campNameLocator);
		
	}
	
	public void onClickAddLeadButton()
	{
	clickWhenVisible(addLeadBtnLocator);
		
	}
	
	public void onClickAddPatientButton()
	{
		clickWhenVisible(addPatientBtnLocator);
		
	}

}
