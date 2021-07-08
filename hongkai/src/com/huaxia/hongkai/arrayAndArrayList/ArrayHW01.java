package com.huaxia.hongkai.arrayAndArrayList;

/**
 * * Write a Java program to **sort** a numeric **array** and a string array.

for example:

```java
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
    String[] my_array2 = {
            "Java",
            
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
```

Expected result:

```
Original numeric array : [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
Sorted numeric array : [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]
Original string array : [Java, Python, PHP, C#, C Programming, C++]
Sorted string array : [C Programming, C#, C++, Java, PHP, Python]
```
 */

import java.util.Arrays;


public class ArrayHW01 {
	
	public static void main(String[] args) {
	    int[] myArray1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };
	    String[] myArray2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
	    };
		
	    String str1 = "Original numeric array :  %s\n";
	    String str2 = "Sorted numeric array : %s\n";
	    System.out.printf(str1, Arrays.toString(myArray1));
		Arrays.sort(myArray1);
		System.out.printf(str2, Arrays.toString(myArray1));

	    str1 = "Original String array :  %s\n";
	    str2 = "Sorted String array : %s\n";
	    System.out.printf(str1, Arrays.toString(myArray2));
		Arrays.sort(myArray2);
		System.out.printf(str2, Arrays.toString(myArray2));
}

}