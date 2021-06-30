package com.huaxia.emma.homeworks;

import java.util.Scanner;

public class LoopHW12 {
	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("enter your data:");
		String data = inputFromConsole.nextLine();
		inputFromConsole.close();
		int count=data.length();
		System.out.println(count);
	}
}
