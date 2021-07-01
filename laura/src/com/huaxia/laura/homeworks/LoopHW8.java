package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class LoopHW8 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		input.close();
		System.out.println("Enter any positive integer:");
		int num = input.nextInt();
		int value = 0;
		int index = 0;
		int factorial = 0;
		double e = 1;
		
		value = num;
		
		while(value > 0) 
		{
			if (value == 1) 
			{
				factorial = 1;
			}
			else 
			{
				index = value - 1;
				factorial = value;
				while(index > 0) 
				{
					factorial *= index;
					index--;
				}
			}
			value--;
			e += 1.0 / factorial;
		}
		System.out.printf("The Euler's Constant is %.16f" , e);
	}

}
