package com.stringcalculator;

/**
 * A simple String Calculator that adds numbers from a comma-separated string.
 * This class will be developed using Test Driven Development (TDD) principles.
 */
public class StringCalculator {

	/**
	 * Adds the numbers provided in a comma-separated string.
	 * 
	 * @param numbers A string containing numbers separated by commas or other
	 *                delimiters.
	 * @return The sum of the numbers as an integer. For an empty string, it returns
	 *         0.
	 */
	public int add(String numbers) {
		// Check if the string is empty
		if (numbers.isEmpty()) {
			return 0; // Return 0 for an empty string
		}

		// Check for custom delimiter
		if (numbers.startsWith("//")) {
			// Find the newline character that follows the custom delimiter
			int delimiterEndIndex = numbers.indexOf("\n");
			String customDelimiter = numbers.substring(2, delimiterEndIndex);
			String numbersToProcess = numbers.substring(delimiterEndIndex + 1);

			// Replace the custom delimiter with a comma, then split the string
			String[] numArray = numbersToProcess.split(customDelimiter);
			return calculateSum(numArray);
		}

		// If no custom delimiter, replace newlines with commas and split
		String[] numArray = numbers.replace("\n", ",").split(",");

		return calculateSum(numArray);
	}

	private int calculateSum(String[] numArray) {
		// Initialize sum to 0
		int sum = 0;

		// Loop through the array and add each number to the sum
		for (String num : numArray) {
			sum += Integer.parseInt(num);
		}

		return sum;
	}
}