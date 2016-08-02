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
import com.qa.mobileapp.pages.PCOScreenPage;

public class PCOScreenTests extends TestBase {

	public static final String userName ="amitava.pc@test.com";
	public static final String password ="Portea123";
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
		pcoscreenpage=new PCOScreenPage(driver);
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
	public void TC_002_testVerifyOnPCOScreenSideMenuVisibility()
	{
		System.out.println("Verify side menu visibility");
		dashboardpage.onTapDashboardtext();
		Assert.assertNotNull(dashboardpage.getMyTaskNavBarLocator());
		Assert.assertNotNull(dashboardpage.getMyTeamNavBarLocator());
		Assert.assertNotNull(dashboardpage.getSettingsNavBarLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_003_testVerifyOnPCOScreenAppointmentTabVisibility()
	{
		System.out.println("Verify Appointment tab visibility under My Task and My Team nav");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		Assert.assertNotNull(dashboardpage.getAppointmentNavLocator());
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		Assert.assertNotNull(dashboardpage.getAppointmentNavLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_004_testVerifyOnPCOScreenAppointmentTabVisibility()
	{
		System.out.println("Verify left nav bar visibility");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		Assert.assertNotNull(dashboardpage.getAppointmentNavLocator());
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		Assert.assertNotNull(dashboardpage.getAppointmentNavLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_005_testVerifyOnTapAppointmentTabAppointmentScreenVisibility()
	{
		System.out.println("Verify left nav bar visibility");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		Assert.assertNotNull(naapppage.getAppointmentScreenLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_005_testVerifyOnTapAnyAppointmentAppointmentDetailsScreenVisibility() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that on tapping on any appointment, appointment details screen should be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickUpcomingTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("confirmed");
		Assert.assertNotNull(pcoscreenpage.getAppointmentDetailScreenLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_012_testVerifyUpcomingTabVisibilityOnAppointments() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that Upcoming tab should be visible on Appointment screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		Assert.assertNotNull(appointmentpage.getUpcomingsAppointmentTabLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_006_testVerifyFabIconOnAppointmentDetailsScreenVisibility() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that on tapping on any appointment, appointment details screen should be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickUpcomingTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("confirmed");
		Assert.assertNotNull(appointmentpage.getAppointmentExpandFabButtonLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_007_testVerifyOnTabFabFabButtonAddAppointmentOptionVisiblityy() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that on tapping on fab icon, Add Appointment fab button should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickUpcomingTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("confirmed");
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		Assert.assertNotNull(appointmentpage.getFabAddAppointmentButtonLocator());
	}

	@Test(groups = {"UITest"})
	public void TC_008_testVerifyOnTabAddAppointmentFabFabButtonCalendarScreenVisiblityy() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that on tapping on fab icon, Add Appointment fab button should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickUpcomingTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("confirmed");
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButtonAddAppointment();
		Assert.assertNotNull(appointmentpage.getAddAppointmentScreenLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_009_testVerifySecondOpinionVisibility() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that on tapping on fab icon, Add Appointment fab button should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		appointmentpage.onClickUpcomingTab();
		GlobalUtil.wait(2);
		appointmentpage.onClickPatientName("confirmed");
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButtonAddAppointment();
		GlobalUtil.wait(2);
		appointmentpage.getFreeDateForAppointment("27",true).click();
		GlobalUtil.wait(1);
		appointmentpage.addAppointment("5:30 PM");
		Assert.assertNotNull(pcoscreenpage.getSelectAppointmentTypeLocator());
	}
	
	//add appointment for second opinion
	@Test(groups = {"UITest"})
	public void TC_011_testVerifyUserShouldAbleToAddSecondOpinion() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that Upcoming tab should be visible on Appointment screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTeamNav();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		Assert.assertNotNull(appointmentpage.getUpcomingsAppointmentTabLocator());
	}
	
}
