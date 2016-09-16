package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CaseFilePage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LabAutomationPage;
import com.qa.mobileapp.pages.LoginPage;

/* Author: Lipsha satpathy
 * Created date: 17thmay 2016
 * Function for labautomation
 * */


// Test case fail due to reach button issue JIRA ID: CA-   //

public class LabAutomationTests extends TestBase {
	

public static final int priority = 0;



	public static final String userName ="lab.p@gmail.com";
	public static final String password ="Portea1234";
	
	@BeforeClass
	public void initlabAutomation() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		//appointmentpage = new AppointmentPage(driver);
		labautomationpage = new LabAutomationPage(driver);
		appointmentpage = new AppointmentPage(driver);
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureLabAutomationPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(labautomationpage.waitVisible(labautomationpage.getExitAppTitleLocator(),GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		casefilepage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(labautomationpage.waitVisible(labautomationpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("LabautomationPage page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	       @Test(groups = { "functest" })
			public void testVerifyTc_174LabappointmentVisibility()
			{
				System.out.println("Verify that created appointment for lab-sample collection is displayed in clinician appointments");
				dashboardpage.onTapDashboardtext();
				GlobalUtil.wait(2);
				dashboardpage.onTapAppointmentsNav();
				GlobalUtil.wait(2);
//				labautomationpage.onClickTodayTabLocator();
//				GlobalUtil.wait(2);
				labautomationpage.onClickUpcomingTabLocator();
				GlobalUtil.wait(2);
				Assert.assertNotNull(labautomationpage.getPendingStatusLocator());
				
			}
	

	        @Test(groups = { "functest" })
			public void testVerifyTs_175ConfirmButton() throws NoSuchFieldException, SecurityException
			{
				System.out.println("Verify that user is able to confirm the appointment");
				
				labautomationpage.onClickSkipbuttonLocator();
				GlobalUtil.wait(2);
				dashboardpage.onTapDashboardtext();
				GlobalUtil.wait(2);
				dashboardpage.onTapAppointmentsNav();
				GlobalUtil.wait(2);
				labautomationpage.onClickPastTabLocator();
				GlobalUtil.wait(2);
				labautomationpage.onClickPatientNames("pending");
				GlobalUtil.wait(2);
				appointmentpage.onTapFabButton();
				GlobalUtil.wait(2);
				labautomationpage.onClickConfirmStatusButtonLocator();
				GlobalUtil.wait(2);
				//labautomationpage.onClickRefreshLocator();
				//GlobalUtil.wait(3);
				appointmentpage.onTapFabButton();
				GlobalUtil.wait(2);
				Assert.assertNotNull(labautomationpage. getConfirmStatusLocator());
			}
	
	
	@Test(groups = { "functest" })
	public void testVerifyTs_176samplecollectedButton() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that the sample collected button is disabled unless Investigation button is reviewed");
		
		labautomationpage.onClickSkipbuttonLocator();
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickReachedLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickOKbuttonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getSampleCollectedButtonLocator());
	}
	
	@Test(groups = { "functest" })
	public void testVerifyTs_177addsubservice() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that the user is able add the sub services");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickINVESTIGATIONLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickAddServiceButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.addSubService("AFP(Alpha Feto Protein)");
		GlobalUtil.wait(2);
		labautomationpage.onClickDoneButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickCheckButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getSampleCollectedButtonLocator());
		
		
	}
	
	@Test(groups = { "functest" })
	public void Ts_179_testVerifyclickingontickbuttonsamplecollectedbuttonisenabled() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that the only after clicking on tick button, sample collected button is enabled");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickINVESTIGATIONLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickCheckButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickBackbuttonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getSampleCollectedButtonLocator());
		
		
	}
	
	@Test(groups = { "functest" })
	public void Ts_180_testVerifyclickingsamplecollectedbuttonpaymentpopup() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that on clicking sample collected button payment pop up is displayed");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickSampleCollectedButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getAlertTitleLocator());
		
		
	}
	
	@Test(groups = { "functest" })	
	public void Ts_181_testVerifypayment() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that user is able to make the payment");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickSampleCollectedButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickYesButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickCashpaymentButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.payByCash("100");
		GlobalUtil.wait(2);
		labautomationpage.onClickPayButtonLocator();
		Assert.assertNotNull(labautomationpage.getBalanceScreenLocator());
		
	}
	
	@Test(groups = { "functest" })
	public void TS_181_testVerifypaymentcheque() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that user is able to make the payment by cheque");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickSampleCollectedButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickYesButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickCashpaymentButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.payByCheque("1");
		GlobalUtil.wait(2);
		labautomationpage.onClickPayButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getBalanceScreenLocator());
	}
	
	@Test(groups = { "functest" })
	public void TC_181_testVerifypaymentbyonline() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that user is able to make the payment by online");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickSampleCollectedButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickYesButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickOnlinePaymentsLocator();
		GlobalUtil.wait(2);
		labautomationpage.payByOnline("1", "abc@gmail.com", "1231231231");
		GlobalUtil.wait(2);
		labautomationpage.onClickPayButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getBalanceScreenLocator());
	}
	
	@Test(groups = { "functest" })
	public void TC_181_testVerifySampleDelivered() throws NoSuchFieldException, SecurityException
	{
		System.out.println("Verify that the user is able to change the status to sample Delivered ");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapAppointmentsNav();
		GlobalUtil.wait(2);
		labautomationpage.onClickPastTabLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickPatientNames("confirmed");
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		appointmentpage.onTapFabButton();
		GlobalUtil.wait(2);
		labautomationpage.onClickSampleCollectedButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickYesButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickGotButtonLocator();
		GlobalUtil.wait(2);
		labautomationpage.onClickOnlinePaymentsLocator();
		GlobalUtil.wait(2);
		labautomationpage.payByOnline("1", "abc@gmail.com", "1231231231");
		GlobalUtil.wait(2);
		labautomationpage.onClickPayButtonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(labautomationpage.getBalanceScreenLocator());
	}
	
}