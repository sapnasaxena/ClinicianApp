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
import com.qa.mobileapp.pages.AlertPage;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CalendarPage;
import com.qa.mobileapp.pages.CampPage;
import com.qa.mobileapp.pages.CaseFilePage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.FeedbackPage;
import com.qa.mobileapp.pages.LeavePage;
import com.qa.mobileapp.pages.LogOutPage;
import com.qa.mobileapp.pages.PatientPage;
import com.qa.mobileapp.pages.PaymentPage;
import com.qa.mobileapp.pages.ProfilePage;
import com.qa.mobileapp.pages.ReferPatientPage;
import com.qa.mobileapp.pages.ReportsPage;

public class DashboardTests extends TestBase{

	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";

	@BeforeClass(alwaysRun=true)
	public void initDashboard() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
		
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		camppage= new CampPage(driver);
		profilepage = new ProfilePage(driver);
		appointmentpage = new AppointmentPage(driver);
		paymentspage = new PaymentPage(driver);
		patientpage = new PatientPage(driver);
		alertpage = new AlertPage(driver);
		reportspage = new ReportsPage(driver);
		casefilepage = new CaseFilePage(driver);
		feedbackpage=new FeedbackPage(driver);
		logoutpage = new LogOutPage(driver);
		calendarpages = new CalendarPage(driver);
		
	}
	

	@Test (groups = { "UITest","smoketest" })
	public void TC_01_testVerifyCheckInStatusVisibilityOnDashboardScreen()
	{
		System.out.println("Verify that on logged in to app, user should able to see Checkin screen");
		if(driver.findElement(dashboardpage.getCheckInTimeLocator()).isDisplayed()==false)
		{ 
			dashboardpage.checkIn();
		}
		Assert.assertNotNull(driver.findElement(dashboardpage.getCheckInTimeLocator()));
		
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_01_testVerifyCheckOutStatusVisibilityOnDashboardScreen()
	{
		System.out.println("Verify that on logged in to app, user should able to see Checkoutscreen");
		if(driver.findElement(dashboardpage.getCheckOutTimeLocator()).isDisplayed()==false)
		{ 
			dashboardpage.checkOut();
		}
		Assert.assertNotNull(driver.findElement(dashboardpage.getCheckOutTimeLocator()));
	}

	//need to do
	//@Test (groups = { "UITest","smoketest" })
	public void TC_03_testVerifyEditProfileImageVisibilityOnDashboardScreen()
	{
		System.out.println("Verify that on right hand side edit profile image should be displayed");
		loginpage.login(userName, password);
		GlobalUtil.wait(5);
		//Assert.assertNotNull(driver.findElement(dashboardpage.));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_04_testVerifyProfileScreenVisibility()
	{
		System.out.println("Verify that on tapping Clinician Name, Profile screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		ProfilePage profilepage = new ProfilePage(driver);
		Assert.assertNotNull(driver.findElement(profilepage.getProfileScreenLocator()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_05_testVerifyOnTopDashboardNavVisibilty()
	{
		System.out.println("Verify that on top Dashboard nav should be displayed");
		Assert.assertNotNull(driver.findElement(dashboardpage.getHomeScreenLocator()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_06_testVerifyClincianNameVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user name should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianNameLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianCashInHand()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianProfession()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianWorkingHrs()));
	}

	//@Test (groups = { "UITest","smoketest" })
	public void TC_08_testVerifyClincianCashInHandVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user's  cash in hand should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianCashInHand()));
	}

	//@Test (groups = { "UITest","smoketest" })
	public void TC_07_testVerifyClincianProfessionVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user's professional should be displayed");
		dashboardpage.onTapDashboardtext();
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianProfession()));
	}

	//@Test (groups = { "UITest","smoketest" })
	public void TC_09_testVerifyClincianWorkingHrsVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user's  Work timings should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianWorkingHrs()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_10_testVerifyMyTasksNavVisibility()
	{
		System.out.println("Verify that My Tasks navigation menus Appointment, Patient, Payment, Calendar, Camps, CaseFile nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getAppointmentNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getPatientNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getPaymentsNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getCalendarNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getCampsNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getCaseFileNavLocator()));
	}
	
	@Test (groups = { "UITest","smoketest" })
	public void TC_10_testVerifySettingsNavVisibility()
	{
		System.out.println("Verify that Settings navigation menus Alert, Reports, Refer Patient, Feedback, Logout should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getAlertsNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getReportsNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getReferPatientLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getFeedbackNavLocator()));
		Assert.assertNotNull(driver.findElement(dashboardpage.getLogOutNavLocator()));
	}
	

	@Test (groups = { "UITest","smoketest" })
	public void TC_11_testVerifyOnTapAppointmentNavAppointmentScreenVisibility()
	{
		System.out.println("Verify that on tapping Appointment nav, Appointment Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		Assert.assertNotNull(appointmentpage.getAllAppointmentdropLocator());
	}




	@Test(groups = { "UITest","smoketest" })
	public void TC_13_testVerifyOnTapPatientNavPatientScreenVisibility()
	{
		System.out.println("Verify that on tapping Patient nav, Patient Listing Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(patientpage.getPatientsScreenLocator());
	}



	@Test(groups = { "UITest","smoketest" })
	public void TC_15_testVerifyOnTapCalendarNavCalendarScreenVisibility()
	{
		System.out.println("Verify that on tapping Calendar nav, Calendar Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(calendarpages.getcalendarScreenLocator());
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_17_testVerifyOnTapPaymentNavPaymentsScreenVisibility()
	{
		System.out.println("Verify that on tapping payment nav, Payments Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		Assert.assertNotNull(paymentspage.getPaymentScreenLocator());
	}


	@Test (groups = { "UITest","smoketest" })
	public void TC_19_testVerifyOnTapCaseFileNavCaseFilesScreenVisibility()
	{
		System.out.println("Verify that on tapping Case File nav, Case files Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCaseFileNav();
		Assert.assertNotNull(casefilepage.getCaseFileScreenLocator());
	}

	//@Test(groups = { "UITest","smoketest" })
	public void TC_21_testVerifyOnTapLeaveNavLeavesScreenVisibility()
	{
		System.out.println("Verify that on tapping Leave nav, Leave Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		LeavePage leavepage = new LeavePage(driver);
		Assert.assertNotNull(driver.findElement(leavepage.getLeaveScreenLocator()));
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_23_testVerifyOnTapReportsNavReportsScreenVisibility()
	{
		System.out.println("Verify that on tapping Reports nav, Report Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Reports");
		GlobalUtil.wait(1);
		dashboardpage.onTapReportsNav();
		GlobalUtil.wait(2);
		ReportsPage reportspage = new ReportsPage(driver);
		Assert.assertNotNull(driver.findElement(reportspage.getreportScreenLocator()));
	}



	@Test(groups = { "UITest","smoketest" })
	public void TC_25_testVerifyOnTapCampNavCampScreenVisibility()
	{
		System.out.println("Verify that on tapping Camp nav, Camp Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(camppage.getCampNameLocator());
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_27_testVerifyOnTapAlertsNavAlertsScreenVisibility()
	{
		System.out.println("Verify that on tapping Refer Alerts nav, Alerts Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapAlertsNav();
		Assert.assertNotNull(alertpage.getAlertScreenLocator());
	}

	

	@Test(groups = { "UITest","smoketest" })
	public void TC_29_testVerifyOnTapReferPatientNavReferAPatientScreenVisibility()
	{
		System.out.println("Verify that on tapping Refer Patient nav, Refer Patient Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(2);
		ReferPatientPage referpatientpage = new ReferPatientPage(driver);
		Assert.assertNotNull(driver.findElement(referpatientpage.getReferPatientScreenLocator()));
	}

	
	@Test(groups = { "UITest","smoketest" })
	public void TC_31_testVerifyOnTapFeedbackNavFeedbackScreenVisibility()
	{
		System.out.println("Verify that on tapping Feedback nav, Feedback Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapFeedbackNav();
		Assert.assertNotNull(feedbackpage.getfeedbackScreenTitleLocator());
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_33_testVerifyOnTapLogoutNavLogoutScreenVisibility()
	{
		System.out.println("Verify that on tapping Logout nav, Logout pop up screen with message 'Are you sure want to logout' should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapLogOut();
		GlobalUtil.wait(2);
		LogOutPage logoutpage = new LogOutPage(driver);
		Assert.assertNotNull(driver.findElement(logoutpage.getLogOutLocator()));
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureDashboardPage() throws MalformedURLException{		
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(dashboardpage.waitVisible(dashboardpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		dashboardpage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(dashboardpage.waitVisible(dashboardpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Dashboard page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}

}
