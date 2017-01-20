package com.qa.mobileapp.pages;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

import io.appium.java_client.AppiumDriver;


/* Author: Sapna Saxena
 * Created date: 29 Mar 2016
 * XPATH for Dashboard/Home Page 
 * */
public class DashboardPage extends BasePage {
	
	public DashboardPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	private final By homeScreenLocator = By.name("Dashboard");
	private final By navigationDrawerLocator = By.name("Open navigation drawer");
	private final By inButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/switch1");
	private final By outButtonLocator = By.name("com.healthvista.clinicianapp.stage:id/switch2");
	private final By patientListLocator = By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By patientNameLocator = By.id("com.healthvista.clinicianapp.stage:id/tvTitle");
	private final By checkInTimeLocator = By.name("ON"); 
	private final By checkOutTimeLocator = By.name("OFF");
	private final By clinicianNameLocator = By.id("com.healthvista.clinicianapp.stage:id/tv_nav_cli_name");
	private final By clinicianProfessionLocator = By.id("com.healthvista.clinicianapp.stage:id/tv_nav_designation");
	private final By cashInHandLocator = By.id("com.healthvista.clinicianapp.stage:id/tv_nav_cashinhand");
	private final By clinicianworkingHrsLocator = By.id("com.healthvista.clinicianapp.stage:id/tv_nav_workinghours");
	private final By appointmentNavLocator = By.name("Appointments");
	private final By patientNavLocator = By.name("Patients");
	private final By calendarNavLocator = By.name("Calendar");
	private final By paymentsNavLocator = By.name("Payments");
	private final By casefileNavLocator = By.name("Casefiles");
	private final By campsNavLocator = By.name("Camps");
	private final By alertsNavLocator = By.name("Alerts");
	private final By leavesNavLocator = By.name("Leaves");
	private final By reportsNavLocator = By.name("Reports");
	private final By referPatientNavLocator = By.name("Refer Patient");
	private final By feedbackNavLocator = By.name("Feedback");
	private final By logOutNavLocator = By.name("Logout");
	private final By exitAppTitleLocator = By.name("Exit App");
	private final By myTeamNavBarLocator = By.name("My Team");
	private final By myTaskNavBarLocator =By.name("My Tasks");
	private final By operationsBarLocator = By.name("Operations");
	private final By settingsNavBarLocator =By.name("Settings");
	private final By helpNavBarLocator=By.name("Help");
	public By getHelpNavBarLocator()
	{
		return helpNavBarLocator;
	}
	private final By aboutAppNavBarLocator = By.name("About App");
	public By getAboutAppNavBarLocator()
	{
		return aboutAppNavBarLocator;
	}
	private final By ticketNavLocator = By.name("Tickets");
	public By getTicketNavLocator()
	{
		return ticketNavLocator;
	}
	
	@Override
	public By getExitAppTitleLocator(){
		return exitAppTitleLocator;
	}
	
	
	@Override
	public By getHomeScreenLocator() {
		return homeScreenLocator;
	}
	
	public By getNavigationDrawerLocator()
	{
		return navigationDrawerLocator;
	}
	
	public By getInButtonLocator()
	{
		return inButtonLocator;
	}
	
	public By getClinicianWorkingHrs()
	{
		return clinicianworkingHrsLocator;
	}
	
	public By getClinicianCashInHand()
	{
		return cashInHandLocator;
	}
	
	public By getClinicianProfession()
	{
		return clinicianProfessionLocator;
	}
	public By getOutButtonLocator()
	{
		return outButtonLocator;
	}
	public By getPatientListLocator()
	{
		return patientListLocator;
	}
	
	public By getPatientNameLocator()
	{
		return patientNameLocator;
	}
	
	public By getCheckInTimeLocator()
	{
		return checkInTimeLocator;
	}
	
	public By getCheckOutTimeLocator()
	{
		return checkOutTimeLocator;
	}
	
	public By getClinicianNameLocator()
	{
		return clinicianNameLocator;
	}
	public By getClinicianProfessionLocator()
	{
		return clinicianProfessionLocator;
	}
	
	public By getAppointmentNavLocator()
	{
		return appointmentNavLocator;
	}
	public By getPatientNavLocator()
	{
		return patientNavLocator;
	}
	public By getCalendarNavLocator()
	{
		return calendarNavLocator;
	}
	public By getPaymentsNavLocator()
	{
		return paymentsNavLocator;
	}
	public By getCaseFileNavLocator()
	{
		return casefileNavLocator;
	}
	public By getCampsNavLocator()
	{
		return campsNavLocator;
	}
	public By getAlertsNavLocator()
	{
		return alertsNavLocator;
	}
	public By getLeavesNavLocator()
	{
		return leavesNavLocator;
	}
	public By getReportsNavLocator()
	{
		return reportsNavLocator;
	}
	public By getReferPatientLocator()
	{
		return referPatientNavLocator;
	}
	public By getFeedbackNavLocator()
	{
		return feedbackNavLocator;
	}
	
	public By getCashInHandLocator()
	{
		return cashInHandLocator;
	}

	public By getMyTeamNavBarLocator() {
		return myTeamNavBarLocator;
	}


	public By getSettingsNavBarLocator() {
		return settingsNavBarLocator;
	}


	public By getMyTaskNavBarLocator() {
		return myTaskNavBarLocator;
	}


	public By getLogOutNavLocator()
	{
		return logOutNavLocator;
	}
	
	// Functions for Dashboard Screen
	
	public void onTapDashboardtext()
	{
		clickWhenVisible(navigationDrawerLocator);
		GlobalUtil.wait(1);
		WebElement ele = driver.findElement(By.name("My Tasks"));
				//(By.id("com.healthvista.clinicianapp.stage:id/imageView"));
		ele.click();
		
	}
	public void onTapMyTasksExpandButton()
	{
		 WebElement ls = driver.findElement(By.name("My Tasks"));
		 ls.click();
	}
	public void onTapSettingsExpandButton()
	{
	     WebElement ls = driver.findElement(By.name("Settings"));
		 ls.click();
	}
	
	public void onTapOperationsExpandButton()
	{
	     WebElement ls = driver.findElement(operationsBarLocator);
		 ls.click();
	}
	public void onTapAppointmentsNav()
	{
		clickWhenVisible(appointmentNavLocator);
		GlobalUtil.wait(1);
		clickWhenVisible(By.name("Got It"));
	}
	
	
	public void onTapPatientNav()
	{
		 clickWhenVisible(patientNavLocator);
	
	}
	
	public void onTapCalendarNav()
	{
		clickWhenVisible(calendarNavLocator);
		
	}
	
	public void onTapPaymentsNav()
	{
		clickWhenVisible(paymentsNavLocator);
		
	}
	public void onTapCaseFileNav()
	{
		clickWhenVisible(casefileNavLocator);
		
	}
	
	public void onTapCampsNav()
	{
		clickWhenVisible(campsNavLocator);
		
	}
	public void onTapReferPatientNav()
	{
		clickWhenVisible(referPatientNavLocator);
		
	}
	
	public void onTapFeedbackNav()
	{
		clickWhenVisible(feedbackNavLocator);
		
	}
	public void onTapReportsNav()
	{
		clickWhenVisible(reportsNavLocator);
		
	}
	
	public void onTapAlertsNav()
	{
		clickWhenVisible(alertsNavLocator);
		
	}
	public void onTapLeavessNav()
	{
		clickWhenVisible(leavesNavLocator);
	
	}
	public void onTapLogOutNav()
	{
		clickWhenVisible(logOutNavLocator);
		
	}
	
	public void onTapClinicianName()
	{
		clickWhenVisible(clinicianNameLocator);
		
	}
	
	public void scrollToLogout()
	{
		driver.scrollTo("Logout");
	}
	public void onTapLogOut()
	{
		clickWhenVisible(logOutNavLocator);
	}
	
	public void onTapCheckIn()
	{
		WebElement ele = driver.findElement(checkOutTimeLocator);
	    if(ele.isEnabled())
	    {
		ele.click();
	    }
	}
	
	public void checkCheckOutVisibility()
	{
		
		if (driver.findElement(By.xpath("//android.widget.Switch[contains(@text,'ON')]")).isSelected())
		{
			checkOut();
		}
		else
		{
			onTapDashboardtext();
		}
  
	}
	
	public void checkOut()
	{
		clickWhenVisible(checkInTimeLocator);
	}
	
	public void checkIn()
	{
		clickWhenVisible(checkOutTimeLocator);
	}
	
	public void onTapMyTeamNav()
	{
		clickWhenVisible(myTeamNavBarLocator);
	}
	
}
