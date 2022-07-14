package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	
	Calculator c = new Calculator();

	@Test
	public void testAdd() {
		
		int res = c.add(100, 200);
		Assertions.assertEquals(300, res);
		
	}
	
	@Test
	public void testAssertFalse() {
		Assertions.assertEquals("Hello", "Hello");
		Assertions.assertFalse("Atharva".length() == 8);
		Assertions.assertFalse(10 > 20, "10 is not greater than 20");
	}
	
	@Test
	public void testAssertNull() {
		String str1 = null;
		String str2 = "abc";
		Assertions.assertNotNull(str2);
		Assertions.assertNull(str1);
	}
	
	@Test
	public void testArrayList() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
		Assertions.assertTrue(myList.get(1) == 200);
	}

}
