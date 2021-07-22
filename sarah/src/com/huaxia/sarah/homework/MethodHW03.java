package com.huaxia.sarah.homework;

import java.util.Scanner;

public class MethodHW03 {
	
	public static String average(String nums) {
		 	int position;
	        int length;
	        if (nums.length() % 2 == 0)
	        {
	            position = nums.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = nums.length() / 2;
	            length = 1;
	        }
	        return nums.substring(position, position+length);
	}

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Input a string: ");
		String nums = inputFromConsole.nextLine();
		inputFromConsole.close();
		
		String result = average(nums);
		System.out.println("The middle character in the string: " + result);

	}

}
