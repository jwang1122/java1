package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW10 
{
	public static String checkLeapYear(int year) 
	{
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) != 0;
		boolean c = ((year % 100 == 0) && (year % 400 == 0));
		if(a && (b || c)) 
		{
			return "The year " + year + " is a leap year.";
		}
		else
		{
			return "The year " + year + " is NOT a leap year.";
		}
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input a year: ");
		int year = in.nextInt();
		System.out.println(checkLeapYear(year));
		in.close();
	}

}
