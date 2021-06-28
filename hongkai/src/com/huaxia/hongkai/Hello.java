package com.huaxia.hongkai;

/*
 * hi
 *this is my second java program
 *
 *run this program by right click > select Run As...
 *Java is OOP Oriented Programming, public, static are modifiers
 *void is a return type but main is a method doesn't return value
 *the arguments in the method in the method is the part of method signature(finger print)
 *
 *first letter of class is UPPERCASE
 */
public class Hello {
	//main method to run this class
	public static void main(String[] options) {
		System.out.println("Hello, World!");
		for(int i=0; i<options.length;i++) {
			System.out.println(options[i]);
		}
		String hello = "Individual";
		for(int i=0; i<hello.length(); i++) {
			System.out.println(hello.charAt(i));
		}
	}
}
