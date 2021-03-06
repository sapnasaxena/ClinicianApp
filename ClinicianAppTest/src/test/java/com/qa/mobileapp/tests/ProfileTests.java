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
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.ProfilePage;

/*Author: Sapna Saxena
  Created date: 22 APRIL 2016   */

public class ProfileTests extends TestBase {

	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea12345";

	@BeforeClass(alwaysRun=true)
	public void initProfile() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		profilepage = new ProfilePage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureProfilePage() throws MalformedURLException{
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(profilepage.waitVisible(profilepage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		profilepage.dismissLocation();
		int i = 0;
	    LoopThrice:
		while(i < 3){
			if(profilepage.waitVisible(profilepage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
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
			System.out.println("Profile page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
   //UI Scenarios
	@Test(groups = { "UITest" })
	public void TS_01_testVerifyProfessionalDetailsVisiblity()
	{
		System.out.println("Verify that user can able to view the details (Name, email id, emp id, clinician id, Mobile number, Address, Gender, Profession, etc)of the clinican ");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		Assert.assertNotNull(profilepage.getProfNameLocator());
		Assert.assertNotNull(profilepage.getEmpcliniIdLocator());
		Assert.assertNotNull(profilepage.getProfEmailIdLocator());
		Assert.assertNotNull(profilepage.getProfMobileNoLocator());
		Assert.assertNotNull(profilepage.getProfAddressLocator());
		Assert.assertNotNull(profilepage.getProfGenderProfessionaLocator());
		//Assert.assertNotNull(driver.findElement(profilepage.getQualificationLocator()));
		//Assert.assertNotNull(driver.findElement(profilepage.getSecurityPinLocator()));
	}
	
	
	@Test(groups = { "UITest" })
	public void TS_02_testVerifyRefreshButtonVisiblity()
	{
		System.out.println("Verify that Refresh Button is visible on Profile Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		Assert.assertNotNull(profilepage.getRefreshButtonLocator());
	}

	@Test(groups = { "UITest" })
	public void TS_02_testVerifyUploadImageButtonVisiblity()
	{
		System.out.println("Verify that Upload Image Button is visible on Profile Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		Assert.assertNotNull(profilepage.getProfilePcImageLocator());
	}
	
	//@Test(groups = { "UITest" })
	public void TS_02_testVerifyUploadImageOptionsVisiblity()
	{
		System.out.println("Verify that Upload Image Options Choose from library, Take photo and cancel should visible on Profile Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		GlobalUtil.wait(2);
		profilepage.onClickUploadImageLocator();
		Assert.assertNotNull(profilepage.getChooseFromLibraryLocator());
		Assert.assertNotNull(profilepage.getTakePhotoLocator());
		Assert.assertNotNull(profilepage.getCancelUploadImageLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TS_03_testVerifyEditButtonVisiblity()
	{
		System.out.println("Verify that Profile edit button is visible on Profile Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		Assert.assertNotNull(profilepage.getProfileEditLocator());
	}

	@Test(groups = { "UITest" })
	public void TS_05_testVerifyProfessionalCashInHandPendingVerificationVisiblity()
	{
		System.out.println("Verify that user can able to view the payment details like Cash in hand, Pending Verification");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		Assert.assertNotNull(profilepage.getCashInHandLocator());
		GlobalUtil.wait(1);
		Assert.assertNotNull(profilepage.getPaymentDetailsLocator());
		GlobalUtil.wait(1);
		Assert.assertNotNull(profilepage.getPendingVerificationLocator());
	}
	
	//functional Test Scenarios
	@Test(groups = { "functest" })
	public void TS_04_testVerifyUserAbleToEditProfile()
	{
		System.out.println("Verify that user can able to edit and save the details of the clinician");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapClinicianName();
		GlobalUtil.wait(2);
		profilepage.onTapEditProfileButton();
		GlobalUtil.wait(2);
		profilepage.editProfile();
		Assert.assertNotNull(profilepage.getProfileScreenLocator());
	}
	
	
}
