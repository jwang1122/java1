package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW01 
{
	public static int findSmallNum(int num1, int num2, int num3) 
	{
		int num = 0;
		for(int i = 0; i < 3; i++) 
		{
			if(num1 < num2) 
			{
				if(num1 < num3) 
				{
					num = num1;
					return num;
				}
				else if(num3 < num1) 
				{
					num = num3;
					return num;
				}
			}
			else if(num2 < num1) 
			{
				if(num2 < num3) 
				{
					num = num2;
					return num;
				}
				else if(num3 < num2) 
				{
					num = num3;
					return num;
				}
			}
			else if(num1 == num2)
			{
				if(num1 < num3) 
				{
					num = num1;
					return num;
				}
				else if(num3 < num1) 
				{
					num = num3;
					return num;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int num1 = in.nextInt();
		System.out.println("Input the second number: ");
		int num2 = in.nextInt();
		System.out.println("Input the third number: ");
		int num3 = in.nextInt();
		double smallNum = findSmallNum(num1, num2, num3);
		System.out.println("The smallest value is " + smallNum);
		in.close();
	}

}
