package test;

import java1.Method; // Use the class in other package need import
import java1.Person;
import java1.Student;
import java1.Superclass1;
import java1.Teacher;

/**
 * Running class within the same package of @see(Method) class, so we don't need to import
 * @author cyxt2
 *
 */
public class TestMethod {

	// ask same question for different classes: polymorphism
	static void printOccupation(Person p) {// p could be teacher or student since both extends from Person
		System.out.println(p.getFirstName() + ": " + p.getOccupation());
	}

	static void testOccupation() {
		Student s1 = new Student();
		s1.setFirstName("John");
		printOccupation(s1);
		
		Teacher t1 = new Teacher("John","Wang");
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