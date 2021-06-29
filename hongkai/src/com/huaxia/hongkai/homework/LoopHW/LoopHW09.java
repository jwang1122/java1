package com.huaxia.hongkai.homework.LoopHW;

import java.util.Scanner;

/**
 * # Scanner Homework 1 1. Two numbers are entered through the keyboard. Write a
 * program to find the value of one number raised to the power of another. (Do
 * not use Java built-in method)
 *
 * Expected execution output:
 * 
 * Enter the base number: 6 Enter the power: 3 Result: 216
 * 
 * @author Hongkai Z
 *
 */

public class LoopHW09 {
	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.println("Input base number");
		int n1 = inputFromConsole.nextInt();
		System.out.println("Input exponent number");
		int n2 = inputFromConsole.nextInt();
		inputFromConsole.close();
		int n3 = 1;
		for (int i = 1; i <= n2; ++i) {n3 *= n1;}
		System.out.printf("%d to the power of %d is %d", n1, n2, n3);
	}

}
