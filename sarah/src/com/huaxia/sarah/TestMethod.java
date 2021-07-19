package com.huaxia.sarah;

import java.util.Arrays;

/**
 * Running class within the same package of @see(Method) class
 * 
 * @author GLiang
 *
 */
public class TestMethod {

	public static void simpleMath() {
		double rst = Method.add(5, 5); // use class name call the method
		System.out.println(rst);
		
//		Method obj = new Method();		
		rst = Method.add(3.4, 6.5);
		System.out.println(rst);		
	}
	
	static void checkSuperClass1() {
		SuperClass1 sc1 = new SuperClass1("John");
		System.out.println(sc1);
		double z = sc1.add(2.3, 5.6); // violation of encapsulation of oop
		System.out.println(z);
	}
	
	public static void main(String[] args) {
//		Occupation o = new Occupation(); // cannot instantiate interface, because interface does NOT do anything
//		Person p1 = new Person(); // abstract class can not be instantiated
		Student s1 = new Student("John", "Wang");
		Student s2 = new Student("Connor", "Tan");
		Teacher t3 = new Teacher("Laura", "Liang");
		Teacher t4 = new Teacher("Sarah", "Liang");
		int result = s1.compareTo(s2);
		System.out.println(result);
		Person[] people = {s1, s2, t3, t4}; // polymorphism
		System.out.println(Arrays.toString(people));
		// we define one method in person class to handle different object from different class
		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
		
	}

}
