package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math05 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("For given radius = ");
		double radius = inputFromConsole.nextDouble();
		inputFromConsole.close();

		double volumeSphere = (4 * Math.PI * Math.pow(radius, 3)) / 3;
		System.out.printf("The sphere volume with radius=%.0f is %.3f.", radius, volumeSphere);
	}

}
