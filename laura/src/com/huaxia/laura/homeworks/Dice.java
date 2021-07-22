package com.huaxia.laura.homeworks;

import java.util.Random;
import java.util.Scanner;

public class Dice 
{
	static void throw2Dice() // build a real game, get name from players, take turns until user terminate the game Hint: while(true)
	{
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		do 
		{
			System.out.print("John's turn: ");
			input.nextLine();
			int dice1 = rand.nextInt(6) + 1;
			int dice2 = rand.nextInt(6) + 1;
			System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));
		
			System.out.print("Connor's turn: ");
			input.nextLine();
			int dice3 = rand.nextInt(6) + 1;
			int dice4 = rand.nextInt(6) + 1;
			System.out.println(dice3 + " + " + dice4 + " = " + (dice3 + dice4));
		
			int P1 = dice1 + dice2;
			int P2 = dice3 + dice4;
			if(P1 > P2) 
			{
				System.out.println("John wins!");
			}
			else if(P1 < P2) 
			{
				System.out.println("Connor wins!");			
			}
			else 
			{
				System.out.println("Tie...");						
			}
			System.out.println("Do you want to continue?(Y/N)");
			String answer = input.nextLine();
			if(answer.equals("N")) 
			{
				playing = false;
			}
		}while(playing);
		System.out.println("GAME OVER");
		input.close();
	}

	public static void main(String[] args) 
	{
		throw2Dice();
	}

}