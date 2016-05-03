package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CalendarPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.ForgotPasswordPage;
import com.qa.mobileapp.pages.LoginPage;

public class ForgotPasswordTests extends TestBase{

	
	String mobileNo ="8095627267";
	String votp="";
	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";
	
//	@BeforeClass(alwaysRun=true)
//	public void initForgotPassword() throws MalformedURLException{		
//		ensureLogin(userName, password);
//	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		loginpage=new LoginPage(driver);
		forgotpasswordpage = new ForgotPasswordPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureforgotpasswordpages() throws MalformedURLException{
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(forgotpasswordpage.waitVisible(forgotpasswordpage.getAbortChangingPasswordLocator(), GlobalUtil.ShortInterval)!=null)
			//driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		forgotpasswordpage.confirmAbortChangePassword();
		int i = 0;
	    LoopThrice:
		while(i < 3){
			if(forgotpasswordpage.waitVisible(loginpage.getLoginButtonLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}}catch(Exception ex){
			bFound = false;
		}
	}

	//UI Scenarios
	@Test(groups = { "UITest" })
	public void TC_01_ForgotPasswordScreenVisiblity()
	{
		System.out.println("Verify that on tap Forgot Password button, Forgot Password Screen should display");
		loginpage.onTapForgotPasswordButton();
		Assert.assertNotNull(forgotpasswordpage.getForgotPasswordScreenLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_02_EnterMobileNoLabelVisiblity()
	{
		System.out.println("Verify that  Forgot Password Screen, Enter Mobile number LabelS should be displayed");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(1);
		Assert.assertNotNull(forgotpasswordpage.getEnterMobileNoLabelLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_04_testVerifyEnterMobileNoFieldVisiblity()
	{
		System.out.println("Verify that  Forgot Password Screen, Enter Mobile number field should be displayed");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(1);
		Assert.assertNotNull(forgotpasswordpage.getEnterMobileNumberFieldLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_05_testVerifySendOTPButtonVisiblity()
	{
		System.out.println("Verify that  Forgot Password Screen, Send OTP button should be displayed");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(1);
		Assert.assertNotNull(forgotpasswordpage.getSendOTPButtonLocator());
	}
	
	//Functionality Test Cases
	//@Test(groups = { "funcTest" })
	public void TS_01_testVerifyUserAbleToRetrievePasswordSuccessfully()
	{
		System.out.println("Verify that user can able to change the password by doing forgot password");
	    loginpage.onTapForgotPasswordButton();
	   
	    //clinician id retrieve from otp_verification table by userid
	}
	
	@Test(groups = { "funcTest" })
	public void TS_02_testVerifyOnEnterValidMobileNoAbleToSendOTP()
	{
		System.out.println("Verify that by entering the Registered mobile number user can able to send the OTP");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(2);
		forgotpasswordpage.forgotPassword("8095627267");
		Assert.assertNotNull(forgotpasswordpage.getWaitMessageOnSendOTPLocator());
		Assert.assertNotNull(forgotpasswordpage.getProgressBarLocator());
		Assert.assertNotNull(forgotpasswordpage.getVerifyOTPButtonLocator());
	}
	
	@Test(groups = { "funcTest" })
	public void TS_03_testVerifyOnEnterInvalidMobileNoErrorVisibility()
	{
		System.out.println("Verify that if the mobile number is not registered then user cann't able to send the OTP");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(2);
		forgotpasswordpage.forgotPassword("123000000");
		GlobalUtil.wait(1);
		Assert.assertNotNull(forgotpasswordpage.getInvalidMobileNoLocator());
	}
	
	//@Test(groups = { "funcTest" })
	public void TS_04_testVerifyOTP()
	{
		System.out.println("Verify that once the OTP verification done then user can able to set the new password and save ");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(2);
		forgotpasswordpage.validateOTP(mobileNo, votp);
		GlobalUtil.wait(2);
		Assert.assertNotNull(forgotpasswordpage.getChangePasswordLocator());
	}
	
	
	
	//@Test (groups = { "funcTest" })***need to add DB code***
	public void TS_05_testVerifyResendOTP()
	{
		System.out.println("Verify that user can able to resend OTP ");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(2);
		forgotpasswordpage.forgotPassword(mobileNo);
		GlobalUtil.wait(2);
		Assert.assertNotNull(forgotpasswordpage.getResendOTPButtonLocator());
	}
	
	//@Test(groups = { "funcTest" })
	public void TS_06_testVerifyUserShouldBeAbleToLoginWithChangePassword()
	{
		System.out.println("Verify that using the new password user can able to log in into the app ");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(2);
		forgotpasswordpage.forgotPassword(mobileNo);
		GlobalUtil.wait(2);
		Assert.assertNotNull(forgotpasswordpage.getResendOTPButtonLocator());
	}
	
	@Test(groups = { "funcTest" })
	public void TS_07_testVerifyOnSubmitForgotPasswordWithoutEnterOTPErrorVisibilty()
	{
		System.out.println("Verify that on tap send OTP button without enter mobile number, should display error");
		loginpage.onTapForgotPasswordButton();
		GlobalUtil.wait(2);
		forgotpasswordpage.forgotPassword("");
		Assert.assertEquals("Please enter mobile number.",forgotpasswordpage.getErrorForBlankFieldLocator());
	}
}
