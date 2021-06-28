package com.huaxia.laura.homeworks;

public class LoopHW1 {

	public static void main(String[] args) 
	{
		System.out.println("Even Numbers:");
		for (int i = 1; i <= 10; i++) 
		{
			if (i % 2 == 0) 
			{
				System.out.println(i);
			}
		}
		System.out.println("\nOdd Numbers:");
		for (int i = 1; i <= 10; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.println(i);
			}
		}
	}

}

// you can define many other class within one file as long as it is not public
//class MyClass
//{
//	
//}