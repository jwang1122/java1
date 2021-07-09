package com.huaxia.sarah;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Resizable-array implementation of List interface
 * the element inside ArrayList is ordered, which means each element on specific index
 * 
 * @author GLiang
 *
 */
public class MyArrayList {
	
	//CRUD: Create, Retrieve, Update, Delete
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// create ArrayList
		ArrayList<Integer> al = new ArrayList<>(); // Specify single data type of ArrayList
		System.out.println(al.size());
		
		// append new element on the end of ArrayList
		al.add(1); // equivalent to: al.add(Integer(1));
		al.add(3);
		al.add(2);
		System.out.println(al.size()); // find number of elements in ArrayList
		printArrayList(al);
		
//		al.add("Hello"); // ArrayList can hold different data types
//		System.out.println(al.size());
		
		// insert element into give position(index)
		al.add(1, 2);
		printArrayList(al);
		
		// change individual element on given position
		al.set(3, 4);
		printArrayList(al);
		
		// find index of certian element = 3
		int value = 3;
		int position = al.indexOf(value);
		System.out.printf("value of %d is at index %d.\n", value, position);
		
		// remove value
		printArrayList(al);
		al.remove(new Integer(3)); // remove value need pass an Object, NOT int
		printArrayList(al);
		
		// sort ArrayList
		al.set(0, 5);
		System.out.println("Original array list:");
		printArrayList(al);
		Collections.sort(al);
		System.out.println("Sorted array list:");
		printArrayList(al);
		
	}
	
	// method should have single responsibility, and reusable
	static void printArrayList(ArrayList<Integer> al) {
		for(int i = 0; i < al.size(); i++) {
			System.out.print(i+ "=" + al.get(i) + ", ");
		}
		System.out.println();
	}

}
