package com.huaxia.connortan.homeworks;

import java.util.Scanner;
/**
 * 
 * @author Connor Tan
 * This program calculates circle area with given radius 
 * Refer to math02.md
 *
 */

public class math02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius of a circle(3.14159265):");
		double r = input.nextDouble();
		input.close();
		double a = Math.PI * Math.pow(r, 2);
		System.out.printf(" The circle area with radius=%.3f is %.3f. ", r, a);
	}
}

