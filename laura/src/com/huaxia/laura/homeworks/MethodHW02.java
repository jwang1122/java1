package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW02 
{
	public static double findAverage(int num1, int num2, int num3) 
	{
		double sum = num1 + num2 + num3;
		return sum/3;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int num1 = in.nextInt();
		System.out.println("Input the second number: ");
		int num2 = in.nextInt();
		System.out.println("Input the third number: ");
		int num3 = in.nextInt();
		double average = findAverage(num1, num2, num3);
		System.out.println("The average value is " + average);
		in.close();
	}

}
