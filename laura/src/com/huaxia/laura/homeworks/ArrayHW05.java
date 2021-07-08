package com.huaxia.laura.homeworks;

public class ArrayHW05 
{
	public static void main(String[] args) 
	{
		int[] myArray1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
		boolean found = false;
		
		for(int i = 0; i < myArray1.length; i++) 
		{
			if(myArray1[i] == 2013) 
			{
				found = true;
				break;
			}
		}
		System.out.println(found);
		for(int i = 0; i < myArray1.length; i++) 
		{
			if(myArray1[i] == 2015) 
			{
				found = true;
				break;
			}
		}
		System.out.println(found);
	}
}
