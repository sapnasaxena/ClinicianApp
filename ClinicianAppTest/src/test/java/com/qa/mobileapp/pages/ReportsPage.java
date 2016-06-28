package com.qa.mobileapp.pages;



import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;


public class ReportsPage extends BasePage{

	public ReportsPage(AppiumDriver driver) {
		super(driver);
		
	}

	private final By reportScreenLocator = By.name("Email Report");
			//By.id("com.healthvista.clinicianapp.stage:id/design_menu_item_text");
	private final By startNEndDateText= By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By reportTypeText= By.id("com.healthvista.clinicianapp.stage:id/reporttypetext");
	private final By cancelBtn= By.name("Cancel");
	private final By continueBtn= By.name("Continue");
	private final By timings= By.name("Timings");
	private final By leaves= By.name("Leaves");
	private final By appointments= By.name("Appointments");
	private final By alertTtlEmailadrs= By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By enterEmailId= By.id("com.healthvista.clinicianapp.stage:id/emailText");
	private final By soonTxt= By.id("com.healthvista.clinicianapp.stage:id/statusText");
	private final By getReportBtn= By.name("Get Reports");
	private final By monthPicker= By.id("android:id/date_picker_month");
	private final By datePicker= By.id("android:id/date_picker_day");
	private final By yearPicker= By.id("android:id/date_picker_year");
	private final By dayPicker= By.id("android:id/date_picker_header");
	
	
	
	public By getreportScreenLocator()
	{
		return reportScreenLocator;
	}
	
	public By getstartNEndDateText()
	{
		return startNEndDateText;
	}
	
	public By getreportTypeText()
	{
		return reportTypeText;
	}
	
	public By getcancelBtn()
	{
		return cancelBtn;
	}
	
	public By getcontinueBtn()
	{
		return continueBtn;
	}
	
	public By gettimings()
	{
		return timings;
	}
	
	public By getleaves()
	{
		return leaves;
	}
	
	public By getappointments()
	{
		return appointments;
	}
	
	public By getalertTtlEmailadrs()
	{
		return alertTtlEmailadrs;
	}
	
	public By getenterEmailId()
	{
		return enterEmailId;
	}
	
	public By getsoonTxt()
	{
		return soonTxt;
	}
	
	public By getgetReportBtn()
	{
		return getReportBtn;
	}
	
	//Functions
	
	public void onClickreportScreenLocator()
	{
		clickWhenVisible(reportScreenLocator);
		
	}
	
	public void onClickstartNEndDateText()
	{
	clickWhenVisible(startNEndDateText);
		
	}
	
	public void onClickreportTypeText()
	{
		clickWhenVisible(reportTypeText);
		
	}
	
	public void onClickcancelBtn()
	{
		clickWhenVisible(cancelBtn);
	
	}
	
	public void onClickcontinueBtn()
	{
		clickWhenVisible(continueBtn);
		
	}
	
	public void onClicktimings()
	{
		 clickWhenVisible(timings);
		
	}
	
	public void onClickleaves()
	{
	clickWhenVisible(leaves);
		
	}
	
	public void onClickappointments()
	{
		 clickWhenVisible(appointments);
		
	}
	
	public void onClickalertTtlEmailadrs()
	{
		clickWhenVisible(alertTtlEmailadrs);
		
	}
	
	public void onClickenterEmailId()
	{
		clickWhenVisible(enterEmailId);
		
	}
	
	public void onClicksoonTxt()
	{
		clickWhenVisible(soonTxt);
		
	}
	
	public void onClickgetReportBtn()
	{
		clickWhenVisible(getReportBtn);
		
	}
	
	public By getmonthPicker()
	{
		return monthPicker;
	}
	
	public By getdatePicker()
	{
		return datePicker;
	}
	
	public By getyearPicker()
	{
		return yearPicker;
	}
	
	public By getdayPicker()
	{
		return dayPicker;
	}

//***************************************************************//	
	
	public void onClickentrEmailId(String emailID)
	{
		WebElement emailid= driver.findElement(enterEmailId);
		emailid.sendKeys(emailID);
		
	}
	
	public void CalenderPicker()
	{
		
		Assert.assertNotNull(getdayPicker());
		Assert.assertNotNull(getmonthPicker());
		Assert.assertNotNull(getdatePicker());
		Assert.assertNotNull(getyearPicker());
	}
	
}
