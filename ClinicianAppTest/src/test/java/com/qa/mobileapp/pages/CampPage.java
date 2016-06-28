package com.qa.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CampPage extends BasePage {

	public CampPage(AppiumDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By campNameLocator = By.name("Camp"); 
	private final By campLocationLocator = By.id("com.healthvista.clinicianapp.stage:id/campLoc");
	private final By addLeadBtnLocator = By.id("com.healthvista.clinicianapp.stage:id/leadBtn");
	private final By addPatientBtnLocator = By.id("com.healthvista.clinicianapp.stage:id/patientBtn");
	
	public By getCampNameLocator()
	{
		return campNameLocator;
	}

	public By getCampLocationLocator()
	{
		return campLocationLocator;
	}
	
	public By getAddLeadBtnLocator()
	{
		return addLeadBtnLocator;
	}

	public By getAddPatientBtnLocator()
	{
		return addPatientBtnLocator;
	}

	//Functions
	public void onClickCampNavBar()
	{
		clickWhenVisible(campNameLocator);
		
	}
	
	public void onClickAddLeadButton()
	{
	clickWhenVisible(addLeadBtnLocator);
		
	}
	
	public void onClickAddPatientButton()
	{
		clickWhenVisible(addPatientBtnLocator);
		
	}

	//************************************ FUNCTIONAL SHITAL*************************//
	
	// Add Lead

		private final By addLeadBtn = By.id("com.healthvista.clinicianapp.stage:id/leadBtn");
		private final By addPatientBtn = By.id("com.healthvista.clinicianapp.stage:id/patientBtn");
		private final By LeadName = By.id("com.healthvista.clinicianapp.stage:id/tilPatientName");
		private final By LeadMobileNumber = By.id("com.healthvista.clinicianapp.stage:id/tilPateintPhone");
		private final By LeadEmailId = By.id("com.healthvista.clinicianapp.stage:id/tilEmail");
		private final By LeadAge1 = By.id("com.healthvista.clinicianapp.stage:id/tilAge");
		private final By selectLeadGender = By.name("Gender");
		private final By addGenderMale = By.id("com.healthvista.clinicianapp.stage:id/rbMale");
		private final By addGenderFemale = By.id("com.healthvista.clinicianapp.stage:id/rbFemale");
		private final By selectLeadLocation = By.id("android:id/text1");
		private final By addLocality = By.id("com.healthvista.clinicianapp.stage:id/tilLocality");
		private final By addAddress = By.id("com.healthvista.clinicianapp.stage:id/tilAddress");
		private final By addAddressPinCode = By.id("com.healthvista.clinicianapp.stage:id/tilPincode");
		private final By LeadLabSampleCollection = By.id("com.healthvista.clinicianapp.stage:id/services");
		private final By LabCollectionSelection = By.name("Hyderabad");
		private final By LabHotSelection = By.name("Hot");
		private final By LabColdSelection = By.name("Cold");
		private final By CancelBtn = By.id("com.healthvista.clinicianapp.stage:id/bCancel");
		private final By SaveBtn = By.id("com.healthvista.clinicianapp.stage:id/bSave");
		private final By spinnerLocality= By.id("com.healthvista.clinicianapp.stage:id/sLeadCity");
		private final By spinnerLeadType= By.id("com.healthvista.clinicianapp.stage:id/leadtype");
		private final By okBtn= By.name("OK");
		private final By cancelBtn= By.name("Cancel");
		private final By cochin= By.id("com.healthvista.clinicianapp.stage:id/etPatientLocality");
		private final By localityInternalLocation= By.name("Cochin,Kerala,India");
		
		// Patient and Appointment Page

		private final By patientBtn = By.name("Patients");
		private final By appointmentBtn = By.name("Appointments");
		private final By patientMobileNbr = By.name("Mobile (10 digits only)");
		private final By searchBtn = By.id("com.healthvista.clinicianapp.stage:id/ibSearch");
		private final By errorMessage = By.id("com.healthvista.clinicianapp.stage:id/snackbar_text");

		// Form for Lead and Patient

		private final By patientTxt = By.name("Patient(s) List");
		private final By mobileNumber = By.name("Mobile No:");
		private final By patientId = By.name("ID");
		private final By patientName = By.name("Name");
		private final By patietAge = By.name("Age");
		private final By patientGender = By.name("Gender");
		private final By addPatientPlusBtn = By.id("com.healthvista.clinicianapp.stage:id/fabAddPatient");
		private final By spinrPtntLocation= By.id("com.healthvista.clinicianapp.stage:id/sPatientArea");
		// Click xpath is left on the patient details page

		// Cancel Button Pop Up
		private final By cancelPopUp = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
		private final By cancelPopUpNo = By.id("android:id/button2");
		private final By cancelPopUpYes = By.id("android:id/button1");

		// Save Button Pop Up

		private final By savePopUpCreateApt = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
		private final By savePopUpOkBtn = By.id("android:id/button1");
		private final By savePopUpCancelBtn = By.id("android:id/button2");

		// For Patient pop up, if mobile number dosen't exist

		private final By patientMobilePopAlert = By.name("No Patient found!");
		private final By addPatinetOkBtn = By.name("OK");
		private final By cancelPatientBtn = By.name("Cancel");
		private final By addAptForPtnt= By.id("com.healthvista.clinicianapp.stage:id/fabAddAppointment");
		
		// Create an appointment for patient Now
		
		private final By nowRadioBtn= By.id("com.healthvista.clinicianapp.stage:id/rbNow");
		private final By laterRadioBtn= By.id("com.healthvista.clinicianapp.stage:id/rbLater");
		private final By spinnerCampService= By.id("com.healthvista.clinicianapp.stage:id/sCampServices");
		private final By nursing12Hr= By.name("12 Hr Nursing - Classic");
		private final By labSmplCollection= By.name("Lab-Sample Collection");
		private final By physio= By.name("Physiotherapy");
		private final By doctorVisit= By.name("Doctor Visit");
		private final By nursing24Hr= By.name("24 Hr Nursing - Classic");
		private final By nursingAttendent= By.name("24 Hr Nursing Attendant");
		private final By equipment= By.name("Equipment");
		
		private final By typesOfTest= By.name("CA 19.9 (Cancer antigen-Pancreas 19.9)");
		private final By actualServiceCost= By.name("Actual Service Cost");
		private final By discountedCost= By.id("com.healthvista.clinicianapp.stage:id/etCampCost");
		private final By spinnerCampProf= By.id("com.healthvista.clinicianapp.stage:id/etCampCost");
		private final By consecutiveFamilyTest= By.name("Consecutive family testing");
		private final By cashRadioBtn= By.id("com.healthvista.clinicianapp.stage:id/rbCampCash");
		private final By chequeRadioBtn= By.id("com.healthvista.clinicianapp.stage:id/rbCampCheque");
		private final By txtBoxMedicalCndtn= By.id("com.healthvista.clinicianapp.stage:id/etCampNotes");
		private final By submitButton= By.id("com.healthvista.clinicianapp.stage:id/bDone");
		//Create Appointment for Patient Later
		
		private final By costTxtBox= By.id("com.healthvista.clinicianapp.stage:id/laterCost");
		private final By noteTxtBox= By.id("com.healthvista.clinicianapp.stage:id/laterNotes");
		private final By yesRadioBtn= By.id("com.healthvista.clinicianapp.stage:id/rbAdvanceYes");
		private final By noRadioBtn= By.id("com.healthvista.clinicianapp.stage:id/rbAdvanceNo");
		

		// Appointment page details

		private final By aptTxtVerify = By.name("All Camp(s) Appointments");
		private final By patientNametxt = By.id("com.healthvista.clinicianapp.stage:id/patientName");
		private final By aptDate = By.id("com.healthvista.clinicianapp.stage:id/date");
		private final By aptStatus = By.id("com.healthvista.clinicianapp.stage:id/statusName");
		private final By aptFee = By.id("com.healthvista.clinicianapp.stage:id/paymentText");
		private final By patientstext = By.name("Patients");
		private final By patientOkBtn = By.name("OK");

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
		
		public By getspinnerLocality()
		{
			return spinnerLocality;
		}

		public By getspinnerLeadType()
		{
			return spinnerLeadType;
		}
		
		public By getokBtn()
		{
			return okBtn;
		}
		
		public By getcancelBtn()
		{
			return cancelBtn;
		}
		
		public By getcochin()
		{
			return cochin;
		}
		
		public By getspinrPtntLocation()
		{
			return spinrPtntLocation;
		}
		
		public By getlabSmplCollection()
		{
			return labSmplCollection;
		}
		
		public By getphysio()
		{
			return physio;
		}
		
		public By getdoctorVisit()
		{
			return doctorVisit;
		}
		
		public By getnursing24Hr()
		{
			return nursing24Hr;
		}
		
		public By getnursingAttendent()
		{
			return nursingAttendent;
		}
		
		public By getequipment()
		{
			return equipment;
		}
		
		public By getsubmitButton()
		{
			return submitButton;
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

		public By getaddGenderMale() {
			return addGenderMale;
		}

		public By getaddGenderFemale() {
			return addGenderFemale;
		}

		public By getselectLeadLocation() {
			return selectLeadLocation;
		}

		public By getaddLocality() {
			return addLocality;
		}

		public By getaddAddress() {
			return addAddress;
		}

		public By getaddAddressPinCode() {
			return addAddressPinCode;
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
		
		public By nowRadioBtn()
		{
			return nowRadioBtn;
		}

		public By laterRadioBtn()
		{
			return laterRadioBtn;
		}
		
		public By spinnerCampService()
		{
			return spinnerCampService;
		}
		
		public By nursing12Hr()
		{
			return nursing12Hr;
		}
		
		public By typesOfTest()
		{
			return typesOfTest;
		}
		
		public By actualServiceCost()
		{
			return actualServiceCost;
		}
		
		public By discountedCost()
		{
			return discountedCost;
		}
		
		public By spinnerCampProf()
		{
			return spinnerCampProf;
		}
		
		public By consecutiveFamilyTest()
		{
			return consecutiveFamilyTest;
		}
		
		public By cashRadioBtn()
		{
			return cashRadioBtn;
		}
		
		public By chequeRadioBtn()
		{
			return chequeRadioBtn;
		}
		
		public By txtBoxMedicalCndtn()
		{
			return txtBoxMedicalCndtn;
		}
		
		public By costTxtBox()
		{
			return costTxtBox;
		}
		
		public By noteTxtBox()
		{
			return noteTxtBox;
		}
		
		public By yesRadioBtn()
		{
			return yesRadioBtn;
		}
		
		public By noRadioBtn()
		{
			return noRadioBtn;
		}
		
		public By localityInternalLocation()
		{
			return localityInternalLocation;
		}
		
		public By addAptForNuPtnt()
		{
			return addAptForPtnt;
		}
		
		// Functions
		
		public void onClickLocationCochin()
		{
			WebElement cochinLotn= driver.findElement(cochin);
			cochinLotn.click();
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

		public void onClickMobilenumber(int len) {
			WebElement LeadMobile = driver.findElement(LeadMobileNumber);
			LeadMobile.click();
			GlobalUtil.getRandomNumber(len);
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

		public void onClickGenderMale() {
			WebElement GndrMale = driver.findElement(addGenderMale);
			GndrMale.click();
		}

		public void onClickGenderFemale() {
			WebElement GndrFmale = driver.findElement(addGenderFemale);
			GndrFmale.click();
		}

		public void onClickLeadLocation() {
			WebElement LeadLcoation = driver.findElement(selectLeadLocation);
			LeadLcoation.click();
		}

		public void onClickLocality() {
			WebElement Locality = driver.findElement(addLocality);
			Locality.click();
		}

		public void onClickAddress() {
			WebElement Adrs = driver.findElement(addAddress);
			Adrs.click();
		}

		public void onClickAdrsPinCode() {
			WebElement AdrsPin = driver.findElement(addAddressPinCode);
			AdrsPin.click();
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
		
		public void onClickspinrPtntLocation()
		{
			WebElement spinrPtntLctn= driver.findElement(spinrPtntLocation);
			spinrPtntLctn.click();
		}

		public void onTapcampLocationLocator() {
//			List<WebElement> addLocation = driver.findElements(campLocationLocator);
//			WebElement campItem = addLocation.get(0);
//			WebElement campName = campItem.findElement(By.id("com.healthvista.clinicianapp.stage.debug:id/campName"));
//			campName.click();
			clickWhenVisible(By.xpath("//android.widget.TextView[contains(@text,'Domlur Camp')]"));

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
		
		public void onClickspinrLocality()
		{
			WebElement spnrLcty= driver.findElement(spinnerLocality);
			spnrLcty.click();
		}

		public void onClickspnrLdType()
		{
			WebElement spnrLdTp= driver.findElement(spinnerLeadType);
			spnrLdTp.click();
		}
		
		public void onClickokButton()
		{
			WebElement okButn= driver.findElement(okBtn);
			okButn.click();
		}
		
		public void onClickcancelButton()
		{
			WebElement cnclBtn= driver.findElement(cancelBtn);
			cnclBtn.click();
		}
		
		public void onClickcampLocationLocator() {
			List<WebElement> addLocation = driver.findElements(campLocationLocator);
			addLocation.get(0).click();
		}

		public void onclickLeadLabSampleCollection() 
		{
			WebElement ledSamplCltn= driver.findElement(LeadLabSampleCollection);
			ledSamplCltn.click();
			
		}
		
		public void onClickLeadName(String LName) {
			WebElement entrLName= driver.findElement(LeadName);
			entrLName.sendKeys(LName);
			
		}

		public void onClickLeadMobileNumber() {
			WebElement entrLName= driver.findElement(LeadMobileNumber);
			entrLName.click();
			
		}
		
		public void addLead()
		{
			WebElement name = driver.findElement(LeadName);
			name.sendKeys(GlobalUtil.getRandomName(6));
			GlobalUtil.wait(1);
			WebElement mobile = driver.findElement(LeadMobileNumber);
			mobile.sendKeys("8788887778");
			GlobalUtil.wait(1);
			WebElement email = driver.findElement(LeadEmailId);
			email.sendKeys(GlobalUtil.getRandomName(4) + "@test.com");
			GlobalUtil.wait(1);
			WebElement age = driver.findElement(LeadAge1);
			email.sendKeys(GlobalUtil.getRandomNumber(2));
			GlobalUtil.wait(1);
			
		}

		public void onClickAddLeadEmail(String EID) {
			WebElement emailId= driver.findElement(LeadEmailId);
			emailId.sendKeys(EID);
			
		}

		public void onClickAddLeadAge(String LAge) {
			WebElement leadAg= driver.findElement(LeadAge1);
			leadAg.sendKeys(LAge);
			
		}

		public void onClickLocality(String LLocality) {
			WebElement Lcty= driver.findElement(addLocality);
			Lcty.sendKeys(LLocality);
			
		}

		public void onClickAddress(String LAdrs) {
			WebElement Adrs= driver.findElement(addAddress);
			Adrs.sendKeys(LAdrs);
			
		}

		public void onClickAdrsPinCode(String LPin) {
			WebElement adPin= driver.findElement(addAddressPinCode);
			adPin.sendKeys(LPin);
			
		}

		public void onclickpatientBtn() {
			WebElement ptntBtun= driver.findElement(patientBtn);
			ptntBtun.click();
			
		}

		public void onClickaddPatientBtnLocator() {
			WebElement ptntBtnLctr= driver.findElement(addPatientBtnLocator);
			ptntBtnLctr.click();
		}

		public void onClickPatientMobileNumber(String PMbNbr) {
			WebElement pMoNbr= driver.findElement(addPatientBtnLocator);
			pMoNbr.sendKeys(PMbNbr);
			
		}

		public void onclickaddPatinetOkBtn() {
			WebElement addNwPtntOkPopUp= driver.findElement(addPatinetOkBtn);
			addNwPtntOkPopUp.click();
		}

		public void onClickpatientName(String pName) {
			WebElement ptntName= driver.findElement(patientName);
			ptntName.sendKeys(pName);
			
		}

		public void onClickpatientAge(String PAge) {
			WebElement ptntAge= driver.findElement(patietAge);
			ptntAge.sendKeys(PAge);
			
		}

		public void onClickaddPatientPlusBtn() {
			WebElement addNuPtnt= driver.findElement(addPatientPlusBtn);
			addNuPtnt.click();
			
		}

		public void onClickNwRadioButn()
		{
			WebElement nowRdoBtn= driver.findElement(nowRadioBtn);
			nowRdoBtn.click();
		}

		public void onClickLaterradioButn()
		{
			WebElement ltrRdoBtn= driver.findElement(laterRadioBtn);
			ltrRdoBtn.click();
		}
		
		public void onClickSpinnerCampService()
		{
			WebElement spnrCmpSrvc= driver.findElement(spinnerCampService);
			spnrCmpSrvc.click();
		}
		
		public void onClickNursing12Hr()
		{
			WebElement nursngHr= driver.findElement(nursing12Hr);
			nursngHr.click();
		}
		
		public void onClickTypesOfTest()
		{
			WebElement tsttyp= driver.findElement(typesOfTest);
			tsttyp.click();
		}
		
		public void onClickActualServiceCost(String Cst)
		{
			WebElement actlSrvcCst= driver.findElement(actualServiceCost);
			actlSrvcCst.sendKeys(Cst);
		}
		
		public void onClickDiscountedCost(String DiscntCst)
		{
			WebElement dscntCst= driver.findElement(discountedCost);
			dscntCst.sendKeys(DiscntCst);
		}
		
		public void onClickSpinnerCampProf()
		{
			WebElement spnrCmpProf= driver.findElement(spinnerCampProf);
			spnrCmpProf.click();
		}
		
		public void onClickConsecutiveFamilyTest()
		{
			WebElement consFmlyTst= driver.findElement(consecutiveFamilyTest);
			consFmlyTst.click();
		}
		
		public void onClickCashRadioBtn()
		{
			WebElement rdoBtnCash= driver.findElement(cashRadioBtn);
			rdoBtnCash.click();
		}
		
		public void onClickChequeRadioBtn()
		{
			WebElement rdoBtnCheque= driver.findElement(chequeRadioBtn);
			rdoBtnCheque.click();
		}
		
		public void onClickTxtBoxMedicalCndtn(String Text)
		{
			WebElement txtBx= driver.findElement(txtBoxMedicalCndtn);
			txtBx.sendKeys(Text);
		}
		
		public void onClickCostTxtBox(String COST)
		{
			WebElement cstTxtBx= driver.findElement(costTxtBox);
			cstTxtBx.sendKeys(COST);
		}
		
		public void onClickNoteTxtBox(String Note)
		{
			WebElement noteTBx= driver.findElement(noteTxtBox);
			noteTBx.sendKeys(Note);
		}
		
		public void onClickyesRadioBtn()
		{
			WebElement yesRBtn= driver.findElement(yesRadioBtn);
			yesRBtn.click();
		}
		
		public void onClickNoRadioBtn()
		{
			WebElement noRBtn= driver.findElement(noRadioBtn);
			noRBtn.click();
		}
		
		public void onClickAddLocality(String Locality)
		{
			WebElement adLocality= driver.findElement(addLocality);
			adLocality.sendKeys(Locality);
		}
		
		public void onClickLocalityInternalLocation()
		{
			WebElement lctyIntrnlLctn= driver.findElement(localityInternalLocation);
			lctyIntrnlLctn.click();
		}
		
		public void onClickAddAptForPtnt()
		{
			WebElement adAptFrPtnt= driver.findElement(addAptForPtnt);
			adAptFrPtnt.click();
		}

		public void onclickPatientId() {
			WebElement pId= driver.findElement(patientId);
			pId.click();
		}

		public void onclickSavePopUpOkBtn() {
			WebElement popUpOk= driver.findElement(savePopUpOkBtn);
			popUpOk.click();
		}
		
		public void onClickLabSmplCollection()
		{
			WebElement labSmplClct= driver.findElement(labSmplCollection);
			labSmplClct.click();
		}
		
		public void onClickPhysio()
		{
			WebElement physiotherap= driver.findElement(physio);
			physiotherap.click();
		}

		public void onClickDoctorVisit()
		{
			WebElement docVst= driver.findElement(doctorVisit);
			docVst.click();
		}
		
		public void onClickNursing24Hr()
		{
			WebElement nursin24Hr= driver.findElement(nursing24Hr);
			nursin24Hr.click();
		}
		
		public void onClickNursingAttendent()
		{
			WebElement nursinAtndnt= driver.findElement(nursingAttendent);
			nursinAtndnt.click();
		}
		
		public void onClickEquipment()
		{
			WebElement equip= driver.findElement(equipment);
			equip.click();
		}
		
		public void onClickSubmitButton()
		{
			WebElement submitBtn= driver.findElement(submitButton);
			submitBtn.click();
		}
	
		public void clickOnCampName()
		{
			WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Domlur Camp')]"));
			ele.click();
		}
	
	
	
}
