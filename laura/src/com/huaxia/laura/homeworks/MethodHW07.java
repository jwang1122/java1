package com.huaxia.laura.homeworks;

public class MethodHW07 
{
	public static int findPentagonalNum(int i) 
	{
		return (i * (3 * i - 1)) / 2;
	}
	
	public static void main(String[] args) 
	{
		int count = 1;
		for(int i = 1; i <= 50; i++) 
		{
			System.out.printf("%-6d", findPentagonalNum(i));
			if(count % 10 == 0) 
			{
				System.out.println();
			}
			count++;
		}
	}

}
