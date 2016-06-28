package com.qa.mobileapp.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class ProfilePage extends BasePage{

	public ProfilePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By profileScreenLocator = By.name("Profile");
	
	private final By profileEditLocator = By.id("com.healthvista.clinicianapp.stage:id/edit");
			
	private final By profNameLocator = By.id("com.healthvista.clinicianapp.stage:id/name");
	
	private final By middleNameLocator = By.id("com.healthvista.clinicianapp.stage:id/middlename");
	
	private final By lastNameLocator = By.id("com.healthvista.clinicianapp.stage:id/lastname");
	
	 private final By editEmailLocator = By.id(" com.healthvista.clinicianapp.stage:id/emailText");
	
	private final By profEmailIdLocator = By.id("com.healthvista.clinicianapp.stage:id/email");
	
	private final By empcliniIdLocator = By.id("com.healthvista.clinicianapp.stage:id/empid");
	
	private final By profAddressLocator = By.id("com.healthvista.clinicianapp.stage:id/address");
	
	private final By pincodeLocator = By.id("com.healthvista.clinicianapp.stage:id/pincode");
	
	private final By profGenderProfessionaLocator = By.id("com.healthvista.clinicianapp.stage:id/personal");
	
	private final By profMobileNoLocator = By.id("com.healthvista.clinicianapp.stage:id/phone");

	private final By paymentDetailsLocator = By.id("com.healthvista.clinicianapp.stage:id/appDetailHeading");
	
	private final By cashInHandLocator = By.id("com.healthvista.clinicianapp.stage:id/cashinhand");
	
	private final By pendingVerificationLocator = By.id("com.healthvista.clinicianapp.stage:id/pendingVer");
	
	private final By refreshButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	
	private final By homeIconLocator = By.id("android:id/up");
	
	private final By myProfileTextLocator = By.id("android:id/action_bar_title");
	
	private final By qualificationLocator = By.id("com.healthvista.clinicianapp.stage:id/qualification");
	
	private final By securityPinLocator = By.id("com.healthvista.clinicianapp.stage:id/securitypin_layout");
	
	private final By menuLoadLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	
	private final By saveButtonLocator =By.id("com.healthvista.clinicianapp.stage:id/done");
	
	private final By confirmDetailsPopUpLocator = By.name("Confirm Details");
	
	private final By confirmScreenSaveButtonLocator =By.name("Save");
	
	private final By confirmScreenBackButtonLocator = By.name("Back");

	public By getProfileScreenLocator()
	{
		return profileScreenLocator;
	}
	
	public By getEmpcliniIdLocator() {
		return empcliniIdLocator;
	}

	public By getQualificationLocator() {
		return qualificationLocator;
	}

	public By getConfirmScreenSaveButtonLocator() {
		return confirmScreenSaveButtonLocator;
	}

	public By getConfirmScreenBackButtonLocator() {
		return confirmScreenBackButtonLocator;
	}

	public By getConfirmDetailsPopUpLocator() {
		return confirmDetailsPopUpLocator;
	}

	public By getPincodeLocator() {
		return pincodeLocator;
	}

	public By getProfileEditLocator() {
		return profileEditLocator;
	}

	public By getSecurityPinLocator() {
		return securityPinLocator;
	}

	public By getMenuLoadLocator() {
		return menuLoadLocator;
	}

	public By getEditEmailLocator() {
		return editEmailLocator;
	}

	public By getMyProfileTextLocator()
	{
		return myProfileTextLocator;
	}
	

	public By getProfNameLocator() {
		return profNameLocator;
	}

	public By getLastNameLocator() {
		return lastNameLocator;
	}

	public By getProfEmailIdLocator() {
		return profEmailIdLocator;
	}

	public By getProfAddressLocator() {
		return profAddressLocator;
	}

	public By getProfGenderProfessionaLocator() {
		return profGenderProfessionaLocator;
	}

	public By getProfMobileNoLocator() {
		return profMobileNoLocator;
	}

	public By getPaymentDetailsLocator() {
		return paymentDetailsLocator;
	}

	public By getCashInHandLocator() {
		return cashInHandLocator;
	}

	public By getPendingVerificationLocator() {
		return pendingVerificationLocator;
	}

	public By getRefreshButtonLocator() {
		return refreshButtonLocator;
	}

	public By getHomeIconLocator() {
		return homeIconLocator;
	}
	

	//android:id/action_bar_container : action barbutton
	//com.portea.internal:id/menu_load: refresh icon
	// android:id/up
	
public void onClickHomeButton()
{
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
System.out.println("Find home button..");
clickWhenVisible(homeIconLocator);
}

public void onTapEditProfileButton()
{
clickWhenVisible(profileEditLocator);
}
	
public void editProfile()
{
	
	clickWhenVisible(By.xpath("//android.widget.EditText[contains(@id,'com.healthvista.clinicianapp.stage:id/qualification')]"));
	GlobalUtil.wait(1);
	WebElement ls= driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'ANM')]"));
	ls.click();
	GlobalUtil.wait(1);
	clickWhenVisible(By.xpath("//android.widget.Button[contains(@text,'Proceed')]"));
//	GlobalUtil.wait(1);
//	WebElement certificate = clickWhenVisible(By.xpath("//android.widget.EditText[contains(@id,'com.healthvista.clinicianapp.stage:id/certifications')]"));
//	certificate.sendKeys("test");
//	GlobalUtil.wait(1);
	clickWhenVisible(saveButtonLocator);
	GlobalUtil.wait(1);
	clickWhenVisible(confirmScreenSaveButtonLocator);
	
}


}

