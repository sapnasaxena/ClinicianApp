package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.NAAppPage;

public class NAAppTests extends TestBase {
	
	public static final String userName ="Nursing@test.com";
	public static final String password ="Portea12345";
	String balanceBeforePayment;
	

	@BeforeClass(alwaysRun=true)
	public void initNAAppPage() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		appointmentpage = new AppointmentPage(driver);
		naapppage = new NAAppPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureNAAppPage() throws MalformedURLException{		
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(appointmentpage.waitVisible(appointmentpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		appointmentpage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(appointmentpage.waitVisible(appointmentpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Appointment page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}

	@Test(groups = {"UITest"})
	public void TC_002_003_testVerifyOnNAScreenSideMenuVisibility()
	{
		System.out.println("Verify left nav bar visibility");
		dashboardpage.onTapDashboardtext();
		Assert.assertNotNull(dashboardpage.getMyTaskNavBarLocator());
		Assert.assertNotNull(dashboardpage.getMyTeamNavBarLocator());
		Assert.assertNotNull(dashboardpage.getSettingsNavBarLocator());
	}
	
	
	@Test(groups = {"UITest"})
	public void TC_004_005_testVerifyMyTeamMenuOptionsVisibility()
	{
		System.out.println("Verify that on tap My Team Option should display Appointment, Patient, Leave Management, Time sheet");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		Assert.assertNotNull(naapppage.getAppointmentNavLocator());
		Assert.assertNotNull(naapppage.getLeaveNavLocator());
		Assert.assertNotNull(naapppage.getPatientNavLocator());
		Assert.assertNotNull(naapppage.getTeamSheetNavLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_006_testVerifyOnTapAppointmentMyTeamMenuOptionsAppointmentScreenVisibility()
	{
		System.out.println("Verify that on tap Appointments nav of My Team Option should display Appointmemt Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		Assert.assertNotNull(naapppage.getAppointmentScreenLocator());
		
	}
	
	@Test(groups = {"UITest"})
	public void TC_006_testVerifyOnTapLeaveMgmtMyTeamMenuOptionsTeamLeavesScreenVisibility()
	{
		System.out.println("Verify that on tap Leaves Mgmt nav of My Team Option should display Team Leaves Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		Assert.assertNotNull(naapppage.getLeaveMgmtScreenLocator());
		
	}
	
	@Test(groups = {"UITest"})
	public void TC_006_testVerifyOnTapTimesheetMyTeamMenuOptionsTimesheetScreenVisibility()
	{
		System.out.println("Verify that on tap Timesheet nav of My Team Option should display Timesheet Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		naapppage.onTapMyTeamTimesheetNav();
		Assert.assertNotNull(naapppage.getTimesheetScreenLocator());
		
	}
	
	@Test(groups = {"UITest"})
	public void TC_010_testVerifyEmpIDVisibilityOnAppointmentDetailsScreen() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that Emp Id of clinician should be visible on Appointment Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		naapppage.onTapMyTeamAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickPastTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("Successful");
		GlobalUtil.wait(2);
		appointmentpage.onTapAppointmentTab();
		Assert.assertNotNull(naapppage.getEmpIdLocator());
		
	}
	
	@Test(groups = {"UITest"})
	public void TC_007_testVerifyOnTapPatientMyTeamMenuOptionsPatientScreenVisibility()
	{
		System.out.println("Verify that on tap Patients nav of My Team Option should display Patient Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(naapppage.getAppointmentScreenLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_010_testVerifyPatientPaymentHistoryOnAppointmentPaymentScreen() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that Payment history will be visible on Appointment->Payment tab");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		naapppage.onTapMyTeamAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickPastTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("Successful");
		GlobalUtil.wait(2);
		appointmentpage.onTapAppointmentsPaymentTab();
		Assert.assertNotNull(appointmentpage.getPaymentHistoryLabelLocator());
		Assert.assertNotNull(appointmentpage.getPaymentHistoryLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_009_testVerifyOnTapPatientPatientDetailsVisibility()
	{
		System.out.println("Verify that on tap on any patieny name, should display Patient details");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		naapppage.onTapPatientName();
		Assert.assertNotNull(naapppage.getPatientNameLocator());
		Assert.assertNotNull(naapppage.getPatientIDLocator());
		Assert.assertNotNull(naapppage.getPatientLocationLocator());
		Assert.assertNotNull(naapppage.getPatientContactNumberLocator());
		Assert.assertNotNull(naapppage.getPatientEmailIdLocator());
		Assert.assertNotNull(naapppage.getPatientGenderLocator());
		Assert.assertNotNull(naapppage.getPatientServiceBalanceAmountLocator());
		Assert.assertNotNull(naapppage.getPatientCaseFileLocator());
		
	}
}
