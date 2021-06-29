package com.huaxia.john.math;

import java.util.Scanner;
/**
 * refer to Homeworks: math01.md
 * 
 * this program calculates circle area with given radius.
 * 
 * @author John
 *
 */
public class Math02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of a circle(1.1): ");
		double r = input.nextDouble();
		input.close();
		double a = Math.PI*Math.pow(r,2);
		System.out.printf("The circle area with radius=%.3f is %.3f.", r, a);
	}

}
