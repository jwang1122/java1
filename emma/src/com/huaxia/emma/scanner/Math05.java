package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math05 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter radius of a sphere(1.1): ");
		double r = input.nextDouble();
		input.close(); {
		double v = 1.333*Math.PI*Math.pow(r,3);
		System.out.printf("The spheres volume with radius=%.3f is %.3f.", r, v);
	}

}

}


