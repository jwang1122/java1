package com.huaxia.java1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Resizable-array implementation of the List interface.
 * the element inside the ArrayList is ordered, which means each element on specific index
 * 
 * @author John
 *
 */
public class MyArrayList {

	// CRUD: Create, Retrieve, Update, Delete
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// create a ArrayList
		ArrayList<Integer> al = new ArrayList<>(); // Specify single data type of the ArrayList
		System.out.println(al.size());
		
		// append new element on end of the ArrayList
		al.add(1); // equivalent to: al.add(Integer(1));
		al.add(3);
		al.add(2);
		System.out.println(al.size()); // find number of elements in the ArrayList.
		printArrayList(al);
		
		// insert element into given position(index)
		al.add(1, 2);
		printArrayList(al);
		
		// change individual elemnt on given position
		al.set(3, 4);
		printArrayList(al);
		
		// find index of certain element=3
		int value = 3;
		int position = al.indexOf(value);
		System.out.printf("value of %d is at index %d.\n" ,value, position);
		
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
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) +", ");
		}
		System.out.println();		
	}
}
