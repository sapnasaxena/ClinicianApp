package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import com.qa.mobileapp.common.BasePage;
import io.appium.java_client.AppiumDriver;

public class CaseFilePage extends BasePage  {


	private static final By CasefileLocator = null;


	public CaseFilePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/* Author: Lipsha satpathy
	 * Created date: 5 april 2016
	 * XPATH for casefile Page 
	 * */
		private final By casefileScreenLocator= By.name("Case Files");
		private final By PendingstatusLocator= By.name("Pending");
		private final By CasefilestabLocator= By.name("Case Files");
		private final By DocumentsLocator=By.name("Documents");
		private final By GenerallistLocator=By.id("com.healthvista.clinicianapp.stage:id/general_list");
		private final By PatientNameLocator=By.id(" com.healthvista.clinicianapp.stage:id/patient_name");
		private final By PatientIDLocator=By.id("com.healthvista.clinicianapp.stage:id/patient_id");
		private final By AppointmentDateLocator=By.id("com.healthvista.clinicianapp.stage:id/appointment_date");
		private final By RefreshButtonLocator=By.id("com.healthvista.clinicianapp.stage:id/menu_load");
		private final By statusLocator=By.id("com.healthvista.clinicianapp.stage:id/sheet_status");
		private final By EditcasefilebuttonLocator=By.id("com.healthvista.clinicianapp.stage:id/edit_case_sheet");
		
		//****Xpath for after click on Edit casefile ****
		
		private final By CasefileNameTypeLocator=By.name("Pain Assessment");
		private final By CasefiletypeTypeLocator=By.name(" Type");
		private final By CasefilenatureLocator=By.name("Nature");
		private final By sideLocator=By.name("Side");
		private final By spinnerLocator=By.className("android.widget.Spinner");
		private final By EarlyLocator=By.name("Early morning");
		private final By MidLocator=By.name("Mid morning");
		private final By afternoonLocator=By.name("Early afternoon");
		private final By LateafternoonLocator=By.name(" Late afternoon");
		private final By EveningLocator=By.name("Evening");
		private final By LateEveningLocator=By.name("Late evening");
		private final By NightEveningLocator=By.name("Night");
		private final By ThroughoutdayLocator=By.name("Throughout the day");
		private final By No24hrpatternLocator=By.name("Night");
		private final By LeftLocator=By.name("Left");
		private final By RightLocator=By.name("Right");
		private final By BothLocator=By.name("Both");
		private final By intensityLocator=By.name("intensity");
		private final By oneLocator=By.name("1");
		private final By twoLocator=By.name("2");
		private final By threeLocator=By.name("3");
		private final By fourLocator=By.name("4");
		private final By fiveLocator=By.name("5");
		private final By sixLocator=By.name("6");
		private final By sevenLocator=By.name("7");
		private final By eightLocator=By.name("8");
		private final By nineLocator=By.name("9");
		private final By tenLocator=By.name("10");
		private final By mildLocator=By.name("Mild");
		private final By ModerateLocator=By.name("Moderate");
		private final By SevereLocator=By.name("Severe");
		private final By EctomorphbuiltLocator=By.name("Ectomorph");
		private final By MesomorphLocator=By.name("Mesomorph");
		private final By EndomorphbuiltLocator=By.name("Endomorph");
		private final By TreatmentScheduleLocator=By.name("Treatment Schedule");
		private final By TotalrequiredvisitsLocator=By.name("Total no. of required visits");
		private final By FrequencyvisitLocator=By.name(" Frequency of visit");
		private final By ReasonsPorteaLocator=By.name(" Reasons for not continuing with Portea");
		private final By TreatmentProgrammeLocator=By.name("Treatment Programme");
		private final By Ts1Locator=By.name("Treatment Programme 1");
		private final By Ts2Locator=By.name("Treatment Programme 2");
		private final By Ts3Locator=By.name("Treatment Programme 3");
		private final By DreaftLocator=By.name("Save as Draft");
		private final By SaveLocator=By.name(" Save and Submit");
		
		
		
		
		
		//click function is missing unable to find x path
		
		private final By TimeLocator=By.name("24 Hrs Pattern");
		private final By IntensityLocator=By.name("Intensity(VAS)");
		private final By CancelbuttonLocator=By.name(" Cancel");
		private final By DonebuttonLocator=By.name(" Done");
		
		//**xpath after click on document tab
		
		private final By TreatmentLocator=By.name("treatment summary");
		private final By ConsentLocator=By.name("consent form");
		
		
		
	
	public By getCaseFileScreenLocator(){
		return casefileScreenLocator;
	}
	
	public By getPendingstatusLocator(){
		return PendingstatusLocator;
	}
	
	public By getDocumentLocator(){
		return DocumentsLocator;	
	}
	
	public By getCasefiletabLocator(){
		return CasefilestabLocator;
	}
	
	public By getGenerallistLocator(){
		return GenerallistLocator;
	}
	
	public By getPatientNameLocator(){
		return PatientNameLocator;
	}
	
	public By getPatientIDLocator(){
		return PatientIDLocator;
	}
	
	public By getAppointmentDateLocator(){
		return AppointmentDateLocator;
	}
	
	public By getRefreshButtonLocator(){
		return RefreshButtonLocator;
	}
	
	public By getstatusLocator(){
		return statusLocator;	
	}
	
	public By getEditcasefilebuttonLocator(){
		return EditcasefilebuttonLocator;
	}
	
	public By getCasefileNameTypeLocator(){
		return CasefileNameTypeLocator ;	
	}
	public By getCasefiletypeTypeLocator(){
		return CasefiletypeTypeLocator ;
	}
	
	public By getCasefilenatureLocator(){
		return CasefilenatureLocator ;
	}
	
	public By getsideLocator(){
		return sideLocator ;
	}
	
	public By getTimeLocator(){
		return TimeLocator ;
	}
	
	public By getIntensityLocator(){
		return IntensityLocator ;
	}
	
	public By getCancelbuttonLocator(){
		return CancelbuttonLocator ;
	}
	
	public By getDonebuttonLocator(){
		return DonebuttonLocator ;
	}
	public By getTreatmentLocator(){
		return TreatmentLocator ;
	}
	
	public By getConsentLocator(){
		return ConsentLocator ;
		
	}
	
	public By getspinnerLocator(){
		return spinnerLocator ;
		
	}
	
	public By getEarlyLocator(){
		return EarlyLocator ;
		
	}
	
	public By getMidLocator(){
		return MidLocator ;
		
	}
	
	public By getafternoonLocator(){
		return afternoonLocator ;
		
	}
	
	public By getLateafternoonLocator(){
		return LateafternoonLocator ;
		
	}
	
	public By getEveningLocator(){
		return EveningLocator ;
		
	}
	
	public By getLateEveningLocator(){
		return LateEveningLocator ;
		
	}
	
	public By getNightEveningLocator(){
		return NightEveningLocator ;
		
	}
	
	public By getThroughoutdayLocator(){
		return ThroughoutdayLocator ;
		
	}
	
	public By getNo24hrpatternLocator(){
		return No24hrpatternLocator ;
		
	}
	
	public By getLeftLocator(){
		return LeftLocator ;
		
	}
	
	public By getRightLocator(){
		return RightLocator ;
		
	}
	
	public By getBothLocator(){
		return BothLocator ;
		
	}
	
	public By getintensityLocator(){
		return intensityLocator ;
		
	}
	
	public By getoneLocator(){
		return oneLocator ;
		
	}
	

	public By gettwoLocator(){
		return twoLocator ;
		
	}
	
	public By getthreeLocator(){
		return threeLocator ;
		
	}
	
	public By getfourLocator(){
		return fourLocator ;
		
	}
	
	public By getfiveLocator(){
		return fiveLocator ;
		
	}
	
	public By getsixLocator(){
		return sixLocator ;
		
	}
	
	public By getsevenLocator(){
		return sevenLocator ;
		
	}
	
	public By geteightLocator(){
		return eightLocator ;
		
	}
	
	public By getnineLocator(){
		return nineLocator ;
		
	}
	

	public By gettenLocator(){
		return tenLocator ;
		
	}
	
	public By getmildLocator(){
		return mildLocator ;
		
	}
	
	public By getModerateLocator(){
		return ModerateLocator ;
		
	}
	
	public By getSevereLocator(){
		return SevereLocator ;
		
	}
	
	public By getEctomorphbuiltLocator(){
		return EctomorphbuiltLocator ;
		
	}
	
	public By getMesomorphLocator(){
		return MesomorphLocator ;
		
	}
	
	public By getEndomorphbuiltLocator(){
		return EndomorphbuiltLocator ;
		
	}
	
	public By getTreatmentScheduleLocator(){
		return TreatmentScheduleLocator ;
		
	}
	

	public By getTotalrequiredvisitsLocator(){
		return TotalrequiredvisitsLocator ;
		
	}
	
	public By getFrequencyvisitLocator(){
		return FrequencyvisitLocator ;
		
	}
	
	public By getReasonsPorteaLocator(){
		return ReasonsPorteaLocator ;
		
	}
	

	public By getTreatmentProgrammeLocator(){
		return TreatmentProgrammeLocator ;
		
	}
	
	public By getTs1Locator(){
		return Ts1Locator ;
		
	}
	
	public By getTs2Locator(){
		return Ts2Locator ;
		
	}
	
	public By getTs3Locator(){
		return Ts3Locator ;
		
	}
	
	public By getDreaftLocator(){
		return DreaftLocator ;
		
	}
	
	public By getSaveLocator(){
		return SaveLocator ;
		
	}
	


		
	// **** FUNCTIONS FOR CaseFile ****
	
	
public void onClickCaseFileScreenLocator()
{
clickWhenVisible(casefileScreenLocator);

}

public void onClickPendingStatusLocator()
{
clickWhenVisible(PendingstatusLocator);

}

public void onClickCasefilestabLocator()
{
clickWhenVisible(CasefilestabLocator);

}

public void onClickDocumentsLocator()
{
clickWhenVisible(DocumentsLocator);

}

public void onClickGenerallistLocator()
{
clickWhenVisible(GenerallistLocator);

}

public void onClickPatientNameLocator()
{
clickWhenVisible(PatientNameLocator);

}

public void onClickPatientIDLocator()
{
clickWhenVisible(PatientIDLocator);

}

public void onClickAppointmentDateLocator()
{
clickWhenVisible(AppointmentDateLocator);

}

public void onClickRefreshButtonLocator()
{
clickWhenVisible(RefreshButtonLocator);

}

public void onClickstatusLocator()
{
clickWhenVisible(statusLocator);
}

public void onClickEditcasefilebuttonLocator()
{
clickWhenVisible(EditcasefilebuttonLocator);
}

public void onClickCasefileNameTypeLocator()
{
clickWhenVisible(CasefileNameTypeLocator);

}

public void onClickCasefiletypeTypeLocator()
{
clickWhenVisible(CasefiletypeTypeLocator);

}

public void onClickCasefilenatureLocator()
{
clickWhenVisible(CasefilenatureLocator);

}

public void onClicksideLocator()
{
clickWhenVisible(sideLocator);

}

public void onClickTimeLocator()
{
clickWhenVisible(TimeLocator);

}

public void onClickIntensityLocator()
{
clickWhenVisible(IntensityLocator);

}

public void onClickCancelbuttonLocator()
{
clickWhenVisible(CancelbuttonLocator);

}

public void onClickDonebuttonLocator()
{
clickWhenVisible(DonebuttonLocator);

}

public void onClickTreatmentLocator()
{
clickWhenVisible(TreatmentLocator);

}

public void onClickspinnerLocator()
{
clickWhenVisible(spinnerLocator);

}

public void onClickDreaftLocator()
{
clickWhenVisible(DreaftLocator);

}

public void onClickConsentLocator()
{
clickWhenVisible(ConsentLocator);

}

public void onClickReasonsPorteaLocator()
{
clickWhenVisible(ReasonsPorteaLocator);

}

public void onClickFrequencyvisitLocator()
{
clickWhenVisible(FrequencyvisitLocator);

}

public void onClickSaveLocator()
{
 clickWhenVisible(SaveLocator);

}
}







