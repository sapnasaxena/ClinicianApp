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
//**Author: Sapna Saxena
//**Created date: 07-APR-2016
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LogOutPage;

public class LogOutTests extends TestBase {

	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea1234";
	
	
	@BeforeClass(alwaysRun=true)
	public void initLogOut() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		logoutpage = new LogOutPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureLogoutPage() throws MalformedURLException{
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(logoutpage.waitVisible(logoutpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		logoutpage.dismissLocation();
		int i = 0;
	   LoopThrice:
		while(i < 3){
			if(logoutpage.waitVisible(logoutpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Logout page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	
	@Test(groups = { "UITest" })
	public void TC_01_testLogOutNavBarVisibilty()
	{
		System.out.println("Verify that on Navigation drawer, Logout nav bar is visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		Assert.assertNotNull(dashboardpage.getLogOutNavLocator());
		
	}
	
	@Test(groups = { "UITest" })
	public void TC_02_testVerifyLogoutMessagePopupScreenVisibilty()
	{
		System.out.println("Verify that on tapping Logout nav bar, should display  alert message pop up Want to Logout along with No and Yes button.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapLogOut();
		Assert.assertNotNull(logoutpage.getLogOutLocator());
		
	}
	
	@Test(groups = { "functest" })
	public void TS_01_testVerifyLogOutFunctionality()
	{
		System.out.println("Verify that on click yes button, user is able to exit from the application");
        dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapLogOut();
		GlobalUtil.wait(2);
		logoutpage.onTapYesButtonToLogOut();
		Assert.assertNotNull(loginpage.getLoginButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_03_testVerifyCancelLogout()
	{
		System.out.println("Verify that on clicking on No button,  user is able to see Dashboard screen");
        dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapSettingsExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapLogOut();
		GlobalUtil.wait(2);
		logoutpage.onTapNoButtonToLogOut();
		Assert.assertNotNull(dashboardpage.getHomeScreenLocator());
	}
}
