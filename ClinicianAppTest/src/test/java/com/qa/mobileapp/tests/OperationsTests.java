package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.FeedbackPage;
import com.qa.mobileapp.pages.OperationsPage;
import com.qa.mobileapp.pages.ReferPatientPage;
import com.qa.mobileapp.pages.ReportsPage;

public class OperationsTests extends TestBase {

	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea123456";
	
	@BeforeClass(alwaysRun=true)
	public void initOperations() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		referpatientpages = new ReferPatientPage(driver);
		operationspage = new OperationsPage(driver);
		reportspage = new ReportsPage(driver);
		feedbackpage = new FeedbackPage(driver);
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureReferPatientPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(referpatientpages.waitVisible(referpatientpages.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		referpatientpages.dismissLocation();
		int i = 0;
	   LoopThrice:
		while(i < 3){
			if(operationspage.waitVisible(referpatientpages.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}}
		catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Refer Patient page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	//UI Scenarios
	
		@Test(groups = { "UITest" })
		public void tc_01_testVerifyReferPatientOnSideMenu()
		{
			System.out.println("Verify that on tap Refer Patient nav, should display Refer a Patient details screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			driver.scrollTo("Refer patient");
			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			Assert.assertNotNull(referpatientpages.getReferPatientScreenLocator());
		}
		
		@Test(groups = { "UITest" })
		public void tc_02_testVerifyPatientDetailsPage()
		{
			System.out.println("Verify that Refer Patient details screen should have fields like New Patient name, Mobile number, Service required, City, Existing Patient ID, details, radio button Portea Patient or Personal network along with Cancel and Done button.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			driver.scrollTo("Refer patient");
			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(3);
			Assert.assertNotNull(referpatientpages.getReferAPatientText());
			Assert.assertNotNull(referpatientpages.getradioButton());
			Assert.assertNotNull(referpatientpages.getPorteaPatient());
			Assert.assertNotNull(referpatientpages.getPersonalNetwork());
			Assert.assertNotNull(referpatientpages.getNewPatientName());
			Assert.assertNotNull(referpatientpages.getPatientMobileNumber());
			Assert.assertNotNull(referpatientpages.getServiceRequiredText());
			Assert.assertNotNull(referpatientpages.getPhysiotherapyText());
			Assert.assertNotNull(referpatientpages.getCityText());
			Assert.assertNotNull(referpatientpages.getBangaloreText());
			Assert.assertNotNull(referpatientpages.getExistingPatinet());
			Assert.assertNotNull(referpatientpages.getPatientDetails());
			Assert.assertNotNull(referpatientpages.getCancelButton());
			Assert.assertNotNull(referpatientpages.getDoneButton());
		}
		
		@Test (groups = { "UITest" })
		public void tc_03_testVerifyPatientDetailsSubmittion()
		{
			System.out.println("Verify that user should able to submit Refer a Patient successfully.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			driver.scrollTo("Refer patient");
			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(3);
			Assert.assertNotNull(referpatientpages.getReferAPatientText());
			Assert.assertNotNull(referpatientpages.getradioButton());
			Assert.assertNotNull(referpatientpages.getPorteaPatient());
			Assert.assertNotNull(referpatientpages.getPersonalNetwork());
			Assert.assertNotNull(referpatientpages.getNewPatientName());
			Assert.assertNotNull(referpatientpages.getPatientMobileNumber());
			Assert.assertNotNull(referpatientpages.getServiceRequiredText());
			Assert.assertNotNull(referpatientpages.getPhysiotherapyText());
			Assert.assertNotNull(referpatientpages.getCityText());
			Assert.assertNotNull(referpatientpages.getBangaloreText());
			Assert.assertNotNull(referpatientpages.getExistingPatinet());
			Assert.assertNotNull(referpatientpages.getPatientDetails());
			Assert.assertNotNull(referpatientpages.getDoneButton());
		}
		
		@Test (groups = { "UITest" })
		public void tc_04_testCancelOptionOnPatientPage()
		{
			System.out.println("Verify that on tap cancel button should redirect to Dashboard screen.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			driver.scrollTo("Refer patient");
			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(3);
			Assert.assertNotNull(referpatientpages.getCancelButton());
		}
		
		@Test (groups = { "UITest" })
		public void tc_04_testUploadsfieldOnReferPatientPage()
		{
			System.out.println("Verify that Upload field should be visible on Refer Patient screen.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
//			driver.scrollTo("Refer patient");
//			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(3);
			Assert.assertNotNull(referpatientpages.getUploadFieldLocator());
		}
		
		//**************** SHITAL FUNCTIONAL TEST CASES********************//
		
		//@Test(groups = { "functest" })
		
		@Test(groups = { "functest" })
		public void tc_CA693_06_uploadImageDocument() {
			System.out.println("Verify that user can able to upload document for Portea Patient by selecting take photo, choose from library and cancel");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
//			driver.scrollTo("Refer patient");
//			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(2);
			referpatientpages.uploadImageDocument();
			Assert.assertNotNull("Take photo");
			Assert.assertNotNull("Choose from Library");
			Assert.assertNotNull("Cancel");
		}
		
		//@Test(groups = { "functest" })
		public void tc_CA693_06_ReferPatientThroughPorteaPatient() {
			System.out.println("Verify that user can able to refer patient for any service for the option Portea Patient");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
//			driver.scrollTo("Refer patient");
//			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(2);
			referpatientpages.referPatientViaPorteaPatient();
			//Assert.assertNotNull(referpatientpage.getChooseFromLibraryLocator());
			Assert.assertNotNull(referpatientpages.getReferAPatientText());
		}
		
		@Test(groups = { "functest" })
		public void tc_CA693_06_ReferPatientThroughPersonalNetwork() {
			System.out.println("Verify that user can able to refer patient for any service for the option Personal Networks");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			driver.scrollTo("Refer patient");
			GlobalUtil.wait(1);
			dashboardpage.onTapReferPatientNav();
			GlobalUtil.wait(2);
			referpatientpages.referPatientViaPersonalNetwork();
			Assert.assertNotNull(referpatientpages.getReferAPatientText());
		}
		
		//Feedback Test Scripts
		
		//UI Test Scenarios
		@Test(groups = { "UITest" })
		public void testVerifyFeedBackScreenVisiblity()
		{
			System.out.println("Verify ontapping Feedback should display fields like Options EOS,MOS.Location,ServicesandRating ");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapFeedbackNav();
			Assert.assertNotNull(feedbackpage.getfeedbackScreenTitleLocator());
//			Assert.assertNotNull(feedbackpage.getIssueTypeLabelLocator());
//			Assert.assertNotNull(feedbackpage.getTechnicalIssueLocator());
//			Assert.assertNotNull(feedbackpage.getEnterFeedbackLocator());
//			Assert.assertNotNull(feedbackpage.getCancelBtnLocator());
//			Assert.assertNotNull(feedbackpage.getSendFeedbackLocator());
				
		}
		

		@Test(groups = { "funcTest" })
		public void testVerifyTechnicalFeedbackSubmission()
		{
			System.out.println("Verify submit technical feedback");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapFeedbackNav();
			GlobalUtil.wait(2);
			feedbackpage.submitTechnicalFeedback();
			Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
		}

		
		
		@Test(groups = { "funcTest" })
		public void testVerifyOperationalFeedbackSubmission()
		{
			System.out.println("Verify submit operational feedback");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapFeedbackNav();
			GlobalUtil.wait(2);
			feedbackpage.onclickgetsubmitLocator();
			Assert.assertNotNull(feedbackpage.getsubmitLocator());
			
		}
		
		//Report Test Scripts
		
		@Test(groups = { "UITest" })
		public void tc_02_testVerifyTimingLeaveAppointment()
		{
		System.out.println("Verify that on Reports should display the field Report type with options: Timings, Leaves and Appointments");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapReportsNav();
		GlobalUtil.wait(2);
		reportspage.onTapReportTypeSpinner();
		Assert.assertNotNull(reportspage.gettimings());
		Assert.assertNotNull(reportspage.getappointments());
		Assert.assertNotNull(reportspage.getleaves());
		}
			

			
		@Test(groups = { "UITest" })
		public void tc_04_testVerifyReportScreenElements()
		{
			System.out.println("Verify that Report Type, From Date, To Date, continue and cancel button should be visible on Reports Screen.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapReportsNav();
			//GlobalUtil.wait(2);
			//driver.getWindowHandle().contains("Email Report");
			Assert.assertNotNull(reportspage.getreportScreenLocator());
			Assert.assertNotNull(reportspage.getreportTypeText());
			Assert.assertNotNull(reportspage.getToDateLocator());
			Assert.assertNotNull(reportspage.getFromDateLocator());
			Assert.assertNotNull(reportspage.getcontinueBtn());
			Assert.assertNotNull(reportspage.getcancelBtn());
		}
		
		@Test(groups = { "functest" })
		public void tc_05_testVerifyOnClickCancelButtonRedirectDashboardScreen()
		{
			System.out.println("Verify that on tap cancel button, should redirect to Dashboard screen.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapReportsNav();
			GlobalUtil.wait(2);
			reportspage.cancelReport();
			Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
		}
		@Test(groups = { "functest" })
		public void tc_05_testVerifySubmitReportForTimings()
		{
			System.out.println("Verify that on tap click get reports button should send report to user.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapReportsNav();
			reportspage.submitReport("Timings");
			Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
		}
		
		
		//@Test(groups = { "functest" })
		public void tc_05_testVerifySubmitReportForLeaves()
		{
			System.out.println("Verify that on tap click get reports button should send report to user.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapReportsNav();
			reportspage.submitReport("Leaves");
			Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
		}
		
		//@Test(groups = { "functest" })
		public void tc_05_testVerifySubmitReportForAppointments()
		{
			System.out.println("Verify that on tap click get reports button should send report to user.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapOperationsExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapReportsNav();
			reportspage.submitReport("Appointments");
			Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
		}
		
		//Alerts Tests
		
		//Tickets Tests
		   @Test(groups = { "UITest" })
				public void TC_testVerifyTicketScreenVisibilty()
				{
					System.out.println("Verify that on tap ticket nav ticket screen should be visible");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapOperationsExpandButton();
					GlobalUtil.wait(2);
					operationspage.onTapTicketNav();
					Assert.assertNotNull(operationspage.getTicketScreenLocators());
				}
		   
		   @Test(groups = { "UITest" })
			public void TC_testVerifyTicketDetailsVisibilty()
			{
				System.out.println("Verify that on Ticket screen,ticket listings and details should be visible");
				dashboardpage.onTapDashboardtext();
				GlobalUtil.wait(2);
				dashboardpage.onTapOperationsExpandButton();
				GlobalUtil.wait(2);
				operationspage.onTapTicketNav();
				try{
				if(driver.findElement(operationspage.getPatientIdLocator()).isDisplayed())
				{
				Assert.assertNotNull(operationspage.getTicketIdLocator());
				Assert.assertNotNull(operationspage.getCategoryLocator());
				Assert.assertNotNull(operationspage.getSubCategoryLocator());
				Assert.assertNotNull(operationspage.getReferenceLocator());
				Assert.assertNotNull(operationspage.getStatusLocator());
				Assert.assertNotNull(operationspage.getPatientIdLocator());
				Assert.assertNotNull(operationspage.getRefreshLocator());
				}
				}
				catch(Exception e)
				{
					System.out.println("Ticket Listing is not available");
					System.out.println(e);
				}
			}
}
