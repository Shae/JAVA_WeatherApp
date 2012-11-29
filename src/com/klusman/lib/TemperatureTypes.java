package com.klusman.lib;

public enum TemperatureTypes {
	
	FAHRENHEIT("�F"),
	CELSIUS("�C");
	
	private String nameAsString;
	
	private TemperatureTypes(String nameAsString){
		this.nameAsString = nameAsString;
	}
	
	@Override
	public String toString() {
		return this.nameAsString;
	}
}
