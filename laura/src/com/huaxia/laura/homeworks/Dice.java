package com.huaxia.laura.homeworks;

import java.util.Random;
import java.util.Scanner;

public class Dice 
{
	static void throw2Dice()
	{
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		do 
		{
			System.out.print("Player 1's turn: ");
			input.nextLine();
			int dice1 = rand.nextInt(6) + 1;
			int dice2 = rand.nextInt(6) + 1;
			System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));
		
			System.out.print("Player 2's turn: ");
			input.nextLine();
			int dice3 = rand.nextInt(6) + 1;
			int dice4 = rand.nextInt(6) + 1;
			System.out.println(dice3 + " + " + dice4 + " = " + (dice3 + dice4));
		
			int P1 = dice1 + dice2;
			int P2 = dice3 + dice4;
			if(P1 > P2) 
			{
				System.out.println("Player 1 wins!");
			}
			else if(P1 < P2) 
			{
				System.out.println("Player 2 wins!");			
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
