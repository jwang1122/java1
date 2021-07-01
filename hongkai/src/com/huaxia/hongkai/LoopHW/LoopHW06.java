// this isn't working as intended. Still under construction... Just skip to LoopHW07.java

package com.huaxia.hongkai.loopHW;

import java.util.Scanner;
/**
 * Write a Python program to create the multiplication table (from 1 to 9) of a number.
 * Ask user input a number.
 * 
 * @author Hongkai Z
 *
 */
public class LoopHW06 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Input a number: ");
		int data = inputFromConsole.nextInt();
		inputFromConsole.close();

		for (int i = 1; i <= 9; ++i) {
			String str = String.format("%d x %d = %d", data, i, data * i); // fix
			System.out.println(str);
		}

	}

}

//Input a number: 6
//1 x 6 = 6
//2 x 6 = 12
//3 x 6 = 18
//4 x 6 = 24
//5 x 6 = 30
//6 x 6 = 36
//6 x 7 = 42
//6 x 8 = 48
//6 x 9 = 54