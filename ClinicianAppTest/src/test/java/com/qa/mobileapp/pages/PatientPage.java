package com.qa.mobileapp.pages;

import java.sql.Savepoint;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

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
	private final By addPackageOptionsLocator = By.name("Add Package");
	private final By addCaseOptionLocator = By.name("Add Case");
	private final By addServiceOptionLocator = By.name("Add Service");
	private final By viewSubscriptionsLocator = By.name("View Subscriptions");
	private final By viewAppointmentsLocator = By.name("View Appointments");
	private final By checkVitalsLocator = By.name("Check Vitals");
	private final By vitalsHistoryLocator = By.name("Vitals History");
	private final By addPackageButtonLocator = By.id("com.portea.internal:id/actionButton");
	private final By searchButtonLocator =By.id("com.healthvista.clinicianapp.stage:id/search");
	private final By subscribedPackageScreenLocator = By.id("android:id/alertTitle");
	private final By dismissButtonLocator = By.id("android:id/button2");
	private final By subcribedpackageListLocator = By.id("com.portea.internal:id/popupList");
	private final By noSubscriptionamessageLocator = By.name("No Subscriptions for this patient");
	private final By addPackageScreenLocator = By.id("android:id/alertTitle");
	private final By refreshButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/menu_load");
	private final By patientDetailsScreenLocator = By.name("Patient Details");
	private final By patientDetailsMenuButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/edit");
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

	private final By referServiceScreenLocator = By.name("Refer a Service");
	private final By patientFeedbackScreenLocator = By.name("Patient Feedback");
	private final By viewAppointmentscreenLocator = By.name("Appointments");
	private final By checkVitalsScreenLocator = By.name("Check Vitals");
	private final By addPatientScreenLocator = By.name("Add Patient Details");
	private final By enterFirstNameLocator = By.id("com.healthvista.clinicianapp.stage:id/name");
	private final By enterLastNameLocator = By.id("com.healthvista.clinicianapp.stage:id/lastname");
	private final By enterAddressLocator = By.id("com.healthvista.clinicianapp.stage:id/address");
	private final By enterMobileNoLocator=By.id("com.healthvista.clinicianapp.stage:id/mobileNumber");
	private final By enterAltNoLocator =By.id("com.healthvista.clinicianapp.stage:id/alternateNumber");
	private final By enterEmailLocator=By.id("com.healthvista.clinicianapp.stage:id/email");
	private final By enterPincodeLocator=By.id("");
	private final By addPatientDoneBtnLocator = By.id("com.healthvista.clinicianapp.stage:id/done");
	private final By patientListingLocatorOnPatientDetailsScreen = By.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By enterSearchPatientLocator =By.id("com.healthvista.clinicianapp.stage:id/search_src_text");
	private final By searchCloseLocator=By.id("com.healthvista.clinicianapp.stage:id/search_close_btn");
	private final By searchStringLocator = By.name("Mr Indu Testing - POR099450");
	private final By confirmPatientDetailsScreenLocator = By.name("Confirm details");
	private final By addPatientSaveButtonLocator = By.name("Save");
	private final By addPatientBackButtonLocator = By.name("Back");
	
	//xpath for Refer Service
	
	private final By selectServiceLocator = By.className("android.widget.Spinner");
	private final By enterNotesLocator = By.className("android.widget.EditText");
	private final By cancelButtonLocator = By.name("Cancel");
	private final By doneButtonLocator = By.name("Done");
	
	//xpath for Add case
	private final By addCaseMessageLocator = By.name("Please go to Appointment Details and add a case file");
	private final By dismissCaseButtonLocator =By.name("Dismiss");
	
	//xpath for Add Package
	
	private final By packageScreenLocator = By.name("Packages");
	private final By packageListLocator = By.id("com.healthvista.clinicianapp.stage:id/packageList");
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

	public By getEnterPincodeLocator() {
		return enterPincodeLocator;
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

	public By getPreferencesProceedButtonLocator() {
		return preferencesProceedButtonLocator;
	}

	public By getSuccessMessageLocator() {
		return successMessageLocator;
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
	public void addPackage()
	{
		clickWhenVisible(patientDetailsMenuButtonLocator);
		GlobalUtil.wait(1);
		clickWhenVisible(addPackageButtonLocator);
		if(driver.findElement(packageListLocator)==null)
		{
		System.out.println("No Packages found");
		}
		else{
		selectPackageFromList();
		clickWhenVisible(subserviceproceedButtonLocator);
		clickWhenVisible(preferencesProceedButtonLocator);
		clickWhenVisible(addPackContinueButtonLocator);
		selectDateAndTime();
		clickWhenVisible(addPackContinueButtonLocator);
		
		}
		
	}
	
	public void selectDateAndTime()
	{
		List<WebElement> date = driver.findElements(By.className("android.widget.NumberPicker"));
	    date.get(0).sendKeys("June");
	    date.get(1).sendKeys("15");
	    date.get(2).sendKeys("2016");   
	    List <WebElement> time = driver.findElements(By.className("android.widget.NumberPicker"));
	    		time.get(3).sendKeys("");
		
	}
	
	public void showSubcribedPackageDetails()
	{
	   clickWhenVisible(patientDetailsMenuButtonLocator);
		GlobalUtil.wait(1);
		clickWhenVisible(viewSubscriptionsLocator);
	
	}
	
	public void selectPackageFromList()
	{
		
		List<WebElement> select = (List<WebElement>) driver.findElement(packageListLocator);
		select.get(0);
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
	
	public void addPatient(String fname, String lname, String email, String address, String mobileNo)
	{
	    clickWhenVisible(addPatientButtonLocator);
		WebElement name = clickWhenVisible(enterFirstNameLocator);
		name.sendKeys(fname);
		WebElement txt = clickWhenVisible(enterLastNameLocator);
		txt.sendKeys(lname);
		WebElement mob = clickWhenVisible(enterMobileNoLocator);
		mob.sendKeys(mobileNo);
		WebElement mail = clickWhenVisible(enterEmailLocator);
		mail.sendKeys(email);
		WebElement add = clickWhenVisible(enterAddressLocator);
		add.sendKeys(address);
		clickWhenVisible(addPatientDoneBtnLocator);
		clickWhenVisible(addPatientSaveButtonLocator);
		
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
	
	public void addService()
	{
		clickWhenVisible(addServiceOptionLocator);
		
		
	}
	
	public void onTapViewSubscription()
	{
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
	
}

