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
import com.qa.mobileapp.pages.CheckInCheckOutPage;
import com.qa.mobileapp.pages.DashboardPage;

public class CheckInCheckOutTests extends TestBase {
	
	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea12345";

	@BeforeClass(alwaysRun=true)
	public void initCheckInCheckOut() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
		
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		checkincheckoutpage = new CheckInCheckOutPage(driver);
		appointmentpage = new AppointmentPage(driver);
	}
	
	@Test(groups = { "functest" })
	public void TS_09_testVerifyAfterCheckOutUserShouldNotAbleToAConfirmAppointment()
	{
		System.out.println("Verify that if user is checkout, should not able to confirm the appointment.");
		       // dashboardpage.checkCheckOutVisibility();
	     	   if(driver.findElementByClassName("android.widget.Switch").isEnabled())
		        {
			    dashboardpage.checkOut();
		        }
	            GlobalUtil.wait(2);
				dashboardpage.onTapDashboardtext();
				GlobalUtil.wait(2);
				dashboardpage.onTapMyTasksExpandButton();
				GlobalUtil.wait(2);
				dashboardpage.onTapAppointmentsNav();
				GlobalUtil.wait(2);
				appointmentpage.onClickUpcomingTab();
				GlobalUtil.wait(2);
				if(appointmentpage.getConfirmAppointmentButtonLocator().equals(true))
				{
				appointmentpage.onClickConfirmButton();
				Assert.assertNotNull(checkincheckoutpage.getCheckInErrorOnAddApptLocator());
				}
				else
				{
					System.out.println("No Pending appointment available...All appointments are already confirmed");
				}
			}
	
	
	@Test(groups = { "functest"})
	public void TS_010_testVerifyAfterCheckOutUserShouldNotAbleToAddAppointment() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that if user is checkout, should not able to add the appointment.");
		if (driver.findElementByClassName("android.widget.Switch").isEnabled())
        {
	    dashboardpage.checkOut();
        }
		GlobalUtil.wait(2);
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
//			appointmentpage.onTapPatienframe();
//			GlobalUtil.wait(1);
		    appointmentpage.onClickPatientName("successful");
		    GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapAddAppointmentButton();
			Assert.assertNotNull(checkincheckoutpage.getCheckInErrorOnAddApptLocator());
		}
	
	
	//@Test(groups = { "functest"})
	public void TS_011_testVerifyAfterCheckOutUserShouldNotAbleToMakeAppointmentSuccessful() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that if user is checkout, should not able to make appointment successful.");
		if (driver.findElementByClassName("android.widget.Switch").isEnabled())
        {
	    dashboardpage.checkOut();
        }  
		    GlobalUtil.wait(2);
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
//			appointmentpage.onTapPatienframe();
//			GlobalUtil.wait(1);
		    appointmentpage.onClickPatientName("confirmed");
		    GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapReachedFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapSuccessFabButton();
			Assert.assertNotNull(checkincheckoutpage.getCheckInErrorOnAddApptLocator());
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void ensureCheckInCheckOutPage() throws MalformedURLException{		
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(checkincheckoutpage.waitVisible(checkincheckoutpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		checkincheckoutpage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(checkincheckoutpage.waitVisible(checkincheckoutpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("CheckInCheckOutPage could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	


}
