package com.huaxia.emma.homeworks;

import java.util.Scanner;

public class LoopHw9 {

	

public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your data:(number power) ");
	
		double number= input.nextInt();
		double power = input.nextInt();
		double answer = Math.pow(number, power);
		input.close();

		System.out.println(number + " raised to the power of " + power +" will be " + answer +".");
}
}//
	