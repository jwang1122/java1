package com.huaxia.emma.homeworks;

/**
 * My application shows the amount of money left in your bank account after
 * three withdrawals
 * 
 * @author user
 *
 */
public class Variable01 {

	public static void main(String[] args) {
		int bankAmount = 100;
		int withdrawOne = 25;
		int withdrawTwo = 30;
		int withdrawThree = 15;
		bankAmount -= withdrawOne;
		bankAmount -= withdrawTwo;
		bankAmount -= withdrawThree;
		System.out.println(bankAmount + " dollars is left");

	}

}
