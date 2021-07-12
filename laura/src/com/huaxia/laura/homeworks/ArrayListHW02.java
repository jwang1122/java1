package com.huaxia.laura.homeworks;

import java.util.ArrayList;

public class ArrayListHW02 {

	public static void main(String[] args) 
	{
		ArrayList colors = new ArrayList();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		for(int i = 0; i < colors.size(); i++) 
		{
			System.out.println(colors.get(i));
		}
	}

}
