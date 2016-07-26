package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
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
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
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
//	reportspage.CalenderPicker();
//	}
	
	@Test(groups = { "UITest" })
	public void tc_02_testVerifyTimingLeaveAppointment()
	{
	System.out.println("Verify that on Reports should display the field Report type with options: Timings, Leaves and Appointments");
	dashboardpage.onTapDashboardtext();
	GlobalUtil.wait(2);
	dashboardpage.onTapSettingsExpandButton();
	GlobalUtil.wait(2);
	dashboardpage.onTapReportsNav();
	Assert.assertNotNull(reportspage.getstartNEndDateText());
	Assert.assertNotNull(reportspage.getreportTypeText());
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
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapReportsNav();
		Assert.assertNotNull(reportspage.getreportTypeText());
		Assert.assertNotNull(reportspage.getdatePicker());
		Assert.assertNotNull(reportspage.getcontinueBtn());
		Assert.assertNotNull(reportspage.getcancelBtn());
	}
	
	@Test(groups = { "functest" })
	public void tc_05_testVerifyOnClickCancelButtonRedirectDashboardScreen()
	{
		System.out.println("Verify that on tap cancel button, should redirect to Dashboard screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapReportsNav();
		reportspage.cancelReport();
		Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
	}
	@Test(groups = { "functest" })
	public void tc_05_testVerifySubmitReportForTimings()
	{
		System.out.println("Verify that on tap click get reports button should send report to user.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
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
		dashboardpage.onTapSettingsExpandButton();
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
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapReportsNav();
		reportspage.submitReport("Appointments");
		Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
	}
	
	
	
	
	
	
}
