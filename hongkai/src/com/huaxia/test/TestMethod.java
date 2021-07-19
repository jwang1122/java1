package com.huaxia.test;

import com.huaxia.hongkai.Method; // Use the class in other package need import
import com.huaxia.hongkai.Person;
import com.huaxia.hongkai.Student;
import com.huaxia.hongkai.Superclass1;
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
	static void printOccupation(Person p) { // p could be teacher or student since both extends from Person
		System.out.println(p.getFirstName() + ": " + p.getOccupation());
	}
	
	static void testOccupation() {
		Student s1 = new Student();
		s1.setFirstName("John");
		printOccupation(s1);
		
		Teacher t1 = new Teacher("Johnny", "Wanted");
		t1.setFirstName("Connor");
		printOccupation(t1);
		
		double rst = Method.add(4, 8);
		System.out.println(rst);

//		Method obj = new Method();
//		rst = obj.add(3.2, 6.98);
//		System.out.println(rst);
	}
	public static void main(String[] args) {
		Superclass1 sc1 = new Superclass1("John");
		System.out.println(sc1);
//		double z = sc1.add(2.3, 5.6);
//		System.out.println(z);
	}

}