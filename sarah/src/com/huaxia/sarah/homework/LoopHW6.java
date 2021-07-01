package com.huaxia.sarah.homework;

import java.util.Scanner;

public class LoopHW6 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Input a Number: ");
		String input = inputFromConsole.nextLine();
		int x = Integer.parseInt(input);
		inputFromConsole.close();
		for(int i = 1; i < 10; i++) {
			int n = i * x;
			System.out.printf("%d * %d = %d\n", i, x, n);
		}

	}

}
