package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AlertPage;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CampPage;
import com.qa.mobileapp.pages.CaseFilePage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.FeedbackPage;
import com.qa.mobileapp.pages.LeavePage;
import com.qa.mobileapp.pages.LogOutPage;
import com.qa.mobileapp.pages.LoginPage;
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
	}
	

	@Test (groups = { "UITest","smoketest" })
	public void TC_01_testVerifyCheckInStatusVisibilityOnDashboardScreen()
	{
		System.out.println("Verify that on logged in to app, user should able to see Checkin screen");		
		Assert.assertNotNull(driver.findElement(dashboardpage.getCheckInTimeLocator()));
		
	}

	//@Test (groups = { "UITest","smoketest" })
	public void TC_01_testVerifyCheckOutStatusVisibilityOnDashboardScreen()
	{
		System.out.println("Verify that on logged in to app, user should able to see Checkoutscreen");
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
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_08_testVerifyClincianCashInHandVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user's  cash in hand should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianCashInHand()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_07_testVerifyClincianProfessionVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user's professional should be displayed");
		dashboardpage.onTapDashboardtext();
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianProfession()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_09_testVerifyClincianWorkingHrsVisibility()
	{
		System.out.println("Verify that on tapping to Dashboard image, on logged in user's  Work timings should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getClinicianWorkingHrs()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_10_testVerifyAppointmentNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Appointment nav should be displayed");
		dashboardpage.onTapDashboardtext();
		Assert.assertNotNull(driver.findElement(dashboardpage.getAppointmentNavLocator()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_11_testVerifyOnTapAppointmentNavAppointmentScreenVisibility()
	{
		System.out.println("Verify that on tapping Appointment nav, Appointment Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		AppointmentPage appointmentpage = new AppointmentPage(driver);
		Assert.assertNotNull(driver.findElement(appointmentpage.getAllAppointmentdropLocator()));
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_12_testVerifyPatientNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Patient nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getPatientNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_13_testVerifyOnTapPatientNavPatientScreenVisibility()
	{
		System.out.println("Verify that on tapping Patient nav, Patient Listing Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		PatientPage patientpage = new PatientPage(driver);
		Assert.assertNotNull(driver.findElement(patientpage.getPatientsScreenLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_14_testVerifyCalendarNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Calendar nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getCalendarNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_15_testVerifyOnTapCalendarNavCalendarScreenVisibility()
	{
		System.out.println("Verify that on tapping Calendar nav, Calendar Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		LeavePage leavepage = new LeavePage(driver);
		Assert.assertNotNull(driver.findElement(leavepage.getcalenderLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_16_testVerifyPaymentNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Payment nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getPaymentsNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_17_testVerifyOnTapPaymentNavPaymentsScreenVisibility()
	{
		System.out.println("Verify that on tapping payment nav, Payments Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		PaymentPage paymentspage = new PaymentPage(driver);
		Assert.assertNotNull(driver.findElement(paymentspage.getPaymentScreenLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_18_testVerifyCaseFileNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Case file nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getCaseFileNavLocator()));
	}

	@Test (groups = { "UITest","smoketest" })
	public void TC_19_testVerifyOnTapCaseFileNavCaseFilesScreenVisibility()
	{
		System.out.println("Verify that on tapping Case File nav, Case files Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCaseFileNav();
		GlobalUtil.wait(2);
		CaseFilePage casefilepage = new CaseFilePage(driver);
		Assert.assertNotNull(driver.findElement(casefilepage.getCaseFileScreenLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_20_testVerifyLeavesNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Leaves nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getLeavesNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_21_testVerifyOnTapLeaveNavLeavesScreenVisibility()
	{
		System.out.println("Verify that on tapping Leave nav, Leave Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		LeavePage leavepage = new LeavePage(driver);
		Assert.assertNotNull(driver.findElement(leavepage.getLeaveScreenLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_22_testVerifyReportNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Reports nav should be displayed");	
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Reports");
		Assert.assertNotNull(driver.findElement(dashboardpage.getReportsNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_23_testVerifyOnTapReportsNavReportsScreenVisibility()
	{
		System.out.println("Verify that on tapping Reports nav, Report Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Reports");
		GlobalUtil.wait(1);
		dashboardpage.onTapReportsNav();
		GlobalUtil.wait(2);
		ReportsPage reportspage = new ReportsPage(driver);
		Assert.assertNotNull(driver.findElement(reportspage.getreportScreenLocator()));
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_24_testVerifyCampsNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Camps nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getCampsNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_25_testVerifyOnTapCampNavCampScreenVisibility()
	{
		System.out.println("Verify that on tapping Camp nav, Camp Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		CampPage camppage = new CampPage(driver);
		Assert.assertNotNull(driver.findElement(camppage.getCampNameLocator()));
	}


	@Test(groups = { "UITest","smoketest" })
	public void TC_26_testVerifyAlertsNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Alerts nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		Assert.assertNotNull(driver.findElement(dashboardpage.getAlertsNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_27_testVerifyOnTapAlertsNavAlertsScreenVisibility()
	{
		System.out.println("Verify that on tapping Refer Alerts nav, Alerts Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAlertsNav();
		GlobalUtil.wait(2);
		AlertPage alertpage = new AlertPage(driver);
		Assert.assertNotNull(driver.findElement(alertpage.getAlertScreenLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_28_testVerifyReferPatientNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Refer Patient nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		Assert.assertNotNull(driver.findElement(dashboardpage.getReferPatientLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_29_testVerifyOnTapReferPatientNavReferAPatientScreenVisibility()
	{
		System.out.println("Verify that on tapping Refer Patient nav, Refer Patient Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(2);
		ReferPatientPage referpatientpage = new ReferPatientPage(driver);
		Assert.assertNotNull(driver.findElement(referpatientpage.getReferPatientScreenLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_30_testVerifyFeedbackNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Feedback nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Feedback");
		Assert.assertNotNull(driver.findElement(dashboardpage.getFeedbackNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_31_testVerifyOnTapFeedbackNavFeedbackScreenVisibility()
	{
		System.out.println("Verify that on tapping Feedback nav, Feedback Screen should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Feedback");
		GlobalUtil.wait(1);
		dashboardpage.onTapFeedbackNav();
		GlobalUtil.wait(2);
		FeedbackPage feedbackpage = new FeedbackPage(driver);
		Assert.assertNotNull(driver.findElement(feedbackpage.getfeedbackScreenTitleLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_32_testVerifyLogoutNavVisibility()
	{
		System.out.println("Verify that on navigation bar, Feedback nav should be displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.scrollToLogout();
		Assert.assertNotNull(driver.findElement(dashboardpage.getLogOutNavLocator()));
	}

	@Test(groups = { "UITest","smoketest" })
	public void TC_33_testVerifyOnTapLogoutNavLogoutScreenVisibility()
	{
		System.out.println("Verify that on tapping Logout nav, Logout pop up screen with message 'Are you sure want to logout' should be displayed");
		dashboardpage.onTapDashboardtext();
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
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}

}
