package com.huaxia.test;

import com.huaxia.hongkai.Method; // Use the class in other package need import
import com.huaxia.hongkai.Person;
import com.huaxia.hongkai.Student;
import com.huaxia.hongkai.Teacher;

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
	static void printOccupation(Person p) {
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
