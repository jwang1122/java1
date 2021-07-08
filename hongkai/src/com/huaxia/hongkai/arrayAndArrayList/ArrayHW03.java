package com.huaxia.hongkai.arrayAndArrayList;

/**
 * * Write a Java program to print the following grid. Go to the editor

Expected Output :

```
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0       ten "0"

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -              ten "-"                                                                             
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
```
 * @author Hongkai Z
 *
 */

public class ArrayHW03 {
	
	static String[] grid1 = {"","","","","","","","","",""};
	
	public static void printGrid(String lineSection, int gridX, String[] parameterGrid) {
		String arrayLine = "";
		for (int i = 0; i < gridX; i++) {
			arrayLine += lineSection;
		}
		String[] returnGrid = parameterGrid;
		for (int i = 0; i < returnGrid.length; i++) {
			;
		}
	}
	
	public static void main(String[] args) {
		
		printGrid("0  ", 10, grid1);
	}

}
