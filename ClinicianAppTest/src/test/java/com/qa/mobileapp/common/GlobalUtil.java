package com.qa.mobileapp.common;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class GlobalUtil {
	
	public static final int ShortInterval = 3;
	public static final int LongInterval = 30;
	public static final int MinuteInterval = 1;
	public static final int StandardInterval = 10;
	public static final String PLACEHOLDER = "<PLACE_HOLDER>";
	
	
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


		public static String getCurrentDate()
		{
			 Calendar currentDate = Calendar.getInstance();
			  SimpleDateFormat formatter= 
			  new SimpleDateFormat("yyyy/MMM/dd");
			  String dateNow = formatter.format(currentDate.getTime());
			  System.out.println("Now the date is :=>  " + dateNow);
			  return dateNow;
		}
		
		
	}
	 
	 


