package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.LoginPage;
import com.qa.mobileapp.pages.PaymentPage;
import com.qa.mobileapp.pages.ReferPatientPage;

//Author: Shital Kumar

public class ReferPatientTests extends TestBase{

	
	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="Portea123";
	
	@BeforeClass(alwaysRun=true)
	public void initReferPatient() throws MalformedURLException{		
		ensureLogin(userName, password);
	}
	

	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		referpatientpages = new ReferPatientPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void ensureReferPatientPage() throws MalformedURLException{	
		boolean bFound = false;
		try{
		driver.navigate().back();
		if(referpatientpages.waitVisible(referpatientpages.getExitAppTitleLocator(), GlobalUtil.ShortInterval)!=null)
			driver.navigate().back();
		GlobalUtil.wait(GlobalUtil.ShortInterval);
		referpatientpages.dismissLocation();
		int i = 0;
	   LoopThrice:
		while(i < 3){
			if(referpatientpages.waitVisible(referpatientpages.getHomeScreenLocator(), GlobalUtil.ShortInterval)!=null){
				bFound = true;
				break LoopThrice;
			}
			i++;
		}}
		catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Refer Patient page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
	
	
	//UI Scenarios
	
	@Test(groups = { "UITest" })
	public void tc_01_testVerifyReferPatientOnSideMenu()
	{
		System.out.println("Verify that on tap Refer Patient nav, should display Refer a Patient details screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		Assert.assertNotNull(referpatientpages.getReferPatientScreenLocator());
	}
	
	@Test(groups = { "UITest" })
	public void tc_02_testVerifyPatientDetailsPage()
	{
		System.out.println("Verify that Refer Patient details screen should have fields like New Patient name, Mobile number, Service required, City, Existing Patient ID, details, radio button Portea Patient or Personal network along with Cancel and Done button.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(3);
		Assert.assertNotNull(referpatientpages.getReferAPatientText());
		Assert.assertNotNull(referpatientpages.getradioButton());
		Assert.assertNotNull(referpatientpages.getPorteaPatient());
		Assert.assertNotNull(referpatientpages.getPersonalNetwork());
		Assert.assertNotNull(referpatientpages.getNewPatientName());
		Assert.assertNotNull(referpatientpages.getPatientMobileNumber());
		Assert.assertNotNull(referpatientpages.getServiceRequiredText());
		Assert.assertNotNull(referpatientpages.getPhysiotherapyText());
		Assert.assertNotNull(referpatientpages.getCityText());
		Assert.assertNotNull(referpatientpages.getBangaloreText());
		Assert.assertNotNull(referpatientpages.getExistingPatinet());
		Assert.assertNotNull(referpatientpages.getPatientDetails());
		Assert.assertNotNull(referpatientpages.getCancelButton());
		Assert.assertNotNull(referpatientpages.getDoneButton());
	}
	
	@Test (groups = { "UITest" })
	public void tc_03_testVerifyPatientDetailsSubmittion()
	{
		System.out.println("Verify that user should able to submit Refer a Patient successfully.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(3);
		Assert.assertNotNull(referpatientpages.getReferAPatientText());
		Assert.assertNotNull(referpatientpages.getradioButton());
		Assert.assertNotNull(referpatientpages.getPorteaPatient());
		Assert.assertNotNull(referpatientpages.getPersonalNetwork());
		Assert.assertNotNull(referpatientpages.getNewPatientName());
		Assert.assertNotNull(referpatientpages.getPatientMobileNumber());
		Assert.assertNotNull(referpatientpages.getServiceRequiredText());
		Assert.assertNotNull(referpatientpages.getPhysiotherapyText());
		Assert.assertNotNull(referpatientpages.getCityText());
		Assert.assertNotNull(referpatientpages.getBangaloreText());
		Assert.assertNotNull(referpatientpages.getExistingPatinet());
		Assert.assertNotNull(referpatientpages.getPatientDetails());
		Assert.assertNotNull(referpatientpages.getDoneButton());
	}
	
	@Test (groups = { "UITest" })
	public void tc_04_testCancelOptionOnPatientPage()
	{
		System.out.println("Verify that on tap cancel button should redirect to Dashboard screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(3);
		Assert.assertNotNull(referpatientpages.getCancelButton());
	}
	
	@Test (groups = { "UITest" })
	public void tc_04_testUploadsfieldOnReferPatientPage()
	{
		System.out.println("Verify that Upload field should be visible on Refer Patient screen.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
//		driver.scrollTo("Refer patient");
//		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(3);
		Assert.assertNotNull(referpatientpages.getUploadFieldLocator());
	}
	
	//**************** SHITAL FUNCTIONAL TEST CASES********************//
	
	//@Test(groups = { "functest" })
	
	@Test(groups = { "functest" })
	public void tc_CA693_06_uploadImageDocument() {
		System.out.println("Verify that user can able to refer patient for any service for the option Personal Networks");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(2);
		referpatientpages.uploadImageDocument();
		Assert.assertNotNull("Take photo");
		Assert.assertNotNull("Choose from Library");
		Assert.assertNotNull("Cancel");
	}
	
	@Test(groups = { "functest" })
	public void tc_CA693_06_ReferPatientThroughPorteaPatient() {
		System.out.println("Verify that user can able to refer patient for any service for the option Portea Patient");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(2);
		referpatientpage.referPatientViaPorteaPatient();
		//Assert.assertNotNull(referpatientpage.getChooseFromLibraryLocator());
		Assert.assertNotNull(referpatientpage.getReferAPatientText());
	}
	
	@Test(groups = { "functest" })
	public void tc_CA693_06_ReferPatientThroughPersonalNetwork() {
		System.out.println("Verify that user can able to refer patient for any service for the option Personal Networks");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapOperationsExpandButton();
		GlobalUtil.wait(2);
		driver.scrollTo("Refer patient");
		GlobalUtil.wait(1);
		dashboardpage.onTapReferPatientNav();
		GlobalUtil.wait(2);
		referpatientpage.referPatientViaPersonalNetwork();
		Assert.assertNotNull(referpatientpage.getReferAPatientText());
	}
	
	
}
