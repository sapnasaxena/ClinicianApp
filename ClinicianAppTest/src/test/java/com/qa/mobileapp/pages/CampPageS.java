package com.qa.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;

import io.appium.java_client.android.AndroidDriver;

public class CampPageS extends BasePage {

	public CampPageS(AndroidDriver driver) {

		super(driver);
	}

	private final By campNameLocator = By.name("Camp");
	private final By campLocationLocator = By
			.id("com.healthvista.clinicianapp.stage:id/general_list");
	private final By addPatientBtnLocator = By
			.id("com.healthvista.clinicianapp.stage:id/patientBtn");
	private final By addLeadBtnLocaton = By
			.id("com.healthvista.clinicianapp.stage:id/leadBtn");

	// Add Lead

	private final By addLeadBtn = By
			.id("com.healthvista.clinicianapp.stage:id/leadBtn");
	private final By addPatientBtn = By
			.id("com.healthvista.clinicianapp.stage:id/patientBtn");
	private final By LeadName = By
			.id("com.healthvista.clinicianapp.stage:id/tilPatientName");
	private final By LeadMobileNumber = By
			.id("com.healthvista.clinicianapp.stage:id/tilPateintPhone");
	private final By LeadEmailId = By
			.id("com.healthvista.clinicianapp.stage:id/tilEmail");
	private final By LeadAge1 = By
			.id("com.healthvista.clinicianapp.stage:id/tilAge");
	private final By selectLeadGender = By.name("Gender");
	private final By addLeadGenderMale = By
			.id("com.healthvista.clinicianapp.stage:id/rbMale");
	private final By addLeadGenderFemale = By
			.id("com.healthvista.clinicianapp.stage:id/rbFemale");
	private final By selectLeadLocation = By.id("android:id/text1");
	private final By addLeadLocality = By
			.id("com.healthvista.clinicianapp.stage:id/tilLocality");
	private final By addLeadAddress = By
			.id("com.healthvista.clinicianapp.stage:id/tilAddress");
	private final By addLeadAddressPinCode = By
			.id("com.healthvista.clinicianapp.stage:id/tilPincode");
	private final By LeadLabSampleCollection = By
			.id("com.healthvista.clinicianapp.stage:id/services");
	private final By LabCollectionSelection = By.name("Hyderabad");
	private final By LabHotSelection = By.name("Hot");
	private final By LabColdSelection = By.name("Cold");
	private final By CancelBtn = By
			.id("com.healthvista.clinicianapp.stage:id/bCancel");
	private final By SaveBtn = By
			.id("com.healthvista.clinicianapp.stage:id/bSave");

	// Patient and Appointment Page

	private final By patientBtn = By.name("Patients");
	private final By appointmentBtn = By.name("Appointments");
	private final By patientMobileNbr = By.name("Mobile (10 digits only)");
	private final By searchBtn = By
			.id("com.healthvista.clinicianapp.stage:id/ibSearch");
	private final By errorMessage = By
			.id("com.healthvista.clinicianapp.stage:id/snackbar_text");

	// Form for Lead and Patient

	private final By patientTxt = By.name("Patient(s) List");
	private final By mobileNumber = By.name("Mobile No:");
	private final By patientId = By.name("ID");
	private final By patientName = By.name("Name");
	private final By patietAge = By.name("Age");
	private final By patientGender = By.name("Gender");
	private final By addPatientPlusBtn = By
			.id("com.healthvista.clinicianapp.stage:id/fabAddPatient");
	// Click xpath is left on the patient details page

	// Cancel Button Pop Up
	private final By cancelPopUp = By
			.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By cancelPopUpNo = By.id("android:id/button2");
	private final By cancelPopUpYes = By.id("android:id/button1");

	// Save Button Pop Up

	private final By savePopUpCreateApt = By
			.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By savePopUpOkBtn = By.id("android:id/button1");
	private final By savePopUpCancelBtn = By.id("android:id/button2");

	// For Patient pop up, if mobile number dosen't exist

	private final By patientMobilePopAlert = By.id("android:id/alertTitle");
	private final By addPatinetOkBtn = By.id("android:id/button1");
	private final By cancelPatientBtn = By.id("android:id/button2");

	// Appointment page details

	private final By aptTxtVerify = By.name("All Camp(s) Appointments");
	private final By patientNametxt = By
			.id("com.healthvista.clinicianapp.stage:id/patientName");
	private final By aptDate = By
			.id("com.healthvista.clinicianapp.stage:id/date");
	private final By aptStatus = By
			.id("com.healthvista.clinicianapp.stage:id/statusName");
	private final By aptFee = By
			.id("com.healthvista.clinicianapp.stage:id/paymentText");
	private final By patientstext = By.name("Patients");
	private final By patientOkBtn = By.id("android:id/button1");

	public By getCampNameLocator() {
		return campNameLocator;
	}

	public By getCampLocationLocator() {
		return campLocationLocator;
	}

	public By addLeadBtnLocaton() {
		return addLeadBtnLocaton;
	}

	public By getAddPatientBtnLocator() {
		return addPatientBtnLocator;
	}

	public By getpatientTxt() {
		return patientTxt;
	}

	public By getmobileNumber() {
		return mobileNumber;
	}

	public By getpatientId() {
		return patientId;
	}

	public By getpatientName() {
		return patientName;
	}

	public By getpatietAge() {
		return patietAge;
	}

	public By getpatientGender() {
		return patientGender;
	}

	public By getaddPatientPlusBtn() {
		return addPatientPlusBtn;
	}

	public By getcancelPopUp() {
		return cancelPopUp;
	}

	public By getcancelPopUpNo() {
		return cancelPopUpNo;
	}

	public By getcancelPopUpYes() {
		return cancelPopUpYes;
	}

	public By getsavePopUpCreateApt() {
		return savePopUpCreateApt;
	}

	public By getsavePopUpOkBtn() {
		return savePopUpOkBtn;
	}

	public By getsavePopUpCancelBtn() {
		return savePopUpCancelBtn;
	}

	public By getaddPatinetOkBtn() {
		return addPatinetOkBtn;
	}

	public By getcancelPatientBtn() {
		return cancelPatientBtn;
	}

	public By getaptTxtVerify() {
		return aptTxtVerify;
	}

	public By getpatientNametxt() {
		return patientNametxt;
	}

	public By getaptDate() {
		return aptDate;
	}

	public By getaptStatus() {
		return aptStatus;
	}

	public By getaptFee() {
		return aptFee;
	}

	// ***************************************************
	public By getaddLeadBtn() {
		return addLeadBtn;
	}

	public By getaddPatientBtn() {
		return addPatientBtn;
	}

	public By getaddLeadName() {
		return LeadName;
	}

	public By getaddLeadMobileNumber() {
		return LeadMobileNumber;
	}

	public By getaddLeadEmailId() {
		return LeadEmailId;
	}

	public By getaddLeadAge() {
		return LeadAge1;
	}

	public By getselectLeadGender() {
		return selectLeadGender;
	}

	public By getaddLeadGenderMale() {
		return addLeadGenderMale;
	}

	public By getaddLeadGenderFemale() {
		return addLeadGenderFemale;
	}

	public By getselectLeadLocation() {
		return selectLeadLocation;
	}

	public By getaddLeadLocality() {
		return addLeadLocality;
	}

	public By getaddLeadAddress() {
		return addLeadAddress;
	}

	public By getaddLeadAddressPinCode() {
		return addLeadAddressPinCode;
	}

	public By getLeadLabSampleCollection() {
		return LeadLabSampleCollection;
	}

	public By getLabCollectionSelection() {
		return LabCollectionSelection;
	}

	public By getLabHotSelection() {
		return LabHotSelection;
	}

	public By getLabColdSelection() {
		return LabColdSelection;
	}

	public By getCancelBtn() {
		return CancelBtn;
	}

	public By getSaveBtn() {
		return SaveBtn;
	}

	public By getpatientBtn() {
		return patientBtn;
	}

	public By getappointmentBtn() {
		return appointmentBtn;
	}

	public By getpatientMobileNbr() {
		return patientMobileNbr;
	}

	public By searchBtn() {
		return searchBtn;
	}

	public By errorMessage() {
		return errorMessage;
	}

	public By patientOkBtn() {
		return patientOkBtn;

	}

	public By patientMobilePopAlert() {
		return patientMobilePopAlert;
	}

	// Functions
	public void onClickCampNavBar() {
		WebElement campName = driver.findElement(campNameLocator);
		campName.click();
	}

	public void onClickAddPatientButton() {
		WebElement addPatient = driver.findElement(addPatientBtnLocator);
		addPatient.click();
	}

	public void onClickAddLeadButton() {
		WebElement addLead = driver.findElement(addPatientBtnLocator);
		addLead.click();
	}

	// **********************************************************

	public void onClickPatientLocationLocator() {
		WebElement addLocation = driver.findElement(campLocationLocator);
		addLocation.click();
	}

	public void onClickaddLead() {
		WebElement addLead = driver.findElement(addLeadBtn);
		addLead.click();
	}

	public void onClickAddPatient() {
		WebElement addPatient = driver.findElement(addPatientBtn);
		addPatient.click();
	}

	public void onClickAddLead() {
		WebElement addLead = driver.findElement(LeadName);
		addLead.click();
	}

	public void onClickMobilenumber() {
		WebElement LeadMobile = driver.findElement(LeadMobileNumber);
		LeadMobile.click();
		LeadMobile.sendKeys("8888888888");
	}

	public void onClickAddLeadEmail() {
		WebElement LeadEmail = driver.findElement(LeadEmailId);
		LeadEmail.click();
	}

	public void onClickAddLeadAge() {
		WebElement LeadAge = driver.findElement(LeadAge1);
		LeadAge.click();
	}

	public void onClickAddLeadGender() {
		WebElement LeadGender = driver.findElement(selectLeadGender);
		LeadGender.click();
	}

	public void onClickLeadGenderMale() {
		WebElement LeadGndrMale = driver.findElement(addLeadGenderMale);
		LeadGndrMale.click();
	}

	public void onClickLeadGenderFemale() {
		WebElement LeadGndrFmale = driver.findElement(addLeadGenderFemale);
		LeadGndrFmale.click();
	}

	public void onClickLeadLocation() {
		WebElement LeadLcoation = driver.findElement(selectLeadLocation);
		LeadLcoation.click();
	}

	public void onClickLeadLocality() {
		WebElement LeadLocality = driver.findElement(addLeadLocality);
		LeadLocality.click();
	}

	public void onClickLeadAddress() {
		WebElement LeadAdrs = driver.findElement(addLeadAddress);
		LeadAdrs.click();
	}

	public void onClickLeadAdrsPinCode() {
		WebElement LeadAdrsPin = driver.findElement(addLeadAddressPinCode);
		LeadAdrsPin.click();
	}

	public void onClickSampleCollection() {
		WebElement LabSampleColtn = driver.findElement(LeadLabSampleCollection);
		LabSampleColtn.click();
	}

	public void onClickSampleLocation() {
		WebElement SampleLoctn = driver.findElement(LabCollectionSelection);
		SampleLoctn.click();
	}

	public void onClickLabHotCollection() {
		WebElement LabHot = driver.findElement(LabHotSelection);
		LabHot.click();
	}

	public void onClickLabColdCollection() {
		WebElement LabCold = driver.findElement(LabColdSelection);
		LabCold.click();
	}

	public void onClickCancelButton() {
		WebElement cancelBtn = driver.findElement(CancelBtn);
		cancelBtn.click();
	}

	public void onClickSaveButton() {
		WebElement svBtn = driver.findElement(SaveBtn);
		svBtn.click();
	}

	public void onClickPatientButton() {
		WebElement ptntbtn = driver.findElement(patientBtn);
		ptntbtn.click();
	}

	public void onClickAppointmentButton() {
		WebElement aptBtn = driver.findElement(appointmentBtn);
		aptBtn.click();
	}

	public void onClickPatientMobileNumber() {
		WebElement ptntmobnbr = driver.findElement(patientMobileNbr);
		ptntmobnbr.click();
	}

	public void onClickSearcButton() {
		WebElement srchbtn = driver.findElement(searchBtn);
		srchbtn.click();
	}

	public void onClickErrorMessage() {
		WebElement ErrMsg = driver.findElement(errorMessage);
		ErrMsg.click();
	}

	public void onClickPatientText() {
		WebElement PtntTxt = driver.findElement(patientTxt);
		PtntTxt.click();
	}

	public void onClickMobileNumberVerify() {
		WebElement moblverify = driver.findElement(mobileNumber);
		moblverify.click();
	}

	public void onClickPatientId() {
		WebElement PtntId = driver.findElement(patientId);
		PtntId.click();
	}

	public void onClickPatientName() {
		WebElement PtntNam = driver.findElement(patientName);
		PtntNam.click();
	}

	public void onClickPatientAge() {
		WebElement PtntAg = driver.findElement(patietAge);
		PtntAg.click();
	}

	public void onClickPatientGender() {
		WebElement PtntGndr = driver.findElement(patientGender);
		PtntGndr.click();
	}

	public void onClickAddMorepatient() {
		WebElement MorPtnt = driver.findElement(addPatientPlusBtn);
		MorPtnt.click();
	}

	public void onClickCancelPopUp() {
		WebElement CnclPopUp = driver.findElement(cancelPopUp);
		CnclPopUp.click();
	}

	public void onClickCancelNo() {
		WebElement CnclNo = driver.findElement(cancelPopUpNo);
		CnclNo.click();
	}

	public void onClickCancelYes() {
		WebElement CnclYs = driver.findElement(cancelPopUpYes);
		CnclYs.click();
	}

	public void onClickCreateAppointment() {
		WebElement CreateApt = driver.findElement(savePopUpCreateApt);
		CreateApt.click();
	}

	public void onClickSaveAppointment() {
		WebElement SavApt = driver.findElement(savePopUpOkBtn);
		SavApt.click();
	}

	public void onClickCancelAppointment() {
		WebElement CnclApt = driver.findElement(savePopUpCancelBtn);
		CnclApt.click();
	}

	public void onClickAddPatinet() {
		WebElement AddPtntBtn = driver.findElement(addPatinetOkBtn);
		AddPtntBtn.click();
	}

	public void onClickCancelPatientButton() {
		WebElement CnclBtn = driver.findElement(cancelPatientBtn);
		CnclBtn.click();
	}

	public void onClickAppointmentVerification() {
		WebElement AptTxt = driver.findElement(aptTxtVerify);
		AptTxt.click();
	}

	public void onClickPatientNameVerification() {
		WebElement PtntName = driver.findElement(patientNametxt);
		PtntName.click();
	}

	public void onClickAppointmentDateVerification() {
		WebElement AptDate = driver.findElement(aptDate);
		AptDate.click();
	}

	public void onClickAppointmentStatus() {
		WebElement AptStats = driver.findElement(aptStatus);
		AptStats.click();
	}

	public void onClickAppointmentFee() {
		WebElement AptFee = driver.findElement(aptFee);
		AptFee.click();
	}

	public void onTapcampLocationLocator() {
		List<WebElement> addLocation = driver.findElements(campLocationLocator);
		WebElement campItem = addLocation.get(0);
		WebElement campName = campItem.findElement(By.id("com.healthvista.clinicianapp.stage.debug:id/campName"));
		campName.click();

	}

	public void onTapaddPatientBtn() {
		WebElement PatientButton = driver.findElement(addPatientBtn);
		PatientButton.click();
	}

	public void ontapAppointmentBtn() {
		WebElement AppointmentButton = driver.findElement(appointmentBtn);
		AppointmentButton.click();

	}

	public void onTabPatienttext() {
		WebElement PatientsTxt = driver.findElement(patientstext);
		PatientsTxt.click();
	}

	public void PatientMoblNbrVerfPopUpAlrt() {
		WebElement PopUpMsg = driver.findElement(patientMobilePopAlert);
		PopUpMsg.click();
	}

	public void onClickcampLocationLocator() {
		List<WebElement> addLocation = driver.findElements(campLocationLocator);
		addLocation.get(0).click();
	}

}
