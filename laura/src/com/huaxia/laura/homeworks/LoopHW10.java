package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class LoopHW10 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int num = userInput.nextInt();
		int total = 0;
		for(int i = 1; i <= num; i++) 
		{
			total = total + i;
		}
		System.out.println("The sum from 1 to " + num + " is " + total + ".");
	}

}
