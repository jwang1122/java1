package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to prove that Euclid's algorithm computes the greatest common divisor (GCD) of two positive given integers. 

Expected Output:

```
Enter two integer numbers: 18 12
The GCD for 18 and 12 is 6.
```
If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop. 
If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop. 
Write A in quotient remainder form (A = B⋅Q + R) 
Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)

 * @author Hongkai Z
 *
 */

public class Math12 {

	public static void main(String[] args) {
		//show-off part
		
		// scanner inputting
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = input.nextInt();
		System.out.print("Enter number 2: ");
		int b = input.nextInt();
		input.close();
		int output = euclidAlgorithm(a, b);
		
		// print part!!
		String str1 = String.format("Enter two integer numbers: %d %d\n", a,b);
		String str2 = String.format("The GCD for %d and %d is %d.", a,b,output);
		System.out.println(str1+str2);
	}
	//math part
	static int euclidAlgorithm(int num1, int num2) {
		// small big number sorting(using ternary operators)
		int a = num1 > num2 ? num1 : num2;
		int b = num1 < num2 ? num1 : num2;
		
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else {
			int r = a%b; // r is remainder
			//boring recursion time
			return euclidAlgorithm(b,r);
		}

	}

}
