package com.huaxia.emma.homeworks;

/**
 * Use a for loop to print the decimal representations of 1/2, 1/3, ..., 1/10,
 * one on each line.
 * 
 * @see loopHW2.md
 * 
 * @author John
 *
 */
public class LoopHW2 {

	public static void main(String[] args) {
		{
			for (int i = 2; i <= 10; i++) {
				System.out.printf("%.2f\n", 1.0 / i);
			}
		}
	}
}
