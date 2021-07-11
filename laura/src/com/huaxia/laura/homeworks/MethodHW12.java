package com.huaxia.laura.homeworks;

import java.util.Random;
import java.util.Scanner;

public class MethodHW12 
{
	static void generateRandomNumRow(int n) 
	{
		Random rand = new Random();
		for(int i = 0; i < n; i++) 
		{
			int j = rand.nextInt(2);
			System.out.print(j + " ");
		}
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		for(int i = 0; i < n; i++) 
		{
			generateRandomNumRow(n);
			System.out.println();
		}
		in.close();
	}

}
