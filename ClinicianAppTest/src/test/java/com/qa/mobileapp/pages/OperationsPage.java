package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class OperationsPage extends BasePage {

	public OperationsPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By referPatientScreenLocator = By.name("Refer a Patient");
	private final By ReferAPatientText = By.name("Refer a Patient");
	private final By radioButton= By.id("com.healthvista.clinicianapp.stage:id/patientSource");
	private final By PorteaPatient = By.id(" com.healthvista.clinicianapp.stage:id/porteaNetwork");
	private final By PersonalNetwork=By.id("com.healthvista.clinicianapp.stage:id/personalNetwork");
	private final By NewPatientName= By.id("com.healthvista.clinicianapp.stage:id/etNewPatientName");
	private final By PatientMobileNumber= By.id("com.healthvista.clinicianapp.stage:id/etNewPatientMobile");
	private final By ServiceRequiredText= By.name("Service Required");
	private final By PhysiotherapyText = By.id("android:id/text1");
	private final By CityText= By.name("City");
	private final By BangaloreText= By.name("Bangalore");
	private final By ExistingPatient=By.id("com.healthvista.clinicianapp.stage:id/referralPatId");
	private final By PatientDetails= By.id("com.healthvista.clinicianapp.stage:id/referralPatDetail");
	private final By CancelButton= By.id("com.healthvista.clinicianapp.stage:id/referCancel");
	private final By DoneButton=By.id("com.healthvista.clinicianapp.stage:id/referOk");
	private final By radioButtonPorteaPatient= By.xpath("//android.widget.RadioButton[contains(@text,'Portea Patient')]");
	private final By radioButtonPersonalNetwork=By.id("com.healthvista.clinicianapp.stage:id/personalNetwork");
	private final By ServiceRequestDrpDwn= By.id("com.healthvista.clinicianapp.stage:id/serviceReffer");
	private final By CochinText= By.name("Cochin");
	private final By chooseFromLibraryLocator = By.name("Choose from Library");
	
	//Alert Page Locators
	private final By alertPageScreenLocator = By.name("Alerts");
	private final By GenerallistLocator=By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By titlelocator = By.id("com.healthvista.clinicianapp.stage:id/title");
	private final By DateLocators = By.id("com.healthvista.clinicianapp.stage:id/date");
	private final By MessageLocators = By.id("com.healthvista.clinicianapp.stage:id/msg");
	
	//Reports Page Locators
	private final By reportScreenLocator = By.name("Email Report");
	//By.id("com.healthvista.clinicianapp.stage:id/design_menu_item_text");
private final By startNEndDateText= By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
private final By reportTypeText= By.id("com.healthvista.clinicianapp.stage:id/reporttypetext");
private final By cancelBtn= By.name("Cancel");
private final By continueBtn= By.name("Continue");
private final By timings= By.name("Timings");
private final By leaves= By.name("Leaves");
private final By appointments= By.name("Appointments");
private final By alertTtlEmailadrs= By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
private final By enterEmailId= By.id("com.healthvista.clinicianapp.stage:id/emailText");
private final By soonTxt= By.id("com.healthvista.clinicianapp.stage:id/statusText");
private final By getReportBtn= By.name("Get Reports");
private final By monthPicker= By.id("android:id/date_picker_month");
private final By datePicker= By.id("android:id/date_picker_day");
private final By yearPicker= By.id("android:id/date_picker_year");
private final By dayPicker= By.id("android:id/date_picker_header");

//Feedback Locators

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
private final By enterFeedbackLocator = By.name("Enter feedback");

//Tickets Page Locators
private final By ticketNavLocator = By.name("Tickets");
private final By ticketScreenLocators = By.name("Tickets");
private final By refreshLocator = By.id("");
private final By doneLocator = By.id("");
private final By backButtonLocator = By.id("");
private final By ticketIdLocator = By.name("Ticket Id");
private final By categoryLocator = By.name("referral");
private final By subCategoryLocator = By.name("Sub Category");
private final By referenceLocator = By.name("Reference");
private final By statusLocator = By.name("Status");
private final By patientIdLocator = By.name("Patient Id");


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

public By getTicketNavLocator() {
	return ticketNavLocator;
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


public By getreportScreenLocator()
{
return reportScreenLocator;
}

public By getstartNEndDateText()
{
return startNEndDateText;
}

public By getreportTypeText()
{
return reportTypeText;
}

public By getcancelBtn()
{
return cancelBtn;
}

public By getcontinueBtn()
{
return continueBtn;
}

public By gettimings()
{
return timings;
}

public By getleaves()
{
return leaves;
}

public By getappointments()
{
return appointments;
}

public By getalertTtlEmailadrs()
{
return alertTtlEmailadrs;
}

public By getenterEmailId()
{
return enterEmailId;
}

public By getsoonTxt()
{
return soonTxt;
}

public By getgetReportBtn()
{
return getReportBtn;
}

	
	public By getAlertScreenLocator()
	{
		return alertPageScreenLocator;
	}
	public By getGenerallistLocator()
	{
		return GenerallistLocator;
	}
	public By gettitlelocator()
	{
		return titlelocator;
	}
	public By getDateLocators()
	{
		return DateLocators;
	}
	public By getMessageLocators()
	{
		return  MessageLocators;
	}
	
	



public void onClickAlertScreenLocator()
{
	clickWhenVisible(getAlertScreenLocator());

}

public void onClickGenerallistLocator()
{
	clickWhenVisible(getGenerallistLocator());

}
	
	public By getChooseFromLibraryLocator()
	{
		return chooseFromLibraryLocator;
	}
	private final By notesLocator=By.name("Notes");
	public By getNotesLocator()
	{
		return notesLocator;
	}
	private final By serviceSpinnerLocator = By.id("com.healthvista.clinicianapp.stage:id/sServiceRef");
	public By getServiceSpinnerLocator()
	{
		return serviceSpinnerLocator;
	}
	private final By CityDropDown= By.id("com.healthvista.clinicianapp.stage:id/sCityRef");
	private final By relationSpinnerLocator = By.id("com.healthvista.clinicianapp.stage:id/sRelation");
	public By getRelationSpinnerLocator()
	{
		return relationSpinnerLocator;
	}
	
	private final By enterPatientIDFieldLocator = By.id("com.healthvista.clinicianapp.stage:id/etRefPatientId");
	public By getEnterPatientIDFieldLocator()
	{
		return enterPatientIDFieldLocator;
	}
	
	private final By uploadFieldLocator = By.name("Uploads:");
	public By getUploadFieldLocator()
	{
		return uploadFieldLocator;
	}
	
	private final By chooseUploadButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bChoose");
	public By getChooseUploadButtonLocator()
	{
		return chooseUploadButtonLocator;
	}
	
	private final By referButtonLocator =By.id("com.healthvista.clinicianapp.stage:id/bRefer");
	public By getReferButtonLocator()
	{
		return referButtonLocator;
	}
	private final By cancelButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bCancelRef");
	public By getCancelButtonLocator()
	{
		return cancelButtonLocator;
	}
	public By getReferPatientScreenLocator()
	{
		return referPatientScreenLocator;
	}
	
	
	public By getReferAPatientText()
	{
		return ReferAPatientText;
	}
	
	public By getPorteaPatient()
	{
		return PorteaPatient;
	}
	
	public By getradioButton()
	{
		return radioButton;
	}
	
	public By getPersonalNetwork()
	{
		return PersonalNetwork;
	}
	
	public By getNewPatientName()
	{
		return NewPatientName;
	}
	
	public By getPatientMobileNumber()
	{
		return PatientMobileNumber;
	}
	
	public By getServiceRequiredText()
	{
		return ServiceRequiredText;
	}
	
	public By getPhysiotherapyText()
	{
		return PhysiotherapyText;
	}
	
	public By getCityText()
	{
		return CityText;
	}
	
	public By getBangaloreText()
	{
		return BangaloreText;
	}
	
	public By getExistingPatinet()
	{
		return ExistingPatient;
	}
	
	public By getPatientDetails()
	{
		return PatientDetails;
	}
	
	public By getCancelButton()
	{
		return CancelButton;
	}
	
	public By getDoneButton()
	{
		return DoneButton;
	}
	
	public By getradioButtonPorteaPatient()
	{
		return radioButtonPorteaPatient;
	}
	
	public By getradioButtonPersonalNetwork()
	{
		return radioButtonPersonalNetwork;
	}
	
	public By getServiceRequestDrpDwn()
	{
		return ServiceRequestDrpDwn;
	}
	
	public By getCityDropDown()
	{
		return CityDropDown;
	}
	

	public void onClickreferPatientScreenLocator()
	{
	clickWhenVisible(referPatientScreenLocator);
		
	}
	
	public void onClickReferAPatientText()
	{
		clickWhenVisible(ReferAPatientText);
	
	}
	
	public void onClickPorteaPatient()
	{
		clickWhenVisible(PorteaPatient);
	
	}
	
	public void onClickradioButton()
	{
		clickWhenVisible(radioButton);
		
	}
	
	public void onClickPersonalNetwork()
	{
		clickWhenVisible(PersonalNetwork);
		
	}

	public void onClickNewPatientName()
	{
		clickWhenVisible(NewPatientName);
		
	}
	
	public void onClickPatientMobileNumber()
	{
		clickWhenVisible(PatientMobileNumber);
		
	}
	
	public void onClickServiceRequiredText()
	{
		clickWhenVisible(ServiceRequiredText);
		
	}
	
	public void onClickPhysiotherapyText()
	{
	clickWhenVisible(PhysiotherapyText);
		
	}
	
	public void onClickCityText()
	{
		clickWhenVisible(CityText);
		
	}
	
	public void onClickBangaloreText()
	{
		clickWhenVisible(BangaloreText);
	
	}
	
	public void onClickExistingPatinet()
	{
		clickWhenVisible(ExistingPatient);
		
	}
	
	public void onClickPatientDetails()
	{
		 clickWhenVisible(PatientDetails);
		
	}
	
	public void onClickCancelButton()
	{
		clickWhenVisible(CancelButton);
		
	}
	
	public void onClickDoneButton()
	{
		clickWhenVisible(DoneButton);
		
	}
	
	public By getCochinText()
	{
		return CochinText;
	}
	
	//**********************SHITAL FUNCTIONAL ********************************//
	
	
	
	public void onClickPorteaPatientRadioBtn()
	{
		WebElement radioBtnPorteaPtnt= driver.findElement(radioButtonPorteaPatient);
		radioBtnPorteaPtnt.click();
	}
	
	public void onClickServiceType()
	{
		WebElement spinner= driver.findElement(ServiceRequestDrpDwn);
		spinner.click();
	}
	
	public void onClickPersonalNetworkRadioBtn()
	{
		WebElement radioBtnPrsnlNtk= driver.findElement(radioButtonPersonalNetwork);
		radioBtnPrsnlNtk.click();
	}
	
	public void onClickNewPtntName(String Name)
	{
		WebElement enterPtntNam= clickWhenVisible(NewPatientName);
		enterPtntNam.sendKeys(Name);
		
	}
	
	public void validatePorteaPatient(String name)
	{
		WebElement radioBtnPorteaPtnt=driver.findElement(radioButtonPorteaPatient);
		radioBtnPorteaPtnt.click();
		GlobalUtil.wait(2);
		WebElement enterPtntNam=clickWhenVisible(NewPatientName);
		enterPtntNam.sendKeys(name);
		GlobalUtil.wait(2);
		onClickMobilNbr("9999999999");
		GlobalUtil.wait(2);
		onClickServiceType();
		GlobalUtil.wait(2);
		onClickPhysiotherapyText();
		GlobalUtil.wait(2);
		onClickCochinText();
		GlobalUtil.wait(2);
		onClickExistnPtntId("POR099241");
		onClickDetail("Testing Details");
		onClickDoneButton();
	}
	public void onClickDetail(String PDetails)
	{
		WebElement dtls= driver.findElement(PatientDetails);
		dtls.sendKeys(PDetails);
		
	}
	public void onClickExistnPtntId(String PID)
	{
		WebElement existinPtId= driver.findElement(ExistingPatient);
		existinPtId.sendKeys(PID);
	}
	public void ValidatePersonalNwPatient()
	{
		WebElement radioBtnPrsnlNtk= driver.findElement(radioButtonPersonalNetwork);
		radioBtnPrsnlNtk.click();
		onClickPersonalNetworkRadioBtn();
		onClickNewPtntName("Patient Name Test");
		onClickMobilNbr("9999999999");
		GlobalUtil.wait(2);
		onClickServiceType();
		GlobalUtil.wait(2);
		onClickPhysiotherapyText();
		GlobalUtil.wait(2);
		onClickCochinText();
		GlobalUtil.wait(2);
		onClickDetail("Testing Details");
		onClickDoneButton();
	}
	
	public void onClickMobilNbr(String phoneNumber)
	{
		WebElement entrMobilNbr= driver.findElement(PatientMobileNumber);
		entrMobilNbr.sendKeys(phoneNumber);
	}
	
	

	

	
	public void onClickCochinText()
	{
		WebElement spin = driver.findElement(CityDropDown);
		spin.click();
		GlobalUtil.wait(1);
		WebElement CochinTxt= driver.findElement(CochinText);
		CochinTxt.click();
	}
	
	public void onClickCityDropDown()
	{
		WebElement ctyDrpDn= driver.findElement(CityDropDown);
		ctyDrpDn.click();
	}
	public void uploadImageDocument()
	{
		WebElement ele = driver.findElement(chooseUploadButtonLocator);
		ele.click();
	}
	
	public void referPatientViaPorteaPatient()
	{
		WebElement name = driver.findElement(NewPatientName);
		name.sendKeys("test");
		GlobalUtil.wait(2);
		WebElement mobNo = driver.findElement(PatientMobileNumber);
		mobNo.sendKeys("8553013244");
		GlobalUtil.wait(2);
		WebElement relation = driver.findElement(serviceSpinnerLocator);
		relation.click();
		GlobalUtil.wait(2);
		relation.sendKeys("Brother");
		GlobalUtil.wait(2);
		WebElement patientID = driver.findElement(enterPatientIDFieldLocator);
		patientID.sendKeys("POR035079");
		GlobalUtil.wait(2);
		WebElement dropdown = driver.findElement(serviceSpinnerLocator);
		dropdown.click();
		GlobalUtil.wait(2);
		dropdown.sendKeys("Physiotherapy");
		GlobalUtil.wait(2);
		WebElement city = driver.findElement(CityDropDown);
		city.click();
		GlobalUtil.wait(2);
		city.sendKeys("Bangalore");
		GlobalUtil.wait(2);
		WebElement notes = driver.findElement(notesLocator);
		notes.sendKeys("test");
		GlobalUtil.wait(2);
		WebElement uploads = driver.findElement(chooseUploadButtonLocator);
		uploads.click();
		GlobalUtil.wait(2);
//		WebElement chooseLibrary = driver.findElement(By.name("Choose from Library"));
//		chooseLibrary.click();
//		GlobalUtil.wait(2);
		WebElement referButton = driver.findElement(referButtonLocator);
		referButton.click();
	}
	
	public void referPatientViaPersonalNetwork()
	{
			WebElement name = driver.findElement(NewPatientName);
			name.sendKeys("test");
			GlobalUtil.wait(2);
			WebElement mobNo = driver.findElement(PatientMobileNumber);
			mobNo.sendKeys("8553013244");
			GlobalUtil.wait(2);
			WebElement relation = driver.findElement(serviceSpinnerLocator);
			relation.click();
			GlobalUtil.wait(2);
			relation.sendKeys("Brother");
			GlobalUtil.wait(2);
			WebElement patientID = driver.findElement(enterPatientIDFieldLocator);
			patientID.sendKeys("POR035079");
			GlobalUtil.wait(2);
			WebElement dropdown = driver.findElement(serviceSpinnerLocator);
			dropdown.click();
			GlobalUtil.wait(2);
			dropdown.sendKeys("Physiotherapy");
			GlobalUtil.wait(2);
			WebElement city = driver.findElement(CityDropDown);
			city.click();
			GlobalUtil.wait(2);
			city.sendKeys("Bangalore");
			GlobalUtil.wait(2);
			WebElement notes = driver.findElement(notesLocator);
			notes.sendKeys("test");
			GlobalUtil.wait(2);
			WebElement uploads = driver.findElement(chooseUploadButtonLocator);
			uploads.click();
			GlobalUtil.wait(2);
//			WebElement chooseLibrary = driver.findElement(By.name("Choose from Library"));
//			chooseLibrary.click();
//			GlobalUtil.wait(2);
			WebElement referButton = driver.findElement(referButtonLocator);
			referButton.click();

		}
	
	//Functions
	
		public void onClickreportScreenLocator()
		{
			clickWhenVisible(reportScreenLocator);
			
		}
		
		public void onClickstartNEndDateText()
		{
		clickWhenVisible(startNEndDateText);
			
		}
		
		public void onClickreportTypeText()
		{
			clickWhenVisible(reportTypeText);
			
		}
		
		public void onClickcancelBtn()
		{
			clickWhenVisible(cancelBtn);
		
		}
		
		public void onClickcontinueBtn()
		{
			clickWhenVisible(continueBtn);
			
		}
		
		public void onClicktimings()
		{
			 clickWhenVisible(timings);
			
		}
		
		public void onClickleaves()
		{
		clickWhenVisible(leaves);
			
		}
		
		public void onClickappointments()
		{
			 clickWhenVisible(appointments);
			
		}
		
		public void onClickalertTtlEmailadrs()
		{
			clickWhenVisible(alertTtlEmailadrs);
			
		}
		
		public void onClickenterEmailId()
		{
			clickWhenVisible(enterEmailId);
			
		}
		
		public void onClicksoonTxt()
		{
			clickWhenVisible(soonTxt);
			
		}
		
		public void onClickgetReportBtn()
		{
			clickWhenVisible(getReportBtn);
			
		}
		
		public By getmonthPicker()
		{
			return monthPicker;
		}
		
		public By getTicketScreenLocators() {
			return ticketScreenLocators;
		}
		public By getRefreshLocator() {
			return refreshLocator;
		}
		public By getBackButtonLocator() {
			return backButtonLocator;
		}
		public By getDoneLocator() {
			return doneLocator;
		}
		public By getTicketIdLocator() {
			return ticketIdLocator;
		}
		public By getdatePicker()
		{
			return datePicker;
		}
		
		public By getCategoryLocator() {
			return categoryLocator;
		}
		public By getyearPicker()
		{
			return yearPicker;
		}
		
		public By getSubCategoryLocator() {
			return subCategoryLocator;
		}
		public By getStatusLocator() {
			return statusLocator;
		}
		public By getReferenceLocator() {
			return referenceLocator;
		}
		public By getPatientIdLocator() {
			return patientIdLocator;
		}
		public By getdayPicker()
		{
			return dayPicker;
		}

	//***************************************************************//	
		
		public void onClickentrEmailId(String emailID)
		{
			WebElement emailid= driver.findElement(enterEmailId);
			emailid.sendKeys(emailID);
			
		}
		
		public void CalenderPicker()
		{
			
			Assert.assertNotNull(getdayPicker());
			Assert.assertNotNull(getmonthPicker());
			Assert.assertNotNull(getdatePicker());
			Assert.assertNotNull(getyearPicker());
		}
		
		public void submitReport(String type)
		{
			//WebElement frame = driver.findElement(By.xpath("//android.widget.LinearLayout"));
//			WebElement reportType = (WebElement) frame.findElements(By.className("//android.widget.spinner"));
//			reportType.click();
//			GlobalUtil.wait(1);
//			driver.scrollToExact("Timings").click();
//			GlobalUtil.wait(2);
//			WebElement date = driver.findElement(By.xpath("//android.widget.Button[contains(@id,'com.healthvista.clinicianapp.stage:id/fromDate')]"));
//			date.click();
//			WebElement startDate = driver.findElement(By.xpath("//android.view.View[contains(@text,'01 July 2016')]"));
//			startDate.click();
			WebElement continueBtn = driver.findElement(By.name("Continue"));
			continueBtn.click();
			WebElement getReportBtn = driver.findElement(By.name("Get Reports"));
			getReportBtn.click();
		}
		public void cancelReport()
		{
			WebElement cancelBtn=driver.findElement(By.name("Cancel"));
			cancelBtn.click();
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
		   WebElement spin = driver.findElement(By.xpath("//android.widget.spinner[contains(@text,'Technical')]"));
		   spin.click();
		   GlobalUtil.wait(2);
		   WebElement enterTxt = driver.findElement(By.name("Enter Feedback"));
		   enterTxt.sendKeys("test");
		   GlobalUtil.wait(2);
		   WebElement btn = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Send FeedBack')]"));
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

	   //Functions for Tickets screen
	   public void onTapTicketsNav()
	   {
		   clickWhenVisible(ticketNavLocator);
	   }
	   
	   public void onTapRefreshButton()
	   {
		   clickWhenVisible(refreshLocator);
	   }
	   
	   public void onTapDoneButton()
	   {
		   clickWhenVisible(doneLocator);
	   }
	   
	   public void onTapTicketNav()
	   {
		   clickWhenVisible(ticketNavLocator);
	   }
	

}
