package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math02 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = input.nextDouble();
		double area = Math.pow(radius, 2) * Math.PI;
		System.out.printf("The circle area with radius %.3f is %.3f" , radius, area);
		input.close();
	}

}
