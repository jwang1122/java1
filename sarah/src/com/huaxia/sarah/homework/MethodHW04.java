package com.huaxia.sarah.homework;

import java.util.Scanner;

public class MethodHW04 {
	
	public static int vowelCount(String word) {
		int x = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				x++;
			}
		}
		return x;
	}

	public static void main(String[] args) {
Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Input the string: ");
		String word = inputFromConsole.nextLine();
		inputFromConsole.close();
		
		int result = vowelCount(word);
		System.out.printf("Number of  Vowels in the string: %d", result);
		

	}

}
