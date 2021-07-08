package com.huaxia.laura.homeworks;

import java.util.Arrays;

public class ArrayHW01 
{
	public static void main(String[] args) 
	{
		int[] myArray1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
		System.out.println("Original Numeric Array : " + Arrays.toString(myArray1));
		Arrays.sort(myArray1);
		System.out.println("Sorted Numeric Array : " + Arrays.toString(myArray1));
		
		String[] myArray2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
		System.out.println("Original String Array : " + Arrays.toString(myArray2));
		Arrays.sort(myArray2);
		System.out.println("Sorted String Array : " + Arrays.toString(myArray2));
	}
}
