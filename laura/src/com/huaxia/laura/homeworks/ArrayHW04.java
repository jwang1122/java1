package com.huaxia.laura.homeworks;

public class ArrayHW04 
{

	public static void main(String[] args) 
	{
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		double sum = 0;
		for(double num : numbers) 
		{
			sum = sum + num;
		}
		double average = sum / numbers.length;
		System.out.printf("Average value of the array elements is : %.1f", average);
	}

}
