package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math01 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a radius of a circle(2.0):");
		double r= input.nextDouble();
		input.close();
		double d= 2*r;
		System.out.printf("The diameter of a circle with a radius %.1f is %.1f.", r, d);
		
	}

}
