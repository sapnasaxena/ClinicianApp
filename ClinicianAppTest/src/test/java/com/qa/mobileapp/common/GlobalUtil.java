package com.qa.mobileapp.common;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class GlobalUtil {
	
	public static final int ShortInterval = 3;
	public static final int LongInterval = 30;
	public static final int MinuteInterval = 1;
	public static final int StandardInterval = 10;
	public static final String PLACEHOLDER = "<PLACE_HOLDER>";
    AppiumDriver driver;
	
	/*wait for time*/
	
	public static void wait(int secs)
    {
        try {
            Thread.sleep(secs * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	/*Generates a sixteen character long random string */
	
	public static String generateRandomString(){
		return Long.toHexString(Double.doubleToLongBits(Math.random()));
	}
	
	
	/*Generate random numbers*/
	public static String getRandomNumber(int length)
	{
		Random rndNumber =  new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= length; i++){
            int number = rndNumber.nextInt((9-1)) + 1;
            sb.append((char)(number));
        }
        System.out.println(sb);
        return sb.toString();
	}
	
	public static String getRandomName(int length){
       Random rndNumber =  new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= length; i++){
            int number = rndNumber.nextInt((122-97)) + 97;
            sb.append((char)(number));
        }
        System.out.println(sb);
        return sb.toString();
    }


//		public static String getCurrentDate()
//		{
//			 Calendar currentDate = Calendar.getInstance();
//			  SimpleDateFormat formatter= 
//			  //new SimpleDateFormat("yyyy/MMM/dd");
//			  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
//			  String dateNow = formatter.format(currentDate.getTime());
//			  System.out.println("Now the date is :=>  " + dateNow);
//			  return dateNow;
//		}
	
	public static String getCurrentDateDay()
	{
		return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.DATE);
		 
	}
		public static String getCurrentDate()
		{
			 return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			 
		}
		public static String getCurrentDateInDD()
		{
			 Calendar cal=Calendar.getInstance();
			  SimpleDateFormat month_date = new SimpleDateFormat("DD");
			  String date = month_date.format(cal.getTime());
			  return date;
		}
		
		public static String getTomorrowDate() throws ParseException
		{
			String untildate=getCurrentDate();//can take any date in current format    
			SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" );   
			Calendar cal = Calendar.getInstance();    
			cal.setTime(dateFormat.parse(untildate));    
			cal.add(Calendar.DATE, 1 );    
			String convertedDate=dateFormat.format(cal.getTime());    
			System.out.println("Date increase by one.."+convertedDate);
			return convertedDate;
		}
		
		public static String getTomorrowDateinDD() throws ParseException
		{
			String untildate=getCurrentDate();//can take any date in current format    
			SimpleDateFormat dateFormat = new SimpleDateFormat("DD");   
			Calendar cal = Calendar.getInstance();    
			cal.setTime(dateFormat.parse(untildate));    
			cal.add(Calendar.DATE, 1 );    
			String convertedDate=dateFormat.format(cal.getTime());    
			System.out.println("Date increase by one.."+convertedDate);
			return convertedDate;
		}
		public static void getCurrentMonth()
		{
			int month;
	        GregorianCalendar date = new GregorianCalendar();      
	        month = date.get(Calendar.MONTH);
	        month = month+1;
	        System.out.println("Current month is  " + month);
		}

		public static String getCurrentMonthInWords()
		{
			 Calendar cal=Calendar.getInstance();
			  SimpleDateFormat month_date = new SimpleDateFormat("MMMM");
			  String month_name = month_date.format(cal.getTime());
			  return month_name;
		}
//		public static String getCurrentMonth()
//		{
//			 Calendar currentDate = Calendar.getInstance();
//			  SimpleDateFormat formatter= 
//			  new SimpleDateFormat("yyyy/MMM/dd");
//			  String monthNow = formatter.format(currentDate.getWeekYear());
//			  System.out.println("Now the date is :=>  " + monthNow);
//			  return monthNow;
//		}
		
	
		public static String generateRandomMobileNo()
		{
			Random random=new Random();
		    int randomNumber=0;
		    boolean loop=true;
		    while(loop) {
		        randomNumber=random.nextInt();
		        if(Integer.toString(randomNumber).length()==10 && !Integer.toString(randomNumber).startsWith("-")) {
		            loop=false;
		        }
		        }
		    return Integer.toString(randomNumber); 
		
		}
	 
		public static String getCurrentMonthInMMM()
		{
			 Calendar cal=Calendar.getInstance();
			  SimpleDateFormat month_date = new SimpleDateFormat("MMM");
			  String month_name = month_date.format(cal.getTime());
			  return month_name;
		}
		
//		public static String getCurrentDateInDD()
//		{
//			 Calendar cal=Calendar.getInstance();
//			  SimpleDateFormat month_date = new SimpleDateFormat("DD");
//			  String date = month_date.format(cal.getTime());
//			  return date;
//		}
/**
 * Scrolls a ListView
 * @param textFieldValue - text that needs to be present in the list view's element
 * @param scrollTo - scroll to the element
 */
public WebElement verticalScroll(String textFieldValue, By scrollTo, int maxScroll)
{

	List<WebElement> elements = driver.findElements(scrollTo);
	if(elements.size() > 0){
		return elements.get(0);
	}else{
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + textFieldValue + " ')]/parent::*"));
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


}

