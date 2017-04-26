package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class LoginPage extends BasePage {

	public LoginPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* Author: Sapna Saxena
	 * Created date: 29 Mar 2016
	 * XPATH for Login Page 
	 * */
	
	private final By userNameFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etEmail"); 
	private final By passwordFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etPassword");
	private final By showPasswordFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/cbShowPwd");
	private final By loginButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/acbLogin");
	private final By profileScreenLocator = By.className("android.widget.RelativeLayout");
	private final By securityscreenLocator = By.className("android.widget.FrameLayout");
	private final By enterSecurityPinNoFieldLocator = By.id("com.portea.internal:id/editText1");
	private final By reenterSecurityPinFieldLocator = By.id("com.portea.internal:id/editText2");
	private final By registerButtonLocator = By.id("com.portea.internal:id/actionButton");
	private final By logoutButtonLocator = By.name("Logout");
	private final By forgotPasswordButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/tvForgotPassword");
	private final By locationEnableAlertLocator = By.name("Location Disabled!");
	private final By enableLocationLocator = By.name("Enable Location");
	private final By mobileOTPLoginLocator = By.name("Mobile Number");
	private final By homeScreenRedirectLocator = By.id("com.healthvista.clinicianapp.stage:id/rlProgressLayout");
	private final By versionNumberLocator = By.id("com.healthvista.clinicianapp.stage:id/versionText");
	private final By versionByNameLocator = By.name("App Version: 34.1 - dev (49) - Stage");
	private final By changeLoginLocator = By.id("com.healthvista.clinicianapp.stage:id/tvToogleLoginMode");
	private final By sendOTPButtonLocator = By.name("Send OTP");
	private final By enterMobileNoFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etMobileNumber");
	private final By enterOTPFieldLocator = By.name("Enter OTP");
	private final By loginPorteaButtonLocator = By.name("LOGIN TO PORTEA");
	
	
		
	public By getLogoutButtonLocator() {
		return logoutButtonLocator;
	}
	
	public By getVersionNumberLocator() {
		return versionNumberLocator;
	}

	public By getLocationEnableAlertLocator() {
		return locationEnableAlertLocator;
	}
	public By getEnableLocationLocator() {
		return enableLocationLocator;
	}
	
	
	public By getShowPasswordFieldLocator() {
		return showPasswordFieldLocator;
	}
	
	public By getForgotPasswordLocator() {
		return forgotPasswordButtonLocator;
	}
	public By getUserNameFieldLocator() {
		return userNameFieldLocator;
	}
	public By getPasswordFieldLocator() {
		return passwordFieldLocator;
	}
	public By getLoginButtonLocator() {
		return loginButtonLocator;
	}
	
	public By getVersionByNameLocator() {
		return versionByNameLocator;
	}

	public By getProfileScreenLocator()
	{
		return profileScreenLocator;
	}

	public By getSecurityScreenLocator()
	{
		return securityscreenLocator;
	}
//	public String securityPinRegistrationScreenLocator ="";
//	public String getSecurityPinRegistrationScreenLocator()
//	{
//		return securityPinRegistrationScreenLocator;
//	}
	
	
	public By getSendOTPButtonLocator() {
		return sendOTPButtonLocator;
	}

	public By getSecurityscreenLocator() {
		return securityscreenLocator;
	}
	public By getLoginPorteaButtonLocator() {
		return loginPorteaButtonLocator;
	}

	public By getEnterSecurityPinNoFieldLocator() {
		return enterSecurityPinNoFieldLocator;
	}
	public By getReenterSecurityPinFieldLocator() {
		return reenterSecurityPinFieldLocator;
	}
	public By getEnterOTPFieldLocator() {
		return enterOTPFieldLocator;
	}

	public By getRegisterButtonLocator() {
		return registerButtonLocator;
	}
	
	
	// **** FUNCTIONS FOR LOGIN ****
	
	public By getEnterMobileNoFieldLocator() {
		return enterMobileNoFieldLocator;
	}

	public By getMobileOTPLoginLocator() {
		return mobileOTPLoginLocator;
	}

	public By getChangeLoginLocator() {
		return changeLoginLocator;
	}

	public void login(String username, String password)
	{
		inputText(userNameFieldLocator, username);
		inputText(passwordFieldLocator, password);
		GlobalUtil.wait(2);
		driver.hideKeyboard();
		GlobalUtil.wait(2);
		clickWhenVisible(loginButtonLocator);
		GlobalUtil.wait(2);
		//clickWhenVisible(By.xpath("//android.widget.Button[contains(@text,'Skip')]"),GlobalUtil.LongInterval * 2);
		//GlobalUtil.wait(2);
		//clickWhenVisible(By.name("Allow"));
		GlobalUtil.wait(1);
		//dismissLocation();
	}
	public void doLogin(String username, String password)
	{
		inputText(userNameFieldLocator, username);
		inputText(passwordFieldLocator, password);
		GlobalUtil.wait(2);
		clickWhenVisible(loginButtonLocator);
		GlobalUtil.wait(2);
		//WebElement ele =driver.findElement(By.name("Skip"));
		//ele.click();

	}
	
	public void inputText(By locator, String text)
	{
		WebElement element = clickWhenVisible(locator);
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		element.sendKeys(Keys.BACK_SPACE);
		GlobalUtil.wait(1);
		element.sendKeys(text);
		GlobalUtil.wait(1);
	}
	
	
	public void forgotPasswordFieldVisibility()
	{
		clickWhenVisible(forgotPasswordButtonLocator);
	}
	
	public void showPasswordFieldVisibilty()
	{
		clickWhenVisible(showPasswordFieldLocator);
	}
	
	public void onTapForgotPasswordButton()
	{
		clickWhenVisible(forgotPasswordButtonLocator);
	}
	
	public void enableLocation()
	{
		clickWhenVisible(enableLocationLocator);
	}
	

	public void securityRegistration(String pin, String rpin)
	{
		WebElement enterpin = clickWhenVisible(enterSecurityPinNoFieldLocator);
		enterpin.sendKeys(pin);
		GlobalUtil.wait(1);
		WebElement reenterpin = clickWhenVisible(reenterSecurityPinFieldLocator);
		reenterpin.sendKeys(rpin);
		GlobalUtil.wait(1);
		clickWhenVisible(registerButtonLocator);
		GlobalUtil.wait(2);
		
	}
	
	public void logoutButton()
	{
		clickWhenVisible(logoutButtonLocator);
	}
	
	public void clearUserNameField()
	{
		WebElement userName = clickWhenVisible(userNameFieldLocator);
		if(userName.isSelected()==true);
		userName.clear();
	}
	
	public void clearPasswordField()
	{
		WebElement password = clickWhenVisible(passwordFieldLocator);
		if (password.isSelected()==true)
		{
		password.clear();
		}
	}
	
	public void onTapShowPassword()
	{
		clickWhenVisible(showPasswordFieldLocator);
	}
	
	public void onTapChangeLoginModeButton()
	{
		clickWhenVisible(changeLoginLocator);
	}
	
	public void sendOTP(String mobileNo)
	{
		WebElement enterMobileNo = driver.findElement(enterMobileNoFieldLocator);
		enterMobileNo.sendKeys(mobileNo);
		GlobalUtil.wait(2);
		WebElement sendOtp = driver.findElement(sendOTPButtonLocator);
		sendOtp.click();
	}
	
	public void enterOTP(String otp)
	{
		WebElement ele = driver.findElement(enterOTPFieldLocator);
		ele.sendKeys(otp);
		GlobalUtil.wait(2);
		clickWhenVisible(loginPorteaButtonLocator);
	}
	
}
