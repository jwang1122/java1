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
- - - - - - - - - -                                                                                        
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
```
 * @author Hongkai Z
 *
 */

public class ArrayHW03 {
	
	static String[] emptyGrid10 = {"","","","","","","","","",""};
	
	public static String[] printGrid(String lineSection, int gridX, String[] parameterGrid) {
		String arrayLine = "";
		for (int i = 0; i < gridX; i++) {
			arrayLine += lineSection;
		}
		String[] returnGrid = parameterGrid;
		for (int i = 0; i < returnGrid.length; i++) {
			returnGrid[i] = arrayLine;
		}
		return returnGrid;
	}
	
	public static void printStringArray(String[] methodArray) {
		for (String methodArrayItem: methodArray) {
			System.out.println(methodArrayItem);
		}
	}
	
	public static void main(String[] args) {
		String[] printGrid;
		printGrid = printGrid(" 0 ", 10, emptyGrid10);
		printStringArray(printGrid);
		printGrid = printGrid("- ", 10, emptyGrid10);
		printStringArray(printGrid);
	}

}
