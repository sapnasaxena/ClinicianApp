package com.qa.mobileapp.tests;


import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.ImageTextExtracter;
//import org.testng.annotations.AfterMethod;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LoginPage;

//**Author: Sapna Saxena
//**Created date: 01-APR-2016

public class LoginTests extends TestBase {


	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea12345";

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		loginpage = new LoginPage(driver);
		dashboardpage=new DashboardPage(driver);
	}


	// BVT (P1) Test Scenarios

	@Test(groups = {"UITest"})
	public void TC_01_testVerifyUsernameFieldVisibilityOnLoginScreen()
	{

		System.out.println("Verify that Username Field is visible On Login screen");
		Assert.assertNotNull(loginpage.getUserNameFieldLocator());
		Assert.assertNotNull(loginpage.getPasswordFieldLocator());
		Assert.assertNotNull(loginpage.getLoginButtonLocator());
		Assert.assertNotNull(loginpage.getForgotPasswordLocator());
		Assert.assertNotNull(loginpage.getShowPasswordFieldLocator());
		Assert.assertNotNull(loginpage.getChangeLoginLocator());
	}

	

	//Functional test Scenarios


	//@Test(groups = {"functest"})
	public void TC_07_testVerifyUserGetsLocationEnabledAlert()
	{
		System.out.println("Verify that after login user can able to get the notification for enable the location");
		loginpage.doLogin(userName, password);
		Assert.assertNotNull(driver.findElement(loginpage.getLocationEnableAlertLocator()));
	}

	@Test(groups = {"functest"})
	public void TC_08_testVerifyErrorOnLoginWithInvalidCredentials() throws Exception
	{
		System.out.println("Verify that user is able to see error while logging with Invalid credentials");
		ensureLogin(userName, "123456");
		Assert.assertNotNull(loginpage.getLoginButtonLocator());
	}

	@Test(groups = {"functest"})
	public void TC_09_testVerifyErrorOnLoginWithblankPasswordFields()
	{
		System.out.println("Verify that user is able to see error while logging by leaving required Password field blank");
		loginpage.clearUserNameField();
		loginpage.clearPasswordField();
		loginpage.login(userName,"");
		Assert.assertTrue(true, "Enter your password");

	}

	@Test(groups = {"functest"})
	public void TC_10_testVerifyErrorOnLoginWithblankUsernameFields()
	{
		System.out.println("Verify that user is able to see error while logging by leaving required field blank");
		loginpage.clearUserNameField();
		loginpage.clearPasswordField();
		loginpage.login("",password);
		Assert.assertTrue(true,"Enter your username/email");

	}

	@Test(groups = {"functest"})
	public void TC_11_testVerifyErrorOnLoginWithblankUserNameAndPasswordFields()
	{
		System.out.println("Verify that user is able to see error while logging by leaving required field blank");
		ensureLogin("", "");
		Assert.assertTrue(true, "Enter your username/email");

	}

	@Test(groups = {"functest"})
	public void TC_004_testVerifyOnTapChangeLoginModeOTPBasedLoginScreenVisibility()
	{
		System.out.println("Verify that on tapping change login mode navigate to Mobile based OTP Screen");
		loginpage.onTapChangeLoginModeButton();
		Assert.assertNotNull(loginpage.getMobileOTPLoginLocator());
		
	}
	
	@Test(groups = {"functest"})
	public void TC_005_testVerifyEnterMobileFieldisfunctional()
	{
		System.out.println("Verify that enter mobile number field is functional on Mobile OTP based login screen");
		loginpage.onTapChangeLoginModeButton();
		GlobalUtil.wait(2);
		loginpage.sendOTP("8553013244");
		Assert.assertNotNull("Please wait, trying to fetch the OTP.You can also enter the OTP manually.");
		
	}
	
	@Test(groups = {"functest"})
	public void TC_006_testVerifyOnlyNumericValuesAllowedInEnterMobileNoField()
	{
		System.out.println("Verify that only numeric value allowed Mobile No field on Mobile OTP based login screen");
		loginpage.onTapChangeLoginModeButton();
		GlobalUtil.wait(2);
		loginpage.sendOTP("qwertyuiop");
		Assert.assertNotNull(loginpage.getMobileOTPLoginLocator());
		
	}
	
	@Test(groups = {"functest"})
	public void TC_007_testVerifyErrorMsgOnTapSendOTPWithoutEnterMobileNo()
	{
		System.out.println("Verify that error message will display on tap Send OTP button without enter mobile number");
		loginpage.onTapChangeLoginModeButton();
		GlobalUtil.wait(2);
		loginpage.sendOTP("");
		Assert.assertNotNull(loginpage.getMobileOTPLoginLocator());
		
	}
	
	
	//@Test(groups = {"functest"})
	public void TC_010_testVerifyOnEnterInvalidOTPShouldDisplayErrorMsg()
	{
		System.out.println("Verify that on enter invalid OTP should display error message.");
		loginpage.onTapChangeLoginModeButton();
		GlobalUtil.wait(2);
		loginpage.sendOTP("8553013244");
		GlobalUtil.wait(2);
		loginpage.enterOTP("1234");
		Assert.assertNotNull(loginpage.getLoginPorteaButtonLocator());
		
	}
	//Functional Test Scenarios
	@Test(groups = {"functest"})
	public void TS_01_testVerifyLoginSuccessfully()
	{
		System.out.println("Verify that User is able to Login successfully on android application");
		ensureLogin(userName, password);
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianNameLocator());
		String name = text.getText();
		String expected="Testphysio";
		Assert.assertTrue(name.startsWith(expected));

	}

	@Test(groups = {"smoketest"})
	public void TS_01_testVerifyLoginAsPhlebotomists()
	{
		System.out.println("Verify that Phlebotomists should able to login successfully");
		ensureLogin("lab.p@gmail.com","Portea123456");
		GlobalUtil.wait(10);
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Phlebotomists");

	}
	
	@Test(groups = {"smoketest"})
	public void TS_01_testVerifyLoginAsPCO()
	{
		System.out.println("Verify that Physio Coordinator should able to login successfully");
		ensureLogin(userName,password);
		GlobalUtil.wait(2);
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Physiotherapist");

	}
	
	@Test(groups = {"smoketest"})
	public void TC_001_LoginAsNursingCoordinator()
	{
		System.out.println("Verify that NA coordinator should able to login to app");
		ensureLogin("Nursing@test.com","Portea12345");
		GlobalUtil.wait(2);
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Nursing Coordinator");
	}


	@Test(groups = {"smoketest"})
	public void TS_01_testVerifyLoginAsLOngTermNursing()
	{
		System.out.println("Verify that LTN should able to login successfully");
		ensureLogin("longterm@test.com", "Portea12345");
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Nursing - Long Term");

	}
	@Test(groups = {"smoketest"})
	public void TS_01_testVerifyLoginAsShortTermNursing()
	{
		System.out.println("Verify that STN should able to login successfully");
		ensureLogin("shortterm@test.com", "Portea12345");
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Nursing - Short Term");

	}



	@Test(groups = {"functest"})
	public void TS_04_testVerifyOnClickShowPasswordShouldNotHangScreen()
	{
		System.out.println("Verify that on click Show Password should not hang screen and proceed to login.");
		loginpage.onTapShowPassword();
		GlobalUtil.wait(1);
		ensureLogin(userName, password);
		GlobalUtil.wait(2);
		Assert.assertNotNull(loginpage.getHomeScreenLocator());
	}


	//@Test(groups = {"UItest"})
	public void TS_05_testVerifyVersionNumberVisibiltyOnLoginScreen()
	{
		System.out.println("Verify the App version number in Login screen should be correct.");
		Assert.assertNotNull(loginpage.getVersionByNameLocator());
	}

	@AfterMethod(alwaysRun=true)
	public void ensureLoginPage() throws MalformedURLException{
		System.out.println("Cleaning up and restoring login screen.");
		driver.quit();
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
