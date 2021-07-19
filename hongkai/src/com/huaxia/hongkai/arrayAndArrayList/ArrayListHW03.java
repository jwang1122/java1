package com.huaxia.hongkai.arrayAndArrayList;

import java.util.ArrayList;

/**
 * * Write a Java program to insert an element into the array list at the first position.

for given ArrayList:

[Red, Green, Orange, White, Black]

add "Yellow"

Expected output:

[Yellow, Red, Green, Orange, White, Black]

 * @author Hongkai Z
 *
 */

public class ArrayListHW03 {
	
	public static void addItem(ArrayList<String> arrayList, int index, String item) {
		arrayList.add(index, item);
	}
	
	public static void main(String[] args) {
		ArrayList<String> myArrayList1 = new ArrayList<>();
		ArrayListHW01.setup(myArrayList1);
		addItem(myArrayList1, 1, "Yellow");
		System.out.println(myArrayList1);

	}

}
