package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class Math11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Celsius or Fahrenheit(C, F): ");
		String tempUnit = input.nextLine();
		System.out.println("Please enter a temperature(45, 101): ");
		int temperature = input.nextInt();
		if(tempUnit.equals("F"))
		{
			double conversionF = (temperature - 32) * 5.0/9.0;
			System.out.printf("The temperature in Fahrenheit %d°F is %.0f°C in Celsius.", temperature, conversionF);
		}
		else if(tempUnit.equals("C"))
		{
			double conversionC = 9.0/5.0 * temperature + 32;
			System.out.printf("The temperature in Celsius %d°C is %.0f°F in Fahrenheit.", temperature, conversionC);
		}
		input.close();
	}

}
