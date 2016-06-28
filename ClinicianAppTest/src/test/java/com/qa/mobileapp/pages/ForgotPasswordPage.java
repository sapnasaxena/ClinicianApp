package com.qa.mobileapp.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class ForgotPasswordPage extends BasePage{

	
	public ForgotPasswordPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By forgotPasswordScreenLocator = By.name("Forgot Password");
	private final By enterMobileNumberFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etRMN");
	private final By enterMobileNoLabelLocator = By.name("Enter Regd Mobile number");
	private final By sendOTPButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bSendOTP");
	private final By errorForBlankFieldLocator= By.name("Please enter mobile number.");
	private final By waitMessageOnSendOTPLocator = By.name("PPlease wait, the OTP is being sent.");
	private final By progressBarLocator =By.id("com.healthvista.clinicianapp.stage:id/pbOTPProgress");
	private final By enterOTPFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etOTP");
	private final By verifyOTPButtonLocator=By.id("com.healthvista.clinicianapp.stage:id/bVerifyOTP");
	private final By resendOTPButtonLocator=By.id("com.healthvista.clinicianapp.stage:id/bSendOTP");
	private final By invalidMobileNoLocator = By.name("Please enter valid mobile number");
	private final By invalidOTPLocator = By.name("OTP is not valid");
	private final By changePasswordLocator = By.name("Change Password");
	private final By newPasswordLocator = By.id("com.healthvista.clinicianapp.stage:id/etNewPassword");
	private final By confirmPasswordLocator =By.id("com.healthvista.clinicianapp.stage:id/etVerifyNewPassword");
	private final By changePasswordButtonLocator =By.id("com.healthvista.clinicianapp.stage:id/bChangePassword");
	private final By abortChangingPasswordLocator = By.name("Abort changing password.");
	private final By confirmAbortYesButtonLocator = By.name("Yes");
	
	

	
	
	public void confirmAbortChangePassword()
	{
		WebElement abort= clickWhenVisible(confirmAbortYesButtonLocator);
		abort.click();
	}
	public By getEnterMobileNumberFieldLocator() {
		return enterMobileNumberFieldLocator;
	}

	public By getChangePasswordLocator() {
		return changePasswordLocator;
	}

	public By getConfirmPasswordLocator() {
		return confirmPasswordLocator;
	}

	public By getResendOTPButtonLocator() {
		return resendOTPButtonLocator;
	}

	public By getInvalidOTPLocator() {
		return invalidOTPLocator;
	}

	public By getEnterOTPFieldLocator() {
		return enterOTPFieldLocator;
	}

	public By getAbortChangingPasswordLocator() {
		return abortChangingPasswordLocator;
	}

	public By getConfirmAbortYesButtonLocator() {
		return confirmAbortYesButtonLocator;
	}

	public By getChangePasswordButtonLocator() {
		return changePasswordButtonLocator;
	}

	public By getInvalidMobileNoLocator() {
		return invalidMobileNoLocator;
	}

	public By getProgressBarLocator() {
		return progressBarLocator;
	}

	public By getVerifyOTPButtonLocator() {
		return verifyOTPButtonLocator;
	}

	public By getWaitMessageOnSendOTPLocator() {
		return waitMessageOnSendOTPLocator;
	}

	public By getForgotPasswordScreenLocator() {
		return forgotPasswordScreenLocator;
	}

	public By getErrorForBlankFieldLocator() {
		return errorForBlankFieldLocator;
	}

	public By getEnterMobileNoLabelLocator() {
		return enterMobileNoLabelLocator;
	}

	public By getSendOTPButtonLocator() {
		return sendOTPButtonLocator;
	}

	public By getNewPasswordLocator() {
		return newPasswordLocator;
	}

	public void forgotPassword(String mobileNo)
	{
		WebElement enter = clickWhenVisible(enterMobileNumberFieldLocator);
		enter.sendKeys(mobileNo);
		GlobalUtil.wait(1);
		clickWhenVisible(sendOTPButtonLocator);
		
	}
	
	public void validateOTP(String mobileNo, String votp)
	{
		forgotPassword(mobileNo);
		GlobalUtil.wait(2);
		WebElement otp = clickWhenVisible(enterOTPFieldLocator);
		otp.sendKeys(votp);
		GlobalUtil.wait(1);
		 clickWhenVisible(verifyOTPButtonLocator);
		
	}
	
	public void changePassword(String pwd)
	{
		WebElement newpwd = clickWhenVisible(newPasswordLocator);
	    newpwd.sendKeys(pwd);
	    GlobalUtil.wait(1);
	    WebElement confpwd = clickWhenVisible(confirmPasswordLocator);
	    confpwd.sendKeys(pwd);
	    GlobalUtil.wait(1);
	    clickWhenVisible(changePasswordButtonLocator);
	   
	}
	
	public void connectOTPVerificationTable()
	{
		String dbtime;
		String dbUrl = "jdbc:mysql:https://intranet.portea.com/pma/index.php?db=&server=5&token=fe74eef25d53f28677184ffb4e2557e9&old_usr=toor";
		String Username ="toor";
		String Password= "23NP6w68P353";
		String server = "portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com";
		String dbName = "portea_crm";
		String query = "Select * FROM otp_verification";

		try {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
		dbtime = rs.getString(1);
		System.out.println(dbtime);
		} //end while

		con.close();
		} //end try

		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		catch(SQLException e) {
		e.printStackTrace();
		}

		}
	}

