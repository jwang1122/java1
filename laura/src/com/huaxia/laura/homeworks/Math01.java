package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math01 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = input.nextDouble();
		double diameter = radius * 2;
		System.out.println("The circle diameter with radius " +  radius + " is " + diameter + ".");
		input.close();
	}

}
