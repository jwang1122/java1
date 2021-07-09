package com.huaxia.laura.homeworks;

public class ArrayHW06 {

	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int x = 0;
		int element = 8;
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] == element) 
			{
				x = i;
				break;
			}
		}
		System.out.println(x);
	}

}
