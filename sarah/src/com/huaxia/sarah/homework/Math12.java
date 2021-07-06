package com.huaxia.sarah.homework;

import java.util.Scanner;

public class Math12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integer numbers: ");
		String data = input.nextLine();
		input.close();

		int GCD = 0;
		String[] sa = data.split(" ");
		int firstNum = Integer.parseInt(sa[0]);
		int secNum = Integer.parseInt(sa[1]);
		
		if(firstNum > secNum) {
		int a = firstNum;
		int b = secNum;
			if(a % b != 0) {
				GCD = a % b;
				a = b;
				b = GCD;
			}
			else if(a % b == 0) {
				GCD = b;
			}
		System.out.printf("The GCD for %d and %d is %d.", firstNum, secNum, GCD);
		}
		
		else if(firstNum < secNum) {
			int c = secNum;
			int d = firstNum;
				if(c % d != 0) {
					GCD = c % d;
					c = d;
					d = GCD;
				}	
				else if(c % d == 0) {
						GCD = d;
				}	
		System.out.printf("The GCD for %d and %d is %d.", firstNum, secNum, GCD);
		}
		
		else if(firstNum == secNum) {
			System.out.printf("The GCD for %d and %d is %d.", firstNum, secNum, firstNum);
		}
				
	}
}


