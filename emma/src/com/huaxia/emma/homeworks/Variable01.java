package com.huaxia.emma.homeworks;

public class Variable01 {
	/**
	 * 
	 * My application shows how much money left in your bank account after withdrawals. 
	 * @param args
	 */

	public static void main(String[] args) {
		int bankAmount=100;
		int withdrawOne=25;
		int withdrawTwo=30;
		int withdrawThree=15;
		bankAmount -= withdrawOne; 
		bankAmount-= withdrawTwo; 
		bankAmount -= withdrawThree; 
		System.out.println(bankAmount + " dollars is left");
	}

}
//