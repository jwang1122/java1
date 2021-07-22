package com.huaxia.java1;

import static org.junit.jupiter.api.Assertions.*;

import javax.sound.midi.InvalidMidiDataException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
	SimpleMath sm;
	double x;
	double y;
	
	@BeforeEach
	void setUp(){
		sm = new SimpleMath();
		x = 1.1;
		y = 2.2;
	}

	@Test
	void testAdd() {
		x = 4.5;
		double expected = x + y;
		double actual = SimpleMath.add(x, y);
		assertTrue(expected==actual);
	}
	
	@Test 
	void testSub() {
		double expected = x - y;
		double actual = sm.sub(x,y);
		assertTrue(expected==actual);
	}

	// TDD: Test Driving Development 
	@Test
	void testIsPrime() {
		int a = 9; // positive number which is not prime number
		assertFalse(sm.isPrime(a));
		a = 1; // special number, is not prime number
		assertFalse(sm.isPrime(a));
		a = 2; // prime number
		assertTrue(sm.isPrime(a));
		a = 0; // special number, is not prime number
		assertFalse(sm.isPrime(a));
		a = -2; // negative number
		assertFalse(sm.isPrime(a));
	}
	
	@Test
	void testCircleAreaWithPositiveR() {
		double r = 1.1;
		double expected = Math.pow(r, 2) * Math.PI;
		try {
			double actual = sm.circleArea(r);
			assertTrue(actual==expected);
		}catch(InvalidMidiDataException ex) {
			System.out.println(ex);
		}
	}

	@Test
	void testCircleAreaWithZeroR() {
		double r = 0; // 0 is very special case
		double expected = 0;
		try {
			double actual = sm.circleArea(r);
			assertTrue(actual==expected);
		}catch(InvalidMidiDataException ex) {
			System.out.println(ex);
		}
	}

	@Test
	void testCircleAreaWithNegativeR() {
		double r = -1.1;
		double expected = Math.pow(r, 2) * Math.PI;
		try {
			double actual = sm.circleArea(r);
			assertTrue(actual==expected);
		}catch(InvalidMidiDataException ex) {
			System.out.println(ex); // this is not good in real case
		}
	}
	
	@Test
	void testExceptionForCircleArea() {
		InvalidMidiDataException exception = assertThrows(InvalidMidiDataException.class, ()->{
			double area = sm.circleArea(-2.9);
			System.out.println(area);
		});
		String expected = "Radius of the circle cannot be negative.";
		String actual = exception.getMessage();
		assertTrue(actual.contains(expected));
	}

}
