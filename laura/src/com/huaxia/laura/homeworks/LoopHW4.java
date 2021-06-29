package com.huaxia.laura.homeworks;

public class LoopHW4 {

	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0; i <= n; i++) 
		{
			for (int x = 0; x <=i; x++) 
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		for(int y = 3; y >= 0; y--) 
		{
			for(int x = 0; x <= y; x++) 
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}