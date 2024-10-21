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
}
