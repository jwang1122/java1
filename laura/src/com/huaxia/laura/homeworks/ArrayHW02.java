package com.huaxia.laura.homeworks;

public class ArrayHW02 
{

	public static void main(String[] args) 
	{
		 int myArray[] = { 12, 21, 43, 84, 35, 67, 27, 18, 92, 10 };
		 int sum = 0;
		 for(int num : myArray) 
		 {
			 sum = sum + num;
		 }
		 System.out.println("The sum is " + sum + ".");
	}

}
