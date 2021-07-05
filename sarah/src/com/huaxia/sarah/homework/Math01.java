package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math01 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("For given radius: ");
		String baseInput = inputFromConsole.nextLine();
		double radius = Double.parseDouble(baseInput);
		inputFromConsole.close();
		
		double diameter = radius * 2;
		System.out.printf("The circle diameter with radius=%.1f is %.1f.", radius, diameter);


	}

}
