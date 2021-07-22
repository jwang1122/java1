package com.huaxia.sarah.test;

/**
 * Running class within the same package of @see(Method) class
 * 
 * different package can only call the public method
 * 
 * @author GLiang
 *
 */
//import com.huaxia.sarah.Method;
import com.huaxia.sarah.Person;
//import com.huaxia.sarah.Student;
import com.huaxia.sarah.SuperClass1;
//import com.huaxia.sarah.Teacher;

public class TestMethod {

	//ask same question for different classes: polymorphism
	static void printOccupation(Person p) { // p could be teacher or student, since both extends from person
		System.out.println(p.getFirstName() + ": " + p.getOccupation());
	}
	public static void main(String[] args) {
		SuperClass1 sc1 = new SuperClass1("John");
		System.out.println(sc1);
//		Student s1 = new Student();
//		s1.setFirstName("John");
//		printOccupation(s1);
//		
//		Teacher t1 = new Teacher();
//		t1.setFirstName("Connor");
//		printOccupation(t1);
//		
//		double rst = Method.add(4, 8);
//		System.out.println(rst);
//
//		Method obj = new Method();
//		rst = obj.add(3.2,6.98);
//		System.out.println(rst);		
		
	}

}
