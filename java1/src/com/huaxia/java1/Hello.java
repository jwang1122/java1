package com.huaxia.java1;

/*
 * This is my first Java program Hello.java I've ever written
 * 
 * run this program by right-click > select Run As... > Java Application
 * Java is OOP Object Oriented Programming, public,static are modifiers
 * void is a return type because main is a method may return value
 * the arguments in the method is the part of method signature(finger print)
 */
class Hello {
	// my main method to run this class, main is static can be run by class name which Hello
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		String hello = "Hello world";
		System.out.println(hello);
		for(int i=0; i<hello.length(); i++) {
			System.out.println(hello.charAt(i));
		}
	}

}
