package com.klusman.lib;

import java.util.HashMap;


// I AM NOT SURE HOW I CAN USE THIS YET.  I WANTED TO USE IT WHEN I PULL MY DATA FROM THE WEB, 
// THEN I COULD INSERT THE WEATHER DATA INTO THE DAY 
// (SINCE THERE CANT BE MORE THEN ONE OF ANY GIVEN DAY IN A 5 DAY SPAN)

public enum DayConvert {

	FIRST(1),
	SECOND(2),
	THIRD(3),
	FORTH(4),
	FIFTH(5),
	SIXTH(6),
	SEVENTH(7),
	EIGHTH(8),
	NINTH(9),
	TENTH(10),
	ELEVENTH(11),
	TWELVTH(12),
	THIRTEENTH(13),
	FOURTEENTH(14),
	FIFTEENTH(15),
	SIXTEENTH(16),
	SEVENTEENTH(17),
	EIGHTEENTH(18),
	NINETEENTH(19),
	TWENTIETH(20),
	TWENTY_FIRST(21),
	TWENTY_SECOND(22),
	TWENTY_THIRD(23),
	TWENTHY_FOURTH(24),
	TWENTY_FIFTH(25),
	TWENTY_SIXTH(26),
	TWENTY_SEVENTH(27),
	TWENTY_EIGHTH(28),
	TWENTHY_NINTH(29),
	THIRTIETH(30),
	THIRTY_FIRST(31);


	
	private final int value;
	
	DayConvert(int value) {
		this.value = value;
	}
	
	public static HashMap<DayConvert, Integer> getDay(int day){
		HashMap<DayConvert, Integer> date = new HashMap<DayConvert, Integer>();
		DayConvert[] dates = {
				FIRST,
				SECOND,
				THIRD,
				FORTH,
				FIFTH,
				SIXTH,
				SEVENTH,
				EIGHTH,
				NINTH,
				TENTH,
				ELEVENTH,
				TWELVTH,
				THIRTEENTH,
				FOURTEENTH,
				FIFTEENTH,
				SIXTEENTH,
				SEVENTEENTH,
				EIGHTEENTH,
				NINETEENTH,
				TWENTIETH,
				TWENTY_FIRST,
				TWENTY_SECOND,
				TWENTY_THIRD,
				TWENTHY_FOURTH,
				TWENTY_FIFTH,
				TWENTY_SIXTH,
				TWENTY_SEVENTH,
				TWENTY_EIGHTH,
				TWENTHY_NINTH,
				THIRTIETH,
				THIRTY_FIRST
				};
		
		return date;
	}
	
	
}
