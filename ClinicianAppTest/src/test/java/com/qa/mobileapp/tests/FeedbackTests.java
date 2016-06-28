package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;


/* Author: Lipsha satpathy
 * Created date: 7 april 2016
 * XPATH for casefile Page 
 * */






import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.FeedbackPage;

//Author: Lipsha Satpathy

public class FeedbackTests extends TestBase{
	
	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";
	
	@BeforeClass(alwaysRun=true)
	public void initFeedback() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		feedbackpage = new FeedbackPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureFeedbackPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(feedbackpage.waitVisible(feedbackpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		feedbackpage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(feedbackpage.waitVisible(feedbackpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
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
			System.out.println("Feedback page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}

	//UI Test Scenarios
	@Test(groups = { "UITest" })
	public void testVerifyFeedBackScreenVisiblity()
	{
		System.out.println("Verify ontapping Feedback should display fields like Options EOS,MOS.Location,ServicesandRating ");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Feedback");
		GlobalUtil.wait(1);
		dashboardpage.onTapFeedbackNav();
		//Assert.assertNotNull(feedbackpage.getfeedbackScreenTitleLocator());
		Assert.assertNotNull(feedbackpage.getServiceTypeLocator());
		Assert.assertNotNull(feedbackpage.getPatientTypeLocator());
		Assert.assertNotNull(feedbackpage.getLocationLocator());
		Assert.assertNotNull(feedbackpage.getRangeLocator());
			
	}
	@Test(groups = { "UITest" })
	public void testVerifySearchButtonVisibilty()
	{
		System.out.println("Verify that search image should be visible on Patient feedback screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		driver.scrollTo("Feedback");
		GlobalUtil.wait(1);
		dashboardpage.onTapFeedbackNav();
		Assert.assertNotNull(feedbackpage.getSearchButtonLocator());
//		Assert.assertNotNull(feedbackpage.getSearchBarLocator());
//		Assert.assertNotNull(feedbackpage.getMenuLoadLocator());
//		Assert.assertNotNull(feedbackpage.getRefreshListLocator());
			
}
	//@Test(groups = { "funcTest" })
	public void testVerifysubmitButton()
	{
		System.out.println("Verify submit button");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapFeedbackNav();
		GlobalUtil.wait(2);
		feedbackpage.onclickgetsubmitLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(feedbackpage.getsubmitLocator());
		
	}
}