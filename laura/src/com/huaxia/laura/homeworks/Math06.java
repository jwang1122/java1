package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math06 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Height of cylinder: ");
		double height = input.nextDouble();
		System.out.println("Radius of cylinder: ");
		double radius = input.nextDouble();
		double lateralArea = 2 * Math.PI * radius * height;
		double surfaceArea = 2 * Math.PI * Math.pow(radius, 2) + lateralArea;
		System.out.printf("Surface Area is: %.3f", surfaceArea);
		input.close();
	}

}
