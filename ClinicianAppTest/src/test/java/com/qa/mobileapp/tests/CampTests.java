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
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CampPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LoginPage;

public class CampTests extends TestBase{

	
	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";

	
	@BeforeClass
	public void initPayment() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
		
	@BeforeMethod
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		camppage = new CampPage(driver);
	}
	
	@AfterMethod
	public void ensureDashboardPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(camppage.waitVisible(camppage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		camppage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(camppage.waitVisible(camppage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Camp page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	@Test
	public void testVerifyCampNavVisibilityOnHomeScreen()
	{
		
		System.out.println("Verify that Camp is visible On Left Nav bar");
		dashboardpage.onTapDashboardtext();
		Assert.assertNotNull(driver.findElement(camppage.getCampNameLocator()));
	}
	
	@Test
	public void testVerifyOnClickCampNavCampScreenWillDsipaly()
	{
		System.out.println("Verify that on click on Camp nav camp screen will display");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		camppage.onClickCampNavBar();
		Assert.assertNotNull(driver.findElement(camppage.getCampNameLocator()));
	}
	
	@Test
	public void testVerifyOnClickCampAddLeadbuttonVisibilty()
	{
		System.out.println("Verify that on click on Camp nav Add Lead button will be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		camppage.onClickCampNavBar();
		Assert.assertNotNull(driver.findElement(camppage.getAddLeadBtnLocator()));
	}
	
	@Test
	public void testVerifyOnClickCampAddPatientbuttonVisibilty()
	{
		System.out.println("Verify that on click on Camp nav Add Patient button will be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		camppage.onClickCampNavBar();
		Assert.assertNotNull(driver.findElement(camppage.getAddPatientBtnLocator()));
	}
	
}
