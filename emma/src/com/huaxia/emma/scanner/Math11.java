package com.huaxia.emma.scanner;

import java.util.Scanner;

public class Math11 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("Please enter a temperature(45)");
	double f= input.nextDouble();
	input.close();
	double c = 1.8*f + 32;
	System.out.printf("%.1f degrees Celsius to Farenheit is %.1f",f, c);
	
	
	

	}

}
