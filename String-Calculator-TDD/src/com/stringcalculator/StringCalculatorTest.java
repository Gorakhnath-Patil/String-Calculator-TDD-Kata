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
}
