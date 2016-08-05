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
import com.qa.mobileapp.pages.CaseFilePage;
import com.qa.mobileapp.pages.DashboardPage;

/* Author: Lipsha satpathy
 * Created date: 5th and 6th april 2016
 * XPATH for casefile Page 
 * */

public class CasefileTests extends TestBase {
	
	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="Portea123";
	
	@BeforeClass
	public void initCasefile() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		//appointmentpage = new AppointmentPage(driver);
		casefilepage = new CaseFilePage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureCasefilePage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(casefilepage.waitVisible(casefilepage.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		casefilepage.dismissLocation();
		int i = 0;
		LoopThrice:
		while(i < 3){
			if(casefilepage.waitVisible(casefilepage.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Casefile page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	//UI Test Scenarios
	
		@Test(groups = { "UITest" })
		public void testVerifyCasefileScreenVisiblity()
		{
			System.out.println("Verify that on clicking Casefile nav bar, user should able to see Casefile screen");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapCaseFileNav();
			Assert.assertNotNull(casefilepage.getCaseFileScreenLocator());
		}

		//@Test(groups = { "UITest" })
		public void TC_01testVerify3tabscontainScreenVisiblity()
		{
			System.out.println("Verify that on tapping Case file nav, should display 3 tabs Pending, Case filestab and Documents ");
			dashboardpage.onTapDashboardtext(); 
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapCaseFileNav();
			Assert.assertNotNull(casefilepage.getPendingstatusLocator());
			Assert.assertNotNull(casefilepage.getCasefiletabLocator());
			Assert.assertNotNull(casefilepage.getDocumentLocator());
			
			}
		@Test(groups = { "UITest" })
		public void TC_02testVerifyPendingScreenVisibility()
		{
			System.out.println("Verify ontapping Pending tab,should display all Pendingcases alond with details like PatientName,PatientId and appointmentdate ");
			dashboardpage.onTapDashboardtext();
			GlobalUtil.wait(2);
			dashboardpage.onTapMyTasksExpandButton();
			GlobalUtil.wait(2);
			dashboardpage.onTapCaseFileNav();
			casefilepage.onClickPendingStatusLocator();
			GlobalUtil.wait(2);
			Assert.assertNotNull(casefilepage.getPatientIDLocator());
			Assert.assertNotNull(casefilepage.getPatientNameLocator());
			Assert.assertNotNull(casefilepage.getAppointmentDateLocator());
		}
		@Test(groups = { "UITest" })
		public void TC_03testVerifycasefiletabScreenVisibility()
		{
		System.out.println("Verify on tapping Casefiles tab,should display Patientlisting with casefiles details like Patient Name, ID, Status allong with Edit Case file button");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCaseFileNav();
		GlobalUtil.wait(2);
		casefilepage.onClickCasefilestabLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage.getGenerallistLocator());
		Assert.assertNotNull(casefilepage.getPatientIDLocator());
		Assert.assertNotNull(casefilepage. getPatientNameLocator());
		Assert.assertNotNull(casefilepage.getstatusLocator());
		Assert.assertNotNull(casefilepage.getEditcasefilebuttonLocator());
		
}

		@Test(groups = { "UITest" })
		public void TC_04TtestVerifyDocumentTabScreenVisibility()
		{
		System.out.println("Verify that on tapping Documentstap,should display the  details of documents uploaded for Patients along with details like Patient name, ID, and document name");
		
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCaseFileNav();
		GlobalUtil.wait(2);
		casefilepage.onClickDocumentsLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage.getGenerallistLocator());
		Assert.assertNotNull(casefilepage.getPatientIDLocator());
		Assert.assertNotNull(casefilepage. getPatientNameLocator());
		Assert.assertNotNull(casefilepage.getTreatmentLocator());
		Assert.assertNotNull(casefilepage.getConsentLocator());
		}
		
		@Test(groups = { "UITest" })
		public void TC_05TtestVerifyUsershouldabletoEditcasefile()
		{
		System.out.println("User should able to Edit case file");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapCaseFileNav();
		GlobalUtil.wait(2);
		casefilepage.onClickCasefilestabLocator();
		GlobalUtil.wait(2);
		casefilepage.onClickEditcasefilebuttonLocator();
		GlobalUtil.wait(2);
		casefilepage.onClickspinnerLocator();
		GlobalUtil.wait(2);
		casefilepage.onClickCancelbuttonLocator();
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage.getspinnerLocator());
		Assert.assertNotNull(casefilepage.getEarlyLocator());
		Assert.assertNotNull(casefilepage.getIntensityLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage.getTreatmentLocator());
		Assert.assertNotNull(casefilepage.getMidLocator());
		Assert.assertNotNull(casefilepage.getEarlyLocator());
		Assert.assertNotNull(casefilepage.getafternoonLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage.getLateafternoonLocator());
		Assert.assertNotNull(casefilepage.getEveningLocator());
		Assert.assertNotNull(casefilepage.getLateEveningLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage.getNightEveningLocator());
		Assert.assertNotNull(casefilepage.getThroughoutdayLocator());
		Assert.assertNotNull(casefilepage. getNo24hrpatternLocator());
		Assert.assertNotNull(casefilepage. getLeftLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getRightLocator());
		Assert.assertNotNull(casefilepage. getBothLocator());
		Assert.assertNotNull(casefilepage. getoneLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. gettwoLocator());
		Assert.assertNotNull(casefilepage. getthreeLocator());
		Assert.assertNotNull(casefilepage. getfourLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getfiveLocator());
		Assert.assertNotNull(casefilepage. getsixLocator());
		Assert.assertNotNull(casefilepage. getsevenLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. geteightLocator());
		Assert.assertNotNull(casefilepage. getnineLocator());
		Assert.assertNotNull(casefilepage. gettenLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getmildLocator());
		Assert.assertNotNull(casefilepage. getModerateLocator());
		Assert.assertNotNull(casefilepage. getSevereLocator());
		Assert.assertNotNull(casefilepage. getEctomorphbuiltLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getMesomorphLocator());
		Assert.assertNotNull(casefilepage. getEndomorphbuiltLocator());
		Assert.assertNotNull(casefilepage. getTreatmentScheduleLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getMesomorphLocator());
		Assert.assertNotNull(casefilepage. getFrequencyvisitLocator());
		Assert.assertNotNull(casefilepage. getReasonsPorteaLocator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getTreatmentProgrammeLocator());
		Assert.assertNotNull(casefilepage. getTs1Locator());
		Assert.assertNotNull(casefilepage. getTs2Locator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getTs3Locator());
		GlobalUtil.wait(2);
		Assert.assertNotNull(casefilepage. getDreaftLocator());
		Assert.assertNotNull(casefilepage. getSaveLocator());
		}
}

		

