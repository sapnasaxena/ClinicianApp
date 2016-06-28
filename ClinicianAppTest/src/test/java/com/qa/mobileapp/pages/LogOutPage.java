package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;


public class LogOutPage extends BasePage {

	public LogOutPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By logOutLocator = By.name("Want to Logout?");
	private final By logoutMessageLocator = By.id("android:id/message");
	private final By yesButtonLocator =By.name("Yes");
	private final By noButtonLocator = By.name("No");
	private final By logOutNavLocator = By.name("Logout");

	public By getLogOutLocator() {
		return logOutLocator;
	}
	
	
	public By getLogOutMessageLocator()
	{
		return logoutMessageLocator;
	}
	public void onTapYesButtonToLogOut()
	{
		clickWhenVisible(yesButtonLocator);
	}
	public void onTapNoButtonToLogOut()
	{
		clickWhenVisible(noButtonLocator);
	}
	
	public void logOut()
	{
	  driver.scrollTo("Logout");
	  GlobalUtil.wait(1);
      clickWhenVisible(logOutLocator);
      onTapYesButtonToLogOut();
	}
	
	
}
