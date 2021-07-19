package com.huaxia.sarah.homework;

import java.util.Scanner;

public class MethodHW02 {
	
	public static double average(double num1, double num2, double num3) {
		double ans = (num1 + num2 + num3)/3;
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		double num1 = inputFromConsole.nextDouble();
		System.out.print("Input the second number: ");
		double num2 = inputFromConsole.nextDouble();
		System.out.print("Input the third number: ");
		double num3 = inputFromConsole.nextDouble();
		
		inputFromConsole.close();
		
		double result = average(num1, num2, num3);
		System.out.printf("The average value is %.1f", result);

	}

}
