package com.qa.mobileapp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;

public class PCOScreenPage extends BasePage {

	public PCOScreenPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By selectAppointmentTypeLocator = By.name("Select Appointment");
	
	
	private final By appointmentDetailScreenLocator = By.name("Appointment");
	public By getAppointmentDetailScreenLocator() {
		return appointmentDetailScreenLocator;
	}
	public By getSelectAppointmentTypeLocator() {
		return selectAppointmentTypeLocator;
	}

}
