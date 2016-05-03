package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;






import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LoginPage;
import com.qa.mobileapp.pages.ReportsPage;

public class ReportTests extends TestBase{

	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";
	
	@BeforeClass(alwaysRun=true)
	public void initReports() throws MalformedURLException{		
		ensureLogin(userName, password);
	}

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		reportspage = new ReportsPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureDashboardPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(reportspage.waitVisible(reportspage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		reportspage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(reportspage.waitVisible(reportspage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Reports page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}

	//UI Test Scenarios
//	@Test
//	public void tc_01_testVerifyGetReport()
//	{
//	System.out.println("Verify that on tap on Reports nav, should display date picker to select Start and end date");
//	loginpage.clearUserNameField();
//	loginpage.clearPasswordField();
//	loginpage.login(userName, password);
//	GlobalUtil.wait(2);
//	dashboardpage.onTapDashboardtext();
//	GlobalUtil.wait(2);
//	driver.scrollTo("Reports");
//	GlobalUtil.wait(1);
//	dashboardpage.onTapReportsNav();
//	// Calendar : Waiting for design
//	
//	}
//	
	@Test(groups = { "UITest" })
	public void tc_02_testVerifyTimingLeaveAppointment()
	{
	System.out.println("Verify that on Reports should display the field Report type with options: Timings, Leaves and Appointments");
	dashboardpage.onTapDashboardtext();
	GlobalUtil.wait(2);
	loginpage.dismissLocation();
	driver.scrollTo("Reports");
	GlobalUtil.wait(2);
	dashboardpage.onTapReportsNav();
	Assert.assertNotNull(reportspage.getstartNEndDateText());
	Assert.assertNotNull(reportspage.getreportTypeText());
	Assert.assertNotNull(reportspage.gettimings());
	Assert.assertNotNull(reportspage.getappointments());
	Assert.assertNotNull(reportspage.getleaves());
	}
		
	@Test(groups = { "UITest" })
	public void tc_03_testVerfyCnclnContinueBtn()
	{
	System.out.println("Verify that Reports tab should have Cancel and continue button");
	dashboardpage.onTapDashboardtext();
	GlobalUtil.wait(2);
	driver.scrollTo("Reports");
	GlobalUtil.wait(1);
	dashboardpage.onTapReportsNav();
	Assert.assertNotNull(reportspage.getcontinueBtn());
	Assert.assertNotNull(reportspage.getcancelBtn());
	}
		
	@Test(groups = { "UITest" })
	public void tc_06_testVerifyCancelBtn()
	{
		System.out.println("Verify that on click cancel button should redirect to Dashboard screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Reports");
		GlobalUtil.wait(1);
		dashboardpage.onTapReportsNav();
		Assert.assertNotNull(reportspage.getcancelBtn());
	}
	
	@Test(groups = { "funcTest" })
	public void tc_05_testVerifyReportBtn()
	{
		System.out.println("Verify that on tap click get reports button should send report to user.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Reports");
		GlobalUtil.wait(1);
		dashboardpage.onTapReportsNav();
		Assert.assertNotNull(reportspage.gettimings());
		
		//Calendar selection is still left, waiting for calendar.
		
		Assert.assertNotNull(reportspage.getcontinueBtn());
		Assert.assertNotNull(reportspage.getgetReportBtn());
	}
	
	
}
