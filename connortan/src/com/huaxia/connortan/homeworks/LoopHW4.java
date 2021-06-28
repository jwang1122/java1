package com.huaxia.connortan.homeworks;

public class LoopHW4 {

	public static void main(String[] args) {
		for (int a = 0; a <= 5; a++) {
			for (int c = 0; c < a; c++)
				System.out.print("* ");
			System.out.println("");

		}
		for (int f = 0; f <= 4; f++) {
			for (int b = 4; b > f; b--)
				System.out.print("* ");
			System.out.println("");
		}

	}
}
