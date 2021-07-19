package com.huaxia.laura.homeworks;

public class MethodHW09 
{
	public static String printCharactersBetween(char char1, char char2) 
	{
		for(int i = 1; char1 <= char2; i++, char1++) 
		{
			System.out.print(char1 + " ");
			if(i % 20 == 0) 
			{
				System.out.println();
			}
		}
		return "\n";
	}

	public static void main(String[] args) 
	{
		printCharactersBetween('(', 'z');
	}

}
