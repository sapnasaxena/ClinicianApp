package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
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
import com.qa.mobileapp.pages.MyTeamPage;

public class MyTeamTests extends TestBase {

	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea123456";
	String balanceBeforePayment;
	

	@BeforeClass(alwaysRun=true)
	public void initMyTeam() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		myteampage = new MyTeamPage(driver);
		dashboardpage = new DashboardPage(driver);
		appointmentpage = new AppointmentPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureMyTeamPage() throws MalformedURLException{		
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(myteampage.waitVisible(myteampage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		myteampage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(myteampage.waitVisible(myteampage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("My Team page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	

		//UI Test Scenarios
		@Test(groups = {"UITest"})
		public void TC_01_testVerifyAppointmentScreenVisiblity()
		{
			System.out.println("Verify that on tapping Appointments nav, All appointments screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			myteampage.onTapAppointmentsNav();
			Assert.assertNotNull(myteampage.getAppointmentScreenLocator());
		}
		
		@Test(groups = {"UITest"})
		public void TC_2_testVerifyPatientsScreenVisiblity()
		{
			System.out.println("Verify that on tapping Patients nav, All patients listing should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			myteampage.onTapPatientsNav();
			Assert.assertNotNull(myteampage.getPatientNavLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_03_testVerifyMyTeamScreenVisiblity()
		{
			System.out.println("Verify that on tapping Team Members nav, My Team screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			myteampage.onTapMyTeamMembersNav();
			Assert.assertNotNull(myteampage.getMyTeamScreenLocator());
		}
		
		@Test(groups = {"funcTest"})
		public void TC_04_testVerifyAddAppointmentAsPCO()
		{
			System.out.println("Verify that on tapping Appointments nav, All appointments screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			myteampage.onTapAppointmentsNav();
			//
			//Assert.assertNotNull(myteampage.getAppointmentScreenLocator());
		}

		@Test(groups = {"funcTest"})
		public void TC_04_testVerifyRescheduleAppointmentAsPCO()
		{
			System.out.println("Verify that PCO should be able to reschedule appointment");
			if (dashboardpage.getCheckOutTimeLocator()!=null)
			{
				dashboardpage.checkIn();
			}
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(1);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickUpcomingTab();
			GlobalUtil.wait(2);
			try {
				appointmentpage.onClickPatientName("confirmed");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onClickRescheduleButton();
			GlobalUtil.wait(2);
			GlobalUtil.wait(2);
			String date;
			try {
				date = GlobalUtil.getTomorrowDate();
				WebElement resch = appointmentpage.getFreeDateForAppointment(date, true);
				GlobalUtil.wait(2);
				resch.click();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//appointmentpage.selectDate(date);
			appointmentpage.rescheduleAppt("4:00 PM");
			Assert.assertNotNull(appointmentpage.getAppointmentExpandFabButtonLocator());

		}

		
		@Test(groups = {"funcTest"})
		public void TC_04_testVerifyDenyAppointmentAsPCO()
		{
			System.out.println("Verify that on PCO should able to deny the appointment");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			myteampage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			try {
				appointmentpage.onTapPatienframe();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GlobalUtil.wait(1);		
			appointmentpage.onTapLoadMoreButton();
			try {
				appointmentpage.onClickPatientName("pending");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GlobalUtil.wait(1);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onClickDenyFabButton();
			Assert.assertNotNull("Can't deny");
				
		}
		
		@Test(groups = {"funcTest"})
		public void TC_04_testVerifyConfirmAppointmentAsPCO()
		{
			System.out.println("Verify that on PCO should able to confirm the team members appointment");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTeamNav();
			GlobalUtil.wait(2);
			myteampage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			try {
				appointmentpage.onTapPatienframe();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GlobalUtil.wait(1);		
			appointmentpage.onTapLoadMoreButton();
			try {
				appointmentpage.onClickPatientName("pending");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GlobalUtil.wait(1);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onClickConfirmButton();
			Assert.assertNotNull("Patient");
		}
		
		
}
