package com.klusman.lib;

import Data.WeatherData;

public class dayClassInfo implements WeatherData {

	String day;
	int high;
	int low;
	
	
	
	public dayClassInfo(String day, int high, int low){
		setDay(day);
		setTempHigh(high);
		setTempLow(low);
	}
	
	
	@Override
	public boolean setDay(String date) {
		this.day = date;
		return true;
	}

	@Override
	public boolean setTempHigh(int intHigh) {
		this.high = intHigh;
		return true;
	}

	@Override
	public boolean setTempLow(int intLow) {
		this.low = intLow;
		return true;
	}

	@Override
	public String getDay() {
		// TODO Auto-generated method stub
		return this.day;
	}

	@Override
	public int getTempHigh() {
		// TODO Auto-generated method stub
		return this.high;
	}

	@Override
	public int getTempLow() {
		// TODO Auto-generated method stub
		return this.low;
	}

}
