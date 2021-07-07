package com.huaxia.sarah;

/*
 * To declare an array, define variable type with square brackets
 * 
 * int[] myIntegers;
 * String[] myStrings;
 * 
 */
public class Array {
	static int[] a = {10, 12, 2, 33, 6, 10}; // initialize integer array a, primative data array(float, double.)
	static String[] type = {"Glass", "Paper", "Plastic", "China"};
	static Hello[] helloes = {new Hello("Connor", 11), new Hello("John", 12), new Hello("Joey", 13)};
	
	public static void main(String[] args) {
		for(int i = 3; i<a.length - 1; i++) { // for-loop: more flexible, can choose part of the array
			System.out.print(a[i] + " "); // a[i] is individual element in array a st index i
		}
		System.out.println();
		
		for(int x : a) { // for-each: run through every element
			System.out.print(x + " ");
		}
		System.out.println();
		
		for(String cupType: type) {
			System.out.print(cupType + ", ");
		}
		System.out.println();
		
		for(Hello h: helloes) {
			System.out.println(h);
			h.sayHello();
		}
		System.out.println();
	}

}