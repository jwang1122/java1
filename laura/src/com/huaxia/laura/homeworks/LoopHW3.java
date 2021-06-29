package com.huaxia.laura.homeworks;

/**
 * Better explain what your application for
 * 
 * @author John
 *
 */
public class LoopHW3 
{

	public static void main(String[] args) 
	{
		int factorial = 1;
		for(int i = 1; i <= 6; i++) 
		{
			factorial = factorial * i;
		}
		System.out.println("The factorial of 6 is: " + factorial);
	}

}
