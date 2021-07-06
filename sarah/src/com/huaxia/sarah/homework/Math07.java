package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math07 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Height of cylinder: ");
		double height = inputFromConsole.nextDouble();
		System.out.print("Radius of cylinder: ");
		double radius = inputFromConsole.nextDouble();
		inputFromConsole.close();
		
		double volume = (Math.PI * Math.pow(radius,2)) * height;
		System.out.printf("Volume is: %.3f\n", volume);

	}

}
