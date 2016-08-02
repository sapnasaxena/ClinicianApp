package com.qa.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.PatientModal;

public class PatientPage extends BasePage {

	public PatientPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By patientScreenLocator = By.name("Patients");
	private final By patientListsLocator = By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By patientFrameLocator = By.className("android.widget.RelativeLayout");
	private final By patientNameLocator = By.id("com.healthvista.clinicianapp.stage:id/patientName");
	private final By patientAddressLocator = By.id("com.healthvista.clinicianapp.stage:id/address");
	private final By patientGenderLocator = By.id("com.healthvista.clinicianapp.stage:id/personal");
	private final By patientContactNumberLocator = By.id("com.healthvista.clinicianapp.stage:id/phone");
	private final By addPatientButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/fab1");
	private final By addPackageOptionsLocator = By.xpath("//android.widget.TextView[contains(@text,'Add Package')]");
	private final By addCaseOptionLocator = By.name("Add Case");
	private final By addServiceOptionLocator = By.name("Add Service");
	private final By viewSubscriptionsLocator = By.name("View Subscriptions");
	private final By viewAppointmentsLocator = By.name("View Appointments");
	private final By checkVitalsLocator = By.name("Check Vitals");
	private final By vitalsHistoryLocator = By.name("Vitals History");
	private final By addPackageButtonLocator = By.name("Add Package");
	private final By searchButtonLocator =By.id("com.healthvista.clinicianapp.stage:id/search");
	private final By subscribedPackageScreenLocator = By.name("Subscriptions");
	private final By dismissButtonLocator = By.id("android:id/button2");
	private final By subcribedpackageListLocator = By.id("com.portea.internal:id/popupList");
	private final By noSubscriptionamessageLocator = By.name("No Subscriptions for this patient");
	private final By addPackageScreenLocator = By.id("android:id/alertTitle");
	private final By refreshButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	private final By patientDetailsScreenLocator = By.xpath("//android.widget.TextView[contains(@text,'Patient Details')]");
	private final By patientDetailsMenuButtonLocator = By.name("Options");//By.id("com.healthvista.clinicianapp.stage:id/edit");
	private final By patientDetailsReferServiceLinkLocator = By.name("Refer a Service");
	private final By patientDetailsPatientFeedbackLinkLocator = By.name("Patient Feedback");
	private final By patientDetailsPatientNameLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_name");
	private final By patientDetailsPatientIDLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_brandid");
	private final By patientDetailsAddressLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_address");
	private final By patientDetailsEmailIdLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_email");
	private final By patientDetailsContactLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_contact_no");
	private final By patientDetailsPatientGenderLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_gender");
	private final By patientDetailsPendingAmountLocator = By.id("com.healthvista.clinicianapp.stage:id/pending_amount");
	private final By patientDetailsCaseLocator = By.id("com.healthvista.clinicianapp.stage:id/content_end");
	private final By errorAlreadyApptLocator = By.name("Error");
	

	private final By referServiceScreenLocator = By.name("Refer a Service");
	private final By patientFeedbackScreenLocator = By.name("Patient Feedback");
	private final By viewAppointmentscreenLocator = By.name("Appointments");
	private final By checkVitalsScreenLocator = By.name("History");
	private final By addPatientScreenLocator = By.name("Add Patient Details");
	private final By enterFirstNameLocator = By.id("com.healthvista.clinicianapp.stage:id/name");
	private final By enterLastNameLocator = By.id("com.healthvista.clinicianapp.stage:id/lastname");
	private final By enterAddressLocator = By.id("com.healthvista.clinicianapp.stage:id/address");
	private final By enterMobileNoLocator=By.id("com.healthvista.clinicianapp.stage:id/mobileNumber");
	private final By enterAltNoLocator =By.id("com.healthvista.clinicianapp.stage:id/alternateNumber");
	private final By enterEmailLocator=By.id("com.healthvista.clinicianapp.stage:id/email");
	private final By enterPinCodeLocator=By.id("com.healthvista.clinicianapp.stage:id/pincode");
	private final By addPatientDoneBtnLocator = By.id("com.healthvista.clinicianapp.stage:id/done");
	private final By patientListingLocatorOnPatientDetailsScreen = By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By enterSearchPatientLocator =By.id("com.healthvista.clinicianapp.stage:id/search_src_text");
	private final By searchCloseLocator=By.id("com.healthvista.clinicianapp.stage:id/search_close_btn");
	private final By searchStringLocator = By.name("Test");
	private final By confirmPatientDetailsScreenLocator = By.name("Confirm details");
	private final By addPatientSaveButtonLocator = By.name("Save");
	private final By addPatientBackButtonLocator = By.name("Back");
	private final By noCaseFoundMessageOnPatientDetailsLocator =By.name("No Case Found!");
	private final By caseNameOnPatientDetailScreenLocator = By.id("com.healthvista.clinicianapp.stage:id/patient_name");
	private final By caseStatusOnPatientDetailScreenLocator = By.id("com.healthvista.clinicianapp.stage:id/casefile_status");
	private final By caseApptDateOnPatientDetailScreenLocator = By.id("com.healthvista.clinicianapp.stage:id/appointment_date");
	private final By caseDateOfFirstVisitOnPatientDetailScreenLocator = By.id("com.healthvista.clinicianapp.stage:id/firstVisitText");
	
	//xpath for Refer Service
	
	private final By selectServiceLocator = By.className("android.widget.Spinner");
	private final By enterNotesLocator = By.className("android.widget.EditText");
	private final By cancelButtonLocator = By.name("Cancel");
	private final By doneButtonLocator = By.name("Done");
	
	//xpath for Add case
	private final By addCaseMessageLocator = By.name("Message");
	private final By dismissCaseButtonLocator =By.name("Dismiss");
	
	//xpath for Add Package
	
	private final By packageScreenLocator = By.name("Packages");
	private final By packageListLocator = By.className("android.widget.RelativeLayout");
	private final By editPackageCostLocator = By.id("com.healthvista.clinicianapp.stage:id/costText");
	private final By editPackageDurationLocator = By.id("com.healthvista.clinicianapp.stage:id/durationText");
	private final By nextButtonLocator = By.name("Next");
	private final By subserviceScreenLocator = By.name("Sub - Service");
	private final By subserviceproceedButtonLocator = By.name("Proceed");
	private final By preferencesProceedButtonLocator = By.name("Proceed");
	private final By addPackselectDateLocator = By.id("com.healthvista.clinicianapp.stage:id/fromDatePicker");
	private final By addPackselectTimeLocator = By.id("com.healthvista.clinicianapp.stage:id/timeSpinner");
	private final By addPackContinueButtonLocator =By.name("Continue");
	private final By addPackCancelcator=By.name("Cancel");
	private final By addPackCostLocator =By.id("com.healthvista.clinicianapp.stage:id/costText");
	private final By addPackDurationLocator = By.id("com.healthvista.clinicianapp.stage:id/durationText");
	private final By addPackNextLocator = By.name("Next");
	private final By addPackageApptDoneButtonLocator = By.name("Done");
	private final By addPackageOnExistingApptDateLocator = By.name("Error");
	private final By errorOkButtonLocator = By.name("Ok");
	private final By addPackageSuccessPopUp = By.name("Subscription");
	private final By successMessageLocator = By.id("");
	private final By addPackageSuccessScreenYesButton = By.name("Yes");
	private final By addPackageSuccessScreenNoButton = By.name("No");
	private final By selectMonthLocator = By.id("android.widget.NumberPicker");
	
	//xpath for feedback
	private final By firstQuesAnsRadioButtonLocator = By.className("android.widget.RadioGroup");
	private final By selectServiceLabelLocator = By.name("select a service");
	private final By selectServiceSpinnerLocator = By.className("android.widget.Spinner");
	private final By feedbackCancelButtonLocator = By.name("Cancel");
	private final By  feedbackDoneButtonLocator = By.name("Done");
	private final By serviceSpinnerTextLocator = By.id("android:id/text1");
	
	
	
	public By getPatientFrameLocator()
	{
		return patientFrameLocator;
	}
	
	public By getPatientListingLocatorOnPatientDetailsScreen()
	{
		return patientListingLocatorOnPatientDetailsScreen;
	}
	
	public By getViewAppointmentsScreenLocator()
	{
		return viewAppointmentscreenLocator;
	}

	public By getCheckVitalsScreenLocator()
	{
		return checkVitalsScreenLocator;
	}
	
	public By getAddPatienScreenLocator()
	{
		return addPatientScreenLocator;
	}
	public By getPatientFeedbackScreenLocator()
	{
		return patientFeedbackScreenLocator;
	}
	public By getReferServiceScreenLocator()
	{
		return referServiceScreenLocator;
	}
	
	public By getPatientsScreenLocator()
	{
		return patientScreenLocator;
	}
	
	public By getAddPatientButtonLocator()
	{
		return addPatientButtonLocator;
	}
	public By getDismissButtonLocator() {
		return dismissButtonLocator;
	}


	public By getSubcribedpackageListLocator() {
		return subcribedpackageListLocator;
	}

  public By getRefreshButtonLocator()
    {
	  return refreshButtonLocator;
	}
  
  public By getPatientDetailsScreenLocator()
  {
	  return patientDetailsScreenLocator;
  }
  public By getPatientDetailsReferServiceLocator()
  {
	  return patientDetailsReferServiceLinkLocator;
  }

  public By getPatientDetailsFeedbackLocator()
  {
	  return patientDetailsPatientFeedbackLinkLocator;
  }
  
  public By getPatientDetailsPatientNameLocator()
  {
	  return patientDetailsPatientNameLocator;
  }

  public By getPatientDetailsPatientIDLocator()
  {
	  return patientDetailsPatientIDLocator;
  }
  
  public By getPatientDetailsAddressLocator()
  {
	  return patientDetailsAddressLocator;
  }
  
  public By getPatientDetailsContactNumberLocator()
  {
	  return patientDetailsContactLocator;
  }
  
  public By getPatientDetailsEmailIdLocator()
  {
	  return patientDetailsEmailIdLocator;
  }
  public By getPatientDetailsPendingAmountDetailsLocator()
  {
	  return patientDetailsPendingAmountLocator;
  }
  public By getPatientDetailsCaseLocator()
  {
	  return patientDetailsCaseLocator;
  }
  public By getPatientDetailsTopRgtMenuLocator()
  {
	  return patientDetailsMenuButtonLocator;
  }
  
  public By getPatientDetailsGenderLocator()
  {
	  return patientDetailsPatientGenderLocator;
  }
	public By getNoSubscriptionamessageLocator() {
		return noSubscriptionamessageLocator;
	}



	public By getSubscribedPackageScreenLocator() {
		return subscribedPackageScreenLocator;
	}

     public By getAddCaseOptionsLocator()
       {
	        return addCaseOptionLocator;
		}
     public By getAddServiceOptionsLocator()
     {
	        return addServiceOptionLocator;
		}
     
	public By getAddPackageScreenLocator() {
		return addPackageScreenLocator;
	}



	public By getSearchButtonLocator() {
		return searchButtonLocator;
	}



	public By getPatientListsLocator() {
		return patientListsLocator;
	}



	public By getPatientGenderLocator() {
		return patientGenderLocator;
	}



	public By getAddPackageOptionsLocator() {
		return addPackageOptionsLocator;
	}



	public By getAddPackageButtonLocator() {
		return addPackageButtonLocator;
	}

	public By getViewAppointmentsOptionsLocator()
    {
	        return viewAppointmentsLocator;
		}
	
	public By getCheckVitalsOptionsLocator()
    {
	        return checkVitalsLocator;
		}
	
	public By getVitalsHistoryLocator()
    {
	        return vitalsHistoryLocator;
		}

	public By getPatientNameLocator() {
		return patientNameLocator;
	}



	

	public By getEnterSearchPatientLocator() {
		return enterSearchPatientLocator;
	}

	public By getPatientAddressLocator() {
		return patientAddressLocator;
	}






	public By getSearchCloseLocator() {
		return searchCloseLocator;
	}

	public By getPatientContactNumberLocator() {
		return patientContactNumberLocator;
	}



	public By getAddPatientBackButtonLocator() {
		return addPatientBackButtonLocator;
	}

	public By getCancelButtonLocator() {
		return cancelButtonLocator;
	}

	public By getEnterEmailLocator() {
		return enterEmailLocator;
	}

	public By getDoneButtonLocator() {
		return doneButtonLocator;
	}

	public By getAddPatientDoneBtnLocator() {
		return addPatientDoneBtnLocator;
	}

	public By getEnterNotesLocator() {
		return enterNotesLocator;
	}

	public By getEnterAltNoLocator() {
		return enterAltNoLocator;
	}

	public By getEnterLastNameLocator() {
		return enterLastNameLocator;
	}

	public By getAddPackageSuccessScreenNoButton() {
		return addPackageSuccessScreenNoButton;
	}

	public By getAddPackageSuccessPopUp() {
		return addPackageSuccessPopUp;
	}

	public By getAddCaseMessageLocator() {
		return addCaseMessageLocator;
	}

	public By getPackageScreenLocator() {
		return packageScreenLocator;
	}

	

	public By getDismissCaseButtonLocator() {
		return dismissCaseButtonLocator;
	}

	public By getEnterMobileNoLocator() {
		return enterMobileNoLocator;
	}

	public By getAddPackselectDateLocator() {
		return addPackselectDateLocator;
	}

	public By getEnterPinCodeLocator() {
		return enterPinCodeLocator;
	}

	public By getSubserviceScreenLocator() {
		return subserviceScreenLocator;
	}

	public By getEnterAddressLocator() {
		return enterAddressLocator;
	}

	public By getAddPackNextLocator() {
		return addPackNextLocator;
	}

	public By getEnterFirstNameLocator() {
		return enterFirstNameLocator;
	}

	public By getConfirmPatientDetailsScreenLocator() {
		return confirmPatientDetailsScreenLocator;
	}

	public By getAddPackCancelcator() {
		return addPackCancelcator;
	}

	public By getAddPackCostLocator() {
		return addPackCostLocator;
	}

	public By getAddPackageApptDoneButtonLocator() {
		return addPackageApptDoneButtonLocator;
	}

	public By getAddPackageOnExistingApptDateLocator() {
		return addPackageOnExistingApptDateLocator;
	}

	public By getAddPackDurationLocator() {
		return addPackDurationLocator;
	}

	public By getErroOkButtonLocator() {
		return errorOkButtonLocator;
	}

	public By getSubserviceproceedButtonLocator() {
		return subserviceproceedButtonLocator;
	}

	public By getAddPackselectTimeLocator() {
		return addPackselectTimeLocator;
	}

	public By getAddPackageSuccessScreenYesButton() {
		return addPackageSuccessScreenYesButton;
	}

	public By getAddPackContinueButtonLocator() {
		return addPackContinueButtonLocator;
	}

	public By getEditPackageDurationLocator() {
		return editPackageDurationLocator;
	}

	public By getPreferencesProceedButtonLocator() {
		return preferencesProceedButtonLocator;
	}

	public By getSuccessMessageLocator() {
		return successMessageLocator;
	}

	public By getEditPackageCostLocator() {
		return editPackageCostLocator;
	}

	public By getSelectServiceLocator() {
		return selectServiceLocator;
	}

	public By getSearchStringLocator() {
		return searchStringLocator;
	}

	public By getSelectMonthLocator() {
		return selectMonthLocator;
	}

	public void onClickPatientName()
	{
		clickWhenVisible(patientNameLocator);
		
	}
	
	public void onTapPatientFrame()
	{
		clickWhenVisible(patientFrameLocator);
		List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//android.widget.ListView"));
		List<WebElement>ele = list;
		ele.get(0).click();
	}
	public void onTapReferServiceLink()
	{
		clickWhenVisible(referServiceScreenLocator);
		
	}
	
	public void onTapFeedbackLink()
	{
		clickWhenVisible(patientFeedbackScreenLocator);
	
	}
	public void onTapPatientScreenNavOptions()
	{
		clickWhenVisible(patientDetailsMenuButtonLocator);
		
	}
	
	private String patientNameLinkLocator = "//android.widget.TextView[contains(text()='" + GlobalUtil.PLACEHOLDER +"')]";
	public String getPatientNameLinkLocator(){
		return patientNameLinkLocator;
	}
	
	public By getCaseNameOnPatientDetailScreenLocator() {
		return caseNameOnPatientDetailScreenLocator;
	}

	public By getNoCaseFoundMessageOnPatientDetailsLocator() {
		return noCaseFoundMessageOnPatientDetailsLocator;
	}

	public void addPackage()
	{
		if(driver.findElement(packageListLocator)==null)
		{
		System.out.println("No Packages found");
		}
		else{
		selectPackageFromList();
		clickWhenVisible(subserviceproceedButtonLocator);
		GlobalUtil.wait(2);
		clickWhenVisible(preferencesProceedButtonLocator);
		GlobalUtil.wait(2);
		clickWhenVisible(addPackContinueButtonLocator);
		selectDateAndTime();
		GlobalUtil.wait(1);
		clickWhenVisible(nextButtonLocator);
		//selectCostForPackage();
		GlobalUtil.wait(1);
		clickWhenVisible(doneButtonLocator);
		//clickWhenVisible(addPackContinueButtonLocator);
		
		}
		
	}
	public void onTapAddPackage()
	{
		clickWhenVisible(patientDetailsMenuButtonLocator);
		GlobalUtil.wait(2);
		clickWhenVisible(addPackageButtonLocator);
	}
	public void selectDateAndTime()
	{
		@SuppressWarnings("unchecked")
		List<WebElement> date = driver.findElements(By.className("android.widget.NumberPicker"));
	    date.get(0).sendKeys("June");
	    date.get(1).sendKeys("15");
	    date.get(2).sendKeys("2016");   
	    @SuppressWarnings("unchecked")
		List <WebElement> time = driver.findElements(By.className("android.widget.NumberPicker"));
	    time.get(3).sendKeys("10:00 am");
		
	}
	
	public void selectCostForPackage()
	{
//		List<WebElement> window = driver.findElements(By.id("android:id/parentPanel"));
//		window.get(1).click();
		driver.switchTo().activeElement();
		WebElement cost = clickWhenVisible(editPackageCostLocator);
//		cost.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		cost.sendKeys(Keys.CLEAR);
		cost.sendKeys("1");
		GlobalUtil.wait(1);
		WebElement duration = clickWhenVisible(editPackageDurationLocator);
//		duration.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		duration.sendKeys(Keys.CLEAR);
		duration.sendKeys("5");
		GlobalUtil.wait(1);
	    List <WebElement> ele = driver.findElements(By.xpath("android.widget.LinearLayout"));
		WebElement btn = ele.get(2);
		List<WebElement> next =btn.findElements(By.className("android.widget.Button"));
		next.get(1).click();
		//clickWhenVisible(nextButtonLocator);
	}
	
	public void inputText(By locator, String text)
	{
		WebElement element = clickWhenVisible(locator);
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		element.sendKeys(Keys.CLEAR);
		GlobalUtil.wait(1);
		element.sendKeys(text);
		GlobalUtil.wait(1);
	}
	
	public void showSubcribedPackageDetails()
	{
	   clickWhenVisible(patientDetailsMenuButtonLocator);
		GlobalUtil.wait(1);
		clickWhenVisible(viewSubscriptionsLocator);
	
	}
	
	@SuppressWarnings("unchecked")
	public void selectPackageFromList()
	{
		List<WebElement> pack = (List<WebElement>)driver.findElements(By.className("android.widget.ListView"));
		pack.get(0).click();
	
	}
	
	public void onClickAddPatientButton()
	{
		clickWhenVisible(addPatientButtonLocator);
		
	}
	
	public void onClickSearchButton()
	{
		clickWhenVisible(searchButtonLocator);
		
	}
	
	public void searchPatient(String patientName)
	{
	
		onClickSearchButton();
		GlobalUtil.wait(2);
		WebElement txt = clickWhenVisible(enterSearchPatientLocator);
		txt.sendKeys(patientName);
	}
	
	public void addPatient(PatientModal patientModal)
	{
	    clickWhenVisible(addPatientButtonLocator);
		WebElement name = clickWhenVisible(enterFirstNameLocator);
		name.sendKeys(patientModal.getPatientFirstName());
		WebElement txt = clickWhenVisible(enterLastNameLocator);
		txt.sendKeys(patientModal.getPatientLastName());
		WebElement mob = clickWhenVisible(enterMobileNoLocator);
		mob.sendKeys(patientModal.getMobileNo());
		WebElement mail = clickWhenVisible(enterEmailLocator);
		mail.sendKeys(patientModal.getEmail());
		WebElement add = clickWhenVisible(enterAddressLocator);
		add.sendKeys(patientModal.getAddress());
		driver.scrollToExact("Pincode");
		WebElement pin = clickWhenVisible(enterPinCodeLocator);
		pin.sendKeys(patientModal.getPinCode());
		clickWhenVisible(addPatientDoneBtnLocator);
		clickWhenVisible(addPatientSaveButtonLocator);
		
	}
	
	public void onClickPatient()
	{
		//WebElement ele = driver.findElement(By.id(id));
	}
	
	public void referService()
	{
		clickWhenVisible(patientDetailsReferServiceLinkLocator);
//		WebElement service = clickWhenVisible("");
//		service.click();
		WebElement notes = clickWhenVisible(enterNotesLocator);
		notes.sendKeys("test");
		clickWhenVisible(doneButtonLocator);
		
		
	}
	
	public void onTapAddCase()
	{
		clickWhenVisible(patientDetailsMenuButtonLocator);
		GlobalUtil.wait(2);
		clickWhenVisible(addCaseOptionLocator);
		
	}
	
	public void addService(String month, String date, String year)
	{
		@SuppressWarnings("unchecked")
		List<WebElement> popup = driver.findElements(By.id("android:id/parentPanel"));
		popup.get(0).click();
		WebElement panel = driver.findElement(By.id("android:id/customPanel"));
		panel.click();
		List<WebElement> subservice = driver.findElements(By.className("android.widget.ListView"));
		//subservice.get(1).click();
		WebElement proceed = driver.findElement(By.name("Proceed"));
		proceed.click();
		@SuppressWarnings("unchecked")
		List<WebElement> select = driver.findElements(By.id("com.healthvista.clinicianapp.stage:id/checkbox_subservice"));
		select.get(1).click();
		proceed.click();
		String noOfVisitsLocator = "//android.widget.EditText[contains(@text,'No. Of Visits')]";
		WebElement noOfVisit = driver.findElement(By.xpath(noOfVisitsLocator));
		noOfVisit.sendKeys("2");
		String impInstructions = "//android.widget.EditText[contains(@text,'Important Instructions')]";
		WebElement imp = driver.findElement(By.xpath(impInstructions));
		imp.sendKeys("test");
		WebElement btn = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Proceed')]"));
		btn.click();
//		List <WebElement> firstframe = driver.findElements(By.xpath("//android.widget.Framelayout"));
//		List<WebElement> linearframe= firstframe.get(0).findElements(By.xpath("//android.widget.Framelayout"));
//		List<WebElement> ls = linearframe.get(1).findElements(By.xpath("//android.widget.FrameLayout"));
//		List<WebElement> minCost=ls.get(0).findElements(By.xpath("//android.widget.TextView"));
//		String str1 = minCost.get(1).getText();
		//System.out.println(str1);
		String str = " Minimum Price: ₹ 400";
		String onlyCost = str.replaceAll("Minimum Price: ₹ ", "");
		System.out.println(onlyCost);
		WebElement cost = driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Service Cost')]"));
		cost.sendKeys(onlyCost);
		btn.click();
		GlobalUtil.wait(2);
	    List<WebElement> datePickerLocator = driver.findElements(By.className("android.widget.NumberPicker"));
	    datePickerLocator.get(0).sendKeys(month);
	    datePickerLocator.get(1).sendKeys(date);
	    datePickerLocator.get(2).sendKeys(year);
	    GlobalUtil.wait(2);
	    WebElement timePicker = driver.findElement(By.xpath("//android.widget.Spinner"));
	    timePicker.click();
	    driver.scrollToExact("11:00 AM").click();
	    GlobalUtil.wait(2);
		WebElement continueBtn = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Continue')]"));
		continueBtn.click();
		GlobalUtil.wait(1);
		WebElement done = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/checkbutton"));
		done.click();
		GlobalUtil.wait(1);
		WebElement yesLocator = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Yes')]"));
		yesLocator.click();
		
	}
	public void onTapAddService()
	{
		clickWhenVisible(addServiceOptionLocator);
	}
	
	public void onTapViewSubscription()
	{
		//driver.scrollToExact("View Subscriptions").click();
		clickWhenVisible(viewSubscriptionsLocator);
	}
	
	public void onTapCheckVitals()
	{
		clickWhenVisible(checkVitalsLocator);
		
	}
	
	public void onTapViewVitals()
	{
		clickWhenVisible(vitalsHistoryLocator);
		
	}
	
	public void refreshPatientDetails()
	{
		clickWhenVisible(refreshButtonLocator);
		
	}
	public void sendFeedback(int i, String service)
	{
		onTapFeedbackLink();
		@SuppressWarnings("unchecked")
		List<WebElement> ques1 = driver.findElements(firstQuesAnsRadioButtonLocator);
		ques1.get(i);
		GlobalUtil.wait(1);
		//spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
		WebElement selectService = driver.findElement(selectServiceSpinnerLocator);
		selectService.findElement(serviceSpinnerTextLocator).click();
		driver.scrollToExact(service).click();
		GlobalUtil.wait(1);
		clickWhenVisible(feedbackDoneButtonLocator);
	}

	public void onTapOptions()
	{
		WebElement ele =driver.findElement(patientDetailsMenuButtonLocator);
		ele.click();
	}
	 
	public void getAddedPatient(PatientModal patientModal)
	{
		WebElement ele = driver.findElement(searchStringLocator);
		ele.sendKeys(GlobalUtil.PLACEHOLDER, patientModal.getPatientFirstName());
		//driver.findElement(By.xpath(patientNameLinkLocator.replace(GlobalUtil.PLACEHOLDER, patientModal.getPatientFirstName()))).click();
	}
	
	public By getCaseStatusOnPatientDetailScreenLocator() {
		return caseStatusOnPatientDetailScreenLocator;
	}

	public By getErrorAlreadyApptLocator() {
		return errorAlreadyApptLocator;
	}

	public By getCaseApptDateOnPatientDetailScreenLocator() {
		return caseApptDateOnPatientDetailScreenLocator;
	}

	public By getCaseDateOfFirstVisitOnPatientDetailScreenLocator() {
		return caseDateOfFirstVisitOnPatientDetailScreenLocator;
	}

	public void caseDetails()
	{
		
		WebElement name = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/patient_name"));
		name.getText();
		WebElement status = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/casefile_status"));
		status.getText();
		WebElement apptDate = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/appointment_date"));
		apptDate.getText();
		WebElement dateOfFirstVisit = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/firstVisitText"));
		dateOfFirstVisit.getText();
		
	}
	
}

