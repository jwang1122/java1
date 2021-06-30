package com.huaxia.sarah.homework;

import java.util.Scanner;

public class LoopHW10 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		String numInput = inputFromConsole.nextLine();
		inputFromConsole.close();
		
		int num = Integer.parseInt(numInput);
		int add = 0;
		
		for (int i = 1; i <= num; i++) {
			add = add + i;		
			}
		
		System.out.printf("The sum from 1 to %d is %d.", num, add);
		}

	}


