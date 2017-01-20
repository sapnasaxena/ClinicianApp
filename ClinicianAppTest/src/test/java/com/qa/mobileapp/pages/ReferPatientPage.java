package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

//Author: Shital Kumar

public class ReferPatientPage extends BasePage {

	public ReferPatientPage(AppiumDriver driver) {
		super(driver);
		
	}
	private final By referPatientScreenLocator = By.name("Refer a Patient");
	private final By ReferAPatientText = By.name("Refer a Patient");
	private final By radioButton= By.id("com.healthvista.clinicianapp.stage:id/patientSource");
	private final By PorteaPatient = By.id(" com.healthvista.clinicianapp.stage:id/porteaNetwork");
	private final By PersonalNetwork=By.id("com.healthvista.clinicianapp.stage:id/personalNetwork");
	private final By NewPatientName= By.xpath("//android.widget.EditText[contains(@id,'com.healthvista.clinicianapp.stage:id/etNewPatientName')]");
			//By.id("com.healthvista.clinicianapp.stage:id/etNewPatientName");
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
	
	
	//Functions
	
//	public void onClickreferPatientScreenLocator()
//	{
//		WebElement referPtntScrnLctr= clickWhenVisible(referPatientScreenLocator);
//		referPtntScrnLctr.click();
//	}
//	
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
	
	public void onClickExistnPtntId(String PID)
	{
		WebElement existinPtId= driver.findElement(ExistingPatient);
		existinPtId.sendKeys(PID);
	}
	
	public void onClickDetail(String PDetails)
	{
		WebElement dtls= driver.findElement(PatientDetails);
		dtls.sendKeys(PDetails);
		
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
		name.click();
		GlobalUtil.wait(2);
		name.sendKeys("ttttttt");
		GlobalUtil.wait(2);
		WebElement mobNo = driver.findElement(PatientMobileNumber);
		mobNo.sendKeys("8553013244");
		GlobalUtil.wait(2);
		WebElement relation = driver.findElement(relationSpinnerLocator);
		relation.click();
		GlobalUtil.wait(2);
		relation.sendKeys("Mother");
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
	
	
}
