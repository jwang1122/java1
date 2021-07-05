package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math03 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("For given radius = ");
		String baseInput = inputFromConsole.nextLine();
		double radius = Double.parseDouble(baseInput);
		inputFromConsole.close();
		
		double circum = Math.PI * (2 * radius);
		System.out.printf("The circle circumference with radius=%.0f is %.3f.", radius, circum);

	}

}
