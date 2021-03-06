package java1;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. computer will use Random class to create a number between [1,100], 
 * 2. then ask player to enter a number 
 * 3. determine if the number matches computer generated number 
 * 4. if matches, computer will tell how many runs the player guesses 
 * 5. if not matches, computer will tell player it is greater of less 
 * 6. then repeat till matches, and tell player how many runs
 * 7. when finished, ask player if they want to play more
 * 8. add two players, compete each other, computer will determine who is winner. HW
 * 
 * @author cyxt2
 *
 */

public class GuessNumber {

	public static void main(String[] args) {
		int runs = 1;
		Random rand = new Random();

		Scanner input = new Scanner(System.in);
		boolean playAgain = true;
		while (playAgain) {
			int number = rand.nextInt(100) + 1; // number is between [1,100]
			System.out.println(number);
//		boolean flag = true;
//		while (flag) {
			while (true) {
				System.out.print("Please enter number between [1,100]: ");
				int playerNumber = input.nextInt();
				if (number == playerNumber) {
					System.out.printf("You got it, took %d guesses.", runs);
					break;
				}
				if (number > playerNumber) {
					System.out.println("Hi, your number is smaller.");
				}
				if (number < playerNumber) {
					System.out.println("Hi, your number is bigger.");
				}
				runs++;
			}
			System.out.print("\nDo you want to play more?(y/n) ");
			input.nextLine(); // ? why need this, because there is a new line character leftover.
			String answer = input.nextLine();
			if (answer.equals ("n")) {
				playAgain = false;

			}
		} while(playAgain);
		input.close();
		System.out.println("Bye...");
	}
}
