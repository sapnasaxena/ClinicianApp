package com.qa.mobileapp.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.text.DateFormatter;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
	private final By rescheduleAppointmentButtonLocator = By.name("Reschedule");
	private final By addAppointmentButtonLocator = By.name("Add Appointment");
	private final By verifyPatientDetailsLinkLocator = By.id("");
	private final By cancelAppointmentButtonLocator = By.name("Call to cancel");
	private final By confirmAppointmentButtonLocator = By.name("Confirm");
	private final By selectDateLocator = By.id("");
	private final By addNoteFieldLocator = By.id("");
	private final By allAppointmentsSpinnerLocator = By.name("All Appointments");
	private final By addAppointmentScreenLocator = By.name("Add Appointment");
	private final By errorAddDuplicateApptLocator = By.name("Error");
	private final By uploadScreenLocator=By.name(" Add Document");
	private final By addCaseScreenLocator = By.name("Case Details");
	private final By payScreenLocator = By.name("Balance");
	private final By cashTabOnPayScreenLocator = By.name("Cash Payments");
	private final By onlineTabOnPayScreenLocator = By.name("Online Link");
	private final By paymentBalanceLocator = By.name("Balance");
	private final By cashCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbCash");
	private final By paytmCheckBoxLocator = By.id("PayTM");
	private final By chequeCheckBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/cbCheque");
	private final By cashAmountTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etCash");
	private final By chequeTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etCheque");
	private final By cashInstructionLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCashInst");
	private final By chequeInstructionLocator = By.id("com.healthvista.clinicianapp.stage:id/tvChequeInst");
	private final By payButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bPay");
	private final By chequeNotesTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/tilPayNotes");
	private final By chequeIssueBankDetailsTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etChequeBank");
	private final By chequeNoDetailsLocator = By.id("com.healthvista.clinicianapp.stage:id/etChequeNo");
	private final By apptCalDateLocator = By.xpath("//android.widget.ImageView[contains(@id,'com.healthvista.clinicianapp.stage:id/imageView1')]");
	private final By loadMoreButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bLoadMore");
			//By.name("Load More");

	private final By walletCheckBoxLocator =By.id("com.healthvista.clinicianapp.stage:id/cbWallet");
	private final By walletEnterAmountTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etWallet");
	private final By walletBalanceLocator = By.id("com.healthvista.clinicianapp.stage:id/tvWalletBalance");
	private final By sendOTPLocator = By.id("com.healthvista.clinicianapp.stage:id/bSendOTP");
	private final By walletInstructionLocator = By.id("com.healthvista.clinicianapp.stage:id/tvWalletInst");
	private final By emailOptionsLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnlineEmail");
	private final By mobileNoTextBoxLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnlineMobile");
	private final By sendPaymentLinkLocator = By.id("com.healthvista.clinicianapp.stage:id/bSendLink");
	private final By onlineCheckBoxLocator = By.name("Online Link");
			//By.id("com.healthvista.clinicianapp.stage:id/cbOnline");

	//xpath for on click on any Patient's appointment
	private final By patientAppointmentDetailsScreenLocator = By.className("android.widget.RelativeLayout");
	private final By appointmentStatusLocator = By.id("com.healthvista.clinicianapp.stage:id/statusName");
	private final By pendingStatusLocator = By.name("Status:pending");
	private final By patientTabLocator = By.name("PATIENT");
	private final By patientProfileLocator = By.id("com.healthvista.clinicianapp.stage:id/llProfile");
	private final By appointmentScreenMenuOptionsLocator = By.id("com.healthvista.clinicianapp.stage:id/edit");
	private final By pendingCheckPointLocator =By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointPending");
	private final By confirmedCheckPointLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointConfirmed");
	private final By reachedCheckPointLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointReached");
	private final By successCheckPointLocator = By.id("com.healthvista.clinicianapp.stage:id/tvCheckpointSuccessful");
	private final By appointmentExpandFabButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/fab_expand_menu_button");
	private final By fabUploadButtonLocator =By.name("Upload");
	private final By fabAddCaseButtonLocator = By.name("Case files");
	private final By fabAddAppointmentButtonLocator = By.name("Add appointment");
	//By.id("com.healthvista.clinicianapp.stage:id/newAppointmentFab");
	private final By fabPayButtonLocator = By.name("Pay");
			//By.xpath("//android.view.View[contains(@text,'Pay')]");
	private final By proceedButtonLocator = By.name("Proceed");
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
	private final By selectTimeLocator = By.className("android.widget.Spinner");
	private final By cancelButtonAddAppointmentLocator = By.name("Cancel");
	private final By addButtonLocator = By.name("Add Appointment");
    private final By addedSubServiceNameLocator = By.id("com.healthvista.clinicianapp.stage:id/subServiceName");
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
	private final By OpenRecentFolderLocator =By.name("Open from");

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
	private final By patientListLocator = By.className("android.widget.ListView");
	private final By appointmentListingLocator = By.id("com.healthvista.clinicianapp.stage:id/appListView");

	//xpath for Payments
	private final By apptPaymentTabLocator = By.name("PAYMENT"); 
	private final By reachedFabButtonLocator = By.name("Reached");
	private final By successfulFabButtonLocator = By.name("Successfull");
	private final By denySelectReasonScreenLocator = By.name("Select Reason");
	public By getDenySelectReasonLocator()
	{
		return denySelectReasonScreenLocator;
	}
	private final By saveLocator = By.name("Save");
	private final By denyFabButtonLocator = By.name("Deny");
	private final By denyPastApptScreenLocator = By.name("Can't deny");
	public By getDenyPastApptScreenLocator()
	{
		return denyPastApptScreenLocator;
	}
	private final By cantDenyCallWFMLocator = By.name("Call WFM");
	public By getCantDenyCallWFMLocator()
	{
		return cantDenyCallWFMLocator;
	}
	private final By cantdenyOkButtonLocator = By.name("Ok");
	public By getCantDenyOkButtonLocator()
	{
		return cantdenyOkButtonLocator;
	}
	
	private final By serviceLevelPendingFeesLabelLocator = By.name("Service level pending fees");
	private final By serviceLevelPendingFeesValueLocator = By.id("");
	private final By packageFeesLabelLocator = By.name("Package Fees");
	private final By packageFeesValueLocator = By.id("");
	private final By amountPaidLabelLocator = By.name("Amount Paid");
	private final By amountPaidValueLocator = By.id("");
	private final By balanceLabelLocator = By.name("Balance");
	private final By balanceValueLocator = By.xpath("//android.widget.TextView[contains(@text,'Balance: ₹ 1835')]");
	private final By walletBalanceLabelLocator = By.name("Wallet Balance");
	private final By walletBalanceValueLocator = By.id("com.healthvista.clinicianapp.stage:id/tvWalletBalance");
	private final By otpAuthorizationScreenLocator = By.id("android:id/alertTitle");
	private final By yesOTPAuthroizationLocator = By.name("YES");
	private final By noOTPAuthroizationLocator = By.name("NO");
	private final By enterOTPLocator = By.id("com.healthvista.clinicianapp.stage:id/etWalletOTPValidate");
	private final By authroizePaymentButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/bVertifyOTP");
	private final By sentPaymentLinkSuccessMessage = By.name("payment link is being sent");
	private final By netBalanceLocatorOnPaymentScreen = By.id("com.healthvista.clinicianapp.stage:id/tvNetBalanceAmount");
	private final By walletBalanceLocatorOnPaymentScreen= By.id(" com.healthvista.clinicianapp.stage:id/tvwalletBalance");
	private final By serviceBalanceLocatorOnPaymentScreen = By.id("com.healthvista.clinicianapp.stage:id/tvServiceBalanceAmount");
	private final By serviceFeesLocatorOnPaymentScreen = By.id("com.healthvista.clinicianapp.stage:id/package_service_feesTv");
	private final By onlineEnterAmountLocator = By.id("com.healthvista.clinicianapp.stage:id/etOnline");
	//private final By cashEnterAmountLocator = By.id("com.healthvista.clinicianapp.stage:id/etCash");
	private final By paymentHistoryLabelLocator =By.name("Payment History");
	private final By paymentHistoryLocator = By.id("com.healthvista.clinicianapp.stage:id/tvPayHistory");


	//xpath for subservice

	private final By fabButtonAddSubserviceLocator = By.name("SUB SERVICES");
	private final By subServiceScreenLocator = By.name("Sub-Service");
	private final By addNewSubserviceButtonLocator = By.name("Add new service");
	private final By subServiceName= By.id("com.healthvista.clinicianapp.stage:id/subServiceName");
	private final By subServicePrice=By.id("com.healthvista.clinicianapp.stage:id/subServicePrice");
	private final By selectSubServiceButtonLocator=By.id("com.healthvista.clinicianapp.stage:id/ibSubServiceAction");
			//By.id("com.healthvista.clinicianapp.stage:id/subServiceState");
	private final By saveSubServiceLocator = By.name("Done");
	//By.id("com.healthvista.clinicianapp.stage:id/DoneButton");
	private final By searchTextBoxLocator = By.id("id/search_src_text");
	private final By searchBoxImageLocator = By.name("Search Here");


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
	public By getDenyFabButtonLocator()
	{
		return denyFabButtonLocator;
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
	public By getApptCalDateLocator() {
		return apptCalDateLocator;
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

	@SuppressWarnings("all")
	public void onClickPatientName(String status) throws NoSuchFieldException, SecurityException
	{
		List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'Status : " + status + "')]/parent::*/child::android.widget.TextView"));
		if(elements.size() > 0){
			elements.get(0).click();
		}else{
			WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Status : ')]/parent::*"));
			int x = ele.getSize().height;
			int scrollStart = (x);
			int scrollEnd = scrollStart;
			Dimension dimensions = driver.manage().window().getSize();
			int totalScrolls = 0;
			int[] oldValues = null;
			int i = 0;
			while(true && i < 30){
				++i;  
				driver.swipe(0, scrollStart, 0, scrollEnd/3, 1000);    
				//scrollEnd += scrollEnd;
				scrollStart = x + scrollEnd;
				List<WebElement>eles = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'Status : ')]"));
				//No more scrolling if the element is found.
				boolean bFound = false;
				int m = 0;
				for(;m < eles.size(); m++){
					if(eles.get(m).getAttribute("text").contains(status)){
						bFound = true;
						break;
					}
				}
				if(bFound){
					eles.get(m).click();
					break;
				}
				if(oldValues == null){
					oldValues = new int[eles.size()];
					for(int n = 0; n < oldValues.length; n++){
						oldValues[n] = eles.get(n).getLocation().y;
					}
				}else{
					int[] newValues = new int[eles.size()];
					for(int n = 0; n < newValues.length; n++){
						newValues[n] = eles.get(n).getLocation().y;
					}
					if(newValues.length != oldValues.length){
						oldValues = newValues;
						continue;
					}
					else{
						bFound = true;
						for(int n = 0; n < oldValues.length; n++){
							if(oldValues[n] != newValues[n]){
								bFound = false;
								break;
							}
						}
						if(bFound)
							break;
						oldValues = newValues;
					}
				}
			}
		}


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
	public void selectDate(String num)
	{
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" +num+"')]"));
		ele.click();

	}

	public void postponeAppt(String time)
	{
		WebElement spin = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/timeSpinner"));
		spin.click();
		driver.scrollToExact(time).click();
		GlobalUtil.wait(2);
		WebElement btn = driver.findElement(By.name("Postpone Appointment"));
		btn.click();
		WebElement done = driver.findElement(doneButtonForAddApptLocator);
		done.click();
		WebElement notes = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/notesText"));
		notes.sendKeys("test");
		GlobalUtil.wait(1);
		btn.click();
	}

	public void onTapFabButton()
	{
//		if(driver.findElement(By.name("Got It")).isDisplayed())
//			{
//			driver.findElement(By.name("Got It")).click();
//			}
//					GlobalUtil.wait(2);
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

	public void onTapPatienframe() throws NoSuchFieldException, SecurityException
	{
		//		List<WebElement> list = driver.findElementsByClassName("android.widget.ListView");
		//		list.get(1).click();
		List<WebElement> patient = driver.findElementsByClassName("android.widget.RelativeLayout");
		for(int i=0;i<patient.size();i++)
		{
			if(patient.get(i).getText().equals("Status:confirmed"))
			{
				patient.get(i).click();
				//clickWhenVisible(patientAppointmentDetailsScreenLocator);
			}
		}

	}

	public void onTapApptScreenMenubutton()
	{
		clickWhenVisible(appointmentScreenMenuOptionsLocator);

	}

	public void onTapFabButtonAddAppointment()
	{
		WebElement ele = driver.findElement(fabAddAppointmentButtonLocator);
		ele.click();

	}

	public void onTapFabButtonAddCase()
	{

		clickWhenVisible(fabAddCaseButtonLocator);

	}
	public void onTapFabButtonUpload()
	{
		clickWhenVisible(fabUploadButtonLocator);

	}

	public void onTapFabButtonSubservices()
	{
		clickWhenVisible(fabButtonAddSubserviceLocator);

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
		WebElement ele = driver.findElement(fabPayButtonLocator);
		ele.click();
//		GlobalUtil.wait(2);
//		driver.findElement(By.name("Got It")).click();
		
		//clickWhenVisible(fabPayButtonLocator);
		
//		if (appointmentStatusLocator.equals("confirmed"))
//		{
//			clickWhenVisible(reachedButtonLocator);
//			GlobalUtil.wait(1);
//			clickWhenVisible(successButtonLocator);
//		}else
//			if(appointmentStatusLocator.equals("Pending"))
//			{
//				clickWhenVisible(confirmAppointmentButtonLocator);
//				clickWhenVisible(reachedButtonLocator);
//				GlobalUtil.wait(1);
//				clickWhenVisible(successButtonLocator);
//			}
//			else
//			{
//				clickWhenVisible(fabPayButtonLocator);
//			}
	}
	
	public void editAmountForPayment()
	{
		WebElement ele = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/etPayAmount"));
		ele.clear();
		GlobalUtil.wait(2);
		ele.sendKeys("1");
	}

	public void payByCash()
	{
//		if(driver.findElement(By.name("Got It")).isDisplayed())
//		{
//		driver.findElement(By.name("Got it")).click();
//		}
		GlobalUtil.wait(2);
		WebElement txt = clickWhenVisible(cashCheckBoxLocator);
		//txt.sendKeys("1");
		GlobalUtil.wait(1);
		clickWhenVisible(payButtonLocator);

	}

	public void payByPaytm()
	{
//		if(driver.findElement(By.name("Got It")).isDisplayed())
//		{
//		driver.findElement(By.name("Got it")).click();
//		}
		GlobalUtil.wait(2);
		WebElement txt = clickWhenVisible(paytmCheckBoxLocator);
		//txt.sendKeys("1");
		GlobalUtil.wait(1);
		clickWhenVisible(payButtonLocator);

	}
	public void balancePayment()
	{
		List<WebElement> ele = driver.findElements(By.className("android.view.View"));
		String balance= ele.get(1).getText();
		System.out.println("Balance amount before payment:" +balance);
	}

	public void BalanceAfterPayment()
	{
		WebElement  ele = driver.findElement(serviceBalanceLocatorOnPaymentScreen);
		ele.getText();
		List<WebElement> pay = driver.findElements(By.className("android.view.View"));
		pay.get(1).getText();
		if (ele.getText().equals(pay.get(1).getText()))
		{
			System.out.println("");
		}
	}

	public void payByCheque(String bankName, String chequeNo )
	{
     
		WebElement bank = clickWhenVisible(chequeIssueBankDetailsTextBoxLocator);
		bank.sendKeys(bankName);
		GlobalUtil.wait(2);
		WebElement chequeno = clickWhenVisible(chequeNoDetailsLocator);
		GlobalUtil.wait(2);
		chequeno.sendKeys(chequeNo);
		GlobalUtil.wait(2);
		clickWhenVisible(payButtonLocator);

	}

	public void onTapOnlinePaymentsTab()
	{
		clickWhenVisible(onlineTabOnPayScreenLocator);

	}

	public void payByWallet(String num, String otp)
	{
		clickWhenVisible(By.name("Got It"));
		GlobalUtil.wait(1);
		clickWhenVisible(onlineTabOnPayScreenLocator);
		GlobalUtil.wait(1);
		WebElement txt = clickWhenVisible(walletEnterAmountTextBoxLocator);
		txt.sendKeys(num);
		GlobalUtil.wait(1);
		if(walletBalanceLocator.equals(num))
		{
		clickWhenVisible(sendOTPLocator);
		WebElement enterOTP = clickWhenVisible(enterOTPLocator);
		enterOTP.sendKeys(otp);
		clickWhenVisible(authroizePaymentButtonLocator);
		}
		else
			System.out.println("The wallet balance is less that amount to be paid");

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
	    WebElement onlineLink = driver.findElement(onlineCheckBoxLocator);
	    onlineLink.click();
	    GlobalUtil.wait(2);
		WebElement txt = clickWhenVisible(emailOptionsLocator);
		txt.clear();
		txt.sendKeys(email);
		GlobalUtil.wait(1);
		WebElement mobile = clickWhenVisible(mobileNoTextBoxLocator);
		mobile.clear();
		mobile.sendKeys(mobileNo);
		GlobalUtil.wait(2);
		clickWhenVisible(payButtonLocator);

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
	public By getFabButtonAddSubserviceLocator() {
		return fabButtonAddSubserviceLocator;
	}
	public By getSaveSubServiceLocator() {
		return saveSubServiceLocator;
	}
	public By getSubServicePrice() {
		return subServicePrice;
	}
	public By getSearchTextBoxLocator() {
		return searchTextBoxLocator;
	}
	public By getCallToCancelLocator() {
		return callToCancelLocator;
	}
	public By getDocumentNextButtonLocator() {
		return documentNextButtonLocator;
	}


	public By getSubServiceScreenLocator() {
		return subServiceScreenLocator;
	}
	public void addAppointment(String time)
	{
		WebElement spin = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/timeSpinner"));
		spin.click();
		driver.scrollToExact(time).click();
		GlobalUtil.wait(2);
		clickWhenVisible(addAppointmentButtonLocator);
		GlobalUtil.wait(2);
		driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/checkbutton")).click();
		GlobalUtil.wait(2);
		driver.findElement(By.name("Add New Appointment")).click();

	}
	
	public void selectDateWithAppointment()
	{
//		WebElement appointmentDate = null;
//		String calendarBlocksLocator = "//android.widget.TextView[@text='" + 
//		String.valueOf(GlobalUtil.getCurrentDate()) + "']/..//following-sibling::android.widget.RelativeLayout";
//		@SuppressWarnings("unchecked")
//		List<WebElement> calendarBlocks = driver.findElements(By.xpath(calendarBlocksLocator));
//		for(int i = 1; i <= calendarBlocks.size(); i++){
//			List<WebElement> calendarBlockElements = driver.findElements(By.xpath(calendarBlocksLocator+"[" + i + "]/child::android.widget.TextView"));
//			if(calendarBlockElements.size() == 0){
	
		WebElement sel = driver.findElement(apptCalDateLocator);
		sel.click();
		WebElement txt = driver.findElement(By.xpath("//android.widget.TextView[contains(@id,'com.healthvista.clinicianapp.stage:id/title2')]"));
		String alreadyAptDate = txt.getText();
		addAppointment(alreadyAptDate);
	
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

	public void onClickConfirmedAppointment() throws NoSuchFieldException, SecurityException

	{

		if (appointmentStatusLocator.equals("Confirmed"))
		{
			onTapPatienframe();
		}
		else
			System.out.println("No Confirmed appointments are available");
	}

	public void onClickPendingAppointment() throws NoSuchFieldException, SecurityException
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

	public void onTapSuccessFabButton()
	{

		clickWhenVisible(successfulFabButtonLocator);

	}

	public void getClosedAppointmentOption()
	{
		List<WebElement> appt =driver.findElements(allAppointmentsSpinnerLocator);
		appt.get(2).click();
	}

	public By getSearchBoxImageLocator() {
		return searchBoxImageLocator;
	}
	public By getServiceFeesLocatorOnPaymentScreen() {
		return serviceFeesLocatorOnPaymentScreen;
	}
	public By getReachedFabButtonLocator() {
		return reachedFabButtonLocator;
	}
	public By getAddedSubServiceNameLocator() {
		return addedSubServiceNameLocator;
	}
	public By getAppointmentListingLocator() {
		return appointmentListingLocator;
	}
	public By getServiceBalanceLocatorOnPaymentScreen() {
		return serviceBalanceLocatorOnPaymentScreen;
	}
	public By getNetBalanceLocatorOnPaymentScreen() {
		return netBalanceLocatorOnPaymentScreen;
	}
	public By getWalletBalanceLocatorOnPaymentScreen() {
		return walletBalanceLocatorOnPaymentScreen;
	}
	public By getOpenRecentFolderLocator() {
		return OpenRecentFolderLocator;
	}
	public By getSelectSubServiceButtonLocator() {
		return selectSubServiceButtonLocator;
	}
	public By getProceedButtonLocator() {
		return proceedButtonLocator;
	}
	public void getOpenAppointmentOption()
	{
		@SuppressWarnings("unchecked")
		List<WebElement> appt = driver.findElements(allAppointmentsSpinnerLocator);
		appt.get(1).click();
	}
	public By getPatientListLocator() {
		return patientListLocator;
	}
	public By getSubServiceName() {
		return subServiceName;
	}
	public By getSuccessfulFabButtonLocator() {
		return successfulFabButtonLocator;
	}
	public By getLoadMoreButtonLocator() {
		return loadMoreButtonLocator;
	}
	public void viewAllAppointmentOption()
	{
		@SuppressWarnings("unchecked")
		List <WebElement> view = driver.findElements(listViewForAppointmentSpinnerLocator);
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
	public By getErrorAddDuplicateApptLocator() {
		return errorAddDuplicateApptLocator;
	}
	public void currentDate()
	{

		Calendar futureCal = Calendar.getInstance();
		futureCal.set(2016, 05, 28);
		Calendar now = Calendar.getInstance();
		now.getTime();
	}



	public void addAppointmentAccordingToPackage()
	{

	}
	public void addService()
	{

	}

	public void addCaseFile()
	{

	}

	public void uploadDocument(String title, String month, String day, String year, String notes)
	{
		WebElement ele = clickWhenVisible(documentTitleLocator);
		GlobalUtil.wait(1);
		ele.sendKeys(title);
		clickWhenVisible(documentReceivedDateLocator);
		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(month);
		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(day);
		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(year);
		clickWhenVisible(By.name("Continue"));
		driver.findElement(documentNotesLocator).sendKeys(notes);
		clickWhenVisible(By.name("Next"));

	}

	public void onTapLoadMoreButton()
	{
		WebElement btn = driver.findElement(loadMoreButtonLocator);
		GlobalUtil.wait(1);
		btn.click();
		//clickWhenVisible(loadMoreButtonLocator);
	}
	
	

	public void paySendPaymentLink()
	{
		WebElement tab = driver.findElement(onlineTabOnPayScreenLocator);
		tab.click();
		WebElement online = driver.findElement(onlineCheckBoxLocator);
		online.sendKeys("1");
		WebElement sendLink = driver.findElement(sendPaymentLinkLocator);
		sendLink.click();

	}

	public void addSubService(String subService)
	{

		WebElement element = waitVisible(addNewSubserviceButtonLocator);
		System.out.println("Add New Sub service button found");
		element.click();
		GlobalUtil.wait(2);
		if(null != verticalScroll("Rs.", By.name(subService), 25)){
			//The text element is found. Now we need to find corresponding Add Image View
			element = waitVisible(By.xpath("//android.widget.TextView[contains(@text,'" + subService + "')]/parent::*"));
			List<WebElement>elements = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'" + subService + "')]/parent::*/child::android.widget.ImageButton"));
			if(elements.size() > 0)
				elements.get(0).click();
		}
		GlobalUtil.wait(1);
		WebElement sub = driver.findElement(selectSubServiceButtonLocator);
				//driver.findElement(By.id("subServiceState"));
		GlobalUtil.wait(1);
		sub.click();
		WebElement done = driver.findElement(By.name("Done"));
		done.click();
		GlobalUtil.wait(1);
		WebElement checkBtn = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/checkbutton"));
		checkBtn.click();
		GlobalUtil.wait(1);
		WebElement fabButton = waitVisible(fabButtonAddSubserviceLocator);
		fabButton.click();
	}

	public void onTapAppointmentTab()
	{
		clickWhenVisible(appointmentTabLocator);
	}
	
	public void onTapAppointmentsPaymentTab()
	{
		clickWhenVisible(apptPaymentTabLocator);
	}

	public WebElement verticalScroll(String textFieldValue, By scrollTo, int maxScroll)
	{

		List<WebElement> elements = driver.findElements(scrollTo);
		if(elements.size() > 0){
			return elements.get(0);
		}else{
			WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + textFieldValue + "')]/parent::*"));
			int x = ele.getSize().height;
			int scrollStart = (x);
			int scrollEnd = scrollStart;
			Dimension dimensions = driver.manage().window().getSize();
			int[] oldValues = null;
			int i = 0;
			//scrolls a maximum of maxScroll times.
			while(i < maxScroll){
				++i;  
				driver.swipe(0, scrollStart, 0, scrollEnd/3, 1000);    
				//scrollEnd += scrollEnd;
				scrollStart = x + scrollEnd;
				elements = driver.findElements(scrollTo);
				//No more scrolling if the element is found.
				if(elements.size() > 0){
					return elements.get(0);
				}				
			}
		}
		return null;
	}


	public WebElement getFreeDateForAppointment(String currentAppointmentDate, boolean checkInNextMonth)
	{
		WebElement appointmentDate = null;
		String[] daySplit = currentAppointmentDate.split("-");
		if(daySplit[2].startsWith("0")){
			daySplit[2] = daySplit[2].substring(1);
		}
		String calendarBlocksLocator = "//android.widget.TextView[@text='" + 
					String.valueOf(daySplit[2]) + "']/..//following-sibling::android.widget.RelativeLayout";
		@SuppressWarnings("unchecked")
		List<WebElement> calendarBlocks = driver.findElements(By.xpath(calendarBlocksLocator));
		
		
		for(int i = 1; i <= calendarBlocks.size(); i++){
			List<WebElement> calendarBlockElements = driver.findElements(By.xpath(calendarBlocksLocator+"[" + i + "]/child::android.widget.ImageView"));
			if(calendarBlockElements.size() == 0){
				return calendarBlocks.get(i-1);
			}
		}
		if(checkInNextMonth){
			//ToDo:click to open next month
			try{
				driver.findElement(By.xpath("//android.widget.TextView[@text='" + daySplit[1] + " " + daySplit[0] + "']/following-sibling::android.widget.ImageView")).click();
				}
				catch(NoSuchElementException e)
				{
					driver.findElement(By.xpath("//android.widget.TextView[@text='January']/following-sibling::android.widget.ImageView")).click();
				}
			try{
				Date date = new SimpleDateFormat("yyyy-MMMM-dd").parse(currentAppointmentDate);
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				cal.add(Calendar.MONTH, 1);
				cal.set(Calendar.DATE, 1);
				String newDate = new SimpleDateFormat("yyyy-MMMM-dd").format(cal.getTime());
				return getFreeDateForAppointment(newDate, false);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return appointmentDate;
	}
	public By getPendingStatusLocator() {
		return pendingStatusLocator;
	}
	public By getPaymentHistoryLocator() {
		return paymentHistoryLocator;
	}
	public By getPaymentHistoryLabelLocator() {
		return paymentHistoryLabelLocator;
	}

	public By getPaytmCheckBoxLocator() {
		return paytmCheckBoxLocator;
	}
	public void onClickDenyFabButton()
	{
		WebElement ele = driver.findElement(denyFabButtonLocator);
		ele.click();
	}
	
	public void selectReasonAppointmentNotCreated()
	{
		WebElement dropdown = driver.findElement(By.name("Please select reason"));
		dropdown.click();
		GlobalUtil.wait(2);
		Select ele = new Select(driver.findElement(By.name("Emergency Leave")));
		ele.selectByVisibleText("Emergency Leave");
		//WebElement ele = driver.findElement(By.name("Emergency Leave"));
		//ele.click();
		GlobalUtil.wait(2);
		WebElement save = driver.findElement(By.name("Save"));
		save.click();
	}

	public void onTapProceedButton()
	{
		clickWhenVisible(proceedButtonLocator);
	}
public void onSelectOnlinePaymentCheckBox()
{
clickWhenVisible(onlineCheckBoxLocator);
}


public void rescheduleAppt(String time)
{
	WebElement spin = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/timeSpinner"));
	spin.click();
	driver.scrollToExact(time).click();
	GlobalUtil.wait(2);
	WebElement postappt = driver.findElement(rescheduleAppointmentButtonLocator);
	postappt.click();
	GlobalUtil.wait(5);
	WebElement done = driver.findElement(doneButtonForAddApptLocator);
	done.click();
	}

}
