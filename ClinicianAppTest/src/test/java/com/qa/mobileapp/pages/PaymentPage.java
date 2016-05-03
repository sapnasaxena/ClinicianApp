package com.qa.mobileapp.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class PaymentPage extends BasePage {

	public PaymentPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By paymentScreenLocator = By.name("Payments");
	private final  By backButtonLocator = By.name("Navigate up");
	private final By cashInHandListLocator = By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By refreshButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	private final By cashInHandTabLocator = By.name("Cash in Hand");
	private final By depositedTabLocator = By.name("Deposits");
	private final By listOfCashInHandLocator = By.id("com.portea.internal:id/general_list");
	private final By amountFieldCIHTabLocator =By.id("com.healthvista.clinicianapp.stage:id/amount");
	private final By typeFieldCIHTabLocator = By.id("com.healthvista.clinicianapp.stage:id/type");
	private final By userFieldCIHTabLocator = By.id("com.healthvista.clinicianapp.stage:id/user");
	private final By dateFieldCIHTabLocator = By.id("com.healthvista.clinicianapp.stage:id/date");
	private final By checkBoxCIHTabLocator = By.id("com.healthvista.clinicianapp.stage:id/checkbox_payment");
	private final By depositButtonOnSelectedCIHLocator = By.id("com.healthvista.clinicianapp.stage:id/deposit");
	private final By depositScreenTitleLocator = By.id("android:id/title=Deposit Amount :- 700");
	private final By enterBankNameFieldLocator  = By.id("com.portea.internal:id/bank");
	private final By enterBranchNameFieldLocator = By.id("com.portea.internal:id/branch");
	private final By enterCityFieldLocator = By.id("com.portea.internal:id/city");
	private final By enterNotesFieldLocator = By.id("com.portea.internal:id/notesText");
	//com.healthvista.clinicianapp.stage.debug:id/deposit
	private final By depositButtonOnDepositScreenLocator = By.id("com.portea.internal:id/statusButton");
	private final By errorOnLeavingFieldBlankOnDepositScreenLocator = By.name("Please enter all the fields");
	private final By pendingConfirmationMessageLocator = By.id("com.portea.internal:id/noSyncView");
	private final By amountFieldDepoistedTabLocator = By.id("com.healthvista.clinicianapp.stage:id/amount");
	private final By statusOnDepositedTabLocator = By.id("com.healthvista.clinicianapp.stage:id/status");
	private final By depositModeLocator = By.name("Choose a Deposit Mode");
	private final By chooseDepositModeLocator = By.className("android.widget.CheckedTextView");
			//By.name("Choose a Deposit Mode");
	private final By iciciIsureModeLocator = By.name("ICICI iSure Pay");
	private final By cashCollectionModeLocator = By.name("Cash Collection");
	private final By iSurePopUpAlertLocator = By.id("android:id/alertTitle");
	private final By iSurePopUpMessageLocator = By.id("android:id/message");
	private final By iSurePopUpOKButtonLocator =By.name("Ok");
	private final By paymentUserLocator = By.id("com.healthvista.clinicianapp.stage:id/paymentUsers");
	private final By enterOTPLocator = By.id("com.healthvista.clinicianapp.stage:id/paymentUsersOtp");
	private final By sendOTPButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/otpBtn");
	private final By notesLocator = By.id("com.healthvista.clinicianapp.stage:id/notesText");
	private final By depositButtonLocator = By.name("Deposit");
	
	
	public By getChooseDepositModeLocator()
	{
		return chooseDepositModeLocator;
	}
	public By getICICISureModeLocator()
	{
		return iciciIsureModeLocator;
	}
	
	public By getCashCollectionModeLocator()
	{
		return cashCollectionModeLocator;
	}
	
	public By getPaymentScreenLocator() {
		return paymentScreenLocator;
	}
	public By getCashInHandTabLocator() {
		return cashInHandTabLocator;
	}
	public By getBackButtonLocator() {
		return backButtonLocator;
	}
	public By getDepositedTabLocator() {
		return depositedTabLocator;
	}
	public By getListOfCashInHandLocator() {
		return listOfCashInHandLocator;
	}
	public By getAmountFieldCIHTabLocator() {
		return amountFieldCIHTabLocator;
	}
	public By getTypeFieldCIHTabLocator() {
		return typeFieldCIHTabLocator;
	}
	public By getUserFieldCIHTabLocator() {
		return userFieldCIHTabLocator;
	}
	public By getDateFieldCIHTabLocator() {
		return dateFieldCIHTabLocator;
	}
	public By getCheckBoxCIHTabLocator() {
		return checkBoxCIHTabLocator;
	}
	public By getDepositButtonOnSelectedCIHLocator() {
		return depositButtonOnSelectedCIHLocator;
	}
	public By getDepositScreenTitleLocator() {
		return depositScreenTitleLocator;
	}
	public By getEnterBankNameFieldLocator() {
		return enterBankNameFieldLocator;
	}
	public By getEnterBranchNameFieldLocator() {
		return enterBranchNameFieldLocator;
	}
	public By getEnterCityFieldLocator() {
		return enterCityFieldLocator;
	}
	public By getEnterNotesFieldLocator() {
		return enterNotesFieldLocator;
	}
	public By getiSurePopUpAlertLocator() {
		return iSurePopUpAlertLocator;
	}
	public By getEnterOTPLocator() {
		return enterOTPLocator;
	}
	public By getPaymentUserLocator() {
		return paymentUserLocator;
	}
	public By getSendOTPButtonLocator() {
		return sendOTPButtonLocator;
	}
	public By getiSurePopUpMessageLocator() {
		return iSurePopUpMessageLocator;
	}
	public By getDepositButtonOnDepositScreenLocator() {
		return depositButtonOnDepositScreenLocator;
	}
	public By getCashInHandListLocator() {
		return cashInHandListLocator;
	}
	public By getDepositButtonLocator() {
		return depositButtonLocator;
	}
	public By getiSurePopUpOKButtonLocator() {
		return iSurePopUpOKButtonLocator;
	}
	public By getRefreshButtonLocator() {
		return refreshButtonLocator;
	}
	public By getErrorOnLeavingFieldBlankOnDepositScreenLocator() {
		return errorOnLeavingFieldBlankOnDepositScreenLocator;
	}
	public By getNotesLocator() {
		return notesLocator;
	}
	public By getPendingConfirmationMessageLocator() {
		return pendingConfirmationMessageLocator;
	}
	public By getAmountFieldDepoistedTabLocator() {
		return amountFieldDepoistedTabLocator;
	}
	public By getStatusOnDepositedTabLocator() {
		return statusOnDepositedTabLocator;
	}
	
	
	public void selectCheckBox()
	{
		if(waitVisible(userFieldCIHTabLocator) != null)
		{
			clickWhenVisible(checkBoxCIHTabLocator);
		}
	}
	
	public void onClickDepositButtonOnCIHTab()
	{
		clickWhenVisible(depositButtonOnSelectedCIHLocator);
		GlobalUtil.wait(2);
	}
	
	public void depositAmount(String bankName, String branchName, String city, String notes)
	{
		WebElement bankNameField = clickWhenVisible(enterBankNameFieldLocator);
		GlobalUtil.wait(2);
		bankNameField.sendKeys(bankName);
		WebElement branchField = clickWhenVisible(enterBranchNameFieldLocator);
		GlobalUtil.wait(2);
		branchField.sendKeys(branchName);
		WebElement cityField = clickWhenVisible(enterCityFieldLocator);
		GlobalUtil.wait(2);
		cityField.sendKeys(city);
		WebElement notesField = clickWhenVisible(enterNotesFieldLocator);
		GlobalUtil.wait(2);
		notesField.sendKeys(notes);
		GlobalUtil.wait(2);
		clickWhenVisible(depositButtonOnDepositScreenLocator);
		GlobalUtil.wait(2);
	}
	
	public void onClickDepositedTab()
	{
		clickWhenVisible(depositedTabLocator);
	}
	
	public void onTapBackButton()
	{
		clickWhenVisible(backButtonLocator);
	}
	
	public void selectPaymentMode(int index)
	{
		clickWhenVisible(depositModeLocator);
		List<WebElement> choose = driver.findElements(chooseDepositModeLocator);
		choose.get(index).click();
	}
	
	public void cashCollection(String otpvalue)
	{
		clickWhenVisible(paymentUserLocator);
		WebElement otp = clickWhenVisible(enterOTPLocator);
		otp.sendKeys(otpvalue);
		WebElement notes = clickWhenVisible(enterNotesFieldLocator);
		notes.sendKeys("test");
	    clickWhenVisible(depositButtonLocator);
		
	}
	

}
