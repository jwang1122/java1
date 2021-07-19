package java1;

/**
 * Method signature: 
 * 1. method name 
 * 2. number of arguments 
 * 3. type of arguments
 * 
 * the method in a class is defined what the object of the class can do.
 * 
 * Method overloading: same method name with different method signature
 * 
 * private scope is called encapsulation: avoid calling from outside unexpectedly.
 * 
 * @author cyxt2
 *
 */

public class Method {

	// this is a default scope method which can only be used within same package
// static int add(int x, int y) { // created a static method so I can call it directly in main()
//	return x + y;
// }
	
	//public modifier determine the scope of this method add()
	public static int add(int x, int y) { // created a static method so I can call it directly in main()
		return x + y;
	}

	public double add(double x, double y) { // different signature of add() method, so-called method overloading
		return x + y;

	}

	public static void main(String[] args) { // local test code block
		double result = add(4, 5); //assign small value to a big contains in the memory 
		System.out.println(result);	

		Method obj = new Method();
		result = obj.add(1.2, 3.4); // create an instance and call non-static method
		System.out.println(result);
	}

}
