package com.qa.mobileapp.common;

public class GlobalConstants {

	public enum STATUS{
		CONFIRMED("confirmed"), SUCCESSFUL("successful"), PENDING("pending"), CANCELLED("cancelled");
		
		private String name;
		
		public String getName(){
			return this.name;
		}
		
		STATUS(String name){
			this.name = name;
		}
	}
	
	
	public enum SUBSERVICE{
		ADL_Training;
	}
	
	public enum PREFERENCES
	{
		IFT, UltraSound, TENS, MuscleStimulator, Female, Male, Others;
	}
	
	public enum GENDER
	{
		Male, Female;
	}
	
	
}
