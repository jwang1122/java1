package com.huaxia.hongkai.method;

/**
 * * Write a Java method to count all words in a string.

Test Data:

Input the string: The quick brown fox jumps over the lazy dog.

Expected Output:

Number of words in the string: 9
 * @author Hongkai Z
 *
 */

public class MethodHW05 {

	static String nonDelimiters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";

	private static boolean findWordsInteriorLoop(String nonDelimiters, char char1) {
		for (int j = 0; j < nonDelimiters.length(); j++) {
			char char2 = nonDelimiters.charAt(j);
			if (char2 == char1) {
				return true;
			}
		}
		return false;
	}

	static int findWords(String str) {
		int words = 0;
		boolean isWord = false;
		boolean wasWord = false;
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);
			isWord = findWordsInteriorLoop(nonDelimiters, char1);
			if (isWord == true) {
				if (wasWord == false) {
					++words;
				}
				wasWord = true;
			} else {
				wasWord = false;
			}		
		}
		return words;
	}

	public static void main(String[] args) {
		String everyLetter = "The quick brown fox jumps over the lazy dog.";
		int words = findWords(everyLetter);
		String str = String.format("Number of words in the string: %d", words);
		System.out.println(str);
	}

}
