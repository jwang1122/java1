package com.huaxia.emma.homeworks;

import java.util.Scanner;

public class LoopHW6 {

	public static void main(String[] args) {
		System.out.print("Input a number: ");
		
		Scanner inputFromConsole = new Scanner(System.in);
		int n=inputFromConsole.nextInt();
		inputFromConsole.close();
		for (int i = 1; i <= 9; i++) { // initialize looping variable, condition on looping variable; adjustment ;
			System.out.println(i + "x" + n + "=" + (i * n)); //n is input

			}
		}
	}

//