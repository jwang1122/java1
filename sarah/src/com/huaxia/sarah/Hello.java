package com.huaxia.sarah;

/*
 * 1. contain attributes
 * 2. constructor
 * 3. methods
 * 4.Representative(toString())
 */
class Hello implements Comparable<Hello> {
	String name = "";
	int age; // by default, the age == 0

	// define constructor: a factroy to create instance of Hello class.
	Hello(String newName) {
		name = newName;
	}

	Hello(String name, int age) {
		this.name = name; // "this" here is the instance itself
		this.age = age;
	}

	public boolean equals(Object obj) {
		Hello h = (Hello) obj;
		return this.name.equals(h.name);
	}
	
	// sort by age
//	@Override
//	public int compareTo(Object o) {
//		Hello h = (Hello) o;
//		if (age < h.age) {
//			return -1;
//		}
//		if (age > h.age) {
//			return 1;
//		}
//		return 0;
//	}

	void sayHello() {
		System.out.println("Hello, " + this.name + "!");
	}

	public String toString() {
		return "[name]=" + name + ", [age]=" + age;
	}

	// my main method to run this class, main is static can be run by class name
	// which Hello
	// which Hello
	public static void main(String[] args) {
		System.out.println("Hello World");

		Hello h = new Hello("Hongkai Zhang", 13); // create instance of Hello with name.
		System.out.println(h); // call toString(): return a String that represents the instance of Hello class
		h.sayHello();

		String s1 = "John";
		String s2 = "John";
		System.out.println(s1 + " " + s2);
		System.out.println(s1 == s2);

		s1 = new String("John");
		s2 = new String("John");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	//sort by name
	@Override
	public int compareTo(Hello h) {
		return name.compareTo(h.name);
	}

}
