package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class LoopHW9 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers:(number power):");
		double number = input.nextInt();
		double power = input.nextInt();
		double answer = Math.pow(number, power);
		System.out.println(number + " to the power of " + power + " is " + answer + ".");
	}

}
