package com.qa.mobileapp.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.mobileapp.pages.AlertPage;
import com.qa.mobileapp.pages.AppointmentPage;
import com.qa.mobileapp.pages.CalendarPage;
import com.qa.mobileapp.pages.CampPage;
import com.qa.mobileapp.pages.CampPageS;
import com.qa.mobileapp.pages.CaseFilePage;
import com.qa.mobileapp.pages.CheckInCheckOutPage;
import com.qa.mobileapp.pages.DashboardPage;
import com.qa.mobileapp.pages.FeedbackPage;
import com.qa.mobileapp.pages.ForgotPasswordPage;
import com.qa.mobileapp.pages.LabAutomationPage;
import com.qa.mobileapp.pages.LeavePage;
import com.qa.mobileapp.pages.LogOutPage;
import com.qa.mobileapp.pages.LoginPage;
import com.qa.mobileapp.pages.MyTasksPage;
import com.qa.mobileapp.pages.MyTeamPage;
import com.qa.mobileapp.pages.NAAppPage;
import com.qa.mobileapp.pages.OperationsPage;
import com.qa.mobileapp.pages.PCOScreenPage;
import com.qa.mobileapp.pages.PatientPage;
import com.qa.mobileapp.pages.PaymentPage;
import com.qa.mobileapp.pages.ProfilePage;
import com.qa.mobileapp.pages.ReferPatientPage;
import com.qa.mobileapp.pages.ReportsPage;
import com.qa.mobileapp.pages.SettingsPage;




public class TestBase {

	//public static AndroidDriver driver;
	public static AppiumDriver driver;
	protected LoginPage loginpage;
	protected ProfilePage profilepage;
	protected AppointmentPage appointmentpage;
	protected PatientPage patientpage;
	protected FeedbackPage feedbackpage;
	protected PaymentPage paymentspage;
	protected ReportsPage reportspage;
	protected AlertPage alertpage;
	protected CampPage camppage;
	protected ReferPatientPage referpatientpage;
	protected CaseFilePage casefilepage;
	protected LeavePage leavepage;
	protected LogOutPage logoutpage;
	protected DashboardPage dashboardpage;
	protected DesiredCapabilities capabilities; 
	protected CampPageS camppages;
	protected ReferPatientPage referpatientpages;
	protected LeavePage leavepages;
	protected AlertPage alertpages;
	protected CalendarPage calendarpages;
	protected ForgotPasswordPage forgotpasswordpage;
	protected CheckInCheckOutPage checkincheckoutpage;
	protected LabAutomationPage labautomationpage;
	protected NAAppPage naapppage;
	protected PCOScreenPage pcoscreenpage;
	protected SettingsPage settingspage;
	protected MyTeamPage myteampage;
	protected MyTasksPage mytaskspage;
	protected OperationsPage operationspage;

	@BeforeClass(alwaysRun=true)
	public void setUp() throws Exception {		
		File app = new File(System.getProperty("user.dir")+"/src/test/resources/android","CA_v35.0_57_STAGE_13032017_02(2).apk");
		capabilities = new DesiredCapabilities(); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"23.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"MarshAvd");
				//DEVICE_NAME,"GenyAvd");
		capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.portea.internal.app.activity.SplashActivity");
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.healthvista.clinicianapp.stage");
		capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY,"com.portea.internal.app.activity.SplashActivity");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,600);
		
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	protected void ensureLogin(String userName, String password){
		
		GlobalUtil.wait(2);
		loginpage = new LoginPage(driver);
		loginpage.login(userName, password);
		dashboardpage = new DashboardPage(driver);
	
	}
	
	@AfterClass(alwaysRun=true)
	public void cleanUp(){
		try{
			if(driver != null){
				driver.quit();

			}
		}finally{
			driver = null;
		}
	}
}
