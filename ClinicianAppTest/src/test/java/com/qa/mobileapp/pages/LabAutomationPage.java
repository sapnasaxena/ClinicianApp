package com.qa.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

import io.appium.java_client.AppiumDriver;


public class LabAutomationPage  extends BasePage  {


	private static final By  Labautomation  = null;


	public  LabAutomationPage (AppiumDriver driver) {
		super(driver);{

}
	}

	
		/* Author: Lipsha satpathy
		 * Created date: 16 May 2016
		 * XPATH for Lab Automation Page 
		 * */
private final By LabAutomationAppointmentLocator = By.name("Appointments");
private final By RefreshLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
private final By TodayTabLocator = By.name("TODAY");
private final By UpcomingTabLocator = By.name("UPCOMING");
private final By PastTabLocator = By.name("PAST");
private final By PatientNameLocator = By.name("testsettle test test");
private final By PendingStatusLocator = By.name("Status : pending");
private final By ConfirmStatusButtonLocator = By.name("Confirm");
private final By ConfirmStatusLocator = By.name("Status : confirmed");
private final By ReachedLocator = By.name("Reached");;
private final By INVESTIGATIONLocator = By.name("INVESTIGATION");
private final By OKbuttonLocator = By.name("Ok");
private final By MessageLocator = By.id("To view/edit lab services, click on Investigation from Action Menu.");
private final By EditFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etPatientEmail");
private final By RemindMeButtonLocator = By.name("Remind me later");
private final By InvenstigationCheckButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/checkbutton");
private final By AddServiceButtonLocator = By.name("Add new service");
private final By InvenstigationCancelButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/subServiceState");
private final By DoneButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/DoneButton");
private final By SearchButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/listSearch");
private final By SubservicePlusButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/subServiceState");
private final By GotButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/got_it");
private final By SampleCollectedButtonLocator = By.name("Sample Collected");
private final By CheckButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/checkbutton");
private final By YesButtonLocator = By.name("Yes");
private final By NoButtonLocator = By.name("No");
private final By AlertTitleLocator = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
private final By CashpaymentButtonLocator = By.name("Cash Payments");
private final By OnlinePaymentsLocator = By.name("Online Payments");
private final By CASHCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbCash");
private final By CASHEditFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etCash");
private final By ChequeCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbCheque");
private final By ChequeEditFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etCheque");
private final By PayButtonLocator = By.name("Pay");
private final By WalletLocator = By.id("com.healthvista.clinicianapp.stage:id/cbWallet");
private final By EditWalletTestFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etWallet");
private final By ONLINEButtonLocator = By.name("ONLINE");
private final By EditONLINEFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnline");
private final By SendonlineLinkButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bSendLink");
private final By EditEmailFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnlineEmail");
private final By EditMobileFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnlineMobile");
private final By BackbuttonLocator = By.name("Navigate up");
private final By SkipbuttonLocator = By.name("Skip");
private final By BalanceScreenLocator = By.className("android.widget.TextView");

public By getCashpaymentButtonLocator(){
	return CashpaymentButtonLocator;
}

public By getBalanceScreenLocator(){
	return BalanceScreenLocator;
}

public By getOnlinePaymentsLocator(){
	return OnlinePaymentsLocator;
}

public By getSampleCollectedButtonLocator(){
	return SampleCollectedButtonLocator;
}



public By getAlertTitleLocator(){
	return AlertTitleLocator;
}


public By getLabAutomationAppointmentLocator(){
	return LabAutomationAppointmentLocator;
}

public By getRefreshLocator(){
	return  RefreshLocator;


}

public By getTodayTabLocator(){
	return TodayTabLocator;
	
}

public By getUpcomingTabLocator(){
	return  UpcomingTabLocator;
	
}

public By getPastTabLocator(){
	return  PastTabLocator;
	
}

public By getPatientNameLocator(){
	return PatientNameLocator;
	
}

public By getPendingStatusLocator(){
	return PendingStatusLocator;
	
}

public By getConfirmStatusButtonLocator(){
	return ConfirmStatusButtonLocator;
	
}

public By getConfirmStatusLocator(){
	return  ConfirmStatusLocator;
	
}
public By getReachedLocator(){
	return  ReachedLocator;
	
}

public By getINVESTIGATIONLocator(){
	return INVESTIGATIONLocator;
	
}

public By getOKbuttonLocator(){
	return OKbuttonLocator;
	
}

public By getMessageLocator(){
	return MessageLocator;
	
}

public By getEditFieldLocator(){
	return EditFieldLocator;
	
}


public By getRemindMeButtonLocator(){
	return RemindMeButtonLocator;
	
}

public By getInvenstigationCheckButtonLocator(){
	return InvenstigationCheckButtonLocator;
	
}

public By getAddServiceButtonLocator(){
	return  AddServiceButtonLocator;
	
}


public By getInvenstigationCancelButtonLocator(){
	return  InvenstigationCancelButtonLocator;
	
}
public By getDoneButtonLocator(){
	return  DoneButtonLocator;
	
}

public By getSearchButtonLocator(){
	return  SearchButtonLocator ;
	
}

public By getSubservicePlusButtonLocator(){
	return  SubservicePlusButtonLocator ;
	
}

//**** FUNCTIONS FOR LabAutomation ****


public void onClickLabAutomationAppointmentLocator()
{
clickWhenVisible(LabAutomationAppointmentLocator);

}

public void onClickRefreshLocator()
{
clickWhenVisible(RefreshLocator);

}

public void onClickTodayTabLocator()
{
clickWhenVisible(TodayTabLocator);

}

public void onClickSkipbuttonLocator()
{
clickWhenVisible(SkipbuttonLocator);

}

public void onClickUpcomingTabLocator()
{
clickWhenVisible(UpcomingTabLocator);

}
public void onClickPastTabLocator()
{
clickWhenVisible(PastTabLocator);

}

public void onClickPatientNameLocator()
{
clickWhenVisible(PatientNameLocator);

}

public void onClickPendingStatusLocator()
{
clickWhenVisible(PendingStatusLocator);

}

public void onClickConfirmStatusButtonLocator()
{
clickWhenVisible(ConfirmStatusButtonLocator);

}

public void onClickConfirmStatusLocator()
{
clickWhenVisible(ConfirmStatusLocator);

}

public void onClickReachedLocator()
{
clickWhenVisible(ReachedLocator);

}

public void onClickINVESTIGATIONLocator()
{
clickWhenVisible(INVESTIGATIONLocator);

}

public void onClickAddServiceButtonLocator()
{
clickWhenVisible(AddServiceButtonLocator);

}

public void onClickInvenstigationCancelButtonLocator()
{
clickWhenVisible(InvenstigationCancelButtonLocator);

}

public void onClickDoneButtonLocator()
{
clickWhenVisible(DoneButtonLocator);

}

public void onClickSearchButtonLocator()
{
clickWhenVisible(SearchButtonLocator);

}

public void onClickSubservicePlusButtonLocator()
{
clickWhenVisible(SubservicePlusButtonLocator);

}

public void onClickGotButtonLocator()
{
clickWhenVisible(GotButtonLocator);

}

public void onClickOKbuttonLocator()
{
clickWhenVisible(OKbuttonLocator);

}

public void onClickPayButtonLocator()
{
clickWhenVisible(PayButtonLocator);

}

public void onClickCheckButtonLocator()
{
clickWhenVisible(CheckButtonLocator);

}

public void onClickSampleCollectedButtonLocator()
{
clickWhenVisible(SampleCollectedButtonLocator);

}

public void onClickYesButtonLocator()
{
clickWhenVisible(YesButtonLocator);

}

public void onClickNoButtonLocator()
{
clickWhenVisible(NoButtonLocator);

}

public void payByCash(String num)
{
	WebElement txt = clickWhenVisible(CASHEditFieldLocator);
	txt.sendKeys(num);
	GlobalUtil.wait(1);
	clickWhenVisible(PayButtonLocator);
	
}

public void payByCheque(String num)
{
	WebElement txt = clickWhenVisible(ChequeEditFieldLocator);
	txt.sendKeys(num);
	GlobalUtil.wait(1);
	clickWhenVisible(PayButtonLocator);
	
}

public void onClickOnlinePaymentsLocator()
{
clickWhenVisible(OnlinePaymentsLocator);

}

//public void payByWallet(String otp)
//{
	//WebElement txt = clickWhenVisible(walletEnterAmountTextBoxLocator);
	//txt.sendKeys("1");
	//GlobalUtil.wait(1);
	//clickWhenVisible(sendOTPLocator);
	//WebElement enterOTP = clickWhenVisible(enterOTPLocator);
	//enterOTP.sendKeys(otp);
	//clickWhenVisible(authroizePaymentButtonLocator);
	


//public void otpDetails()
//{
	//WebElement txt = clickWhenVisible(walletEnterAmountTextBoxLocator);
	//txt.sendKeys("1");
	//GlobalUtil.wait(1);
	//clickWhenVisible(sendOTPLocator);
	
//}

public void payByOnline(String num ,String email, String mobileNo)  
{
	WebElement txt = clickWhenVisible(EditONLINEFieldLocator);
	txt.sendKeys(num);
	WebElement txt1 = clickWhenVisible(EditEmailFieldLocator);
	txt.sendKeys(email);
	GlobalUtil.wait(1);
	WebElement mobile = clickWhenVisible(EditMobileFieldLocator);
	mobile.sendKeys(mobileNo);
	GlobalUtil.wait(1);
	clickWhenVisible(SendonlineLinkButtonLocator);
}
	


public void onClickCashpaymentButtonLocator()
{
clickWhenVisible(CashpaymentButtonLocator);

}


public void onClickWalletLocator()
{
clickWhenVisible(WalletLocator);

}

public void onClickEditWalletTestFieldLocator()
{
clickWhenVisible(EditWalletTestFieldLocator);

}

public void onClickBackbuttonLocator()
{
clickWhenVisible(BackbuttonLocator);

}



public void addSubService(String subService)
{

WebElement element = waitVisible(SubservicePlusButtonLocator);
System.out.println("Add New Sub service button found");
element.click();
GlobalUtil.wait(2);
if(null != verticalScroll("Rs.", By.name(subService), 25)){
//The text element is found. Now we need to find corresponding Add Image View
element = waitVisible(By.xpath("//android.widget.TextView[contains(@text,'" + subService + "')]/parent::*"));
List<WebElement>elements = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'" + subService + "')]/parent::*/child::android.widget.ImageButton"));
if(elements.size() > 0)
elements.get(0).click();
}
GlobalUtil.wait(1);
WebElement sub = driver.findElement(By.id("subServiceState"));
GlobalUtil.wait(1);
sub.click();
}


public WebElement verticalScroll(String textFieldValue, By scrollTo, int maxScroll)
{

List<WebElement> elements = driver.findElements(scrollTo);
if(elements.size() > 0){
return elements.get(0);
}else{
WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + textFieldValue + "')]/parent::*"));
int x = ele.getSize().height;
int scrollStart = (int) (x);
int scrollEnd = scrollStart;
Dimension dimensions = driver.manage().window().getSize();
int[] oldValues = null;
int i = 0;
//scrolls a maximum of maxScroll times.
while(i < maxScroll){
++i;  
driver.swipe(0, scrollStart, 0, scrollEnd/3, 1000);    
//scrollEnd += scrollEnd;
scrollStart = x + scrollEnd;
elements = driver.findElements(scrollTo);
//No more scrolling if the element is found.
if(elements.size() > 0){
return elements.get(0);
}	
}
}
return null;
}

public void onClickPatientNames(String status) throws NoSuchFieldException, SecurityException
{
List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'Status : " + status + "')]/parent::*/child::android.widget.TextView"));
if(elements.size() > 0){
elements.get(0).click();
}else{
WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Status : ')]/parent::*"));
int x = ele.getSize().height;
int scrollStart = (int) (x);
int scrollEnd = scrollStart;
Dimension dimensions = driver.manage().window().getSize();
int totalScrolls = 0;
int[] oldValues = null;
int i = 0;
while(true && i < 30){
++i;  
driver.swipe(0, scrollStart, 0, scrollEnd/3, 1000);    
//scrollEnd += scrollEnd;
scrollStart = x + scrollEnd;
List<WebElement>eles = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'Status : ')]"));
//No more scrolling if the element is found.
boolean bFound = false;
int m = 0;
for(;m < eles.size(); m++){
if(eles.get(m).getAttribute("text").contains(status)){
bFound = true;
break;
}
}
if(bFound){
eles.get(m).click();
break;
}
if(oldValues == null){
oldValues = new int[eles.size()];
for(int n = 0; n < oldValues.length; n++){
oldValues[n] = eles.get(n).getLocation().y;
}
}else{
int[] newValues = new int[eles.size()];
for(int n = 0; n < newValues.length; n++){
newValues[n] = eles.get(n).getLocation().y;
}
if(newValues.length != oldValues.length){
oldValues = newValues;
continue;
}
else{
bFound = true;
for(int n = 0; n < oldValues.length; n++){
if(oldValues[n] != newValues[n]){
bFound = false;
break;
}
}
if(bFound)
break;
oldValues = newValues;
}
}
}
}


}


}





