package com.huaxia.sarah.homework;

import java.util.Scanner;

public class MethodHW06 {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Input an integer: ");
		String num = inputFromConsole.nextLine();
		
		inputFromConsole.close();
		
		String[] sa = num.split("");
		int a = Integer.parseInt(sa[0]);
		int b = Integer.parseInt(sa[1]);
		
		int result = sum(a,b);
		System.out.printf("The sum is %d", result);

	}

}
