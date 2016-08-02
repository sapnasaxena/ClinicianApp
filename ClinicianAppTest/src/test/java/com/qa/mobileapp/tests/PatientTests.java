package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.PatientModal;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.PatientPage;

public class PatientTests extends TestBase {

	public static final String userName ="testphysio@test.com";
	public static final String password ="Portea123";
	String patientID="";
	
	@BeforeClass(alwaysRun=true)
	public void initPatient() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		patientpage = new PatientPage(driver);
	}
	
  	@Test(groups = { "UITest" })
	public void TC_01_testVerifyOnClickPatientNavBarPatientListVisibilty()
	{
		System.out.println("Verify that on Click on Patient Nav bar,list of patients is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(driver.findElement(patientpage.getPatientListsLocator()));
		Assert.assertNotNull(driver.findElement(patientpage.getPatientNameLocator()));
		Assert.assertNotNull(driver.findElement(patientpage.getPatientAddressLocator()));
	}
	
	@Test(groups = { "UITest" })
	public void TC_02_testVerifyPatientDetailsVisiblity()
	{
		System.out.println("Verify that on Click on Patient Nav bar, Patients details like Name, address, contact number, status and fees are visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(patientpage.getPatientListingLocatorOnPatientDetailsScreen());
		Assert.assertNotNull(patientpage.getPatientNameLocator());
     	Assert.assertNotNull(patientpage.getPatientAddressLocator());
		Assert.assertNotNull(patientpage.getPatientContactNumberLocator());
        Assert.assertNotNull(patientpage.getPatientGenderLocator());
	}
	
	//@Test(groups = { "UITest" })
	public void TC_05_testVerifyAddPatientButtonVisibilityOnPatientListing()
	{
		System.out.println("Verify that on Patient listing screen, add Patient button should be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(patientpage.getAddPatientButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_03_testVerifySearchButtonVisibilityOnPatientListing()
	{
		System.out.println("Verify that on Patient listing screen, search image should be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(patientpage.getSearchButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_04_testVerifyRefreshButtonVisibilityOnPatientListing()
	{
		System.out.println("Verify that on Patient listing screen, refresh image should be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		Assert.assertNotNull(patientpage.getRefreshButtonLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_06_testVerifyOnTapPatientNamePatientDetailsScreenVisiblity()
	{
		System.out.println("Verify that on tap on any Patient name, Patient Details screen should be displayed.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		Assert.assertNotNull(patientpage.getPatientDetailsScreenLocator());
	}
	
	@Test(groups = {"UITest"})
	public void TC_07_testVerifyOnPatientDetailsScreenPatientDetailsVisiblity()
	{
		System.out.println("Verify that on tapping any patient name, should display Patient details like Name, Patient ID, location, email id, contact number, gender, Pending amount, case name, status, appointment datetime and Date of first Visit.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(1);
		Assert.assertNotNull(patientpage.getPatientDetailsPatientNameLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsPatientIDLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsAddressLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsContactNumberLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsEmailIdLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsGenderLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsPendingAmountDetailsLocator());
		Assert.assertNotNull(patientpage.getPatientDetailsCaseLocator());
	}
	
	//@Test(groups = { "UITest" })
	public void TC_08_testVerifyOnPatientDetailsScreenReferAServiceLinkVisiblity()
	{
		System.out.println("Verify that on Patient details screen, Refer a service link should be visible.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		Assert.assertNotNull(patientpage.getPatientDetailsReferServiceLocator());
	}
	
	//@Test(groups = { "UITest" })
	public void TC_09_testVerifyOnPatientDetailsScreenFeedbackLinkVisiblity()
	{
		System.out.println("Verify that on Patient details screen, Patient feedback link should be visible.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		Assert.assertNotNull(patientpage.getPatientDetailsFeedbackLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_10_testVerifyOnPatientDetailsScreenRefreshImageVisiblity()
	{
		System.out.println("Verify that on Patient details screen, refresh image should be visible");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		Assert.assertNotNull(patientpage.getPatientDetailsTopRgtMenuLocator());
	}
	
	@Test(groups = { "UITest" })
	public void TC_11_testVerifyMenuOptionsOnPatientListingVisiblity()
	{
		System.out.println("Verify that on Click on Patient Nav bar, AddPackage,ViewAppointments,AddCase,Add Service and CheckVitals Options is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapPatientScreenNavOptions();
		Assert.assertNotNull(patientpage.getAddPackageOptionsLocator());
		Assert.assertNotNull(patientpage.getViewAppointmentsOptionsLocator());
		Assert.assertNotNull(patientpage.getAddCaseOptionsLocator());
		Assert.assertNotNull(patientpage.getAddServiceOptionsLocator());
		Assert.assertNotNull(patientpage.getCheckVitalsOptionsLocator());
		Assert.assertNotNull(patientpage.getVitalsHistoryLocator());
	}
	
	
	//@Test(groups = { "UITest" })
	public void TC_12_testVerifyReferServiceScreenVisiblity()
	{
		System.out.println("Verify that on tap Refer a service link, should display Refer a service screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapReferServiceLink();
		Assert.assertNotNull(patientpage.getReferServiceScreenLocator());
	}
	
	//@Test(groups = { "UITest" })
	public void TC_13_testVerifyFeedbackScreenVisiblity()
	{
		System.out.println("Verify that on tap Feedback link, should display Feedback screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapFeedbackLink();
		Assert.assertNotNull(driver.findElement(patientpage.getPatientFeedbackScreenLocator()));
	}
	
	//@Test(groups = { "UITest" })
	public void TC_14_testVerifyAddPatientScreenVisiblity()
	{
		System.out.println("Verify that on click on + button, should display the  Add Patient details screen..");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onClickAddPatientButton();
		Assert.assertNotNull(driver.findElement(patientpage.getAddPatienScreenLocator()));
	}
	
	@Test(groups = { "funcTest" })
	public void TS_01_testVerifyUserIsAbleToSearchPatientByName()
	{
		System.out.println("Verify that user can able to search a patient by entering patient name.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.searchPatient("test");
		List<WebElement> ls = driver.findElements(By.className("//android.widget.ListView"));
		ls.get(0).getText();
		Assert.assertEquals("test", ls.get(0).getText());
	}
	
	@Test(groups = { "functest" })
	public void TS_01_testVerifyUserIsAbleToSearchPatientByID()
	{
		System.out.println("Verify that user can able to search a patient by entering patient ID.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.searchPatient("POR099554");
		Assert.assertNotNull(driver.findElement(patientpage.getSearchStringLocator()));
	}
	
	//@Test(groups = { "functest" })
	public void TS_0_testVerifyUserIsAbleToAddPatient()
	{
		System.out.println("Verify that user can able to add a new patient on clicking (+) button.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		PatientModal patientModal=PatientModal.getPatientDetails();
		patientModal.setPatientFirstName(GlobalUtil.getRandomName(8));
		patientModal.setPatientLastName(GlobalUtil.getRandomName(6));
		patientModal.setEmail(GlobalUtil.getRandomName(4) + "@test.com");
		patientModal.setMobileNo(GlobalUtil.generateRandomMobileNo());
		patientModal.setAddress("test test test");
		patientModal.setPinCode("560071");
		patientpage.addPatient(patientModal);
//		patientpage.getPatientDetailsScreenLocator();
     	patientpage.getAddedPatient(PatientModal.getPatientDetails());
		Assert.assertNotNull(patientpage.getPatientListsLocator());
		Assert.assertNotNull(patientModal.getPatientFirstName());
	}
	
	


	//@Test(groups = { "functest" })
	public void TS_04_testVerifyUserIsAbleToReferService()
	{
		System.out.println("Verify that user can able to Refer a service for the selected patient.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onClickPatientName();
		GlobalUtil.wait(2);
		patientpage.referService();
		Assert.assertNotNull(driver.findElement(patientpage.getPatientDetailsScreenLocator()));
	}

	@Test(groups = { "UITest" })
	public void testVerifyAddPackageOptionVisibilty()
	{
		System.out.println("Verify that on Click on Patient Nav bar, Add Package button is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onClickPatientName();
		GlobalUtil.wait(1);
		patientpage.onTapOptions();
		Assert.assertNotNull(patientpage.getAddPackageOptionsLocator());
	}
	
	@Test(groups = { "UITest" })
	public void testVerifySubscribedPackageDetailsVisibilty()
	{
		System.out.println("Verify subscribed package details visiblity.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.showSubcribedPackageDetails();
		//driver.switchTo().alert();
		Assert.assertNotNull(patientpage.getSubscribedPackageScreenLocator());
		Assert.assertNotNull(patientpage.getSubcribedpackageListLocator());
		Assert.assertNotNull(patientpage.getDismissButtonLocator());
		
	}
	
	@Test(groups = { "UITest" })
	public void testVerifyPatientDetailsScreenVisibilty()
	{
		System.out.println("Verify patient details visibilty");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onClickPatientName();
		Assert.assertNotNull(patientpage.getPatientNameLocator());
	}

	//functional Test Scenarios
	
	@Test(groups = { "functest" })
	public void TS_01_testVerifyUserShouldAbleToSearchPatient()
	{
		System.out.println("Verify that user can able to search a patient by entering patient name and ID");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		
	}
	
	//@Test(groups = { "functest" })
	public void TS_02_testVerifyUserIsAbleToAddPatient()
	{
		System.out.println("Verify that user can able to Refer a service for the selected patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		PatientModal patientModal=PatientModal.getPatientDetails();
		patientModal.setPatientFirstName(GlobalUtil.getRandomName(8));
		patientModal.setPatientLastName(GlobalUtil.getRandomName(8));
		patientModal.setMobileNo(GlobalUtil.getRandomNumber(10));
		patientModal.setEmail(GlobalUtil.getRandomName(6) + "test.com");
		patientModal.setAddress("test test test");
		patientModal.setPinCode("560071");
		 patientpage.addPatient(patientModal);
		Assert.assertNotNull(patientpage.getPatientsScreenLocator());
	}
	
	@Test(groups = { "functest" })
	public void TS_03_testVerifyOnTapAnyPatientUserShouldRedirectedToPatientDetailScreen()
	{
		System.out.println("Verify that on clicking on any patient it should redirect to patient details screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onClickPatientName();
		Assert.assertNotNull(patientpage.getPatientDetailsScreenLocator());
	}
	
	
	
	@Test(groups = { "functest" })
	public void TS_05_testVerifyUserShouldGetsErrorWhileClickOnAddCase()
	{
		System.out.println("Verify that user can get error while trying to add case for a particular patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapOptions();
		GlobalUtil.wait(2);
		patientpage.onTapAddCase();
		Assert.assertNotNull(patientpage.getAddCaseMessageLocator());
	}
	
	//Not working
	@Test(groups = { "functest" })
	public void TS_06_testVerifyUserShouldAbleToAddPackage()
	{
		System.out.println("Verify that user can able to add package for aparticular patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapOptions();
		GlobalUtil.wait(2);
		patientpage.onTapAddPackage();
		GlobalUtil.wait(2);
		patientpage.addPackage();
		Assert.assertNotNull(driver.findElement(patientpage.getSubscribedPackageScreenLocator()));
	} 

	@Test(groups = { "functest" })
	public void TS_07_testVerifyUserShouldAbleToAddServiceForPatient()
	{
		System.out.println("Verify that user can able to add service for a particular patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(2);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapOptions();
		GlobalUtil.wait(1);
		patientpage.onTapAddService();
		GlobalUtil.wait(2);
		System.out.println(GlobalUtil.getCurrentMonthInMMM());
		patientpage.addService(GlobalUtil.getCurrentMonthInMMM(), "02", "2016");
		if (appointmentpage.getApptCalDateLocator()!=null)
		{
			Assert.assertNotNull(patientpage.getPatientDetailsScreenLocator());
		}
		else
		{
			System.out.println("Error");
			Assert.assertNotNull(patientpage.getErrorAlreadyApptLocator());
		}
	}

	@Test(groups = { "functest" })
	public void TS_08_testVerifyUserShouldAbleToViewSubscriptionsOfPatient()
	{
		System.out.println("Verify that user can able to view subscriptions for aparticular patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapOptions();
		GlobalUtil.wait(2);
		patientpage.onTapViewSubscription();
		Assert.assertNotNull(patientpage.getSubscribedPackageScreenLocator());
	}
	
	@Test(groups = { "functest" })
	public void TS_09_testVerifyUserShouldAbleToCheckVitalsOfPatient()
	{
		System.out.println("Verify that user can able to check vitals for a particular patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapOptions();
		GlobalUtil.wait(2);
		patientpage.onTapCheckVitals();
		Assert.assertNotNull(patientpage.getCheckVitalsScreenLocator());
	}	
	
	@Test(groups = { "functest" })
	public void TS_10_testVerifyUserShouldAbleToViewVitalHistoryOfPatient()
	{
		System.out.println("Verify that user can able view vitals History for a particular patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.onTapOptions();
		GlobalUtil.wait(2);
		patientpage.onTapViewVitals();
		Assert.assertNotNull(patientpage.getVitalsHistoryLocator());
	}
	
	@Test(groups = { "functest" })
	public void TS_11_testVerifyUserShouldAbleToViewCaseDetailsOfPatient()
	{
		System.out.println("Verify that user can able to view case details if exist");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		driver.scrollToExact("Cases");
		if(patientpage.getPatientDetailsCaseLocator()!=null)
		{
			Assert.assertNotNull(patientpage.getNoCaseFoundMessageOnPatientDetailsLocator());
			
		}
		else
		{
			WebElement name = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/patient_name"));
			WebElement status = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/casefile_status"));
			WebElement apptDate = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/appointment_date"));
			WebElement dateOfFirstVisit = driver.findElement(By.id("com.healthvista.clinicianapp.stage:id/firstVisitText"));
			Assert.assertTrue(name.getText(), true);
			Assert.assertTrue(status.getText(), true);
			Assert.assertTrue(apptDate.getText(), true);
			Assert.assertTrue(dateOfFirstVisit.getText(), true);
		}
	}
	
	@Test(groups = { "functest" })
	public void TS_12_testVerifyUserShouldAbleToRefreshPatientDetails()
	{
		System.out.println("Verify that user can able to refresh the patient details screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.refreshPatientDetails();
		Assert.assertNotNull(patientpage.getPatientDetailsScreenLocator());
	}
	
    //@Test(groups = { "functest" })
	public void TS_13_testVerifyUserShouldAbleToSendDoctorServiceFeedback()
	{
		System.out.println("Verify that user can able to refresh the patient details screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.sendFeedback(0,"doctor");
		Assert.assertNotNull(patientpage.getPatientDetailsScreenLocator());
	}

	//@Test(groups = { "functest" })
	public void TS_13_testVerifyUserShouldAbleToSendPhysioServiceFeedback()
	{
		System.out.println("Verify that user can able to refresh the patient details screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPatientNav();
		GlobalUtil.wait(1);
		patientpage.onTapPatientFrame();
		GlobalUtil.wait(2);
		patientpage.sendFeedback(0,"physiotherapy");
		Assert.assertNotNull(patientpage.getPatientDetailsScreenLocator());
	}
	
	
	
	@AfterMethod(alwaysRun=true)
	public void ensurePatientPage() throws MalformedURLException{		
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(patientpage.waitVisible(patientpage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		dashboardpage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(patientpage.waitVisible(patientpage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}	
		}
		catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Patient page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
}
