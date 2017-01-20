package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CampPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LoginPage;

public class CampTests extends TestBase{

	
	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea123456";

	
	@BeforeClass
	public void initCamp() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
		
	@BeforeMethod
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		camppage = new CampPage(driver);
	}
	
	@AfterMethod
	public void ensureCampPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(camppage.waitVisible(camppage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		camppage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(camppage.waitVisible(camppage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Camp page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	@Test(groups = { "UITest" })
	public void testVerifyCampNavVisibilityOnHomeScreen()
	{
		
		System.out.println("Verify that Camp is visible On Left Nav bar");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		Assert.assertNotNull(camppage.getCampNameLocator());
	}
	
	@Test(groups = { "UITest" })
	public void testVerifyOnClickCampNavCampScreenWillDsipaly()
	{
		System.out.println("Verify that on click on Camp nav camp screen will display");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		camppage.onClickCampNavBar();
		Assert.assertNotNull(camppage.getCampNameLocator());
	}
	
	@Test(groups = { "UITest" })
	public void testVerifyOnClickCampAddLeadbuttonVisibilty()
	{
		System.out.println("Verify that on click on Camp nav Add Lead button will be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		camppage.onClickCampNavBar();
		camppage.onClickcampLocationLocator();
		Assert.assertNotNull(camppage.getAddLeadBtnLocator());
	}
	
	@Test(groups = { "UITest" })
	public void testVerifyOnClickCampAddPatientbuttonVisibilty()
	{
		System.out.println("Verify that on click on Camp nav Add Patient button will be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		camppage.onClickCampNavBar();
		Assert.assertNotNull(camppage.getAddPatientBtnLocator());
	}
	
	@Test(groups = { "UITest" })
	public void tc_02_testVerifyAndAddressAndLeadAndPatientButton()
	{
		System.out.println("Verify that on tapping on any camp name, should display Camp name and address along with Add Lead and Add Patient buttons");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		Assert.assertNotNull(camppage.getCampNameLocator());
	}
	
	@Test(groups = { "UITest" })
	public void tc_03_testAddLeadFormScreen()
	{
		System.out.println("Veriify that on tapping Add Lead, should open Add Lead form details screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		//camppage.onTapcampLocationLocator();
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddLead();
		Assert.assertNotNull(camppage.getLeadScreenLocator());
	}
	
	@Test(groups = { "UITest" })
	public void tc_04_testAddPatientFormScreen()
	{
		System.out.println("Verify that on tapping Add Patient, should open Add Patient details screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickAddPatient();
		Assert.assertNotNull(camppage.getpatientBtn());
		Assert.assertNotNull(camppage.getappointmentBtn());
	}
	
	@Test(groups = { "UITest" })
	public void tc_05_testAddLeadFormDetailScreen()
	{
		System.out.println("Verify that on Add Lead screen, should display fields like Name, mobile number, email, age, gender options, location, locatlity, Address, pincode, service  and type of lead along with Cancel and save button");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.getaddLeadBtn();
		camppage.onClickAddLeadButton();
		Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getaddLeadName());
		Assert.assertNotNull(camppage.getaddLeadMobileNumber());
		Assert.assertNotNull(camppage.getaddLeadEmailId());
		Assert.assertNotNull(camppage.getaddLeadAge());
		Assert.assertNotNull(camppage.getselectLeadGender());
		Assert.assertNotNull(camppage.getaddLeadBtn());
		Assert.assertNotNull(camppage.getaddLocality());
		Assert.assertNotNull(camppage.getaddAddress());
		Assert.assertNotNull(camppage.getaddAddressPinCode());
		Assert.assertNotNull(camppage.getLeadLabSampleCollection());
		Assert.assertNotNull(camppage.getLabHotSelection());
		Assert.assertNotNull(camppage.getCancelBtn());
		Assert.assertNotNull(camppage.getSaveBtn());
	}
	
	@Test(groups = { "UITest" })
	public void tc_07_AddpatientBtnWithPatientNAppointment()
	{
		System.out.println("Verify that on tap Add Patient button should display screen with 2 tabs Patients and Appointments");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		Assert.assertNotNull(camppage.getpatientBtn());
		Assert.assertNotNull(camppage.getappointmentBtn());
	}
	
	@Test(groups = { "UITest" })
	public void tc_08_Mobilenumber()
	{
		System.out.println("Verify that user should able to search patient with mobile number.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickAddPatientButton();
		GlobalUtil.wait(2);
		camppage.onClickMobilenumber();
		Assert.assertNotNull(camppage.getPatientstxt());
			}

	@Test(groups = { "UITest" })
	public void tc_09_PatientMobileNumberExistance()
	{
		System.out.println("Verify that if patient exists with searched mobile number should display the Patient details along with Add Patient button.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		camppage.onClickMobileNumber("8888888888");
		//Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getmobileNumber());
		Assert.assertNotNull(camppage.getpatientId());
		Assert.assertNotNull(camppage.getpatientName());
		Assert.assertNotNull(camppage.getpatietAge());
		Assert.assertNotNull(camppage.getpatientGender());
		Assert.assertNotNull(camppage.getaddPatientBtn());
	}
	
	@Test(groups = { "UITest" })
	public void tc_10_PopUpToCheckPatientDetails()
	{
		System.out.println("Verify that if patient not exists with searched mobile number, should display alert message screen, No Patient found along with options to Add New Patient.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		camppage.onClickMobilenumber();
		//camppage.onClickSearcButton();
		camppage.onClickokButton();
		Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getmobileNumber());
		Assert.assertNotNull(camppage.errorMessage());
		Assert.assertNotNull(camppage.getpatientMobileNbr());
	}
	
	@Test(groups = { "UITest" })
	public void tc_12_addNewPatientIfPatientNotThere()
	{
		System.out.println("Verify that on tap on OK button should redirect to Add Patient details screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		camppage.onClickMobilenumber();
		//camppage.onClickSearcButton();
		Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getmobileNumber());
		Assert.assertNotNull(camppage.errorMessage());
		Assert.assertNotNull(camppage.patientOkBtn());
		Assert.assertNotNull(camppage.getpatientName());
		Assert.assertNotNull(camppage.getpatientMobileNbr());
		Assert.assertNotNull(camppage.getaddLeadEmailId());
		Assert.assertNotNull(camppage.getpatietAge());
		Assert.assertNotNull(camppage.getpatientGender());
		Assert.assertNotNull(camppage.getselectLeadLocation());
		Assert.assertNotNull(camppage.getaddLocality());
		Assert.assertNotNull(camppage.getaddAddress());
		Assert.assertNotNull(camppage.getaddAddress());
		Assert.assertNotNull(camppage.getaddAddressPinCode());
		Assert.assertNotNull(camppage.getSaveBtn());
	}
	
	@Test(groups = { "UITest" })
	public void tc_11_PopUpCancelIfPatientMobileNbrdsntExist()
	{
		System.out.println("Verify that on tap cancel button should redirect to Patient search screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		camppage.onClickMobilenumber();
		//camppage.onClickSearcButton();
		Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getmobileNumber());
		Assert.assertNotNull(camppage.errorMessage());
		Assert.assertNotNull(camppage.getCancelBtn());
	}
	
	@Test(groups = { "UITest" })
	public void tc_13_PatientAppointmentDetails()
	{
		System.out.println("Verify that on tap Appointments tab, should display all the camp appointments.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getappointmentBtn());		
	}
	
	@Test(groups = { "UITest" })
	public void tc_14_AppointmentDetailsVerification()
	{
		System.out.println("Verify that on tap Appointments tab, should display all the camp appointments.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onClickcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onTapaddPatientBtn();
		//Assert.assertNotNull(camppage.getCampLocationLocator());
		Assert.assertNotNull(camppage.getappointmentBtn());
		Assert.assertNotNull(camppage.getaptTxtVerify());
		Assert.assertNotNull(camppage.getpatientNametxt());
		Assert.assertNotNull(camppage.getaptDate());
		Assert.assertNotNull(camppage.getaptStatus());
		Assert.assertNotNull(camppage.getaptFee());
	}

	//***************** FUNCTIONAL TEST CASE*******************************//
	

	//Due to GPS Location field cannot be automated
	//@Test(groups = { "functest" })
	public void ts_01_AddLeadTypeCold()
	{
		System.out.println("Verify that user can able to add leads of type cold");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickAddLeadButton();
//		camppage.onClickLeadName("Shital");
//		GlobalUtil.getRandomNumber(10);
		camppage.addLead();
//		camppage.onClickAddLeadEmail("dinnyportea@gmail.com");
//		camppage.onClickAddLeadAge("55");
//		camppage.onClickGenderMale();
//		camppage.onClickspinrLocality();
//		camppage.onClickLocationCochin();
//		camppage.onClickLocality("Cochin,Kerala,India");
//	    camppage.onClickLocalityInternalLocation();;
//		camppage.onClickAddress("Test Address Field");
//		camppage.onClickAdrsPinCode("560076");
//		camppage.onclickLeadLabSampleCollection();
//		camppage.onClickokButton();
//		camppage.onClickspnrLdType();
//		camppage.onClickLabColdCollection();
		camppage.onClickSaveButton();
		
	}
	/*
	@Test(groups = { "functest" })
	public void ts_02_AddLeadTypeHot()
	{
		System.out.println("Verify that user can able to add leads of type hot");
		loginpage.clearUserNameField();
		loginpage.clearPasswordField();
		loginpage.login(userName, password);
		GlobalUtil.wait(1);
		loginpage.dismissLocation();
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickAddLeadButton();
		camppage.onClickLeadName("Shital");
		camppage.onClickMobilenumber(10);
		camppage.onClickAddLeadEmail("dinnyportea@gmail.com");
		camppage.onClickAddLeadAge("55");
		camppage.onClickGenderMale();
		camppage.onClickspinrLocality();
		camppage.onClickLocationCochin();
		camppage.onClickLocality("Cochin,Kerala,India");
		camppage.onClickLocalityInternalLocation();
		camppage.onClickAddress("Test Address Field");
		camppage.onClickAdrsPinCode("560076");
		camppage.onclickLeadLabSampleCollection();
		camppage.onClickokButton();
		camppage.onClickspnrLdType();
		camppage.onClickLabHotCollection();
		camppage.onClickSaveButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_03_AddNewPatient()
	{
		System.out.println("Verify that user can able to add new patients");
		loginpage.clearUserNameField();
		loginpage.clearPasswordField();
		loginpage.login(userName, password);
		GlobalUtil.wait(1);
		loginpage.dismissLocation();
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("6666644444");
		camppage.onClickSearcButton();
		camppage.onclickaddPatinetOkBtn();
		camppage.onClickpatientName("Shital");
		camppage.onClickPatientMobileNumber("6666644444"); // by default its taking the mobile no, we can ignore this code.
		camppage.onClickAddLeadEmail("dinnyportea@gmail.com");
		camppage.onClickpatientAge("45");
		camppage.onClickGenderMale();
		camppage.onClickspinrLocality();
		camppage.onClickLocationCochin();
		camppage.onClickLocality("Cochin,Kerala,India");
		GlobalUtil.wait(5);
		camppage.onClickLocalityInternalLocation();
		camppage.onClickAddress("Testing Address");
		camppage.onClickAdrsPinCode("Testing Pin");
		camppage.onClickSaveButton();
		
	}	
	
	@Test(groups = { "functest" })
	public void ts_04_AddAptForFamilyRelatives()
	{
		System.out.println("Verify that user can able to add appointment for family relatives");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onClickaddPatientPlusBtn();
		camppage.onClickpatientName("Shital Family Member");
		camppage.onClickPatientMobileNumber("6666644444"); // by default its taking the mobile no, we can ignore this code.
		camppage.onClickAddLeadEmail("dinnyportea@gmail.com");
		camppage.onClickpatientAge("45");
		camppage.onClickGenderMale();
		camppage.onClickspinrLocality();
		camppage.onClickLocality("Cochin,Kerala,India");
		camppage.onClickLocalityInternalLocation();
		camppage.onClickAddress("Testing Address");
		camppage.onClickAdrsPinCode("Testing Pin");
		camppage.onClickSaveButton();
		camppage.onClickokButton();
		camppage.onClickAddAptForPtnt();
		camppage.onClickAddAptForPtnt();
		camppage.onClickNwRadioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing12Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_04_AddNewPatientAndAddAppointment()
	{
		System.out.println("Verify that user can able to add appointment for new patients");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
//		camppage.onClickPatientMobileNumber("6666644444");
		camppage.onClickMobilenumber(10);
		camppage.onClickSearcButton();
		camppage.onclickaddPatinetOkBtn();
		camppage.onClickpatientName("Shital");
		camppage.onClickPatientMobileNumber("6666644444"); // by default its taking the mobile no, we can ignore this code.
		camppage.onClickAddLeadEmail("dinnyportea@gmail.com");
		camppage.onClickpatientAge("45");
		camppage.onClickGenderMale();
		camppage.onClickspinrLocality();
		camppage.onClickLocationCochin();
		camppage.onClickLocality("Cochin,Kerala,India");
		camppage.onClickLocalityInternalLocation();
		camppage.onClickAddress("Testing Address");
		camppage.onClickAdrsPinCode("Testing Pin");
		camppage.onClickSaveButton();
		camppage.onClickAddAptForPtnt();
		camppage.onClickNwRadioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing12Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}	
	
	@Test(groups = { "functest" })
	public void ts_04_AddAptForExistingPtnt()
	{
		System.out.println("Verify that user can able to add appointment for existing patients");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickNwRadioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing12Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_07_AddAptForNowCase()
	{
		System.out.println("Verify that user can able to add appointment for Now case");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickNwRadioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing12Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_08_AddAptForLaterCase()
	{
		System.out.println("Verify that user can able to add appointment for Later case");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing12Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_09_AddAptForPhysiotherapy()
	{
		System.out.println("Verify that user can able to add apoointment for the service physiotherapy");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickPhysio();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_10_AddAptForDoctorVisit()
	{
		System.out.println("Verify that user can able to add apoointment for the service Doctor visit");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickDoctorVisit();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_11_AddAptFor12HrNursing()
	{
		System.out.println("Verify that user can able to add apoointment for the service 12Hr Nursing");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing12Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_12_AddAptFor24HrNursing()
	{
		System.out.println("Verify that user can able to add apoointment for the service 24Hr Nursing");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursing24Hr();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_13_AddAptForNursingAttendent()
	{
		System.out.println("Verify that user can able to add apoointment for the service  Nursing Attendant");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickNursingAttendent();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_14_AddAptForLabSampleCollection()
	{
		System.out.println("Verify that user can able to add apoointment for the service Lab-Sample Collection");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickLabSmplCollection();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_15_AddAptForEquipment()
	{
		System.out.println("Verify that user can able to add apoointment for the service Lab-Sample Collection");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickEquipment();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
	}
	
	@Test(groups = { "functest" })
	public void ts_16_AddedAppointmentIsVisibleUnderAppointmentTab()
	{
		System.out.println("Verify that user can able to view the appointments under Appointment tab");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapCampsNav();
		GlobalUtil.wait(2);
		camppage.onTapcampLocationLocator();
		GlobalUtil.wait(2);
		camppage.onClickaddPatientBtnLocator();
		camppage.onclickpatientBtn();
		camppage.onClickPatientMobileNumber("8888888888");
		camppage.onClickSearcButton();
		camppage.onclickPatientId();
		camppage.onClickSaveButton();
//		camppage.onClickCreateAppointment();
		camppage.onclickSavePopUpOkBtn();
		camppage.onClickAddAptForPtnt();
		camppage.onClickLaterradioButn();
		camppage.onClickSpinnerCampService();
		camppage.onClickEquipment();
		camppage.onClickDiscountedCost("500");
		camppage.onClickSpinnerCampProf();
		camppage.onClickConsecutiveFamilyTest();
		camppage.onClickCashRadioBtn();
		camppage.onClickTxtBoxMedicalCndtn("Testing Text Box");
		camppage.onClickSaveButton();
		camppage.onClickSubmitButton();
		
	}
	
	
	

	
	*/
	
	
	
}
