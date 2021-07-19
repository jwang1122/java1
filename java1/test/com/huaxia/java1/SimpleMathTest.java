package com.huaxia.java1;

import static org.junit.jupiter.api.Assertions.*;

import javax.sound.midi.InvalidMidiDataException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
	SimpleMath sm;
	
	@BeforeEach
	void setUp(){
		sm = new SimpleMath();
	}

	@Test
	void testAdd() {
		double x = 1.1;
		double y = 2.2;
		double expected = x + y;
		double actual = SimpleMath.add(x, y);
		assertTrue(expected==actual);
	}
	
	@Test 
	void testSub() {
		double x = 2.2;
		double y = 1.1;
		double expected = x - y;
		double actual = sm.sub(x,y);
		assertTrue(expected==actual);
	}

	// TDD: Test Driving Development 
	@Test
	void testIsPrime() {
		int a = 9;
		assertFalse(sm.isPrime(a));
		a = 1;
		assertFalse(sm.isPrime(a));
		a = 2;
		assertTrue(sm.isPrime(a));
		a = 0;
		assertFalse(sm.isPrime(a));
		a = -2;
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
	void testCircleAreaWithNegativeR() {
		double r = -1.1;
		double expected = Math.pow(r, 2) * Math.PI;
		try {
			double actual = sm.circleArea(r);
			assertTrue(actual==expected);
		}catch(InvalidMidiDataException ex) {
			System.out.println(ex);
		}
	}

}
