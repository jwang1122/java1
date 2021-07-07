package com.huaxia.hongkai.loopHW;

// Loop10.java version2!!!
/**
 * * Write a Java program to print an American flag on the screen. Go to the editor

Expected Output

```
* * * * * * ==================================1                          
 * * * * *  ================================== 2                         
* * * * * * ==================================  3                        
 * * * * *  ==================================   4                       
* * * * * * ==================================    5                      
 * * * * *  ==================================     6                     
* * * * * * ==================================      7                    
 * * * * *  ==================================       8                   
* * * * * * ==================================        9    
==============================================         10                 
==============================================          11                
==============================================           12               
==============================================            13    
==============================================             14!!
==============================================              

```
 * @author Hongkai Z
 *YOU BETTER BE HAPPY WITH THIS!!!!!
 */

public class Loop10 {

	public static void main(String[] args) {
		String str1 = designLine("* ", 6) + designLine("=", 34);
		String str2 = " " + designLine("* ", 5) + " " + designLine("=", 34);
		String str3 = designLine("=", 46);
		
		for (int j = 0; j < 4; ++j) {
			System.out.println(str1);
			System.out.println(str2);
		}
		System.out.println(str1);
		for (int j = 0; j < 6; ++j) {
			System.out.println(str3);
		}

//		String a = "==================================";
//		System.out.print(a.length());
	}

	static String designLine(String writeItem, int num) {
		String returnItem = "";
		for (int i = 0; i < num; ++i) {
			returnItem += writeItem;
		}
		return returnItem;
	}

}
