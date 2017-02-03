package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LeavePage;


/* Author: Lipsha satpathy
 * Created date: 6th and 7th april 2016
 * XPATH for casefile Page 
 * */

public class LeaveTests extends TestBase{

	
	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea12345";
	
	@BeforeClass(alwaysRun=true)
	public void initLeave() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		leavepage = new LeavePage(driver);
		appointmentpage = new AppointmentPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureLeavePage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(leavepage.waitVisible(leavepage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		leavepage.getLeaveScreenLocator();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(leavepage.waitVisible(leavepage.getLeaveScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}	
		catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Leave page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}

	//UI Test Scenarios
	/*
	@Test(groups = { "UITest" })
	public void TC_01testVerifyLeaveScreenVisiblity()
	{
		System.out.println("Verify that on tap Leaves nav,should display 3 tabs: Holiday, Leaves, Overtime");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(4);
		Assert.assertNotNull(leavepage.getholidaysTabLocator());
		Assert.assertNotNull(leavepage.getovertimeTabLocator());
		Assert.assertNotNull(leavepage.getleaveTabLocator());
		
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_02testVerifyApplyButtonVisiblity()
	{
		System.out.println("Verify that Apply Button should visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepage.getapplyButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_03testVerifyHolidayTabVisiblity()
	{
		System.out.println("Verify that Holiday screen, should display company Holiday list");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepage.onClickholidaysTabLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepage.getgenerallistLocator());
		Assert.assertNotNull(leavepage.getHolidayNameLocator());
		Assert.assertNotNull(leavepage.getHolidayDateLocator());
		Assert.assertNotNull(leavepage.getHolidayStatusLocator());
		
		
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_04testVerifyLeavesTabVisiblity()
	{
		System.out.println("Verify that Leaves, should display all the applied leaves details");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepage.onClickleaveTabLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepage.getgenerallistLocator());
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_05testVerifyOvertimescreenVisiblity()
	{
		System.out.println("Verify that on Overtime screen, should display all the applied overtime details");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepage.onClickovertimeTabLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepage.getgenerallistLocator());
		Assert.assertNotNull(leavepage.getHolidayNameLocator());
		Assert.assertNotNull(leavepage.getHolidayDateLocator());
		Assert.assertNotNull(leavepage.getHolidayStatusLocator());
		
	}
	@Test(groups = { "UITest" })
	public void TC_06testApplybuttonVisiblity()
	{
		System.out.println("Verfiy that on tap Apply, should display 3 options Apply Leave, Apply overtime, Apply changetime");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepage.onClickapplyButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepage.getapplyChangeTimeLocator());
		Assert.assertNotNull(leavepage.getapplyOverTimeButtonLocator());
		Assert.assertNotNull(leavepage.getApplyLeavesButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_07testApplybuttonTapVisiblity()
	{
		System.out.println("Verify that on tap Apply Leave, should display calendar to select the date for leave apply");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepage.onClickapplyButtonLocator();
		GlobalUtil.wait(3);
		leavepage.onClickApplyLeavesButtonLocator();
		Assert.assertNotNull(leavepage.getcalenderLocator());	
		
}
	*/
	@Test(groups = { "UITest" })
	public void TC_DemotestSelectChangeTime()
	{
		System.out.println("Verify that select change timings...");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepage.onClickapplyButtonLocator();
		GlobalUtil.wait(3);
		leavepage.onClickapplyChangeTimeLocator();
		GlobalUtil.wait(2);
		appointmentpage.selectDate("11");
		leavepage.selectTimeForChangeTimings(4,9);
		//Assert.assertNotNull(leavepage.getcalenderLocator());
		
		
}
}
	
	