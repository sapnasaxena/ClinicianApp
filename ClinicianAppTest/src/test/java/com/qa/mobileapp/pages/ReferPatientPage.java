package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

//Author: Shital Kumar

public class ReferPatientPage extends BasePage {

	public ReferPatientPage(AppiumDriver driver) {
		super(driver);
		
	}
	private final By referPatientScreenLocator = By.name("Refer a Patient");
	private final By ReferAPatientText = By.name("Refer a Patient");
	private final By radioButton= By.id("com.healthvista.clinicianapp.stage:id/porteaNetwork");
	private final By PorteaPatient = By.id("com.healthvista.clinicianapp.stage:id/porteaNetwork");
	private final By PersonalNetwork=By.id("com.healthvista.clinicianapp.stage:id/personalNetwork");
	private final By NewPatientName= By.id("com.healthvista.clinicianapp.stage:id/patientName");
	private final By PatientMobileNumber= By.id("com.healthvista.clinicianapp.stage:id/patientPhone");
	private final By ServiceRequiredText= By.name("Service Required");
	private final By PhysiotherapyText = By.id("android:id/text1");
	private final By CityText= By.name("City");
	private final By BangaloreText= By.name("Bangalore");
	private final By ExistingPatinet=By.id("com.healthvista.clinicianapp.stage:id/referralPatId");
	private final By PatientDetails= By.id("com.healthvista.clinicianapp.stage:id/referralPatDetail");
	private final By CancelButton= By.id("com.healthvista.clinicianapp.stage:id/referCancel");
	private final By DoneButton=By.id("com.healthvista.clinicianapp.stage:id/referOk");
	
	
	public By getReferPatientScreenLocator()
	{
		return referPatientScreenLocator;
	}
	
	
	public By getReferAPatientText()
	{
		return ReferAPatientText;
	}
	
	public By getPorteaPatient()
	{
		return PorteaPatient;
	}
	
	public By getradioButton()
	{
		return radioButton;
	}
	
	public By getPersonalNetwork()
	{
		return PersonalNetwork;
	}
	
	public By getNewPatientName()
	{
		return NewPatientName;
	}
	
	public By getPatientMobileNumber()
	{
		return PatientMobileNumber;
	}
	
	public By getServiceRequiredText()
	{
		return ServiceRequiredText;
	}
	
	public By getPhysiotherapyText()
	{
		return PhysiotherapyText;
	}
	
	public By getCityText()
	{
		return CityText;
	}
	
	public By getBangaloreText()
	{
		return BangaloreText;
	}
	
	public By getExistingPatinet()
	{
		return ExistingPatinet;
	}
	
	public By getPatientDetails()
	{
		return PatientDetails;
	}
	
	public By getCancelButton()
	{
		return CancelButton;
	}
	
	public By getDoneButton()
	{
		return DoneButton;
	}
	
	
	//Functions
	
//	public void onClickreferPatientScreenLocator()
//	{
//		WebElement referPtntScrnLctr= clickWhenVisible(referPatientScreenLocator);
//		referPtntScrnLctr.click();
//	}
//	
	public void onClickreferPatientScreenLocator()
	{
	clickWhenVisible(referPatientScreenLocator);
		
	}
	
	public void onClickReferAPatientText()
	{
		clickWhenVisible(ReferAPatientText);
	
	}
	
	public void onClickPorteaPatient()
	{
		clickWhenVisible(PorteaPatient);
	
	}
	
	public void onClickradioButton()
	{
		clickWhenVisible(radioButton);
		
	}
	
	public void onClickPersonalNetwork()
	{
		clickWhenVisible(PersonalNetwork);
		
	}

	public void onClickNewPatientName()
	{
		clickWhenVisible(NewPatientName);
		
	}
	
	public void onClickPatientMobileNumber()
	{
		clickWhenVisible(PatientMobileNumber);
		
	}
	
	public void onClickServiceRequiredText()
	{
		clickWhenVisible(ServiceRequiredText);
		
	}
	
	public void onClickPhysiotherapyText()
	{
	clickWhenVisible(PhysiotherapyText);
		
	}
	
	public void onClickCityText()
	{
		clickWhenVisible(CityText);
		
	}
	
	public void onClickBangaloreText()
	{
		clickWhenVisible(BangaloreText);
	
	}
	
	public void onClickExistingPatinet()
	{
		clickWhenVisible(ExistingPatinet);
		
	}
	
	public void onClickPatientDetails()
	{
		 clickWhenVisible(PatientDetails);
		
	}
	
	public void onClickCancelButton()
	{
		clickWhenVisible(CancelButton);
		
	}
	
	public void onClickDoneButton()
	{
		clickWhenVisible(DoneButton);
		
	}
}
