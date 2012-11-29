package com.klusman.lib;

public enum MonthConvert {
	JANUARY("Jan"),
	FEBRUARY("Feb"),
	MARCH("Mar"),
	APRIL("Apr"),
	MAY("May"),
	JUNE("Jun"),
	JULY("Jul"),
	AUGUST("Aug"),
	SEPTEMBER("Sep"),
	OCTOBER("Oct"),
	NOVEMBER("Nov"),
	DECEMBER("Dec");
	

	
	private String nameAsString;
	
	private MonthConvert(String nameAsString){
		this.nameAsString = nameAsString;
	}
	
	@Override
	public String toString() {
		return this.nameAsString;
	}
}

	



