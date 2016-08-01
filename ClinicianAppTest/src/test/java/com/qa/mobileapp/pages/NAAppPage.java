package com.qa.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;

public class NAAppPage extends BasePage {

	public NAAppPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private final By appointmentNavLocator = By.name("Appointments");
	private final By patientNavLocator = By.name("Patients");
	private final By leaveNavLocator = By.name("Leave Management");
	private final By teamSheetNavLocator = By.name("Time Sheets");
	private final By appointmentScreenLocator = By.name("All");
	private final By patientScreenLocator = By.name("All");
	private final By LeaveMgmtScreenLocator = By.name("Team Leaves");
	private final By timesheetScreenLocator = By.name("Team Leaves");
	private final By patientNameLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_name");
	private final By patientIDLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_brandid");
	private final By patientLocationLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_address");
	private final By patientGenderLocator =By.id("com.healthvista.clinicianapp.stage:id/patient_gender");
	private final By patientContactNumberLocator=By.id("com.healthvista.clinicianapp.stage:id/patient_contact_no");
	private final By patientEmailIdLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_email");
	private final By patientServiceBalanceAmountLocator = By.id("com.healthvista.clinicianapp.stage:id/pending_amount");
	private final By patientCaseFileLocator= By.id("com.healthvista.clinicianapp.stage:id/content_end");
	private final By empIdLocator = By.id("com.healthvista.clinicianapp.stage:id/tvClinicianEmpId");
	private final By clinischeduleLocator = By.id("com.healthvista.clinicianapp.stage:id/shedule");
	private final By cliniDurationLocator = By.id("com.healthvista.clinicianapp.stage:id/durationText");

 
	public By getAppointmentNavLocator() {
		return appointmentNavLocator;
	}

	public By getClinischeduleLocator() {
		return clinischeduleLocator;
	}

	public By getAppointmentScreenLocator() {
		return appointmentScreenLocator;
	}

	public By getPatientServiceBalanceAmountLocator() {
		return patientServiceBalanceAmountLocator;
	}

	public By getEmpIdLocator() {
		return empIdLocator;
	}

	public By getCliniDurationLocator() {
		return cliniDurationLocator;
	}

	public By getPatientEmailIdLocator() {
		return patientEmailIdLocator;
	}

	public By getPatientCaseFileLocator() {
		return patientCaseFileLocator;
	}

	public By getPatientContactNumberLocator() {
		return patientContactNumberLocator;
	}

	public By getPatientIDLocator() {
		return patientIDLocator;
	}

	public By getPatientGenderLocator() {
		return patientGenderLocator;
	}

	public By getPatientLocationLocator() {
		return patientLocationLocator;
	}

	public By getPatientNameLocator() {
		return patientNameLocator;
	}

	public By getPatientNavLocator() {
		return patientNavLocator;
	}

	public By getPatientScreenLocator() {
		return patientScreenLocator;
	}

	public By getLeaveMgmtScreenLocator() {
		return LeaveMgmtScreenLocator;
	}

	public By getLeaveNavLocator() {
		return leaveNavLocator;
	}

	public By getTimesheetScreenLocator() {
		return timesheetScreenLocator;
	}

	public By getTeamSheetNavLocator() {
		return teamSheetNavLocator;
	}

	public void onTapMyTeamAppointmentsNav()
	{
		clickWhenVisible(appointmentNavLocator);
	}
	
	public void onTapMyTeamPatientsNav()
	{
		clickWhenVisible(patientNavLocator);
	}
	
	public void onTapMyLeaveMgmtNav()
	{
		clickWhenVisible(leaveNavLocator);
	}
	
	public void onTapMyTeamTimesheetNav()
	{
		clickWhenVisible(teamSheetNavLocator);
	}
	
	public void onTapPatientName()
	{
		List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//android.widget.ListView"));
		WebElement patientName = list.get(0).findElement(By.className("android.widget.RelativeLayout"));
		patientName.click();
		
	}
}
