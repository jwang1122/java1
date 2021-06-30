package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math06 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter radius and height of a cylinder (1 1): ");
		double r = input.nextDouble();
		double h= input.nextDouble();
		input.close(); {
		double sa = 2*Math.PI*Math.pow(r,2)+h*2*Math.PI*r;
		System.out.printf("The cylinders surface area with radius=%.3f and height=%.3f is %.3f.", r, h, sa);
	}

}

}

