package java1;

public abstract class Person implements Occupation, Comparable<Person>{
	protected String firstName;
	protected String lastName;
	protected String ssn;
	protected int age;
	protected int gender; //1: male, 2:female, 0: other
	
	/**
	 * a negative integer, zero, or positive integer as this object
	 * is less than, equal to, or greater than the specified object
	 */
	@Override
	public int compareTo(Person other) {
		String fullname = lastName + ", " + firstName;
		String otherName = other.lastName + ", " + lastName;
		return fullname.compareTo(otherName);
	}
	
	// abtract class can define abstract method without implementation
	public abstract double add(double x, double y); // Person does NOT know how to add() but want every subclass do it
	
	public String getFirstName() { // a getter
		return firstName;
	}
	
	public void setFirstName(String firstName) { // a setter
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getSsn() {
		return ssn;
	}

	protected void setSsn(String ssn) {
		this.ssn = ssn;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected int getGender() {
		return gender;
	}

	protected void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	
}
