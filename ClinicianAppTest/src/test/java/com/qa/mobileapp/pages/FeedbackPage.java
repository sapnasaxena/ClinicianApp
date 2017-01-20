package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class FeedbackPage extends BasePage {

	public FeedbackPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/* Author: Lipsha satpathy
	 * Created date: 7 April 2016
	 * XPATH for Feedback Page 
	 * */

	private final By feedbackScreenTitleLocator = By.name("FeedBack");
	//private final By patientTypeLocator = By.id("com.healthvista.clinicianapp.stage:id/patientType");
	private final By searchButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/search_button");
	private final By searchBarLocator = By.id("com.healthvista.clinicianapp.stage:id/search_bar");
	private final By menuLoadLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	private final By patientListLocator = By.id("com.healthvista.clinicianapp.stage:id/feedback_patient_list");
	private final By locationLocator = By.id("com.healthvista.clinicianapp.stage:id/location");
	private final By refreshListLocator = By.name("Refresh List");
	private final By patientTypeLocator = By.name("com.healthvista.clinicianapp.stage:id/patientType");
	private final By serviceTypeLocator = By.name("com.healthvista.clinicianapp.stage:id/service_type");
	private final By rangeLocator = By.name("com.healthvista.clinicianapp.stage:id/range");
	private final By submitLocator = By.name("submit");
	private final By cancelBtnLocator = By.name("Cancel");
	private final By sendFeedbackLocator = By.name("Send FeedBack");
	private final By issueTypeLabelLocator = By.name("Select Issue Type: ");
	private final By technicalIssueLocator = By.name("Technical");
	private final By enterFeedbackLocator = By.id("feedBackText");
			//By.name("Enter feedback");

	
	
	
	
	public By getfeedbackScreenTitleLocator(){
		return feedbackScreenTitleLocator;
	}
	public By getSendFeedbackLocator() {
		return sendFeedbackLocator;
	}
	public By getEnterFeedbackLocator() {
		return enterFeedbackLocator;
	}
	public By getSearchButtonLocator(){
		return searchButtonLocator;
	}
	
	public By getTechnicalIssueLocator() {
		return technicalIssueLocator;
	}
	public By getSearchBarLocator(){
		return searchBarLocator;
	}
	
	public By getMenuLoadLocator(){
		return menuLoadLocator;
	}
	
	public By getPatientListLocator(){
		return patientListLocator;
	}
	
	public By getLocationLocator(){
		return locationLocator ;
	}
	
	public By getCancelBtnLocator() {
		return cancelBtnLocator;
	}
	public By getRefreshListLocator(){
		return refreshListLocator ;
	}
	
	public By getIssueTypeLabelLocator() {
		return issueTypeLabelLocator;
	}
	public By getPatientTypeLocator(){
		return patientTypeLocator ;
	}
	
	public By getServiceTypeLocator(){
		return patientTypeLocator ;
	}
	
		public By getRangeLocator(){
			return rangeLocator ;
		}
		
		public By getsubmitLocator(){
			return submitLocator ;
		}
			
	// **** FUNCTIONS FOR Feedback ****
			
	public void onTapfeedbackScreenTitleLocator()
	{
     clickWhenVisible(feedbackScreenTitleLocator);
	}
	
	public void onclicksearchButtonLocator()
	{
     clickWhenVisible(searchButtonLocator);
	}
	
	public void onclicksearchBarLocator()
	{
     clickWhenVisible(searchBarLocator);
	}
	public void onclickmenuLoadLocator()
	{
    clickWhenVisible(menuLoadLocator);
	 
    }
	public void onclickpatientListLocator()
	{
    clickWhenVisible(patientListLocator);
	
    }
	public void onclicklocationLocator()
	{
    clickWhenVisible(locationLocator);
	
	}
	public void onclickrefreshListLocator()
	{
    clickWhenVisible(refreshListLocator);
	}
	
	public void onclickpatientTypeLocator()
	{
    clickWhenVisible(patientTypeLocator);
	
	}
	public void onclickserviceTypeLocator()
	{
    clickWhenVisible(serviceTypeLocator);
	
	}

   public void onclickrangeLocator()
   {
   clickWhenVisible(rangeLocator);

   }


   public void onclickgetsubmitLocator()
   {
   clickWhenVisible(submitLocator);

   }
   
   public void submitTechnicalFeedback()
   {
//	   WebElement spin = driver.findElement(By.xpath("//android.widget.spinner[contains(@text,'Technical')]"));
//	   spin.click();
//	   GlobalUtil.wait(2);
	   clickWhenVisible(enterFeedbackLocator);
	   WebElement enterTxt = driver.findElement(enterFeedbackLocator);
	   enterTxt.sendKeys("test");
	   GlobalUtil.wait(2);
	   WebElement btn = driver.findElement(sendFeedbackLocator);
	   btn.click();
   }
   
   public void submitOperationalFeedback()
   {
	   WebElement spin = driver.findElement(By.xpath("//android.widget.spinner[contains(@text,'Technical')]"));
	   spin.click();
	   GlobalUtil.wait(2);
	   driver.scrollToExact("Operational").click();
	   GlobalUtil.wait(1);
	   WebElement enterTxt = driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter Feedback')]"));
	   enterTxt.sendKeys("test");
	   GlobalUtil.wait(2);
	   WebElement btn = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Send FeedBack')]"));
	   btn.click();
   }

}
	

			
		
	
	
	
	
	
	
	
	
	
	
	
	

	