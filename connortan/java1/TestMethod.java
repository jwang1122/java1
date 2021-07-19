package com.huaxia.java1;


/**
 * Running class within the same package of @see(Method) class, so we don't need to import
 *  
 * @author cyxt2
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		double rst = Method.add(5, 5); // use class name call the method
		System.out.println(rst);
		
		Method obj = new Method();
		rst = obj.add(3.4, 6.5);
		System.out.println(rst);
	}

	static void checkSuperclass1() {
		Superclass1 sc1 = new Superclass1("John");
		System.out.println(sc1);
		double z = sc1.add(3.4,7.3); // violation of encapsualtion of OOP
		System.out.println(z);
	}
	public static void main(String[] args) {
		Teacher s1 = new Student("John", "Wang");
		Teacher s2 = new Student("Connor", "Tan");
		Teacher t3 = new Teacher("Laura","Liang");
		Teacher t4 = new Teacher("Sarah","Liang");
		int result = s1.compareTo(s2);
		System.out.println(result);
		Person[] people = {s1, s2, t3, t4}; // Polymorphism
		System.out.println(Array.toString(people));
		// we define one method in Person class to handler differnet objects from different data type(classes).
		Array.sort(people);
		System.out.println(Array.toString(people));
	}
}
