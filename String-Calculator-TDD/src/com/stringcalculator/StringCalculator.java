package com.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    /**
     * Adds the numbers provided in a comma-, newline-, or custom-delimiter-separated string.
     * @param numbers A string containing numbers separated by commas, newlines, or custom delimiters.
     * @return The sum of the numbers as an integer.
     * @throws IllegalArgumentException if negative numbers are present.
     */
    public int add(String numbers) {
        // Check if the string is empty
        if (numbers.isEmpty()) {
            return 0;  // Return 0 for an empty string
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
        List<String> negativeNumbers = new ArrayList<>(); // List to store negative numbers

        // Loop through the array and add each number to the sum
        for (String num : numArray) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                negativeNumbers.add(num); // Add negative numbers to the list
            }
            sum += number;
        }

        // If there are negative numbers, throw an exception
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + String.join(", ", negativeNumbers));
        }

        return sum;
    }
}
