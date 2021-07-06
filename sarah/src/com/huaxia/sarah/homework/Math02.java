package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math02 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Enter radius of circle(1.1): ");
		String baseInput = inputFromConsole.nextLine();
		double radius = Double.parseDouble(baseInput);
		inputFromConsole.close();
		
		double area = Math.PI * Math.pow(radius, 2);
		System.out.printf("The circle area with radius=%.3f is %.3f.", radius, area);

	}

}
