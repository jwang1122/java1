package com.huaxia.laura.homeworks;

public class LoopHW7 {

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++) 
		{
			int w = 5 - i;
			for(int x = 1; x <= w; x++) 
			{
				System.out.print(" ");
			}
			for(int x = 1; x <= i; x++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for(int y = 4; y >= 1; y--) 
		{
			int z = 5 - y;
			for(int x = 1; x <= z; x++) 
			{
				System.out.print(" ");
			}
			for(int x = 1; x <= y; x++) 
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
