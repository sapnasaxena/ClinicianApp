package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;







































































































































import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.AppointmentPage;
//**Author: Sapna Saxena
//**Created date: 07-APR-2016
import com.qa.mobileapp.pages.DashboardPage;

public class AppointmentTests extends TestBase {

	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";
	String balanceBeforePayment;
	

	@BeforeClass(alwaysRun=true)
	public void initAppointment() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	
	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		appointmentpage = new AppointmentPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureAppointmentPage() throws MalformedURLException{		
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(appointmentpage.waitVisible(appointmentpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		appointmentpage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(appointmentpage.waitVisible(appointmentpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Appointment page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	

		//UI Test Scenarios
		@Test(groups = {"UITest"})
		public void TC_01_testVerifyAppointmentScreenVisiblity()
		{
			System.out.println("Verify that on tapping Appointments nav, All appointments screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			Assert.assertNotNull(appointmentpage.getAllAppointmentdropLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_02_testVerifyTodayTabVisibiltyOnAppointmentScreen()
		{
			System.out.println("Verify that Today Tab is visible on Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			Assert.assertNotNull(appointmentpage.getTodayAppointmentTabLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_02_testVerifyUpcomingTabVisibiltyOnAppointmentScreen()
		{
			System.out.println("Verify that Upcoming Tab is visible on Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			Assert.assertNotNull(appointmentpage.getUpcomingsAppointmentTabLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_02_testVerifyPastTabVisibiltyOnAppointmentScreen()
		{
			System.out.println("Verify that PAST Tab is visible on Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			Assert.assertNotNull(appointmentpage.getPastAppointmentTabLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_03_testVerifyTodaysAppointmentListVisibility()
		{
			System.out.println("Verify that Today's Appointment List is visible on Today's Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			if (appointmentpage.waitVisible(appointmentpage.getAppointmentScreenPatientNameLocator())!= null)
			{
			Assert.assertNotNull(appointmentpage.getAppointmentListViewPageLocator());
			}
			else
			{
			System.out.println("Not found any today's Appoinment");
			}
			
		}

		@Test(groups = {"UITest"})
		public void TC_04_testVerifyUpcomingAppointmentListVisibility()
		{
			System.out.println("Verify that Upcomings Appointment List is visible on Upcomings Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			if (appointmentpage.waitVisible(appointmentpage.getAppointmentScreenPatientNameLocator())!= null)
			{
			Assert.assertNotNull(appointmentpage.getAppointmentListViewPageLocator());
			}
			else
			{
			System.out.println("Not found any Upcoming Appointment");
			}
			
		}

		@Test(groups = {"UITest"})
		public void TC_05_testVerifyPastAppointmentListVisibility()
		{
			System.out.println("Verify that Past Appointment List is visible on Past Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			if (appointmentpage.waitVisible(appointmentpage.getAppointmentScreenPatientNameLocator())!= null)
			{
			Assert.assertNotNull(appointmentpage.getAppointmentListViewPageLocator());
			}
			else
			{
			System.out.println("Not found any Past Appoinment");
			}
		}

		@Test(groups = {"UITest"})
		public void TC_06_testVerifyAllAppointmentsOptionVisiblity()
		{
			System.out.println("Verify that on click All Appointment link, all Appointments are visible on Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onTapAllAppointmentsSpinner();
			Assert.assertNotNull(appointmentpage.getAllAppointmentdropLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_012_testVerifyOpenAppointmentsOptionVisiblity()
		{
			System.out.println("Verify that on click Open Appointment link, all Open appointments are visible on Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onTapAllAppointmentsSpinner();
			Assert.assertNotNull(appointmentpage.getOpenAppointmentdropLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_011_testVerifyClosedAppointmentsOptionVisiblity()
		{
			System.out.println("Verify that on click Closed Appointment link, all Closed appointments are visible on Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onTapAllAppointmentsSpinner();
			Assert.assertNotNull(appointmentpage.getClosedAppointmentdropLocator());
		}

		@Test(groups = {"UITest"})
		public void TC_07_testVerifyPatientDetailsVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on click Patient Name, verify Patient details is visible on Patient Details Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			appointmentpage.onClickPatientName("successful");
			Assert.assertNotNull(appointmentpage.getAppointmentScreenPatientNameLocator());
			//Assert.assertNotNull(driver.findElement(appointmentpage.getAppointmentScreenPatientPhoneLocator()));
			Assert.assertNotNull(appointmentpage.getAppointmentScreenPatientGenderLocator());
			//Assert.assertNotNull(driver.findElement(appointmentpage.getAppointmentScreenPatientBrandLocator()));
			
		}

		        @Test(groups = {"UITest"})
				public void TC_09_testVerifyOnPendingAppointmentConfirmButtonVisiblity()
				{
					System.out.println("Verify that on click Patient Name, verify Patient details is visible on Patient Details Screen");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					if (appointmentpage.getAppointmentStatusLocator().equals("Pending"))
					{
						Assert.assertNotNull(appointmentpage.getConfirmAppointmentButtonLocator());
					}
					else
						System.out.println("Not able to find Pending appointment");

				}

		@Test(groups = {"UITest"})
		public void TC_13_testOnTapPatientNameAppointmentDetailsScreenVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap on any Patient name Appointment Details screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			Assert.assertNotNull(appointmentpage.getAppointmentScreenLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_14_testOnAppointmentDetailsScreenPatientTabVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on Appointment Details screen, Patient tab should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//sappointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			Assert.assertNotNull(appointmentpage.getPatientTabLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_15_testOnAppointmentDetailsScreenPaymentTabVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on Appointment Details screen, Payment tab should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			Assert.assertNotNull(appointmentpage.getApptPaymentTabLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_16_testOnAppointmentDetailsScreenAppointmentTabVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on Appointment Details screen, appointment tab should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			Assert.assertNotNull(appointmentpage.getAppointmentTabLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_17_testOnAppointmentDetailsScreenMenuOptionVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on Appointment Details screen, menu Option should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			Assert.assertNotNull(appointmentpage.getAppointmentScreenMenuOptionsLocator());	
		}

		@Test(groups = {"UITest"})
		public void TC_18_testOnAppointmentDetailsScreenMenuCheckVitalsOptionVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on Appointment Details screen, on tap menu button, Check Vitals options should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapApptScreenMenubutton();
			Assert.assertNotNull(appointmentpage.getAppointmentOptionCheckVitalLocator());	
		}

		@Test(groups = {"UITest"})
		public void TC_19_testOnAppointmentDetailsScreenMenuViewVitalsOptionVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on Appointment Details screen, on tap menu button, View Vitals options should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapApptScreenMenubutton();
			Assert.assertNotNull(appointmentpage.getAppointmentOptionViewVitalsLocator());	
		}

		@Test(groups = {"UITest"})
		public void TC_20_testOnTapMenuOptionCheckVitalCheckVitalsScreenVisibilty() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap menu option check vitals, Check Vitals screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapApptScreenMenubutton();
			GlobalUtil.wait(2);
			appointmentpage.onTapCheckVitalsOption();
			Assert.assertNotNull(appointmentpage.getCheckVitalsScreenLocator());	
		}

		@Test(groups = {"UITest"})
		public void TC_21_testViewVitalsScreenVisibilty()
		{
			System.out.println("Verify that on tap menu option View vitals, View Vitals screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
//			GlobalUtil.wait(2);
//			appointmentpage.onTapPatienframe();
			GlobalUtil.wait(2);
			appointmentpage.onTapApptScreenMenubutton();
			GlobalUtil.wait(2);
			appointmentpage.onTapViewVitalsOptions();
			Assert.assertNotNull(appointmentpage.getViewVitalsScreenLocator());	
		}

		@Test(groups = {"UITest"})
		public void TC_22_testVerifyOnTabFabButtonAddAppointmentOptionsVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button, Add Appointment button should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			Assert.assertNotNull(appointmentpage.getFabAddAppointmentButtonLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_23_testVerifyOnTabFabButtonAddCaseOptionsVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button, Add Case button should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			Assert.assertNotNull(appointmentpage.getFabAddCaseButtonLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_24_testVerifyOnTabFabButtonUploadOptionsVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button, upload button should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			Assert.assertNotNull(appointmentpage.getFabUploadButtonLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_25_testVerifyOnTabFabButtonPayOptionsVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button, Pay button should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			Assert.assertNotNull(appointmentpage.getFabPayButtonLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_26_testVerifyOnTabFabButtonAddAppointmentOptionsAddAppointmentScreenVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button Add Appointment button, Add Appointment screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButtonAddAppointment();
			Assert.assertNotNull(appointmentpage.getAppointmentScreenLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_27_testVerifyOnTabFabButtonAddCaseOptionsCaseDetailsScreenVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button Add Case button, Case details screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButtonAddCase();
			Assert.assertNotNull(appointmentpage.getAddCaseScreenLocator());

		}

		@Test(groups = {"UITest"})
		public void TC_28_testVerifyOnTabFabButtonUploadOptionsAddDocumentPopUpVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button Upload, Add Document screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButtonUpload();
			Assert.assertNotNull(appointmentpage.getUploadScreenLocator());	
		}

		
		@Test(groups = {"UITest"})
		public void TC_29_testVerifyOnTabFabButtonPayOptionsPaymentScreenVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button Pay, Payment screen should be displayed");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			appointmentpage.onTapLoadMoreButton();
			GlobalUtil.wait(2);
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButtonPay();
			Assert.assertNotNull(appointmentpage.getPayScreenLocator());	
		}
		
		@Test(groups = {"UITest"})
		public void TC_30_testVerifyOnTabFabButtonAddAppointmentAddAppointmentDetailsScreenVisiblity() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that on tap fab button Add Appointment, should display Add Appointment screen.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			//appointmentpage.onTapPatienframe();
			appointmentpage.onClickPatientName("successful");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButtonAddAppointment();
			Assert.assertNotNull(appointmentpage.getAddAppointmentScreenLocator());	
		}
		
		       @Test(groups = {"UITest"})
				public void TC_31_testVerifyOnPayScreenCashAndOnlineTabsVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on Pay screen,  Cash Payment and Online Payments tab should be displayed");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(1);
					Assert.assertNotNull(appointmentpage.getCashTabOnPayScreenLocator());	
					Assert.assertNotNull(appointmentpage.getOnlineTabOnPayScreenLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_32_testVerifyOnCashPaymentScreenCashAndChequeOptionsVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that Cash Payment have Options Cash, Cheque");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					Assert.assertNotNull(appointmentpage.getCashCheckBoxLocator());	
					Assert.assertNotNull(appointmentpage.getChequeCheckBoxLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_33_testVerifyOnEnterChequeAmountIssueBankDetailsTextboxVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on enter amount on Cheque, text box for Issuing bank and notes description should be displayed");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(1);
					appointmentpage.enterChequeAmount();
					Assert.assertNotNull(appointmentpage.getChequeInstructionLocator());	
					Assert.assertNotNull(appointmentpage.getChequeIssueBankDetailsTextBoxLocator());
					Assert.assertNotNull(appointmentpage.getChequeNoDetailsLocator());
					Assert.assertNotNull(appointmentpage.getChequeNotesTextBoxLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_34_testVerifyOnlineScreenWalletAndOnlineOptionsVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that for online Payments, Wallet and Online options should be displayed");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
				//	appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(1);
					appointmentpage.onTapOnlinePaymentsTab();
					Assert.assertNotNull(appointmentpage.getWalletCheckBoxLocator());	
					Assert.assertNotNull(appointmentpage.getOnlineCheckBoxLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_35_testVerifyWalletBalanceSendOTPLinkVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on enter amount for wallet, should displayed Wallet balance along with Send OTP link");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(1);
					appointmentpage.onTapOnlinePaymentsTab();
					GlobalUtil.wait(2);
					appointmentpage.enterWalletAmount();
					Assert.assertNotNull(appointmentpage.getWalletBalanceLocator());	
					Assert.assertNotNull(appointmentpage.getSendOTPLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_36_testVerifyEnterAmountOnlineEmailIdMobileNoSendLinkVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on enter amount for online, should displayed text box for Email address, mobile number along with Send link");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(1);
					appointmentpage.onTapOnlinePaymentsTab();
					GlobalUtil.wait(2);
					appointmentpage.enterOnlineAmount();
					Assert.assertNotNull(appointmentpage.getEmailOptionsLocator());	
					Assert.assertNotNull(appointmentpage.getMobileNoTextBoxLocator());
					Assert.assertNotNull(appointmentpage.getSendPaymentLinkLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_37_testVerifyOnAddAppointmentScreenCurrentMonthYearVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on Click on Add Appointment option, should display current month calendar along with done button");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonAddAppointment();
					GlobalUtil.wait(1);
					Calendar cal = Calendar.getInstance();
					Assert.assertTrue(DateFormatSymbols.getInstance().getMonths()[cal.get(Calendar.MONTH)].equalsIgnoreCase(GlobalUtil.getCurrentMonthInWords()));
					Assert.assertTrue(String.valueOf(cal.get(Calendar.YEAR)).equalsIgnoreCase("2016"));
					Assert.assertNotNull(appointmentpage.getDoneButtonForAddApptLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_38_testVerifyOnTapCaseFabButtonCaseDetailsAndAddCaseOptionsVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on Click on Add Case option, should display case details and add case button");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButton();
					Assert.assertNotNull(appointmentpage.getListOfCasesLocator());
					Assert.assertNotNull(appointmentpage.getCaseNameLocator());
					Assert.assertNotNull(appointmentpage.getAddCaseButtonLocator());
					Assert.assertNotNull(appointmentpage.getShowCasesLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_39_testVerifyOnTapAddCaseButtonAlertWindowWithYesNoOptionVisibilty() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on click Add case button, Add case file alerts should display along with Yes and No option");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButtonOnCaseScreen();
					Assert.assertNotNull(appointmentpage.getCaseFilePopUpWindowLocator());
					Assert.assertNotNull(appointmentpage.getCaseFilePopUpYesButtonLocator());
					Assert.assertNotNull(appointmentpage.getCaseFilePopUpNoButtonLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_40_testVerifyOnTapYesForAddCaseRedirectToPhysioApp() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on tap YES button , should redirect to Physio App");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
//					appointmentpage.onTapPatienframe();
//					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("successful");
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButtonOnCaseScreen();
					GlobalUtil.wait(1);
					appointmentpage.onTapYesButtonToAddCaseFile();
					Assert.assertNotNull(appointmentpage.getPhysioAppLocator());	
				}
				
				@Test(groups = {"UITest"})
				public void TC_41_testVerifyOnTapNOForRedirectToCaseScreen() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on tap No button , should redirect to Case Screen");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
//					appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapAddCaseButtonOnCaseScreen();
					GlobalUtil.wait(1);
					appointmentpage.onTapNoBtnOnCaseScreen();
					Assert.assertNotNull(appointmentpage.getAddCaseScreenLocator());	
				}
				
				@Test(groups = {"UITest"})
				public void TC_42_testVerifyAddDocumentScreenElementsVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on Add Document screen, type of document, title, received date and notes should be displayed along with clear and next button.");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					//appointmentpage.onTapPatienframe();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapUploadButton();
					Assert.assertNotNull(appointmentpage.getDocumentTitleLocator());	
					Assert.assertNotNull(appointmentpage.getDocumentTypeLocator());
					Assert.assertNotNull(appointmentpage.getDocumentReceivedDateLocator());
					Assert.assertNotNull(appointmentpage.getDocumentNotesLocator());
					Assert.assertNotNull(appointmentpage.getDocumentNextButtonLocator());
					Assert.assertNotNull(appointmentpage.getDocumentClearButtonLocator());
				}
				
				@Test(groups = {"UITest"})
				public void TC_43_testVerifyForConfirmedApptAddApptRescheduleCallToCancelReachedfabOptionsVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that for confirmed appointment on Fab Button, Add Appointment, Reschedule, Call to Cancel and Reached Options.");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("confirmed");
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
                    Assert.assertNotNull(appointmentpage.getReachedButtonLocator());
                    Assert.assertNotNull(appointmentpage.getRescheduleAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getAddAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getCallToCancelLocator());	
				}
				
				@Test(groups = {"functest"})
				public void TC_44_testVerifyForPendingApptConfirmCallToCancelfabOptionsVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that for confirmed appointment on Fab Button, Add Appointment, Reschedule, Call to Cancel and Reached Options.");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					//appointmentpage.onClickConfirmedAppointment();
					appointmentpage.onClickPatientName("confirmed");
					//GlobalUtil.wait(2); futureCal.set(Calendar.YEAR, 2010);
					//create second Calendar object
					Calendar now = Calendar.getInstance();
					appointmentpage.onTapFabButton();
                    Assert.assertNotNull(appointmentpage.getConfirmAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getRescheduleAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getAddAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getFabButtonAddSubserviceLocator());
				}
				

				@Test(groups = {"functest"})
				public void TC_45_testVerifyForPendingApptConfirmCallToCancelfabOptionsVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on tap confirm fab button on pending appointment, should change the fab buttons Call to Cancel, Reschedule, Add Appointment and Reached.");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("pending");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapConfirmFabButton();
                    Assert.assertNotNull(appointmentpage.getCallToCancelLocator());
                    Assert.assertNotNull(appointmentpage.getRescheduleAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getAddAppointmentButtonLocator());
                    Assert.assertNotNull(appointmentpage.getReachedButtonLocator());
				}
				
				@Test(groups = {"functest"})
				public void TC_46_testVerifyOnTapReachedButtonForFutureApptErrorMessageVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on tap reached button, if appointment time is in future, should displayed message'You cannot do reach status early'");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("confirmed");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					
					//compare current date with appointment date
					appointmentpage.onTapReachedFabButton();
					
                    Assert.assertTrue("You cannot do reach status early", true);
                   
				}
				
				@Test(groups = {"functest"})
				public void TC_47_testVerifyOnTabRescheduleButtonForFutureAppointmentCurrentMonthCalendarVisiblity() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that on tap Reschedule fab button, should display current month calendar.");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("confirmed");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onClickRescheduleButton();
                    Assert.assertNotNull(appointmentpage.getCurrentMonthLocator());
				}
				
				@Test(groups = {"functest"})
				public void TS_14_testVerifyAddAppointmentSuccessful() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that user is able to add appointment successfully");
					if (dashboardpage.getCheckOutTimeLocator()!=null)
					{
						dashboardpage.checkIn();
					}
					GlobalUtil.wait(2);
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("confirmed");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonAddAppointment();
					GlobalUtil.wait(1);
					//appointmentpage.selectDate("10");
					String date = GlobalUtil.getCurrentDate();
					appointmentpage.getFreeDateForAppointment(date, true).click();
					GlobalUtil.wait(1);
					appointmentpage.addAppointment("5:30 PM");
					Assert.assertNotNull(appointmentpage.getAddAppointmentScreenLocator());
				}
				
				//@Test(groups = {"functest"})
				public void TS_67_testVerifyErrorVisibiltyWhileAddAppointmentWithAlreadyHavAppt() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that user should get error while adding duplicate appointment ");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(2);
					appointmentpage.onClickPatientName("confirmed");
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonAddAppointment();
					GlobalUtil.wait(1);
					appointmentpage.selectDateWithAppointment();
					//GlobalUtil.wait(1);
					//appointmentpage.addAppointment();
					Assert.assertNotNull(appointmentpage.getErrorAddDuplicateApptLocator());
				}
				
				
	
		@Test(groups = {"UITest"})
		public void TS_12_testVerifyPatientDetailsVisibilty()
		{
			System.out.println("Verify that Upcomings Appointment List is visible on Upcomings Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			//appointmentpage.onClickPatientName();
			GlobalUtil.wait(2);
			Assert.assertNotNull(appointmentpage.getPatientNameLocator());
			Assert.assertNotNull(appointmentpage.getFeesTextLocator());
			Assert.assertNotNull(appointmentpage.getStatusLocator());
		}

		

		@Test(groups = {"functest"})
		public void TS_15_testVerifyUserShouldAbleToRescheduleAppointment() throws NoSuchFieldException, SecurityException, ParseException
		{
			System.out.println("Verify that User should able to reschedule appointment");
			if (dashboardpage.getCheckOutTimeLocator()!=null)
			{
				dashboardpage.checkIn();
			}
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(1);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickUpcomingTab();
			GlobalUtil.wait(2);
			appointmentpage.onClickPatientName("confirmed");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onClickRescheduleButton();
			GlobalUtil.wait(2);
			String date = GlobalUtil.getTomorrowDate();
			appointmentpage.selectDate(date);
			//appointmentpage.getFreeDateForAppointment(date, true).click();
			GlobalUtil.wait(2);
			appointmentpage.rescheduleAppt("5:30 PM");
			Assert.assertNotNull(appointmentpage.getAppointmentExpandFabButtonLocator());

		}

		@Test(groups = {"functest"})
		public void TS_66_testVerifyCancelAppointment() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that User should be redirected to call on cancel appointment.");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPatientName("confirmed");
			GlobalUtil.wait(2);
			appointmentpage.onTapFabButton();
			GlobalUtil.wait(2);
			appointmentpage.onClickCancelButton();
			Assert.assertTrue("1800 123 2020", true);
		}

		@Test(groups = {"functest"})
		public void TS_12_testVerifyPatientDetails() throws NoSuchFieldException, SecurityException
		{
			System.out.println("Verify that Upcomings Appointment List is visible on Upcomings Appointment Screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapAppointmentsNav();
			GlobalUtil.wait(2);
			appointmentpage.onClickPastTab();
			GlobalUtil.wait(2);
			appointmentpage.onClickPatientName("Confirmed");
			GlobalUtil.wait(2);
			appointmentpage.onClickVerifyPatientDetailsLink();
			System.out.println("Added Subservices");
		}
		
	
		       @Test(groups = {"functest"})
				public void TS_17_testVerifyUserAbleToAddSubservices() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that user should able to add subservices");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickUpcomingTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(1);
				    appointmentpage.onClickPatientName("confirmed");		
				    GlobalUtil.wait(2);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonSubservices();
					GlobalUtil.wait(2);
					//SubServiceModal subservicemodal = new SubServiceModal();
					appointmentpage.addSubService("7 day Package (INR 700 bracket)");
					Assert.assertEquals("7 day Package (INR 700 bracket)", driver.findElement(appointmentpage.getAddedSubServiceNameLocator()).getText());
//					Assert.assertNotNull(appointmentpage.getSubServiceScreenLocator());
//					Assert.assertTrue("ADL Training", true);
					//Assert.assertEquals("ADL Training", appointmentpage.getSubServiceName());
					
				}
		
		       
		      @Test(groups = {"functest"})
				public void TS_63_testVerifyAfterPaymentVisibiltyOfAmountPaidAndBalanceAmountOnPaymentsScreen() throws NoSuchFieldException, SecurityException
				{
		    	    System.out.println("Verify that Amount paid and Balance amount in Payment tab of Appointment details screen after Payment.");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(1);		
					appointmentpage.onTapLoadMoreButton();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(2);
					WebElement balanceBeforePayment = driver.findElement(appointmentpage.getBalanceValueLocator());
			    	String balBeforePay = balanceBeforePayment.getText();
					appointmentpage.payByCash();
					WebElement balanceAfterPayment = driver.findElement(appointmentpage.getBalanceValueLocator());
					String balAfterPay = balanceAfterPayment.getText();
					//Assert.assertSame(appointmentpage.balancePayment(), appointmentpage.BalanceAfterPayment());
					Assert.assertNotSame(balBeforePay, balAfterPay);
					
				}
					
				@Test(groups = {"functest"})
				public void TS_19_testVerifyUserShouldAbleToSendPaymentLinkOnline() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that Clinician should able to do Payment through Online");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);	
					appointmentpage.onTapLoadMoreButton();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(2);
					appointmentpage.payByOnline("sapna.saxena@porteamedical.com", "8553013244");
					//Assert.assertTrue("Payment link is being sent", true);
					Assert.assertNotNull(appointmentpage.getOnlineTabOnPayScreenLocator());
					
				}   

				@Test(groups = {"functest"})
				public void TS_18_testVerifyUserShouldAbleToPayByWallet() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that Clinician should able to do Payment through Wallet)");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(1);	
					appointmentpage.onTapLoadMoreButton();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(2);
					appointmentpage.payByWallet("1","1234");
					//Assert.assertTrue("Payment link is being sent", true);
					Assert.assertNotNull(appointmentpage.getOnlineTabOnPayScreenLocator());
				
				}   
				

				@Test(groups = {"functest"})
				public void TS_62_testVerifyUserShouldAbleToPayByCash() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that Clinician should able to do Payment by Cash");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(1);		
					appointmentpage.onTapLoadMoreButton();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(2);
					appointmentpage.payByCash();
					//Assert.assertTrue("Amount has been paid successfully", true);
					Assert.assertNotNull(appointmentpage.getCashTabOnPayScreenLocator());
				}  
				
				@Test(groups = {"functest"})
				public void TS_62_testVerifyUserShouldAbleToPayByCheque() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that Clinician should able to do Payment by Cheque)");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(1);		
					appointmentpage.onTapLoadMoreButton();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonPay();
					GlobalUtil.wait(2);
					appointmentpage.payByCheque("test", "123456");
					Assert.assertTrue("Amount has been paid successfully", true);
					//Assert.assertNotNull(appointmentpage.getCashTabOnPayScreenLocator());
				}  
				
				@Test(groups = {"functest"})
				public void TS_20_testVerifyUserShouldAbleToUploadDocument() throws NoSuchFieldException, SecurityException
				{
					System.out.println("Verify that user should able to upload documents.)");
					dashboardpage.onTapDashboardtext();
					GlobalUtil.wait(2);
					dashboardpage.onTapMyTasksExpandButton();
					GlobalUtil.wait(2);
					dashboardpage.onTapAppointmentsNav();
					GlobalUtil.wait(2);
					appointmentpage.onClickPastTab();
					GlobalUtil.wait(2);
					appointmentpage.onTapPatienframe();
					GlobalUtil.wait(1);		
					appointmentpage.onTapLoadMoreButton();
					appointmentpage.onClickPatientName("successful");
					GlobalUtil.wait(1);
					appointmentpage.onTapFabButton();
					GlobalUtil.wait(2);
					appointmentpage.onTapFabButtonUpload();
					GlobalUtil.wait(2);
					appointmentpage.uploadDocument("test", "June", "01", "2016", "testnotes");
					Assert.assertNotNull(appointmentpage.getOpenRecentFolderLocator());
				}  
				
				
			
	}
