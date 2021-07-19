package com.huaxia.hongkai.method;

/**
 * * Write a Java method to count all vowels in a string.

Test Data:

Input the string: w3resource

Expected Output:

Number of  Vowels in the string: 4
 * @author Hongkai Z
 *
 */

public class MethodHW04 {
	
	
	
	static int countVowels(String word) {
		char[] vowels = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
		int vowelCount = 0;
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			for (char vowel:vowels) {
				if (vowel==character) {
					++vowelCount;
				}
			}
		}
		return vowelCount;
	}
	public static void main(String[] args) {
		int vowels = countVowels("w3resource");
		String str = String.format("Number of  Vowels in the string: %d", vowels);
		System.out.println(str);

	}

}
