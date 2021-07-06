package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integer numbers: ");
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		int GCD = 0;
		if(numOne > numTwo) 
		{
			GCD = numOne - numTwo;
			System.out.println("The GCD for " + numOne + " and " + numTwo + " is " + GCD + ".");
		}
		else if(numTwo > numOne) 
		{
			GCD = numTwo - numOne;
			System.out.println("The GCD for " + numOne + " and " + numTwo + " is " + GCD + ".");
		}
		else if(numOne == numTwo)
		{
			System.out.println("The GCD for " + numOne + " and " + numTwo + " is " + numOne + ".");
		}
		input.close();
	}

}
