package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTest {

	int sum = 0;
	Calculator c = new Calculator();
	
	@BeforeAll
	public static void testDbConn() {
		System.out.println("DB Connection is established");
	}
	
	@BeforeEach
	public void testStartup() {
		sum = 0;
		System.out.println("start");
	}

	@Test
	public void testAdd() {
		
		int res = c.add(100, 200);
		Assertions.assertEquals(300, res, "Checked add method");
		
	}
	
	@Test
	public void testAdd1() {
		
		int res = c.add(100, 200);
		Assertions.assertEquals(300, res, "Checked add method");
		
	}
	
	@AfterEach
	public void testShutdown() {
		System.out.println("shutdown");
	}
	
	@AfterAll
	public static void testDbConnClose() {
		System.out.println("DB Connection is closed");
	}
}
