package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW04 
{
	public static int numberOfVowels(String s) 
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
			{
				count++;
			}
		}
		return count;
	} 
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input the string: ");
		String s = in.nextLine();
		int numOfVowels = numberOfVowels(s);
		System.out.println("Number of Vowels in the string: " + numOfVowels);
		in.close();
	}

}
