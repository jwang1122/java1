package com.huaxia.connortan.homeworks;

import java.util.Scanner;

public class LoopHW6 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number: ");
		int number = input.nextInt();
		int total = 0;
		for(int i = 0; i < 9; i++) 
		{
			total = number * i;
			System.out.println(number + " * " + i + " = " + total);
		}
	}

}