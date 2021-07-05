package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math07 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Height of cylinder: ");
		double height = input.nextDouble();
		System.out.println("Radius of cylinder: ");
		double radius = input.nextDouble();
		double volume = Math.PI * Math.pow(radius, 2) * height;
		System.out.printf("Volume is: %.3f", volume);
		input.close();
	}

}
