package com.stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the StringCalculator class. Following Test Driven Development
 * (TDD) principles.
 */
public class StringCalculatorTest {

	/**
	 * Test to verify that an empty string returns 0.
	 */
	@Test
	public void testEmptyString() {
		// Create an instance of the StringCalculator class
		StringCalculator calculator = new StringCalculator();

		// Call the add method with an empty string and store the result
		int result = calculator.add("");

		// Assert that the result is 0 for an empty string
		assertEquals(0, result);
	}

	/**
	 * Test to verify that a single number string returns that number.
	 */
	@Test
	public void testSingleNumber() {
		StringCalculator calculator = new StringCalculator();

		// Test with a single number "1"
		int result = calculator.add("1");

		// Assert that the result is 1
		assertEquals(1, result);
	}

	/**
	 * Test to verify that two numbers separated by a comma return their sum.
	 */
	@Test
	public void testTwoNumbers() {
		StringCalculator calculator = new StringCalculator();

		// Test with two numbers "1,5"
		int result = calculator.add("1,5");

		// Assert that the result is the sum of 1 and 5
		assertEquals(6, result);
	}

	@Test
	public void testMultipleNumbers() {
		StringCalculator calculator = new StringCalculator();

		// Test with multiple numbers "1,2,3,4"
		int result = calculator.add("1,2,3,4");

		// Assert that the result is the sum of 1, 2, 3, and 4
		assertEquals(10, result);
	}

	@Test
	public void testNewlinesAsDelimiter() {
		StringCalculator calculator = new StringCalculator();

		// Test with numbers separated by commas and newlines "1\n2,3"
		int result = calculator.add("1\n2,3");

		// Assert that the result is the sum of 1, 2, and 3
		assertEquals(6, result);
	}

	@Test
	public void testCustomDelimiter() {
		StringCalculator calculator = new StringCalculator();

		// Test with a custom delimiter ";"
		int result = calculator.add("//;\n1;2");

		// Assert that the result is the sum of 1 and 2
		assertEquals(3, result);
	}
}
