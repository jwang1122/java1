package com.huaxia.hongkai;

import java.util.Random;
import java.util.Scanner;

public class SimpleMath {

	public static double add(double x, double y) {
		return x + y;
	}

	static void doMath() {
		double x = SimpleMath.add(3, 4); // static way to call add()
		System.out.println(x);
	}

	static void generateRandomNumber4Dice() {
		Random rand = new Random();
		for (int j = 0; j < 20; j++) {
			int i = rand.nextInt(6) + 1; // build dice, [0, 6) ==> [1, 6]
			System.out.print(i + ", ");
		}
	}
	// Homeworj: make two players against each other
	static void throw2Dices() { // build a real game, get name from players, take turn until user terminates the game. Hint: while(true)		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.print("Johnny's turn: ");
		input.nextLine();
		int dice1 = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		System.out.println(dice1 + "," + dice2 + " = " + (dice1 + dice2));

		System.out.print("Connor's turn: ");
		input.nextLine();
		int dice3 = rand.nextInt(6) + 1;
		int dice4 = rand.nextInt(6) + 1;
		System.out.println(dice3 + "," + dice4 + " = " + (dice3 + dice4));
		input.close();
		int johnny = dice1 + dice2;
		int connor = dice3 + dice4;
		if (johnny > connor) {
			System.out.println("Johnny wins!!");
		} else if (johnny < connor) {
			System.out.println("Connor wins!!");
		} else {
			System.out.println("Johnny and Connor ties!!");
		}
		
		System.out.println("Game over...");
	}
	
	//none static method
	//Prime numbers are number that have only 2 factors: 1 and themselves.
	boolean isPrime(int n) {
		boolean result = true;
		for (int i = 2; i<n; i++) {
			if(n%i==0) {
				result = false;
				break;
			}
		}
		return n!=1 && result;
	}
	
	double circleArea(double r) throws Exception {
		if(r<0) {
			throw new Exception("Radius of circle cannot be negative");
		}
		
		return Math.PI * r * r;
	}
	
	public static void main(String[] args) throws Exception{
		// the main method provide place for you to test your code above
//		doMath();
//		generateRandomNumber4Dice();
//		throw2Dices();
		SimpleMath obj = new SimpleMath();
		int n = 1;
		boolean x = obj.isPrime(n);
		System.out.printf("Is %d a prime number? %b\n", n, x);
		double r = -2;
		double area = obj.circleArea(r);
		System.out.println(area);
	}

}
