package com.huaxia.connortan.homeworks;

public class LoopHW3 {
	public static void main(String[] args) {
		int n = 6;
		int factorial = 1;

		for (int i = 1; i <= n; i++) {
		factorial = factorial*i;
		}
		System.out.print("The factorial of 6 is: " + factorial);

	}
}
