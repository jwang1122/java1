package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math10 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("base = ");
		int base = inputFromConsole.nextInt();
		System.out.print("height = ");
		int height = inputFromConsole.nextInt();
		inputFromConsole.close();

		int area = (base * height)/2;
		System.out.println("area = " + area);

	}

}
