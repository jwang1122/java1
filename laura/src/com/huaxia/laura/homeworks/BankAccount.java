package com.huaxia.java1;

public class BankAccount {

	public static void main(String[] args) 
	{
		int bankAmount = 100;
		int withdrawOne = 25;
		int withdrawTwo = 30;
		int withdrawThree = 15;
		int withdraw = withdrawOne + withdrawTwo + withdrawThree;
		int amountLeft = bankAmount - withdraw;
		System.out.println("The remaining amount of money left over after three withdraws is $" + amountLeft + ".");
	}

}
// This adds up all of the withdraws into withdraw and subtracts it from bankAmount. It then prints the amount left over.