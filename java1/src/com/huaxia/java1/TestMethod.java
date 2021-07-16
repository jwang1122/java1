package com.huaxia.java1;

import java.util.Arrays;

/**
 * Running class within the same package of @see(Method) class, so we don't need import
 * 
 * @author John
 *
 */
public class TestMethod {

	static void simpleMath() {
		double rst = Method.add(5, 5);// use class name call the method
		System.out.println(rst);
		
		Method obj = new Method();
		rst = obj.add(3.4, 6.5);
		System.out.println(rst);		
	}
	
	static void checkSuperclass1() {
		Superclass1 sc1 = new Superclass1("John");
		System.out.println(sc1);
		double z = sc1.add(3.4, 7.3);//violation of encapsulation of OOP.
		System.out.println(z);		
	}
	
	public static void main(String[] args) {
//		Occupation o =new Occupation(); // cannot instantiate interface, because interface does NOT do anything
//		Person p1 = new Person();//abstract class cannot be instantiated, because you don't want to
		Student s1 = new Student("John", "Wang");
		Student s2 = new Student("Connor", "Tan");
		Teacher t3 = new Teacher("Laura","Liang");
		Teacher t4 = new Teacher("Sarah","Liang");
		int result = s1.compareTo(s2);
		System.out.println(result);
		Person[] people = {s1, s2, t3, t4}; // Polymorphism
		System.out.println(Arrays.toString(people));
		// we define one method in Person class to handler different objects from different data type(classes).
		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
	}

}
