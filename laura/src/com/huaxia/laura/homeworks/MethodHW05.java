package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW05 
{
	public static int findNumOfWords(String s) 
	{
		String[] words = s.split(" ");
		return words.length;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input the string: ");
		String s = in.nextLine();
		System.out.println("Number of words in the string: " + findNumOfWords(s));
		in.close();
	}

}
