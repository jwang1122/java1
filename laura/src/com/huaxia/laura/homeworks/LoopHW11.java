package com.huaxia.laura.homeworks;

public class LoopHW11 {

	public static void main(String[] args) 
	{
		int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i]%5 == 0) 
			{
				System.out.print(array[i] + " ");
			}
		}
	}

}
 