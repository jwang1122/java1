package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math05 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = input.nextDouble();
		double volume = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
		System.out.printf("The sphere with radius %.3f is %.3f", radius, volume);
		input.close();
	}

}
