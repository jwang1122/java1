package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW14 
{
	public static boolean findPrimeNumber(int num) 
	{
		if(num < 2) 
		{
			return false;
		}
		for(int i = 2; i <= num / 2; i++) 
		{
			if(num % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = in.nextInt();
		if(findPrimeNumber(num)) 
		{
			System.out.println("The number " + num + " is a prime number.");
		}
		else
		{
			System.out.println("The number " + num + " is not a prime number.");
		}
	}

}
