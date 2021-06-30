package com.huaxia.sarah.homework;

import java.util.Scanner;

public class LoopHW9 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		// Base #
		System.out.print("Enter the base number: ");
		String baseInput = inputFromConsole.nextLine();
		int base = Integer.parseInt(baseInput);
		
		// Power #
		System.out.print("Enter the power: ");
		String powerInput = inputFromConsole.nextLine();
		int power = Integer.parseInt(powerInput);
		
		inputFromConsole.close();
		
		//result
		double i = Math.pow(base, power);
		System.out.println("Result: " + i);
	}

}
