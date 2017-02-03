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
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CalendarPage;
import com.qa.mobileapp.pages.DashboardPage;


/* Author: Lipsha satpathy
 * Created date: 15thth april 2016
 * XPATH for calender Page 
 * */

public class CalendarTests extends TestBase {

	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea12345";
	
	@BeforeClass(alwaysRun=true)
	public void initCalendar() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		appointmentpage = new AppointmentPage(driver);
		calendarpages = new CalendarPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureCalendarPage() throws MalformedURLException{	
		GlobalUtil.wait(2);
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(calendarpages.waitVisible(calendarpages.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		calendarpages.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(calendarpages.waitVisible(calendarpages.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		
		if(!bFound){
			System.out.println("Calendar page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	

	
	//UI Test Scenarios
	
	@Test(groups = { "UITest" })
	public void TC01testVerifyCalendarScreenVisiblity()
	{
		System.out.println("Verify that on tapping Calendar nav, should display the current month calendar");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		Assert.assertNotNull(calendarpages.getcalendarScreenLocator());
		//Assert.assertNotNull(calendarpages.getcurrentmonthtextLocator());
	}
	
	
	@Test(groups = { "UITest" })
	public void TC03testVerifysaveCheckButtonOnCalendarScreenVisiblity()
	{
		System.out.println("Verify that on Calendar Screen, Check Button is visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(calendarpages.getsaveButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC02testVerifyNextsliderButtonvisiblity()
	{
		System.out.println("Verify that on Calendar Screen, Next month slider is visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		calendarpages.onclicknextMonthScreenImageLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(calendarpages.getnextMonthScreenImageLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC02testVerifyPreviousSliderbuttonVisiblity()
	{
		System.out.println("Verify that on Calendar Screen, Previous slider is visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		calendarpages.onclickpreviousMonthScreenImageLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(calendarpages.getpreviousMonthScreenImageLocator());
	
	}
	
	@Test(groups = { "UITest" })
	public void TC08testVerifyHomeBackButtonOnCalendarScreenVisiblity()
	{
		System.out.println("Verify that on Calendar Screen, Home Back button is visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(3);
		calendarpages.onClickhomeBackButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(calendarpages.gethomeBackButtonLocator());
}
	
	@Test(groups = { "UITest" })
	public void TC05testVerifyappointmentdetailsVisiblity()
	{
		System.out.println("Verify that tapping on date appointment details should visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		calendarpages.onClickdateFromCalendarLocator();
		Assert.assertNotNull(calendarpages.getAppointmentPopUpLocator());
		Assert.assertNotNull(calendarpages.getCancelAppointmentPopUpLocator());
		
	}
	
	//@Test(priority=5)  (this apk some id's are missing )
	public void TC06testverifypopupdetailsVisiblity()
	{
		System.out.println("Verify that on ");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		calendarpages.onClickdateFromCalendarLocator();
		GlobalUtil.wait(2);
		calendarpages.onClickPopuplistLocator();;
		GlobalUtil.wait(2);
		calendarpages.onClickdateFromCalendarLocator();
		GlobalUtil.wait(2);
		calendarpages.onClickPopuplistLocator();;
		GlobalUtil.wait(2);
		Assert.assertNotNull(calendarpages.getdateFromCalendarLocator());
		Assert.assertNotNull(calendarpages.getPopuplistLocator());
		Assert.assertNotNull(calendarpages.getExistingappointmentlistLocator());
		Assert.assertNotNull(calendarpages.getalertpopuptimetextLocator());
		Assert.assertNotNull(calendarpages.getTimeanddateunderpatientnameLocator());
		Assert.assertNotNull(calendarpages.getPatientreferalLocator());
		
		
	}
	
	//@Test(groups = { "funcTest" })
	public void TC07testVerifycancelbutton()
	{
		System.out.println("Verify that on tap on cancel button should redirect to calendar screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCalendarNav();
		GlobalUtil.wait(2);
		calendarpages.onClickdateFromCalendarLocator();
		GlobalUtil.wait(2);
		calendarpages.onClickPopuplistLocator();
		GlobalUtil.wait(2);
		calendarpages.onClickcancelButtonLocator();
		Assert.assertNotNull(calendarpages.getcancelButtonLocator());
		Assert.assertNotNull(calendarpages.getcalendarScreenLocator());

	}
		
	
}
	
	