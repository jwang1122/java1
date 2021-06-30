package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * Write Java progrom recieve user input of temperature, convert from Celsius to Fahrenheit or vice versa. for instance, if user input 101F, which represents a Fahrenheit temperature, your output should be 38C.
 *
 * here is the formula
 *
 * ![](images/temperatureConverter.png)
 *
 * $$ 째F = \frac 9 5 째C + 32 $$
 * $$ 째C = \frac 5 9 (째F - 32) $$
 *
 * Expected output
 *
 * ```output
 * Please enter a temperature (45C, 101F): 101F
 * The temperature in Fahrenheit 101캟 is 38캜 in Celsius.
 *
 * Please enter a temperature (45C, 101F): 45C
 * The temperature in Celsius 45C is 113F in Fahrenheit.
 *```
 * @author Hongkai Z
 *
 */

public class Math11 { // INCOMPLETE INCOMPLETE INCOMPLETE INCOMPLETE INCOMPLETE INCOMPLETE INCOMPLETE INCOMPLETE 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a temperature: ");
		String temp = input.nextLine();
		input.close();
		if (temp.contains("F") || temp.contains("f")) {
			System.out.println("farinheight캟");

		} else if (temp.contains("C") || temp.contains("c")) {
			System.out.println("celsiyus캜");
		}

	}

}
