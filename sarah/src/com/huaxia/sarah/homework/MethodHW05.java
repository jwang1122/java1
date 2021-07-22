package com.huaxia.sarah.homework;

import java.util.Scanner;

public class MethodHW05 {
	public static int wordAmount(String sentance) {
		int wordCount = 0;
		for(int i = 0; i < sentance.length(); i++) {
			if(sentance.charAt(i) == ' ') {
				wordCount++;
			}
		}
		return wordCount + 1;
	}

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Input the String: ");
		String sentance = inputFromConsole.nextLine();
		
		inputFromConsole.close();
		
		int result = wordAmount(sentance);
		System.out.printf("Number of words in the string: %d", result);
		

	}

}
