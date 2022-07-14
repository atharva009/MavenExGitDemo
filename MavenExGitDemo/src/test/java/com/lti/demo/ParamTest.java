package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParamTest {

	@ParameterizedTest
	@ValueSource(ints = {8, 10, 22, 36, 48})
	public void  testIntArrays(int arg) {
		System.out.println("args: " + arg);
		Assertions.assertTrue(arg % 2 == 0);
	}
	
	@ParameterizedTest
	@DisplayName("Should pass all not null arguments")
	@ValueSource(strings = {"Hello", "Hello World", "Hello Us"})
	public void  testStringArrays(String msg) {
		System.out.println("args: " + msg);
		Assertions.assertTrue(msg.contains("Hello"));
	}
	
	
	//Login 3 attempts same code
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x = 10, y = 20;
		assertEquals(200, x*y);
	}
	
	@Test
	public void testLambda()
	{
		Integer[] intAry= {2,3,7,5,10};
		
		List<Integer> numbers= Arrays.asList(intAry);
		
		Assertions.assertAll(
				() -> assertEquals(2, numbers.get(0)) ,				
				() -> assertEquals(3, numbers.get(1)) ,
				() -> assertEquals(7, numbers.get(2)) ,
				() -> assertEquals(5, numbers.get(3)) ,
				() -> assertEquals(10, numbers.get(4)) 				
				);	
	}
	
	//Testing whether exception is called - excep obj got created
	@Test
	void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("One");
		});
	}

}
