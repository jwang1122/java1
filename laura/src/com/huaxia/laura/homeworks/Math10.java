package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math10 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Base: ");
		int base = input.nextInt();
		System.out.println("Height: ");
		int height = input.nextInt();
		double area = 1.0/2.0 * base * height;
		System.out.printf("Area: %.0f", area);
		input.close();
	}

}
