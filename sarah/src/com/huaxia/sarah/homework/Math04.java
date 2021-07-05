package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math04 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("For given radius = ");
		double radius = inputFromConsole.nextDouble();
		inputFromConsole.close();
		
		double SA = 4*(Math.PI*Math.pow(radius, 2));
		System.out.printf("The sphere surface area with radius=%.0f is %.3f.", radius, SA);
	}

}
