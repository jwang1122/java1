package com.huaxia.java1;


/**
 * To declare an array, define a variable type with square brackets:
 * 
 * int[] myIntegers; 
 * String[] myString;
 * 
 * @author cyxt2
 *
 */
public class Array {
	
	static int[] a = { 10, 12, 2, 33, 6, 10 }; // initialize an integer array a, premitive data array(float,double.)
	static String[] type = { "Glass", "Paper", "China" };
	static Hello[] helloes = {new Hello("Connor", 11), new Hello("John", 12), new Hello("Joey", 13)};
	
	public static void main(String[] args) {
		for (int i=0; i< a.length; i++) { // for-loop
			System.out.print(a[i] + " "); // a[i] is individual element in array a at index i
		}
		System.out.println();
		
		for (int x : a) { // for-each: run through every element
			System.out.print(x + " ");
		}
		System.out.println();
		
		for (String cupType: type) {
			System.out.print(cupType + ", ");
		}
		System.out.println();	
		
		for (Hello h: helloes) {
			System.out.print(h);
		}
		System.out.println();
		
	}
}