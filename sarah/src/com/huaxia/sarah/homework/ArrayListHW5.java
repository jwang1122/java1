package com.huaxia.sarah.homework;

import java.util.ArrayList;

public class ArrayListHW5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		list.set(2, "Yellow");
		
		System.out.println(list);
	}

}
