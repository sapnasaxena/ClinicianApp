package com.qa.mobileapp.pages;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.sf.cglib.core.Local;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.mobileapp.common.BasePage;
import com.qa.mobileapp.common.GlobalUtil;

public class AppointmentPage extends BasePage{
	
	public AppointmentPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
     Calendar cal;
	private final By appointmentScreenLocator = By.name("All Appointments");
	private final By leftDrawerNavLocator = By.id("com.healthvista.clinicianapp.stage:id/left_drawer");
	private final By LocationDisabledLocator = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By LocationDisabledDismissButtonLocator =By.name("Dismiss");
	private final By LocationEnabledButtonLocator = By.name("Enable Location");
	private final By listViewForAppointmentSpinnerLocator = By.className("android.widget.ListView");
	private final By AllAppointmentdropLocator = By.name("All Appointments");
	private final By OpenAppointmentdropLocator = By.name("Open Appointments");
	private final By ClosedAppointmentdropLocator = By.name("Closed Appointments");
	private final By TodayAppointmentTabLocator = By.name("TODAY");
	private final By UpcomingsAppointmentTabLocator = By.name("UPCOMING");
	private final By PastAppointmentTabLocator = By.name("PAST");
	private final By AppointmentListViewPageLocator=By.name("com.portea.internal:id/appListView");
	private final By patientNameLocator = By.id("com.portea.internal:id/patientName");
	private final By appointmentDateLocator = By.id("com.portea.internal:id/date");
	private final By statusLocator = By.id("com.portea.internal:id/statusName");
	private final By feesTextLocator = By.id("com.portea.internal:id/paymentText");
	private final By rescheduleAppointmentButtonLocator = By.id("");
	private final By addAppointmentButtonLocator = By.id("");
	private final By verifyPatientDetailsLinkLocator = By.id("");
	private final By cancelAppointmentButtonLocator = By.id("");
	private final By confirmAppointmentButtonLocator = By.name("Confirm");
	private final By selectDateLocator = By.id("");
	private final By addNoteFieldLocator = By.id("");
	private final By allAppointmentsSpinnerLocator = By.name("All Appointments");
	private final By addAppointmentScreenLocator = By.name("Add Appointment");
	private final By uploadScreenLocator =By.name("Add Document");
	private final By addCaseScreenLocator = By.name("Case Details");
	private final By payScreenLocator = By.name("Balance");
	private final By cashTabOnPayScreenLocator = By.name("Cash Payments");
	private final By onlineTabOnPayScreenLocator = By.name("Online Payments");
	private final By cashCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbCash");
	private final By chequeCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbCheque");
	private final By cashAmountTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etCash");
	private final By chequeTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etCheque");
	private final By cashInstructionLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCashInst");
	private final By chequeInstructionLocator = By.id("com.healthvista.clinicianapp.stage:id/tvChequeInst");
	private final By payButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bPay");
	private final By chequeNotesTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/tilPayNotes");
	private final By chequeIssueBankDetailsTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etChequeBank");
	private final By chequeNoDetailsLocator = By.id("com.healthvista.clinicianapp.stage:id/etChequeNo");
	
	private final By walletCheckBoxLocator =By.id("com.healthvista.clinicianapp.stage:id/cbWallet");
	private final By walletEnterAmountTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etWallet");
	private final By walletBalanceLocator = By.id("com.healthvista.clinicianapp.stage:id/tvWalletBalance");
	private final By sendOTPLocator = By.id("com.healthvista.clinicianapp.stage:id/bSendOTP");
	private final By walletInstructionLocator = By.id("com.healthvista.clinicianapp.stage:id/tvWalletInst");
	private final By emailOptionsLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnlineEmail");
	private final By mobileNoTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnlineMobile");
	private final By sendPaymentLinkLocator = By.id("com.healthvista.clinicianapp.stage:id/bSendLink");
	private final By onlineCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbOnline");
	
	//xpath for on click on any Patient's appointment
	private final By patientAppointmentDetailsScreenLocator = By.className("android.widget.RelativeLayout");
	private final By appointmentStatusLocator = By.id("com.healthvista.clinicianapp.stage:id/statusName");
	private final By patientTabLocator = By.name("PATIENT");
	private final By patientProfileLocator = By.id("com.healthvista.clinicianapp.stage:id/llProfile");
	private final By appointmentScreenMenuOptionsLocator = By.id("com.healthvista.clinicianapp.stage:id/edit");
	private final By pendingCheckPointLocator =By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointPending");
	private final By confirmedCheckPointLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointConfirmed");
	private final By reachedCheckPointLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointReached");
	private final By successCheckPointLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointSuccessful");
	private final By appointmentExpandFabButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/fab_expand_menu_button");
	private final By fabUploadButtonLocator =By.name("Upload");
	private final By fabAddCaseButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/attuneCasefile");
	private final By fabAddAppointmentButtonLocator = By.name("Add Appointment");
			//By.id("com.healthvista.clinicianapp.stage:id/newAppointmentFab");
	private final By fabPayButtonLocator =By.name("Pay");
			//By.id("om.healthvista.clinicianapp.stage:id/firstDynamicFab");
	private final By appointmentOptionCheckVitalLocator = By.name("Check Vitals");
	private final By appointmentOptionViewVitalsLocator=By.name("View Vitals");
	private final By appointmentScreenPatientNameLocator = By.id("com.healthvista.clinicianapp.stage:id/tvPatientName");
	private final By appointmentScreenPatientAddressLocator = By.id("com.healthvista.clinicianapp.stage:id/address");
	private final By appointmentScreenPatientGenderLocator = By.id("com.healthvista.clinicianapp.stage:id/gender");
	private final By appointmentScreenPatientPhoneLocator = By.id("com.healthvista.clinicianapp.stage:id/phone");
	private final By appointmentScreenPatientBrandLocator = By.id("com.healthvista.clinicianapp.stage:id/brand");
	private final By relativeLayoutforPatientDetailsLocator = By.id("com.healthvista.clinicianapp.stage:id/detailsContentLayout");
	private final By checkVitalsScreenLocator = By.name("Check Vitals");
	private final By viewVitalsScreenLocator = By.name("View Vitals");
	private final By dateLocator = By.className("android.widget.TextView");
	private final By appointmentTimeSelectWindowLocator = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By selectTimeLabelLocator = By.id("com.healthvista.clinicianapp.stage:id/selectTimeText");
	private final By selectTimeLocator = By.id("android.widget.TextView");
	private final By cancelButtonAddAppointmentLocator = By.name("Cancel");
	private final By addButtonLocator = By.name("Add Appointment");
	
	//xpath for Vitals screen
	
	private final By vitalScreenMenuLocator = By.id("com.healthvista.clinicianapp.stage:id/vital_menu");
	private final By listViewOptionLocator = By.name("List View");
	private final By graphViewOptionLocator = By.name("Graph View");
	
	//Xpath for Add case
	
	private final By listOfCasesLocator = By.id("com.healthvista.clinicianapp.stage:id/lv_cases");
	private final By addCaseButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/new_case_file");
	private final By caseNameLocator = By.id("com.healthvista.clinicianapp.stage:id/tv_case_main_complaint");
	private final By showCasesLocator = By.id("com.healthvista.clinicianapp.stage:id/iv_show_case_sheet");
	private final By caseFilePopUpWindowLocator = By.name("Add Case File");
	private final By caseFilePopUpYesButtonLocator = By.name("Yes");
	private final By caseFilePopUpNoButtonLocator = By.name("No");
	private final By physioAppLocator = By.name("Physio App");
	
	
	//Xpath for Upload Documents
	private final By documentTypeLocator = By.id("com.healthvista.clinicianapp.stage:id/document_type");
	private final By documentTitleLocator = By.id("com.healthvista.clinicianapp.stage:id/document_title");
	private final By documentReceivedDateLocator = By.id("com.healthvista.clinicianapp.stage:id/document_recvd_date");
	private final By documentNotesLocator = By.id("com.healthvista.clinicianapp.stage:id/document_notes");
	private final By documentNextButtonLocator = By.name("Next");
	private final By documentClearButtonLocator = By.name("Clear");
	
	//Xpath for Appointments
	
	private final By appointmentTabLocator = By.name("APPOINTMENT"); 
	private final By appointmentScheduleLocator =By.id("");
	private final By appointmentDurationLocator = By.id("");
	private final By appointmentCaseFileLocator = By.id("");
	private final By appointmentServiceToBeRenderedLocator = By.id("");
	private final By appointmentServiceTypeLocator = By.id("");
	private final By doneButtonForAddApptLocator = By.id("com.healthvista.clinicianapp.stage:id/checkbutton");
	private final By currentMonthLocator = By.className("android.widget.TextView");
	private final By rescheduleButtonLocator = By.name("Reschedule");
	private final By reachedButtonLocator = By.name("Reached");
	private final By callToCancelLocator = By.name("Call To cancel");
	private final By addAppointmentLocator = By.name("Add Appointment");
	private final By rescheduleAppointmentScreenLocator = By.name("Postpone Appointment");
	private final By successButtonLocator = By.name("Successful");
	
	//xpath for Payments
	private final By apptPaymentTabLocator = By.name("PAYMENT"); 
	private final By reachedFabButtonLocator = By.name("Reached");
	private final By successfulFabButtonLocator = By.name("Successfull");
	private final By serviceLevelPendingFeesLabelLocator = By.name("Service level pending fees");
	private final By serviceLevelPendingFeesValueLocator = By.id("");
	private final By packageFeesLabelLocator = By.name("Package Fees");
	private final By packageFeesValueLocator = By.id("");
	private final By amountPaidLabelLocator = By.name("Amount Paid");
	private final By amountPaidValueLocator = By.id("");
	private final By balanceLabelLocator = By.name("Balance");
	private final By balanceValueLocator = By.id("");
	private final By walletBalanceLabelLocator = By.name("Wallet Balance");
	private final By walletBalanceValueLocator = By.id("com.healthvista.clinicianapp.stage:id/tvWalletBalance");
	private final By otpAuthorizationScreenLocator = By.id("android:id/alertTitle");
	private final By yesOTPAuthroizationLocator = By.name("YES");
	private final By noOTPAuthroizationLocator = By.name("NO");
	private final By enterOTPLocator = By.id("com.healthvista.clinicianapp.stage:id/etWalletOTPValidate");
	private final By authroizePaymentButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bVertifyOTP");
	private final By sentPaymentLinkSuccessMessage = By.name("payment link is being sent");
	
	
	public By getBalanceValueLocator (){
		return balanceValueLocator ;
		}
	public By getWalletBalanceLabelLocator (){
		return walletBalanceLabelLocator ;
		}
	
	public By getWalletBalanceValueLocator(){
		return walletBalanceValueLocator;
		}
	
	public By getLocationDisabledDismissButtonLocator(){
	return LocationDisabledDismissButtonLocator;
	}
	
	public By getLeftDrawerNavLocator(){
		return leftDrawerNavLocator;
		}
	
	public By getLocationEnabledButtonLocator()
	{
		return LocationEnabledButtonLocator;
	}
	public By getAllAppointmentdropLocator() {
		return AllAppointmentdropLocator;
	}
	public By getOpenAppointmentdropLocator() {
		return OpenAppointmentdropLocator;
	}
	public By getClosedAppointmentdropLocator() {
		return ClosedAppointmentdropLocator;
	}
	
	public By getLocationDisabledLocator(){
		return LocationDisabledLocator;
	}
	public By getTodayAppointmentTabLocator() {
		return TodayAppointmentTabLocator;
	}
	public By getUpcomingsAppointmentTabLocator() {
		return UpcomingsAppointmentTabLocator;
	}
	public By getPastAppointmentTabLocator() {
		return PastAppointmentTabLocator;
	}
	public By getAppointmentListViewPageLocator() {
		return AppointmentListViewPageLocator;
	}
	public By getPatientNameLocator() {
		return patientNameLocator;
	}
	public By getAppointmentDateLocator() {
		return appointmentDateLocator;
	}
	public By getStatusLocator() {
		return statusLocator;
	}
	public By getFeesTextLocator() {
		return feesTextLocator;
	}
	
	public By getBalanceLabelLocator() {
		return balanceLabelLocator;
	}
	public By getRescheduleAppointmentButtonLocator() {
		return rescheduleAppointmentButtonLocator;
	}
	public By getAddAppointmentButtonLocator() {
		return addAppointmentButtonLocator;
	}
	public By getVerifyPatientDetailsLinkLocator() {
		return verifyPatientDetailsLinkLocator;
	}
	public By getCancelAppointmentButtonLocator() {
		return cancelAppointmentButtonLocator;
	}
	
	public By getConfirmAppointmentButtonLocator() {
		return confirmAppointmentButtonLocator;
	}
	
	public By getSelectDateLocator() {
		return selectDateLocator;
	}
	public By getAddNoteFieldLocator() {
		return addNoteFieldLocator;
	}
	
	public By getAmountPaidValueLocator() {
		return amountPaidValueLocator;
	}
	public By getAmountPaidLabelLocator() {
		return amountPaidLabelLocator;
	}
	public By getPackageFeesValueLocator() {
		return packageFeesValueLocator;
	}
	public By getPackageFeesLabelLocator() {
		return packageFeesLabelLocator;
	}
	public By getServiceLevelPendingFeesValueLocator() {
		return serviceLevelPendingFeesValueLocator;
	}
	public By getServiceLevelPendingFeesLabelLocator() {
		return serviceLevelPendingFeesLabelLocator;
	}
	public By getApptPaymentTabLocator() {
		return apptPaymentTabLocator;
	}
	public By getPatientProfileLocator() {
		return patientProfileLocator;
	}
	public By getPatientAppointmentDetailsScreenLocator() {
		return patientAppointmentDetailsScreenLocator;
	}
	public By getAppointmentScreenLocator() {
		return appointmentScreenLocator;
	}
	public By getPatientTabLocator() {
		return patientTabLocator;
	}
	public By getAppointmentScreenMenuOptionsLocator() {
		return appointmentScreenMenuOptionsLocator;
	}
	public By getPendingCheckPointLocator() {
		return pendingCheckPointLocator;
	}
	public By getConfirmedCheckPointLocator() {
		return confirmedCheckPointLocator;
	}
	public By getReachedCheckPointLocator() {
		return reachedCheckPointLocator;
	}
	public By getSuccessCheckPointLocator() {
		return successCheckPointLocator;
	}
	public By getAppointmentExpandFabButtonLocator() {
		return appointmentExpandFabButtonLocator;
	}
	public By getFabUploadButtonLocator() {
		return fabUploadButtonLocator;
	}
	public By getFabAddAppointmentButtonLocator() {
		return fabAddAppointmentButtonLocator;
	}
	public By getFabAddCaseButtonLocator() {
		return fabAddCaseButtonLocator;
	}
	public By getFabPayButtonLocator() {
		return fabPayButtonLocator;
	}
	public By getAppointmentOptionViewVitalsLocator() {
		return appointmentOptionViewVitalsLocator;
	}
	public By getAppointmentOptionCheckVitalLocator() {
		return appointmentOptionCheckVitalLocator;
	}
	public By getAppointmentScreenPatientNameLocator() {
		return appointmentScreenPatientNameLocator;
	}
	public By getAppointmentScreenPatientAddressLocator() {
		return appointmentScreenPatientAddressLocator;
	}
	public By getAppointmentScreenPatientGenderLocator() {
		return appointmentScreenPatientGenderLocator;
	}
	public By getAppointmentScreenPatientPhoneLocator() {
		return appointmentScreenPatientPhoneLocator;
	}
	public By getAppointmentScreenPatientBrandLocator() {
		return appointmentScreenPatientBrandLocator;
	}
	public By getRelativeLayoutforPatientDetailsLocator() {
		return relativeLayoutforPatientDetailsLocator;
	}
	public By getVitalScreenMenuLocator() {
		return vitalScreenMenuLocator;
	}
	public By getListViewOptionLocator() {
		return listViewOptionLocator;
	}
	public By getGraphViewOptionLocator() {
		return graphViewOptionLocator;
	}
	public By getAppointmentTabLocator() {
		return appointmentTabLocator;
	}
	public By getAppointmentScheduleLocator() {
		return appointmentScheduleLocator;
	}
	public By getAppointmentCaseFileLocator() {
		return appointmentCaseFileLocator;
	}
	public By getAppointmentDurationLocator() {
		return appointmentDurationLocator;
	}
	public By getAppointmentServiceToBeRenderedLocator() {
		return appointmentServiceToBeRenderedLocator;
	}
	public By getAppointmentServiceTypeLocator() {
		return appointmentServiceTypeLocator;
	}
	
	public By getCheckVitalsScreenLocator() {
		return checkVitalsScreenLocator;
	}
	public By getViewVitalsScreenLocator() {
		return viewVitalsScreenLocator;
	}
	public By getAddAppointmentScreenLocator() {
		return addAppointmentScreenLocator;
	}
	public By getUploadScreenLocator() {
		return uploadScreenLocator;
	}
	public By getAddCaseScreenLocator() {
		return addCaseScreenLocator;
	}
	public By getPayScreenLocator() {
		return payScreenLocator;
	}
	
	
	public By getAuthroizePaymentButtonLocator() {
		return authroizePaymentButtonLocator;
	}
	public By getCashTabOnPayScreenLocator() {
		return cashTabOnPayScreenLocator;
	}
	public By getOnlineCheckBoxLocator() {
		return onlineCheckBoxLocator;
	}
	public By getOnlineTabOnPayScreenLocator() {
		return onlineTabOnPayScreenLocator;
	}
	public By getCashAmountTextBoxLocator() {
		return cashAmountTextBoxLocator;
	}
	public By getChequeTextBoxLocator() {
		return chequeTextBoxLocator;
	}
	public By getCashInstructionLocator() {
		return cashInstructionLocator;
	}
	public By getChequeInstructionLocator() {
		return chequeInstructionLocator;
	}
	public By getPayButtonLocator() {
		return payButtonLocator;
	}
	public By getCashCheckBoxLocator() {
		return cashCheckBoxLocator;
	}
	public By getChequeCheckBoxLocator() {
		return chequeCheckBoxLocator;
	}
	public By getChequeNotesTextBoxLocator() {
		return chequeNotesTextBoxLocator;
	}
	public By getChequeIssueBankDetailsTextBoxLocator() {
		return chequeIssueBankDetailsTextBoxLocator;
	}
	public By getChequeNoDetailsLocator() {
		return chequeNoDetailsLocator;
	}
	public By getWalletCheckBoxLocator() {
		return walletCheckBoxLocator;
	}
	public By getWalletEnterAmountTextBoxLocator() {
		return walletEnterAmountTextBoxLocator;
	}
	public By getWalletBalanceLocator() {
		return walletBalanceLocator;
	}
	public By getSendOTPLocator() {
		return sendOTPLocator;
	}
	public By getWalletInstructionLocator() {
		return walletInstructionLocator;
	}
	public By getEmailOptionsLocator() {
		return emailOptionsLocator;
	}
	public By getMobileNoTextBoxLocator() {
		return mobileNoTextBoxLocator;
	}
	public By getSendPaymentLinkLocator() {
		return sendPaymentLinkLocator;
	}
	public By getOtpAuthorizationScreenLocator() {
		return otpAuthorizationScreenLocator;
	}
	public By getNoOTPAuthroizationLocator() {
		return noOTPAuthroizationLocator;
	}
	public By getSentPaymentLinkSuccessMessage() {
		return sentPaymentLinkSuccessMessage;
	}
	public By getDocumentTypeLocator() {
		return documentTypeLocator;
	}
	public By getAppointmentStatusLocator() {
		return appointmentStatusLocator;
	}
	public By getEnterOTPLocator() {
		return enterOTPLocator;
	}
	public By getDocumentReceivedDateLocator() {
		return documentReceivedDateLocator;
	}
	//Functions
	public void onTapAllAppointmentsSpinner()
	{
		clickWhenVisible(allAppointmentsSpinnerLocator);
	}
	public void onClickUpcomingTab()
	{
		clickWhenVisible(UpcomingsAppointmentTabLocator);
		
	}
	
	public void onClickPastTab()
	{
		clickWhenVisible(PastAppointmentTabLocator);
		
	}
	
	public void onClickTodayTab()
	{
		clickWhenVisible(TodayAppointmentTabLocator);
		
	}
	
	public void onClickPatientName()
	{
		List<WebElement> patient = driver.findElements(By.id("com.healthvista.clinicianapp.stage:id/appListView"));
		patient.get(0).click();

	}
	
	public void onClickRescheduleButton()
	{
		clickWhenVisible(rescheduleAppointmentButtonLocator);
	
	}
	
	public void onClickAddAppointmentButton()
	{
		 clickWhenVisible(addAppointmentButtonLocator);
		
	}
	
	public void onClickCancelButton()
	{
		clickWhenVisible(cancelAppointmentButtonLocator);
		
	}
	
	public void onClickVerifyPatientDetailsLink()
	{
		clickWhenVisible(verifyPatientDetailsLinkLocator);
		
	}
	
	
	public void onClickConfirmButton()
	{
		clickWhenVisible(confirmAppointmentButtonLocator);
		
	}
	
	public By getYesOTPAuthroizationLocator() {
		return yesOTPAuthroizationLocator;
	}
	public By getDoneButtonForAddApptLocator() {
		return doneButtonForAddApptLocator;
	}
	public By getCurrentMonthLocator() {
		return currentMonthLocator;
	}
	
	public By getAppointmentTimeSelectWindowLocator() {
		return appointmentTimeSelectWindowLocator;
	}
	public By getSelectTimeLabelLocator() {
		return selectTimeLabelLocator;
	}
	public By getSelectTimeLocator() {
		return selectTimeLocator;
	}
	public By getCancelButtonAddAppointmentLocator() {
		return cancelButtonAddAppointmentLocator;
	}
	public By getDocumentTitleLocator() {
		return documentTitleLocator;
	}
	public By getAddButtonLocator() {
		return addButtonLocator;
	}
	public By getShowCasesLocator() {
		return showCasesLocator;
	}
	public By getCaseNameLocator() {
		return caseNameLocator;
	}
	public By getAddCaseButtonLocator() {
		return addCaseButtonLocator;
	}
	public By getListOfCasesLocator() {
		return listOfCasesLocator;
	}
	public By getCaseFilePopUpNoButtonLocator() {
		return caseFilePopUpNoButtonLocator;
	}
	public By getCaseFilePopUpYesButtonLocator() {
		return caseFilePopUpYesButtonLocator;
	}
	public By getCaseFilePopUpWindowLocator() {
		return caseFilePopUpWindowLocator;
	}
	public By getPhysioAppLocator() {
		return physioAppLocator;
	}
	public void selectDate()
	{
		clickWhenVisible(selectDateLocator);
		
	}
	public void onTapFabButton()
	{
		clickWhenVisible(appointmentExpandFabButtonLocator);
	
	}
	
	public void onTapUploadButton()
	{
		 clickWhenVisible(fabUploadButtonLocator);
	
	}
	
	public void onTapAddCaseButton()
	{
		clickWhenVisible(fabAddCaseButtonLocator);
		
	}
	
	public void onTapAddAppointmentButton()
	{
		clickWhenVisible(fabAddAppointmentButtonLocator);
	
	}
	
	public void onTapPayButton()
	{
		clickWhenVisible(fabPayButtonLocator);
		
	}
	
	public void onTapAppointmentsTab()
	{
	clickWhenVisible(appointmentTabLocator);
	
	}
	
	public void onTapPaymentTab()
	{
		clickWhenVisible(apptPaymentTabLocator);
		
	}
	
	
	public void onTabappointmentScreenMenuOptions()
	{
		WebElement tab = clickWhenVisible(appointmentScreenMenuOptionsLocator);
		tab.clear();
	}
	
	public void onTapViewVitalsOptions()
	{
		clickWhenVisible(appointmentOptionViewVitalsLocator);
		
	}
	
	public void onTapCheckVitalsOption()
	{
		clickWhenVisible(appointmentOptionCheckVitalLocator);
		
	}
	
	public void onTapPatienframe()
	{
		clickWhenVisible(patientAppointmentDetailsScreenLocator);
		
	}

	public void onTapApptScreenMenubutton()
	{
		clickWhenVisible(appointmentScreenMenuOptionsLocator);
		
	}
	
	public void onTapFabButtonAddAppointment()
	{
     clickWhenVisible(fabAddAppointmentButtonLocator);
		
	}
	
	public void onTapFabButtonAddCase()
	{
		
     clickWhenVisible(fabAddCaseButtonLocator);
	
	}
	public void onTapFabButtonUpload()
	{
		clickWhenVisible(fabUploadButtonLocator);
		
	}
	
	public void enterChequeAmount()
	{
		WebElement txt = clickWhenVisible(chequeTextBoxLocator);
		txt.sendKeys("1");
	}
	
	public void enterWalletAmount()
	{
		WebElement txt = clickWhenVisible(walletEnterAmountTextBoxLocator);
		txt.sendKeys("1");
	}
	
	public void enterOnlineAmount()
	{
		WebElement txt = clickWhenVisible(onlineCheckBoxLocator);
		txt.sendKeys("1");
	}
	
	public void onTapFabButtonPay()
	{
//		WebElement status = driver.findElement(appointmentStatusLocator);
//		switch(status.getText())
//				{
//					case Successful:
//						clickWhenVisible(fabPayButtonLocator);
//						break;
//					case Pending:
//						clickWhenVisible(confirmAppointmentButtonLocator);
//						clickWhenVisible(reachedButtonLocator);
//						clickWhenVisible(successButtonLocator);
//						break;
//					case Confirmed:
//						clickWhenVisible(reachedButtonLocator);
//						clickWhenVisible(successButtonLocator);
//						break;
//					default:
//						break;
//						
//				}
			
		if (appointmentStatusLocator.equals("confirmed"))
			{
			     clickWhenVisible(reachedButtonLocator);
			     GlobalUtil.wait(1);
			     clickWhenVisible(successButtonLocator);
			}else
				if(appointmentStatusLocator.equals("Pending"))
			{
					clickWhenVisible(confirmAppointmentButtonLocator);
					 clickWhenVisible(reachedButtonLocator);
				     GlobalUtil.wait(1);
				     clickWhenVisible(successButtonLocator);
			}
			else
			{
				clickWhenVisible(fabPayButtonLocator);
			}
	}
	
	public void payByCash()
	{
		WebElement txt = clickWhenVisible(cashAmountTextBoxLocator);
		txt.sendKeys("1");
		GlobalUtil.wait(1);
		clickWhenVisible(payButtonLocator);
		
	}
	
	public void payByCheque()
	{
		WebElement txt = clickWhenVisible(chequeTextBoxLocator);
		txt.sendKeys("1");
		GlobalUtil.wait(1);
		clickWhenVisible(payButtonLocator);
		
	}
	
	public void onTapOnlinePaymentsTab()
	{
		clickWhenVisible(onlineTabOnPayScreenLocator);
		
	}
	
	public void payByWallet(String otp)
	{
		WebElement txt = clickWhenVisible(walletEnterAmountTextBoxLocator);
		txt.sendKeys("1");
		GlobalUtil.wait(1);
		clickWhenVisible(sendOTPLocator);
		WebElement enterOTP = clickWhenVisible(enterOTPLocator);
		enterOTP.sendKeys(otp);
		clickWhenVisible(authroizePaymentButtonLocator);
		
	}
	
	public void otpDetails()
	{
		WebElement txt = clickWhenVisible(walletEnterAmountTextBoxLocator);
		txt.sendKeys("1");
		GlobalUtil.wait(1);
		clickWhenVisible(sendOTPLocator);
		
	}
	
	public void payByOnline(String email, String mobileNo)
	{
		WebElement txt = clickWhenVisible(emailOptionsLocator);
		txt.sendKeys(email);
		GlobalUtil.wait(1);
		WebElement mobile = clickWhenVisible(mobileNoTextBoxLocator);
		mobile.sendKeys(mobileNo);
		GlobalUtil.wait(1);
		clickWhenVisible(sendPaymentLinkLocator);
		
	}
	
	public void getCurrentMonthCalendar()
	{
		 Calendar cal = Calendar.getInstance();
		 System.out.println(String.valueOf(cal.get(Calendar.YEAR)));
		 String.valueOf(cal.get(Calendar.YEAR)).equalsIgnoreCase("2016");
		
	}
	
	public By getDocumentNotesLocator() {
		return documentNotesLocator;
	}
	public By getReachedButtonLocator() {
		return reachedButtonLocator;
	}
	public By getRescheduleButtonLocator() {
		return rescheduleButtonLocator;
	}
	public By getDocumentClearButtonLocator() {
		return documentClearButtonLocator;
	}
	public By getListViewForAppointmentSpinnerLocator() {
		return listViewForAppointmentSpinnerLocator;
	}
	public By getAddAppointmentLocator() {
		return addAppointmentLocator;
	}
	public By getRescheduleAppointmentScreenLocator() {
		return rescheduleAppointmentScreenLocator;
	}
	public By getCallToCancelLocator() {
		return callToCancelLocator;
	}
	public By getDocumentNextButtonLocator() {
		return documentNextButtonLocator;
	}
	
	
	public void addAppointment(String no)
	{
		WebElement date = clickWhenVisible(dateLocator);
		date.sendKeys(no);
		driver.switchTo().alert();
		//window("com.healthvista.clinicianapp.stage:id/alertTitle");
		List<WebElement> listsDropDown = driver.findElements(selectTimeLocator);
        
		for (WebElement listdropdown : listsDropDown) 
		{
        String list = listdropdown.getText();
        if (list.equals("11:30 am")) 
        {
            listdropdown.click();
            break;
        }
		}
		clickWhenVisible(addAppointmentButtonLocator);
		
//		WebElement cost = clickWhenVisible("");
//		cost.sendKeys("1");
//		WebElement duration = clickWhenVisible(by);
//		duration.sendKeys("60");
//		WebElement notes = clickWhenVisible(by.name("Notes"));
//		notes.sendKeys("test");
		clickWhenVisible(addAppointmentButtonLocator);
		
	    
	}
	
	public void onTapAddCaseButtonOnCaseScreen()
	{
		clickWhenVisible(addCaseButtonLocator);
		
	}
	
	public void onTapYesButtonToAddCaseFile()
	{
		clickWhenVisible(caseFilePopUpYesButtonLocator);
		
	}
	
	public void onTapNoBtnOnCaseScreen()
	{
		clickWhenVisible(caseFilePopUpNoButtonLocator);
	    
	}
	
	public void onClickConfirmedAppointment()
	
	{
		
		if (appointmentStatusLocator.equals("Confirmed"))
		{
			onTapPatienframe();
		}
		else
			System.out.println("No Confirmed appointments are available");
	}
	
public void onClickPendingAppointment()
	
	{
		
		if (appointmentStatusLocator.equals("Pending"))
		{
			onTapPatienframe();
		}
		else
			System.out.println("No Pending appointments are available");
	}

    public void onTapConfirmFabButton()
    {
    	clickWhenVisible(confirmAppointmentButtonLocator);
    	
	}
	
    public void onTapReachedFabButton()
    {
    	clickWhenVisible(reachedButtonLocator);
    	
	}
    
    public void getClosedAppointmentOption()
    {
    	List<WebElement> appt =driver.findElements(allAppointmentsSpinnerLocator);
    	appt.get(2).click();
    }

    public void getOpenAppointmentOption()
    {
    	@SuppressWarnings("unchecked")
		List<WebElement> appt = driver.findElements(allAppointmentsSpinnerLocator);
    	appt.get(1).click();
    }
     public void viewAllAppointmentOption()
     {
    	 @SuppressWarnings("unchecked")
		List <WebElement> view = (List<WebElement>) driver.findElements(listViewForAppointmentSpinnerLocator);
    	 view.get(0);
     }
     
     public void viewOpenAppointmentOption()
     {
    	 @SuppressWarnings("unchecked")
		List <WebElement> view = driver.findElements(listViewForAppointmentSpinnerLocator);
    	 view.get(1);
     }
     public void viewClosedAppointmentOption()
     {
    	 @SuppressWarnings("unchecked")
		List <WebElement> view = driver.findElements(listViewForAppointmentSpinnerLocator);
    	 view.get(2);
     }
    
    public void getAllAppointmentOption()
    {
    	List<WebElement> appt = driver.findElements(allAppointmentsSpinnerLocator);
    	appt.get(0).click();
    }
    public void currentDate()
    {

    	Calendar futureCal = Calendar.getInstance();
    	 futureCal.set(2016, 05, 28);
    	Calendar now = Calendar.getInstance();
    	now.getTime();
    	
    {
    	
    }

    }
	
}
	

