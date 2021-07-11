package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW03 
{
	public static String findMiddle(String s) 
	{
		int oddEven = s.length()%2;
		String middle = "";
		if(oddEven == 0) 
		{
			int midEven1 = s.length()/2 - 1;
			int midEven2 = s.length()/2;
			char middleCharEven1 = s.charAt(midEven1);
			char middleCharEven2 = s.charAt(midEven2);
			middle = Character.toString(middleCharEven1) + middleCharEven2;
			return middle;
		}
		else if(oddEven == 1) 
		{
			int midOdd = s.length()/2;
			char middleCharOdd = s.charAt(midOdd);
			middle = Character.toString(middleCharOdd);
			return middle;
		}
		return middle;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string: ");
		String s = in.nextLine();
		String middleChar = findMiddle(s);
		System.out.println("The middle character(s) in the string: " + middleChar);
		in.close();
	}

}
