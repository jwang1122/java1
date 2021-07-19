package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW06 
{
	public static int findSumOfInt(int num) 
	{
		int sum = 0;
		while(num > 0) 
		{
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int num = in.nextInt();
		System.out.println("The sum is " + findSumOfInt(num));
		in.close();
	}

}
