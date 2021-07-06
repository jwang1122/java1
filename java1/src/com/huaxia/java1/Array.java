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
		
		// Change element inside an array
		System.out.println(helloes[1]); // print out individual element of array at index 1
		Hello hello1 = helloes[1];

		System.out.println("array element ID: "+helloes[1].hashCode());
		System.out.println("Hello instance ID: "+hello1.hashCode());
		
		hello1.name = "Sarah";
		System.out.println(hello1);
		System.out.println(helloes[1]); // print out individual element of array at index 1
		
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
		
	}
}
