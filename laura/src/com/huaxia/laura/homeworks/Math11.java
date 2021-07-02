package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a temperature (45C, 101F): ");
		String temperature = input.nextLine();
		if(temperature.contains("F")) 
		{
			System.out.println("The temperature in Fahrenheit " + temperature + " is " + " in Celsius.");
		}
		else if(temperature.contains("C")) 
		{
			System.out.println("The temperature in Celsius " + temperature + " is " + " in Fahrenheit.");
		}
	}

}
