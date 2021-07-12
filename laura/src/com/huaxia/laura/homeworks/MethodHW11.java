package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW11 
{
	public static boolean checkForLetters(char passwordChar) 
	{
		return ((passwordChar >= 'A' && passwordChar <= 'Z') || (passwordChar >= 'a' && passwordChar <= 'z'));
	}
	
	public static boolean checkForNumbers(char passwordChar) 
	{
		return (passwordChar >= '0' && passwordChar <= '9');
	}
	
	public static boolean checkPasswordValidity(String password) 
	{
		if(password.length() < 8) 
		{
			return false;
		}
		int charCount = 0;
		int numCount = 0;
		for(int i = 0; i < password.length(); i++) 
		{
			char passwordChar = password.charAt(i);
			if(checkForNumbers(passwordChar)) 
			{
				numCount++;
			}
			else if(checkForLetters(passwordChar)) 
			{
				charCount++;
			}
			else
			{
				return false;
			}
		}
		return (charCount >= 2 && numCount >= 2);
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Passowrd rules: \nA password must have at least eight characters.\nA password consists of only letters and digits.\nA password must contain at least two digits.");
		System.out.println("Input a password (You are agreeing to the above Terms and Conditions): ");
		String password = in.nextLine();
		if(checkPasswordValidity(password)) 
		{
			System.out.println("Passowrd is valid: " + password);
		}
		else
		{
			System.out.println("Passowrd is NOT valid: " + password);			
		}
		in.close();
	}

}
