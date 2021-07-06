package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math09 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("length = ");
		int length = inputFromConsole.nextInt();
		System.out.print("width = ");
		int width = inputFromConsole.nextInt();
		inputFromConsole.close();

		int area = length * width;
		System.out.println("area = " + area);

	}

}
