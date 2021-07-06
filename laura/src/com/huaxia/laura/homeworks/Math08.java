package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math08 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("Width: ");
		int width = input.nextInt();
		int perimiter = 2 * length + 2 * width;
		System.out.println("Perimiter: " + perimiter);
		input.close();
	}

}
