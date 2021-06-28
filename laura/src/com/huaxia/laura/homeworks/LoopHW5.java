package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class LoopHW5 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = input.nextLine();
		String reverse = "";
		for(int i = word.length() - 1; i >= 0; i--) 
		{
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse);
	}

}
