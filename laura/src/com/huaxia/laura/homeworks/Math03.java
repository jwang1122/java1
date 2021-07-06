package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math03 
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = input.nextDouble();
		double circumference = 2 * radius * Math.PI;
		System.out.printf("The circumference with radius %.3f is %.3f.", radius, circumference);
		input.close();
	}

}
