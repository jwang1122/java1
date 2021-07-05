package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math08 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("length = ");
		int length = inputFromConsole.nextInt();
		System.out.print("width = ");
		int width = inputFromConsole.nextInt();
		inputFromConsole.close();
		
		int perimeter = 2 * length + 2 * width;
		System.out.println("primeter = " + perimeter);

	}

}
