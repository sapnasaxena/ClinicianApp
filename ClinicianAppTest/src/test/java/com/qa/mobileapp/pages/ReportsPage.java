package com.qa.mobileapp.pages;



import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;


public class ReportsPage extends BasePage{

	public ReportsPage(AppiumDriver driver) {
		super(driver);
		
	}

	private final By reportScreenLocator = By.name("Email Report");
			//By.id("com.healthvista.clinicianapp.stage:id/design_menu_item_text");
	private final By startNEndDateText= By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By reportTypeText= By.name("Report Type:");
			//By.id("com.healthvista.clinicianapp.stage:id/reporttypetext");
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
	private final By toDateLocator = By.id("com.healthvista.clinicianapp.stage:id/toDate");
	private final By fromDateLocator = By.id("com.healthvista.clinicianapp.stage:id/fromDate");
	
	
	
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
	
	public By getToDateLocator() {
		return toDateLocator;
	}

	public By getFromDateLocator() {
		return fromDateLocator;
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
	
	public void submitReport(String type)
	{
		//WebElement frame = driver.findElement(By.xpath("//android.widget.LinearLayout"));
//		WebElement reportType = (WebElement) frame.findElements(By.className("//android.widget.spinner"));
//		reportType.click();
//		GlobalUtil.wait(1);
//		driver.scrollToExact("Timings").click();
//		GlobalUtil.wait(2);
//		WebElement date = driver.findElement(By.xpath("//android.widget.Button[contains(@id,'com.healthvista.clinicianapp.stage:id/fromDate')]"));
//		date.click();
//		WebElement startDate = driver.findElement(By.xpath("//android.view.View[contains(@text,'01 July 2016')]"));
//		startDate.click();
		WebElement continueBtn = driver.findElement(By.name("Continue"));
		continueBtn.click();
		WebElement getReportBtn = driver.findElement(By.name("Get Reports"));
		getReportBtn.click();
	}
	public void cancelReport()
	{
		WebElement cancelBtn=driver.findElement(By.name("Cancel"));
		cancelBtn.click();
	}
	public void onTapReportTypeSpinner()
	{
		WebElement ele = driver.findElement(By.className("android.widget.spinner"));
		ele.click();
	}
}
