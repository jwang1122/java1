package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a temperature(45)");
		double c = input.nextDouble();
		input.close();
		
		// f = 9/5*c + 32
		double f = 9*c/5 + 32;
		System.out.printf("%.1f degrees Celsius to Farenheit is %.1f", c, f);
	}
}
