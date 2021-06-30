package com.huaxia.sarah.homework;

import java.util.Scanner;

public class LoopHW8 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Enter any positive integer: ");
		String baseInput = inputFromConsole.nextLine();
		double num = Double.parseDouble(baseInput);
		
		inputFromConsole.close();

		//Euler's Number
		double euler = 1 + 1/num;
		System.out.println("The Euler's constant is: " + Math.pow(euler, num));

	}

}
