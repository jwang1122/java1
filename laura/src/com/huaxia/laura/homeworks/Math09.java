package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math09 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("Width: ");
		int width = input.nextInt();
		int area = length * width;
		System.out.println("Area: " + area);
		input.close();
	}

}
