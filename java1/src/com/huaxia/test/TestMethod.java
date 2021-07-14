package com.huaxia.test;

import com.huaxia.java1.Method; // Use the class in other package need import
import com.huaxia.java1.Person;
import com.huaxia.java1.Student;
import com.huaxia.java1.Teacher;

/**
 * Running class with different package of @see(Method) class, so we need import
 * 
 * different package can only call the public method.
 * 
 * @author John
 *
 */
public class TestMethod {

	// ask same question for different classes: polymorphism
	static void printOccupation(Person p) {// p could be teacher or student since both extends from Person
		System.out.println(p.getFirstName() + ": " + p.getOccupation());
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setFirstName("John");
		printOccupation(s1);
		
		Teacher t1 = new Teacher();
		t1.setFirstName("Connor");
		printOccupation(t1);
		
		double rst = Method.add(4, 8);
		System.out.println(rst);
//
//		Method obj = new Method();
//		rst = obj.add(3.2, 6.98);
//		System.out.println(rst);
	}

}
