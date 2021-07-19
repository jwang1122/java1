package com.huaxia.sarah.homework;

import java.util.ArrayList;

public class ArrayListHW4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				System.out.println("First element: " + list.get(i));
			}
			if(i == 2) {
				System.out.println("Third element: " + list.get(i));
			}
		}
		
	}

}
