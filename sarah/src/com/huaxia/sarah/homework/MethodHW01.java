package com.huaxia.sarah.homework;

import java.util.Scanner;


public class MethodHW01 {
	public static int compare(int num1, int num2, int num3) {
		if(num1 < num2) {
			if(num1 < num3) {
				return num1;
			}
			else if(num1 > num3) {
				return num3;
			}
			else if(num1 == num3) {
				return num1;
			}
		}
		else if(num1 > num2) {
			if(num2 < num3) {
				return num2;
			}
			else if(num2 > num3) {
				return num3;
			}
			else if(num2 == num3) {
				return num2;
			}
		}
		else if(num1 == num2) {
			if(num1 > num3) {
				return num3;
			}
			else if(num1 < num3) {
				return num1;
			}
		}
		return num1;
	}

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int num1 = inputFromConsole.nextInt();
		System.out.print("Input the second number: ");
		int num2 = inputFromConsole.nextInt();
		System.out.print("Input the third number: ");
		int num3 = inputFromConsole.nextInt();
		
		inputFromConsole.close();
		
		int result = compare(num1, num2, num3);
		System.out.printf("The smallest value is %d", result);
		
		
		
		

	}

}
