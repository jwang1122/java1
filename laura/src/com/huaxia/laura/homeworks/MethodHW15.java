package com.huaxia.laura.homeworks;

public class MethodHW15 
{
	public static boolean isPrimeNumber(long n) 
	{
		if(n < 2) 
		{
			return false;
		}
		for(int i = 2; i <= n / 2; i++) 
		{
			if(n % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		for(int i = 2; i < 100; i++) 
		{
			if(isPrimeNumber(i) && isPrimeNumber(i + 2)) 
			{
				System.out.printf("(%d, %d)\n", i, i+ 2);
			}
		}
	}

}
