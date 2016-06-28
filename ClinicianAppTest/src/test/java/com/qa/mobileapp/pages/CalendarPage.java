package com.qa.mobileapp.pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import com.qa.mobileapp.common.BasePage;

public class CalendarPage extends BasePage {

	public CalendarPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/* Author: Lipsha satpathy
	 * Created date: 4th and 15th april 2016
	 * XPATH for calendar Page 
	 * */

	private final By calendarScreenLocator = By.name("Calendar");
	private final By nextMonthScreenImageLocator = By.className("android.widget.ImageView");
	private final By previousMonthScreenImageLocator = By.className("android.widget.TextView");
	private final By saveButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/checkbutton");
	private final By currentmonthtextLocator = By.name("April 2016");
	private final By PopuplistLocator = By.id("com.healthvista.clinicianapp.stage:id/popupList ");	
	private final By appointmentPointerLocator = By.id("com.healthvista.clinicianapp.stage:id/imageView1");
	private final By dateFromCalendarLocator = By.name("WED");
	private final By appointmentPopUpLocator=By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By cancelAppointmentPopUpLocator=By.name("Cancel");
	
	private final By dayFromCalendarLocator = By.id("com.portea.internal:id/textView1");
	
	//if holiday is there then its marked as red for this id is missing
	
	private final By homeBackButtonLocator = By.id("com.healthvista.clinicianapp.stage:id/homeback");
	private final By ExistingappointmentlistLocator = By.name("Existing Appointments");
	private final By cancelButtonLocator = By.name("Cancel");
	private final By okayButtonLocator = By.name("Okay");
	private final By overtimedateSelectedLocator = By.id(" com.healthvista.clinicianapp.stage:id/tvovertime");
	private final By alertpopuptimetextLocator = By.id("com.healthvista.clinicianapp.stage:id/alertTitle");
	private final By PatientreferalLocator = By.name("com.healthvista.clinicianapp.stage:id/title1");
	private final By TimeanddateunderpatientnameLocator = By.name("com.healthvista.clinicianapp.stage:id/title2");
	
	
	public By getcalendarScreenLocator() {
		return calendarScreenLocator;
	}
	
	public By getnextMonthScreenImageLocator() {
		return nextMonthScreenImageLocator;
	}
	
	public By getsaveButtonLocator() {
		return saveButtonLocator;
	}
	
	public By getpreviousMonthScreenImageLocator() {
		return previousMonthScreenImageLocator;
	}
	
	public By getcurrentmonthtextLocator() {
		return  currentmonthtextLocator;
	}
	
	public By getPopuplistLocator() {
		return  PopuplistLocator;
	}
	
	public By getdateFromCalendarLocator() {
		return  dateFromCalendarLocator;
	}
	
	public By getdayFromCalendarLocator() {
		return  dayFromCalendarLocator;
	}
	
	
	public By gethomeBackButtonLocator() {
		return  homeBackButtonLocator;
	}
	
	public By getExistingappointmentlistLocator() {
		return   ExistingappointmentlistLocator;
	}
	
	public By getcancelButtonLocator() {
		return   cancelButtonLocator;
	}
	
	public By getokayButtonLocator() {
		return   okayButtonLocator;
	}
	
	public By geovertimedateSelectedLocator() {
		return   overtimedateSelectedLocator;
	}

	public By getalertpopuptimetextLocator() {
		return   alertpopuptimetextLocator;
	}
	


public By getPatientreferalLocator() {
	return   PatientreferalLocator;
}


public By getTimeanddateunderpatientnameLocator() {
	return   TimeanddateunderpatientnameLocator;
}


public By getCancelAppointmentPopUpLocator() {
	return cancelAppointmentPopUpLocator;
}

public By getAppointmentPointerLocator() {
	return appointmentPointerLocator;
}

public By getAppointmentPopUpLocator() {
	return appointmentPopUpLocator;
}

public void onclickcalendarScreenLocator()
{
clickWhenVisible(calendarScreenLocator);

}

public void onclicknextMonthScreenImageLocator()
{
clickWhenVisible(nextMonthScreenImageLocator);

}

public void onclickpreviousMonthScreenImageLocator()
{
clickWhenVisible(previousMonthScreenImageLocator);

}


public void onClickOkayButton()
{
clickWhenVisible(okayButtonLocator);

}

public void onClicksaveCheckButton()
{
clickWhenVisible(saveButtonLocator);

}

public void onClickcurrentmonthtextLocator()
{
 clickWhenVisible(currentmonthtextLocator);

}

public void onClickPopuplistLocator()
{
clickWhenVisible(PopuplistLocator);

}

public void onClickdateFromCalendarLocator()
{
	clickWhenVisible(appointmentPointerLocator);


}

public void onClickdayFromCalendarLocator()
{
clickWhenVisible(dayFromCalendarLocator);

}

public void onClickhomeBackButtonLocator()
{
clickWhenVisible(homeBackButtonLocator);

}

public void onClickExistingappointmentlistLocator()
{
clickWhenVisible(ExistingappointmentlistLocator);

}

public void onClickcancelButtonLocator()
{
clickWhenVisible(cancelButtonLocator);

}

public void onClickovertimedateSelectedLocator()
{
clickWhenVisible(overtimedateSelectedLocator);

}

public void onClickalertpopuptimetextLocator()
{
clickWhenVisible(alertpopuptimetextLocator);

}

public void onClickPatientreferalLocator()
{
clickWhenVisible(PatientreferalLocator);

}

public void onClickTimeanddateunderpatientnameLocator()
{
clickWhenVisible(TimeanddateunderpatientnameLocator);

}


	
}

