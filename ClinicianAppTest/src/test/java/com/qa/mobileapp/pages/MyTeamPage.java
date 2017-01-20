package com.qa.mobileapp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;

public class MyTeamPage extends BasePage {

	
	public MyTeamPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By appointmentsNavLocator = By.name("Appointments");
	private final By patientNavLocator = By.name("Patients");
	private final By teamMemberNavLocator = By.name("Team Members");
	private final By appointmentScreenLocator = By.name("All");
	private final By myTeamScreenLocator = By.name("My Team");
	private final By upcomingApptTabLocator = By.name("Upcoming");
	private final By pastApptTabLocator = By.name("Past");
	private final By todayApptTabLocator = By.name("Today");
	private final By apptListingLocator = By.className("android.widget.RelativeLayout");
	
	public By getAppointmentsNavLocator() {
		return appointmentsNavLocator;
	}

	public By getPatientNavLocator() {
		return patientNavLocator;
	}

	public By getApptListingLocator() {
		return apptListingLocator;
	}

	public By getUpcomingApptTabLocator() {
		return upcomingApptTabLocator;
	}

	public By getTodayApptTabLocator() {
		return todayApptTabLocator;
	}

	public By getPastApptTabLocator() {
		return pastApptTabLocator;
	}

	public By getTeamMemberNavLocator() {
		return teamMemberNavLocator;
	}

	public By getAppointmentScreenLocator() {
		return appointmentScreenLocator;
	}

	public By getMyTeamScreenLocator() {
		return myTeamScreenLocator;
	}
	
	public void onTapAppointmentsNav()
	{
		clickWhenVisible(appointmentsNavLocator);
	}
	public void onTapPatientsNav()
	{
		clickWhenVisible(patientNavLocator);
	}
	public void onTapMyTeamMembersNav()
	{
		clickWhenVisible(teamMemberNavLocator);
	}
	
	public void onTapUpcomingApptTab()
	{
		clickWhenVisible(upcomingApptTabLocator);
	}

	public void onTapPastApptTab()
	{
		clickWhenVisible(pastApptTabLocator);
	}
	public void onTapTodayAppt()
	{
		clickWhenVisible(todayApptTabLocator);
	}
	public void onTapAppt()
	{
		clickWhenVisible(apptListingLocator);
	}


}
