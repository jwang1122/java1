package com.huaxia.connortan.homeworks;

/**
 * 
 * @author Connor Tan
 * This program subtracts three withdraws form the bankAmount and prints out the bankAmount after the withdraws
 * Refer to variable01.md
 */

public class variable01 {

	public static void main(String[] args) {
		int bankAmount = 100;

		int withdrawOne = 25;
		int withdrawTwo = 30;
		int withdrawThree = 15;

		bankAmount = bankAmount - withdrawOne - withdrawTwo - withdrawThree;

		System.out.println(bankAmount);
	}
}