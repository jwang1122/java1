package com.huaxia.laura.homeworks;

import java.util.Scanner;
/**
 * Write a program that accepts a word from the user and reverse it.

		Input: Welcome
		Expected Output: emocleW
		
 * @author John
 *
 */
public class LoopHW5 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = input.nextLine();
		input.close(); // get rid of warning, also possibly avoid memory leak.
		String reverse = "";
		for(int i = word.length() - 1; i >= 0; i--) 
		{
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse);
	}

}
