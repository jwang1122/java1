package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math03 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
			System.out.println("Enter a radius of a circle(1):");
			double r = input.nextDouble();
			input.close(); {
			double a = Math.PI* 2 *r;
			System.out.printf(" The circle circumference with radius=%.3f is %.3f. ", r, a);
		}

	}
}

	


