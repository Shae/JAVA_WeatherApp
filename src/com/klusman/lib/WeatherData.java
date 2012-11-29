package com.klusman.lib;

public interface WeatherData {
	
	
	// Set Day
	public boolean setDay(String date);
	// Set Temp High
	public boolean setTempHigh(int intHigh);
	// Set Temp Low
	public boolean setTempLow(int intLow);
	
	
	// Get Day
	public String getDay();
	// Get Temp High
	public int getTempHigh();
	// Get Temp Low
	public int getTempLow();

}
