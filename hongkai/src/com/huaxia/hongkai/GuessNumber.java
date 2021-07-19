package com.huaxia.hongkai;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. computer will use Random class to create a number between [1, 100]
 * 2. then ask player to enter a number
 * 3. determine if the number matched computer generated number
 * 4. if matched, computer will tell how many times player guesses
 * 5. if not match, computer will tell player it is greater or less
 * 6. then repeat till matches, and tell player how many guesses
 * 7. When finished, ask player want to play more
 * 8. add two players, compete each other
 * 
 * @author Hongkai Z
 *
 */
public class GuessNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		while(true) {
			//		boolean flag = true;
			//		while (flag) {
			while (true) {
				int runs = 1;
				int number = rand.nextInt(100) + 1; // number between 1 and 100
				System.out.println(number);
				System.out.print("Please enter a number between [1, 100]: ");
				int playerNumber = input.nextInt();
				if (number == playerNumber) {
					System.out.printf("You got it! It took you %d guesses to get it right.", runs);
					break;
				}
				if (number > playerNumber) {
					System.out.println("The correct number is greater than your number.");
				}
				if (number < playerNumber) {
					System.out.println("The correct number is less than your number.");
				}
				runs++;
			}
			System.out.print("\nDo you want to play more(y, n)? ");
			input.nextLine();
			String answer = input.nextLine();
			if (answer.equals("n")) {
				break;
			}
		}
		input.close();
		System.out.println("Bye...");
	}

}
