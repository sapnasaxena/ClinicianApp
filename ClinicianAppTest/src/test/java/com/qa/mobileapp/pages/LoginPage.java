package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

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
	private final By passwordFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/tilPassword");
	private final By showPasswordFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/cbShowPwd");
	private final By loginButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/acbLogin");
	private final By profileScreenLocator = By.className("android.widget.RelativeLayout");
	private final By securityscreenLocator = By.className("android.widget.FrameLayout");
	private final By enterSecurityPinNoFieldLocator = By.id("com.portea.internal:id/editText1");
	private final By reenterSecurityPinFieldLocator = By.id("com.portea.internal:id/editText2");
	private final By registerButtonLocator = By.id("com.portea.internal:id/actionButton");
	private final By logoutButtonLocator = By.name("Logout");
	private final By forgotPasswordButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/tvForgotPassword");
	private final By locationEnableAlertLocator = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By enableLocationLocator = By.name("Enable Location");
	
	private final By homeScreenRedirectLocator = By.id("com.healthvista.clinicianapp.stage:id/rlProgressLayout");
	private final By versionNumberLocator = By.id("com.healthvista.clinicianapp.stage:id/versionText");
	private final By versionByNameLocator = By.name("App Version: 33.1 (45) - Stage");
	
	
		
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
	public String securityPinRegistrationScreenLocator ="";
	public String getSecurityPinRegistrationScreenLocator()
	{
		return securityPinRegistrationScreenLocator;
	}
	
	
	public By getSecurityscreenLocator() {
		return securityscreenLocator;
	}
	public By getEnterSecurityPinNoFieldLocator() {
		return enterSecurityPinNoFieldLocator;
	}
	public By getReenterSecurityPinFieldLocator() {
		return reenterSecurityPinFieldLocator;
	}
	public By getRegisterButtonLocator() {
		return registerButtonLocator;
	}
	
	
	// **** FUNCTIONS FOR LOGIN ****
	
	public void login(String username, String password)
	{
		inputText(userNameFieldLocator, username);
		inputText(passwordFieldLocator, password);
		GlobalUtil.wait(2);
		clickWhenVisible(loginButtonLocator);
		GlobalUtil.wait(2);
		dismissLocation();
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
}
