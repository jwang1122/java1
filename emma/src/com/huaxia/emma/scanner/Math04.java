package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of a sphere(1.1): ");
		double r = input.nextDouble();
		input.close();
		{
			double v = Math.PI * Math.pow(r, 2) * 4;
			System.out.printf("The spheres surface area with radius=%.3f is %.3f.", r, v);
		}

	}

}
