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
import com.qa.mobileapp.pages.LeavePage;


/* Author: Lipsha satpathy
 * Created date: 6th and 7th april 2016
 * XPATH for casefile Page 
 * */

public class LeaveTest extends TestBase{

	
	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea1234";
	
	@BeforeClass
	public void initPayment() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		appointmentpage = new AppointmentPage(driver);
		leavepage = new LeavePage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureLeavePage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(leavepage.waitVisible(leavepage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		leavepage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(leavepage.waitVisible(leavepage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}}	
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
	
	@Test(groups = { "UITest" })
	public void TC_01testVerifyLeaveScreenVisiblity()
	{
		System.out.println("Verify that on tap Leaves nav,should display 3 tabs: Holiday, Leaves, Overtime");
		
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		Assert.assertNotNull(leavepages.getholidaysTabLocator());
		Assert.assertNotNull(leavepages.getovertimeTabLocator());
		Assert.assertNotNull(leavepages.getleaveTabLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_02testVerifyApplyButtonVisiblity()
	{
		System.out.println("Verify that Apply Button should visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepages.getapplyButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_03testVerifyHolidayTabVisiblity()
	{
		System.out.println("Verify that Holiday screen, should display company Holiday list");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepages.onClickholidaysTabLocator();
		Assert.assertNotNull(leavepages.getgenerallistLocator());
		Assert.assertNotNull(leavepages.getHolidayNameLocator());
		Assert.assertNotNull(leavepages.getHolidayDateLocator());
		Assert.assertNotNull(leavepages.getHolidayStatusLocator());
		
		
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_04testVerifyLeavesTabVisiblity()
	{
		System.out.println("Verify that Leaves, should display all the applied leaves details");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepages.onClickleaveTabLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepages.getgenerallistLocator());
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_04testVerifyOvertimescreenVisiblity()
	{
		System.out.println("Verify that on Overtime screen, should display all the applied overtime details");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepages.onClickovertimeTabLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepages.getgenerallistLocator());
		Assert.assertNotNull(leavepages.getHolidayNameLocator());
		Assert.assertNotNull(leavepages.getHolidayDateLocator());
		Assert.assertNotNull(leavepages.getHolidayStatusLocator());
		
	}
	@Test(priority=6)
	public void TC_06testApplybuttonVisiblity()
	{
		System.out.println("Verfiy that on tap Apply, should display 3 options Apply Leave, Apply overtime, Apply changetime");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepages.onClickapplyButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(leavepages.getapplyChangeTimeLocator());
		Assert.assertNotNull(leavepages.getapplyOverTimeButtonLocator());
		Assert.assertNotNull(leavepages.getApplyLeavesButtonLocator());
		
		
		
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_07testApplybuttonTapVisiblity()
	{
		System.out.println("Verify that on tap Apply Leave, should display calendar to select the date for leave apply");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapLeavessNav();
		GlobalUtil.wait(2);
		leavepages.onClickapplyButtonLocator();
		GlobalUtil.wait(3);
		leavepages.onClickApplyLeavesButtonLocator();
		GlobalUtil.wait(2);	
		Assert.assertNotNull(leavepages.getcalenderLocator());
}
	
	
}
	
	