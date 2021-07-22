package com.huaxia.hongkai.method;

/**
 * * Write a Java method to print characters between two characters (i.e. A to P ). 

Note: Prints 20 characters per line

Expected Output:

```
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  
< = > ? @ A B C D E F G H I J K L M N O                  
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                  
d e f g h i j k l m n o p q r s t u v w                  
x y z
```
 * @author Hongkai Z
 *
 */

public class MethodHW09 {
	
	public static int findCharInString(String char1, String str) {
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == char1.charAt(0)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void printStringSeperated(String delimiter, String str, int start, int end, int charPerLineMax) {
		System.out.println(start);
		for (int i = start++; i <= end; i++) {
			System.out.print(i + "" + str.charAt(i) + delimiter);
			if ((i - start-1)%charPerLineMax == 0) {
				System.out.println();
			}			
		}
	}
	
	public static void printCharsInRange(String char1, String char2) {
		String listOfChars = "()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz";
		int int1 = findCharInString(char1, listOfChars);
		int int2 = findCharInString(char2, listOfChars);
		printStringSeperated(" ", listOfChars, int1, int2, 10);
	}
	
	public static void main(String[] args) {
		printCharsInRange("A", "P");

	}

}
