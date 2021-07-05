package com.huaxia.hongkai.print;

import java.util.ArrayList;

/**
 * * Write a Java program to display the following pattern. 


Sample Pattern :

```
   J    a    v     v    a                                                  
   J   a a    v   v    a a                                                 
J  J  aaaaa    V V    aaaaa                                                
 JJ  a     a    V    a     a
 ```
 * @author Hongkai Z
 *
 */

public class Print01 {

	public static void main(String[] args) {
		// these arraylists should have 4 items
		ArrayList<String> letterJ = new ArrayList<>();
		addToAL(letterJ, "   J", "   J", "J  J", " JJ ");
		ArrayList<String> letterA = new ArrayList<>();
		addToAL(letterA, "   a   ", "  a a  ", " aaaaa ", "a     a");
		ArrayList<String> letterV = new ArrayList<>();
		addToAL(letterV, "v     v", " v   v ", "  V V  ", "   V   ");
		
		System.out.println(letterJ);
		
		
		String a = findLetterAL(letterJ, 2);
	}
	
//	static void printWord()
	
	static void addToAL(ArrayList<String> ArrayListName, String row1, String row2, String row3, String row4) {
		ArrayListName.add(row1);
		ArrayListName.add(row2);
		ArrayListName.add(row3);
		ArrayListName.add(row4);
	}

	static String findLetterAL(ArrayList<String> ArrayListName, int itemNum) {
		return ArrayListName.get(itemNum);
		
	}
	
	

}
