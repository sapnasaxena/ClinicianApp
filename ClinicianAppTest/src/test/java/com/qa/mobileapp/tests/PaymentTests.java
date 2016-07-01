package com.qa.mobileapp.tests;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;






import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobileapp.common.GlobalUtil;
import com.qa.mobileapp.common.TestBase;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.PaymentPage;

//**Author: Sapna Saxena
//**Created date: 05-APR-2016


public class PaymentTests extends TestBase{

	public static final String userName ="dinnyportea@gmail.com";
	public static final String password ="password";

	@BeforeClass(alwaysRun=true)
	public void initPayment() throws MalformedURLException{		
		ensureLogin(userName, password);
	}


	@BeforeMethod(alwaysRun=true)
	public void initPageObjects(){
		dashboardpage = new DashboardPage(driver);
		paymentspage = new PaymentPage(driver);
	}


	//UI Test Scenarios
	@Test(groups = { "UITest" })
	public void TC_01_testVerifyPaymentScreenVisiblity()
	{
		System.out.println("Verify that on click Payments nav bar, user is able to see Payments Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(paymentspage.getPaymentScreenLocator());
	}

	@Test(groups = { "UITest" })
	public void TC_02_testVerifyCashInHandANDDepositedTabVisiblity()
	{
		System.out.println("Verify that on click Payments nav bar, Cash in Hand and Deposited Tab is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(paymentspage.getCashInHandTabLocator());
		Assert.assertNotNull(paymentspage.getDepositedTabLocator());
	}

	@Test(groups = { "UITest" })
	public void TC_03_testVerifyRefreshButtonVisiblity()
	{
		System.out.println("Verify that on click Payments nav bar, Cash in Hand and Deposited Tab is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(paymentspage.getRefreshButtonLocator());
	}


	@Test(groups = { "UITest" })
	public void TC_04_testVerifyAmountTypeUserAndDateFieldVisibiltyOnCashInHandTab()
	{
		System.out.println("Verify that on Cash in Hand screen, should display Payment details like Amount, type, User and Date");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(paymentspage.getAmountFieldCIHTabLocator());
		Assert.assertNotNull(paymentspage.getTypeFieldCIHTabLocator());
		Assert.assertNotNull(paymentspage.getUserFieldCIHTabLocator());
		Assert.assertNotNull(paymentspage.getDateFieldCIHTabLocator());
	}



	@Test(groups = { "UITest" })
	public void TC_05_testVerifyCheckBoxOnCashInHandTab()
	{
		System.out.println("Verify that on Cash In Hand tab, Checkbox is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		Assert.assertNotNull(paymentspage.getCheckBoxCIHTabLocator());
	}


	@Test(groups = { "UITest" })
	public void TC_06_testVerifyDepositButtonVisiblityOnSelectingCheckBox()
	{
		System.out.println("Verify that on Cash In Hand tab, on selecting checkbox, Deposit button is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		Assert.assertNotNull(paymentspage.getDepositButtonOnSelectedCIHLocator());
	}

	@Test(groups = { "UITest" })
	public void TC_08_testVerifyOnClickDepositButtonDepositScreenVisiblity()
	{
		System.out.println("Verify that on Cash In Hand tab, on selecting checkbox, Deposit button is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(2);
		paymentspage.onClickDepositButtonOnCIHTab();
		Assert.assertNotNull(paymentspage.getDepositScreenTitleLocator());
	}



	@Test(groups = { "UITest" })
	public void TC_07_testVerifyBranchCityAndNotesFieldVisiblityOnDepositScreen()
	{
		System.out.println("Verify that on Deposit Screen, City field is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(2);
		paymentspage.onClickDepositButtonOnCIHTab();
		Assert.assertNotNull(paymentspage.getEnterCityFieldLocator());
		Assert.assertNotNull(paymentspage.getEnterNotesFieldLocator());
		Assert.assertNotNull(paymentspage.getEnterBranchNameFieldLocator());
		Assert.assertNotNull(paymentspage.getEnterBankNameFieldLocator());
	}


	@Test(groups = { "UITest" })
	public void TC_09_testVerifyDepositButtonVisiblityOnDepositScreen()
	{
		System.out.println("Verify that on selecting and tapping  any record in Cash In hand, should display Deposit button on tap.");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(2);
		paymentspage.onClickDepositButtonOnCIHTab();
		Assert.assertNotNull(paymentspage.getDepositButtonOnDepositScreenLocator());
	}

	//functional test scenarios

	//@Test(groups = { "UITest" })
	public void testVerifyPendingConfirmationStatusVisiblityOnCashInHandTab()
	{
		System.out.println("Verify that on Deposit amount, pending confirmation message visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(1);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(2);
		paymentspage.onClickDepositButtonOnCIHTab();
		GlobalUtil.wait(2);
		paymentspage.selectDepositModeCashCollection();
		Assert.assertNotNull(paymentspage.getPendingConfirmationMessageLocator());
	}


	//@Test(groups = { "functest" })
	public void testVerifyErrorWhileDepositAmountOnLeavingBlankFields()
	{
		System.out.println("Verify that while Deposit amount on leaving blank field, error for required is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(2);
		paymentspage.onClickDepositButtonOnCIHTab();
		GlobalUtil.wait(2);
		paymentspage.depositAmount("testbank", "testbranch", "Bangalore", "testnotes");
		Assert.assertNotNull(paymentspage.getPendingConfirmationMessageLocator());
	}

	//@Test(groups = { "UITest" })
	public void TC_testVerifyDepositedAmountCASHINHANDListedOnDepositedTab()
	{

		System.out.println("Verify that on Deposited amount, deposited amount is visible to user");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(2);
		paymentspage.onClickDepositButtonOnCIHTab();
		GlobalUtil.wait(2);
		paymentspage.selectDepositModeCashCollection();
		Assert.assertNotNull(paymentspage.getCashInHandTabLocator());
//		Assert.assertNotNull(paymentspage.getAmountFieldDepoistedTabLocator());
//		Assert.assertNotNull(paymentspage.getTypeFieldCIHTabLocator());
//		Assert.assertNotNull(paymentspage.getStatusOnDepositedTabLocator());
	}

	@Test(groups = { "functest" })
	public void TS_01_testVerifyDepositedAmountThroughiSure()
	{

		System.out.println("Verify that user can able to deposit the amount from cash in hand by using ICICI isure pay");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(1);
		paymentspage.onClickDepositButtonOnCIHTab();
		GlobalUtil.wait(2);
		paymentspage.selectDepositModeICICIISure();
		Assert.assertNotNull(paymentspage.getiSurePopUpAlertLocator());
		Assert.assertNotNull(paymentspage.getiSurePopUpMessageLocator());
		Assert.assertNotNull(paymentspage.getiSurePopUpOKButtonLocator());  
	}

	@Test(groups = { "functest" })
	public void TS_02_testVerifyDepositedAmountThroughCashCollection()
	{

		System.out.println("Verify that user can able to deposit the amount from cash in hand by using Cash Collection");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(2);
		paymentspage.selectCheckBox();
		GlobalUtil.wait(1);
		paymentspage.onClickDepositButtonOnCIHTab();
		GlobalUtil.wait(2);
		paymentspage.selectPaymentMode(2);
		Assert.assertNotNull(paymentspage.getChooseDepositModeLocator());
		Assert.assertNotNull(paymentspage.getEnterNotesFieldLocator());
		Assert.assertNotNull(paymentspage.getEnterOTPLocator());  
		Assert.assertNotNull(paymentspage.getDepositButtonLocator()); 
	}
	
	@Test(groups = { "functest" })
	public void TS_05_testVerifyUserIsAbleToRefreshPaymentScreen()
	{

		System.out.println("Verify that user can able to refresh the Payments Screen");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(1);
		paymentspage.refreshPaymentScreen();
		Assert.assertNotNull(paymentspage.getPaymentScreenLocator());
	}
	
	@Test(groups = { "functest" })
	public void TS_06_testVerifyUserIsAbleToDeclineiSurePayment()
	{

		System.out.println("Verify that user should able to decline ICICI iSure pay deposites ");
		dashboardpage.onTapDashboardtext();
		GlobalUtil.wait(2);
		dashboardpage.onTapMyTasksExpandButton();
		GlobalUtil.wait(2);
		dashboardpage.onTapPaymentsNav();
		GlobalUtil.wait(1);
		paymentspage.onClickDepositedTab();
		GlobalUtil.wait(1);
		paymentspage.cancelISurePayment();
		Assert.assertNotNull(paymentspage.getPaymentScreenLocator());
	}

	@AfterMethod(alwaysRun=true)
	public void ensurePaymentPage() throws MalformedURLException{
		boolean bFound = false;
		try{
			paymentspage.onTapBackButton();
			driver.navigate().back();
			if(paymentspage.waitVisible(paymentspage.getExitAppTitleLocator(), GlobalUtil.ShortInterval) != null)
				driver.navigate().back();
			GlobalUtil.wait(GlobalUtil.ShortInterval);
			paymentspage.dismissLocation();
			int i = 0;
			LoopThrice:
			while(i < 3){
				if(paymentspage.waitVisible(paymentspage.getHomeScreenLocator(), GlobalUtil.ShortInterval) != null){
					bFound = true;
					break LoopThrice;
				}
				i++;
			}
		}catch(Exception ex){
			bFound = false;
		}
		if(!bFound){
			System.out.println("Payments page could not be restored. Performing relogin.");
			driver.quit();
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ensureLogin(userName, password);
		}
	}
}
