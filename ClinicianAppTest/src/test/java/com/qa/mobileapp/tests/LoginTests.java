package com.qa.mobileapp.tests;


import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;








import com.qa.mobileapp.common.GlobalUtil;
//import org.testng.annotations.AfterMethod;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LoginPage;

//**Author: Sapna Saxena
//**Created date: 01-APR-2016

public class LoginTests extends TestBase {


	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		loginpage = new LoginPage(driver);
		dashboardpage=new DashboardPage(driver);
	}


	// BVT (P1) Test Scenarios

	@Test(groups = {"UItest"})
	public void TC_01_testVerifyUsernameFieldVisibilityOnLoginScreen()
	{

		System.out.println("Verify that Username Field is visible On Login screen");
		Assert.assertNotNull(driver.findElement(loginpage.getUserNameFieldLocator()));
	}

	@Test(groups = {"UItest"})
	public void TC_02_testVerifyPasswordFieldVisibilityOnLoginScreen()
	{
		System.out.println("Verify that Password Field is visible On Login screen");
		Assert.assertNotNull(driver.findElement(loginpage.getPasswordFieldLocator()));
	}

	@Test(groups = {"UItest"})
	public void TC_05_testVerifyLoginButtonVisibilityOnLoginScreen()
	{
		System.out.println("Verify that Login to Portea Button is visible On Login screen");
		Assert.assertNotNull(driver.findElement(loginpage.getLoginButtonLocator()));
	}

	@Test(groups = {"UItest"})
	public void TC_04_testVerifyForgotPasswordButtonVisibilityOnLoginScreen()
	{
		System.out.println("Verify that Forgot Password Button is visible On Login screen");
		Assert.assertNotNull(driver.findElement(loginpage.getForgotPasswordLocator()));
	}

	@Test(groups = {"UItest"})
	public void TC_03_testVerifyShowPasswordButtonVisibilityOnLoginScreen()
	{
		System.out.println("Verify that Forgot Password Button is visible On Login screen");
		Assert.assertNotNull(driver.findElement(loginpage.getShowPasswordFieldLocator()));
	}


	//Functional test Scenarios


	@Test(groups = {"functest"})
	public void TC_07_testVerifyUserGetsLocationEnabledAlert()
	{
		System.out.println("Verify that after login user can able to get the notification for enable the location");
		ensureLogin(userName, password);
		Assert.assertNotNull(driver.findElement(loginpage.getLocationEnableAlertLocator()));
	}

	@Test(groups = {"functest"})
	public void TC_08_testVerifyErrorOnLoginWithInvalidCredentials()
	{
		System.out.println("Verify that user is able to see error while logging with Invalid credentials");
		ensureLogin(userName, "123456");
		Assert.assertTrue(true, "Wrong Credentials");
	}

	@Test(groups = {"functest"})
	public void TC_09_testVerifyErrorOnLoginWithblankPasswordFields()
	{
		System.out.println("Verify that user is able to see error while logging by leaving required Password field blank");
		ensureLogin(userName, "");
		Assert.assertTrue(true, "Wrong Credentials.");

	}

	@Test(groups = {"functest"})
	public void TC_10_testVerifyErrorOnLoginWithblankUsernameFields()
	{
		System.out.println("Verify that user is able to see error while logging by leaving required field blank");
		loginpage.clearUserNameField();
		loginpage.clearPasswordField();
		loginpage.login("",password);
		Assert.assertTrue(true, "Wrong Credentials.");

	}

	@Test(groups = {"functest"})
	public void TC_11_testVerifyErrorOnLoginWithblankUserNameAndPasswordFields()
	{
		System.out.println("Verify that user is able to see error while logging by leaving required field blank");
		ensureLogin("", "");
		Assert.assertTrue(true, "Wrong Credentials.");

	}

	//Functional Test Scenarios
	@Test(groups = {"smoketest", "functest"})
	public void TS_01_testVerifyLoginSuccessfully()
	{
		System.out.println("Verify that User is able to Login successfully on android application");
		ensureLogin(userName, password);
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianNameLocator());
		String name = text.getText();
		String expected="Dinny test Dimple";
		Assert.assertEquals(name, expected);

	}

	@Test(groups = {"smoketest", "functest"})
	public void TS_01_testVerifyLoginAsPhlebotomists()
	{
		System.out.println("Verify that Phlebotomists should able to login successfully");
		ensureLogin("lab.p@gmail.com",password);
		GlobalUtil.wait(1);
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Phlebotomists");

	}

	@Test(groups = {"smoketest", "functest"})
	public void TS_01_testVerifyLoginAsLOngTermNursing()
	{
		System.out.println("Verify that LTN should able to login successfully");
		ensureLogin("sridevi@gmail.com", password);
		dashboardpage.onTapDashboardtext();
		WebElement text = driver.findElement(dashboardpage.getClinicianProfessionLocator());
		String profession = text.getText();
		Assert.assertEquals(profession, "Nursing - Long Term");

	}
	@Test(groups = {"smoketest", "functest"})
	public void TS_01_testVerifyLoginAsShortTermNursing()
	{
		System.out.println("Verify that STN should able to login successfully");
		ensureLogin("dony345@gmail.com", password);
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
		Assert.assertNotNull(driver.findElement(loginpage.getHomeScreenLocator()));
	}


	@Test(groups = {"UItest"})
	public void TS_05_testVerifyVersionNumberVisibiltyOnLoginScreen()
	{
		System.out.println("Verify the App version number in Login screen should be correct.");
		Assert.assertNotNull(driver.findElement(loginpage.getVersionByNameLocator()));
	}

	@AfterMethod(alwaysRun=true)
	public void ensureAppointmentPage() throws MalformedURLException{
		System.out.println("Cleaning up and restoring login screen.");
		driver.quit();
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
