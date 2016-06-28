package com.qa.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;

public class LeavePage extends BasePage {

	public LeavePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/* Author: Lipsha satpathy
	 * Created date: 6th and 18th april 2016
	 * XPATH for casefile Page 
	 * */
	private final By leaveScreenLocator = By.name("Leaves");
	private final By applyButtonLocator = By.name("Apply");
	private final By holidaysTabLocator = By.name("Holiday");
	private final By overtimeTabLocator = By.name("Overtime");
	private final By leaveTabLocator = By.name("Leaves");
	private final By holidayDateLocator = By.id("com.healthvista.clinicianapp.stage:id/holidaydate");
	private final By holidayNameLocator = By.id(" com.healthvista.clinicianapp.stage:id/holidayname");
	private final By holidayStatusLocator = By.id("com.healthvista.clinicianapp.stage:id/holidaystatus");
	private final By refreshbuttonLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	private final By generallistLocator = By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By leaveApplybuttonLocator = By.name("Apply Leave");
	private final By applyOverTimeButtonLocator = By.name("Apply Overtime");
	private final By applyChangeTimeLocator = By.name("Apply ChangeTime");
	private final By calendarBackButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/homeback");
	private final By CalendarSaveButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/checkbutton");
	private final By calenderLocator = By.id("com.healthvista.clinicianapp.stage:id/calendar");
	
	//private final By CalendarMonthLocator = By.id("");// (Month id is missing)
	//private final By calendarDateFormLocator = By.id("com.healthvista.clinicianapp.stage:id/textView1");(Id is missing )
	
	private final By calendarDayFormLocator = By.id("com.healthvista.clinicianapp.stage:id/textView1");
	private final By leavealertboxLocator = By.name("Leave Reason");
	private final By cancelButtonLocator = By.name("Cancel");
	private final By ApplyLeavesButtonLocator = By.name("Apply Leave");
	
	//Xpath for After click on apply overtime 

	private final By actionbardateviewLocator = By.id("com.healthvista.clinicianapp.stage:id/actionbartitle");
	private final By DurationLocator30 = By.name("00 - 30 min");
	private final By DurationLocator60 = By.name("30 - 60 min");
	
	//private final By timeLocator = By.name(""); (id is missing)
	
	private final By overtimeSelectedConfirmationScreenLocator = By.name("Are you sure?");
	private final By overtimeSelectedMessageLocator = By.id("android:id/message");
	private final By yesButtonLocator = By.name("Yes");
	private final By noButtonLocator = By.name("No");
	private final By NewleaveLocator = By.name("New Leave");
	
	
	//com.portea.internal:id/tv900
	
	public By getLeaveScreenLocator() {
		return leaveScreenLocator;
	}
	public By getapplyButtonLocator() {
		return applyButtonLocator;
	}
	public By getholidaysTabLocator() {
		return holidaysTabLocator;
	}
	public By getovertimeTabLocator() {
		return  overtimeTabLocator;
	}
	public By getleaveTabLocator() {
		return leaveTabLocator;
	}
	public By getholidayDateLocator() {
		return holidayDateLocator;
	}
	public By getholidayNameLocator() {
		return holidayNameLocator;
	}
	public By getholidayStatusLocator() {
		return holidayStatusLocator;
	}
	public By getCancelButtonLocator() {
		return cancelButtonLocator;
	}
	public By getrefreshbuttonLocator() {
		return refreshbuttonLocator;
	}
	public By getOvertimeSelectedConfirmationScreenLocator() {
		return overtimeSelectedConfirmationScreenLocator;
	}
	public By getOvertimeSelectedMessageLocator() {
		return overtimeSelectedMessageLocator;
	}
	public By getYesButtonLocator() {
		return yesButtonLocator;
	}
	public By getNoButtonLocator() {
		return noButtonLocator;
	}
	public By getApplyButtonLocator() {
		return applyButtonLocator;
	}
	public By getHolidaysTabLocator() {
		return holidaysTabLocator;
	}
	public By getOvertimeTabLocator() {
		return overtimeTabLocator;
	}
	public By getHolidayDateLocator() {
		return holidayDateLocator;
	}
	public By getHolidayNameLocator() {
		return holidayNameLocator;
	}
	public By getHolidayStatusLocator() {
		return holidayStatusLocator;
	}
	public By getgenerallistLocator() {
		return generallistLocator;
	}
	public By getleaveApplybuttonLocator() {
		return leaveApplybuttonLocator;
	}
	public By getapplyOverTimeButtonLocator() {
		return applyOverTimeButtonLocator;
	}
	public By getapplyChangeTimeLocator() {
		return applyChangeTimeLocator;
	}
	public By getcalendarBackButtonLocator() {
		return calendarBackButtonLocator;
	}
	public By getCalendarSaveButtonLocator() {
		return CalendarSaveButtonLocator;
	}
	public By getcalenderLocator() {
		return calenderLocator;
	}
	public By getcalendarDayFormLocator() {
		return  calendarDayFormLocator;
	}
	public By getleavealertboxLocator() {
		return leavealertboxLocator;
	}
	public By getcancelButtonLocator() {
		return cancelButtonLocator;
	}
	public By getApplyLeavesButtonLocator() {
		return ApplyLeavesButtonLocator;
	}
	public By getactionbardateviewLocator() {
		return actionbardateviewLocator;
	}
	public By getDurationLocator30() {
		return DurationLocator30;
	}
	public By getDurationLocator60() {
		return DurationLocator60;
	}
	public By getovertimeSelectedConfirmationScreenLocator() {
		return overtimeSelectedConfirmationScreenLocator;
	}
	public By getovertimeSelectedMessageLocator() {
		return overtimeSelectedMessageLocator;
	}
	public By getyesButtonLocator() {
		return yesButtonLocator;
	}
	public By getnoButtonLocator() {
		return noButtonLocator;
	}
 
   public By getNewleaveLocator() {
	return NewleaveLocator;
}

	
	
	// **** FUNCTIONS FOR LeavePage ****
	
	public void onClickleaveScreenLocator()
	{
		clickWhenVisible(leaveScreenLocator);
		
	}
	
	public void onClickapplyButtonLocator()
	{
		clickWhenVisible(applyButtonLocator);
		
	}
	
	public void onClickholidaysTabLocator()
	{
		clickWhenVisible(holidaysTabLocator);
		
	}
	
	public void onClickovertimeTabLocator()
	{
	 clickWhenVisible(overtimeTabLocator);
		
}
	public void onClickleaveTabLocator()
	{
		clickWhenVisible(leaveTabLocator);
		
	}
	public void onClickholidayDateLocator()
	{
		clickWhenVisible( holidayDateLocator);
		
	}
	public void onClickgenerallistLocator()
	{
		clickWhenVisible(generallistLocator);
		
	}
	public void onClickholidayStatusLocator()
	{
		clickWhenVisible(holidayStatusLocator);
	
	}
	public void onClickrefreshbuttonLocator()
	{
		clickWhenVisible(refreshbuttonLocator);
		
	}
	public void onClickholidayNameLocator()
	{
	 clickWhenVisible(holidayNameLocator);
		
	}
	public void onClickleaveApplybuttonLocator()
	{
		clickWhenVisible(leaveApplybuttonLocator);
		
	}
	public void onClickapplyOverTimeButtonLocator()
	{
		clickWhenVisible(applyOverTimeButtonLocator);
    }
	public void onClickapplyChangeTimeLocator()
	{
		clickWhenVisible(applyChangeTimeLocator);
		
	}
	public void onClickcalendarBackButtonLocator()
	{
		clickWhenVisible(calendarBackButtonLocator);
		
	}
	public void onClickCalendarSaveButtonLocator()
	{
		clickWhenVisible(CalendarSaveButtonLocator);
	
	}
	public void onClickcalenderLocator()
	{
		clickWhenVisible(calenderLocator);
		
	}
	public void onClickcalendarDayFormLocator()
	{
		clickWhenVisible(calendarDayFormLocator);
		
	}
	public void onClickleavealertboxLocator()
	{
		clickWhenVisible(leavealertboxLocator);
		
	}
	public void onClickcancelButtonLocator()
	{
		clickWhenVisible( cancelButtonLocator);
		
	}
	public void onClickApplyLeavesButtonLocator()
	{
		clickWhenVisible(ApplyLeavesButtonLocator);
		
    }
	public void onClickactionbardateviewLocator()
	{
		clickWhenVisible( actionbardateviewLocator);
		
     }
	public void onClickDurationLocator30()
	{
		clickWhenVisible( DurationLocator30);
    }
	
	public void onClickDurationLocator60()
	{
		clickWhenVisible( DurationLocator60);	
    }
	
	public void onClickovertimeSelectedConfirmationScreenLocator()
	{
		clickWhenVisible(overtimeSelectedConfirmationScreenLocator );
		
	}
	
	//public void waitforClickable(String we) {
      //  WebDriverWait obje = new WebDriverWait(driver,15);
      // WebElement xcy = obje.until(ExpectedConditions.elementToBeClickable(we));
       // if(xcy == null) {
            //try {
                //throw new Exception("Element's not Exposed");
            //} catch (Exception e) {
               // e.printStackTrace();
            //}
        //}
	//public WebElement getWhenVisible(By locator, int timeout) {
		 
		//WebElement element = null;
		 
		//WebDriverWait wait = new WebDriverWait(driver, timeout);
		 
		//element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
		//return element;
		 
		//}
	
	public void selectTimeForChangeTimings(int start, int end)
	{
		for(int i=0; i<=9;i++)
		{
		WebElement listViewChildElements = driver.findElement(By.className("//[...]android.widget.ScrollView[0]/android.widget.LinearLayout/*[1][2]"));
		List <WebElement> ele = listViewChildElements.findElements(By.id("tv93S0"));
	  
		}
		
		
//		List <WebElement> main = driver.findElements(By.className("android.widget.ScrollView"));
//		main.get(0);
//	    List<WebElement> parent = driver.findElements(By.className("android.widget.LinearLayout"));
//		List<WebElement> child = (List<WebElement>) parent.subList(start, end);
//		
//		//List<WebElement> parent = driver.findElements(By.xpath("//android.widget.LinearLayout/child::[contains(@class,'android.widget.TextView')]"));
//		//List<WebElement> child= driver.findElements(By.className("android.widget.TextView"));
//		for(int i=0; i<=parent.size();i++)
//		{
//			System.out.println("no of ele:" +parent.size());
//		child.get(1).click();
//		child.get(2).click();
//		}
//		
	}
	
	
}
	
	
	
	

