package com.huaxia.hongkai;

public class Switch {
	static String[] days = { "Moonday", "Tuesday", "Wednesday", "Thorsday", "Friday", "Saturday", "Sunday"};

	public static void main(String[] args) {
		int day = 4;
		System.out.println(getDay(day));
		System.out.println(getNumber("three"));

	}
	
	static int getNumber(String num) {
//		int result = 0;
		switch(num) {
		case "one":
			return 1;
		case "two":
			return 2;
		case "three":
			return 3;
		case "four":
			return 4;
		case "five":
			return 5;
		case "six":
			return 6;
		case "seven":
			return 7;
		default:
			return 0;
		}
//		return result;
	}
	static String getDay(int day) {
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			return days[day-1];
		default:
			return "No such day lol.";
		}
	}
}
