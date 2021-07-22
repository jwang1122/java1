package java1;

/*
 * This is my first Java program Hello.java I've ever written
 * 
 * run this program by right-click > select Run As... > Java Application
 * Java is OOP Object Oriented Programming, public,static are modifiers
 * void is a return type because main is a method may return value
 * the arguments in the method is the part of method signature(finger print)
 * 
 * 1. contain attributes
 * 2. constructor
 * 3. methods
 * 4. Representative (toString() method)
 */
class Hello implements Comparable{
	String name = "";
	int age; // by default, the age == 0

	// define constructor: a factory to create instance of Hello class.
	Hello(String newName) {
		name = newName;
	}

	Hello(String name, int age) { // overloading constructor
		this.name = name; // "this" here is the instance itself
		this.age = age;
	}

	public boolean equals(Object obj) {
		Hello h = (Hello)obj;
		return this.name.equals(h.name);
	}
	
	void sayHello() {
		System.out.println("Hello, " + this.name + "!" );
	}
	
	public String toString() {
		return "[name]=" + name + ", [age]=" + age;
	}

	// my main method to run this class, main is static can be run by class name
	// which Hello
	public static void main(String[] args) {
		System.out.println("Hello, World!");
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
//		String hello = "Hello world";
//		System.out.println(hello);
//		for(int i=0; i<hello.length(); i++) {
//			System.out.println(hello.charAt(i));
//		}
		Hello h = new Hello("Hongkai Zhang", 13); // create instance of Hello with name.
		System.out.println(h); // call toString(): return a String that represent the instance of Hello class
		h.sayHello();
		
		String s1 = "John";
		String s2 = "John";
		System.out.println(s1 + " " + s2);
		System.out.println(s1==s2);
		
		s1 = new String("John");
		s2 = new String("John");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

	/**
	 * sort by name
	 */
	@Override
	public int compareTo(Object o) {
		Hello h = (Hello)o;
		return name.compareTo(h.name);
	}

	
	/**
	 * sort by age
	 */
//	@Override
//	public int compareTo(Object o) {
//		Hello h = (Hello)o;
//		if (age<h.age) {
//			return -1;
//		}
//		if (age>h.age) {
//			return 1;
//		}
//		return 0;
//	}


}
