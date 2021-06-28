package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class LoopHW11 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		input.close();
		System.out.println("Enter the length of the list:");
		int length = input.nextInt();
		int[] list = new int [length];
		System.out.println("Enter the list of numbers(number number number number...)");
		for(int i = 0; i <= length; i++) 
		{
			list[i] = input.nextInt();
			if(list[i]%5 == 0) 
			{
				System.out.print(list[i] + " ");
			}
		}
	}

}
