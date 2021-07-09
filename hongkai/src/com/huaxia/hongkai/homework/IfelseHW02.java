package com.huaxia.hongkai.homework;

/**
 * * Write a Java program to print numbers between 1 to 100 which are divisible
 * by 3, 5 and by both.
 * 
 * Expected output:
 * 
 * ``` Divided by 3: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45,
 * 48, 51, 54, 57 , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
 * 
 * Divided by 5: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80,
 * 85, 90, 95,
 * 
 * Divided by 3 & 5: 15, 30, 45, 60, 75, 90, ```
 * 
 * @author Hongkai Z
 *
 */

public class IfelseHW02 {

	public static void main(String[] args) {
		dividedBy("3", 3);
		dividedBy("5", 5);
		dividedBy("3 & 5", 15);
	}

	static void dividedBy(String say, int num) {
		System.out.printf("Divided by %s: \n", say);
		for (int i = 1; i < 100; ++i) {
			if (i % num == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("\n");
	}
}