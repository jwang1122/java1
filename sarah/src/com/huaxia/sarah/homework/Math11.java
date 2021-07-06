package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math11 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Celcius or Fahrenheit(C,F):  ");
		String unit = inputFromConsole.nextLine();
		System.out.print("Please enter a temperature (45C, 101F): ");
		int temp = inputFromConsole.nextInt();
		
		if(unit.equals("F")) {
			int celciusTemp = 5*(temp - 32)/9;
			System.out.printf("The temperature in Fahrenheit %d°F is %d°C in Celsius.", temp, celciusTemp);
		}
		else if(unit.equals("C")) {
			int fahrenheitTemp = 9*(temp + 32)/5;
			System.out.printf("The temperature in Celcius %d°F is %d°C in Fahrenheit.", temp, fahrenheitTemp);
		
		inputFromConsole.close();
		}
	}
}
