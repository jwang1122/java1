package com.huaxia.java1;

public class Switch {
	static String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday" };

	public static void main(String[] args) {
		int day = 4;
		System.out.println(getDay(day));
		System.out.println(getNumber("four"));

	}

	static String getName(char h) {
		String name = "";
		switch(h) { // Java switch only support byte, char, short, int, String, enum
		
		}
		return name;
	}
	
	static int getNumber(String num) {
		int result = 0;
		switch(num) {
		case "one":
			result = 1;
			break;
		case "two":
			result = 2;
			break;
		case "three":
			return 3;
		case "four":
			return 4;
		case "five":
			return 5;
		default:
			return 0;
		}
		return result;
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
			return "No such day.";
		}
	}
}
