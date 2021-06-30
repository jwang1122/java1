package com.huaxia.sarah.homework;

import java.util.Scanner;

public class LoopHW5 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Input: ");
		String input = inputFromConsole.nextLine();
		inputFromConsole.close();
		
		int n = input.length();
		for (int i = n-1; i >= 0; i--) {
			char index = input.charAt(i);
			System.out.print(index);
		}
		
	}

}
