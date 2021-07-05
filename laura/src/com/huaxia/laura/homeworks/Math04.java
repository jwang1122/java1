package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math04 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a sphere: ");
		double radius = input.nextDouble();
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		System.out.printf("The sphere surface area with radius %.3f is %.3f", radius, surfaceArea);
		input.close();
	}

}
