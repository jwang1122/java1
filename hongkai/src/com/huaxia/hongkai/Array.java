package com.huaxia.hongkai;

import java.util.Arrays;

/**
 * To declare an array, define a variable type with square brackets:
 * 
 * int[] myIntegers;
 * String[] myStrings;
 * 
 * @see Hello
 * @author Hongkai Z
 *
 */
public class Array {
	
	static int[] a = { 10, 12, 2, 33, 6, 10 }; // initialize an integer array a, primitive data array(float,double.)
	static String[] type = { "Glass", "Paper", "Plastic", "China" };
	static Hello[] helloes = { new Hello("Connor", 15), new Hello("Sarah", 12), new Hello("Joey", 13) };

	public static void main(String[] args) {
		for (int i=0; i< a.length; i++) { // for-loop
			System.out.print(a[i] + " "); // a[i] is individual element in array a at index i
		}
		System.out.println();
		
		for (int x : a) { // for-each: run through every element
			System.out.print(x + " ");
		}
		System.out.println();

		for (String cupType : type) {
			System.out.print(cupType + ", ");
		}
		System.out.println();

		for (Hello h : helloes) {
			System.out.println(h);
		}
		System.out.println();
		
		// Change element inside an array
		System.out.println(helloes[1]); // print out individual element  of array at index 1
		Hello hello1 = helloes[1];
		
		System.out.println("array element ID: "+helloes[1].hashCode());
		System.out.println("Hello instance ID: "+hello1.hashCode());
		
		hello1.name = "Sarah";
		System.out.println(hello1);
		System.out.println(helloes[1]); // print out individual element  of array at index 1
		
		// change value in the array type on index=3
		type[3] = "Metal";
		for (String cupType: type) {
			System.out.print(cupType + ", ");
		}
		System.out.println();
		
		a[2] = 23;
		for (int x : a) { // for-each: run through every element
			System.out.print(x + " ");
		}
		System.out.println();
		
		// sort integer Array
		System.out.printf("Original integer array: %s\n", Arrays.toString(a));
		Arrays.sort(a);
		System.out.printf("Sorted integer array: %s\n", Arrays.toString(a));
		
		// String Array
		System.out.printf("Original String array: %s\n", Arrays.toString(type));
		Arrays.sort(type);
		System.out.printf("Sorted String array: %s\n", Arrays.toString(type));

		// sort Hello(the class we created) object array
		System.out.printf("Original Hello array: %s\n", Arrays.toString(helloes));
		Arrays.sort(helloes);
		System.out.printf("Sorted Hello array: %s\n", Arrays.toString(helloes));
	}

}
