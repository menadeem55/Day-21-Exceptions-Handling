package com.moodAnalyzer.java;

/**
 * To Check the Mood of the Person by String Entered. Emphasis on - Junit Test
 * Cases - Exception Handling - Custom Exceptions
 */

//Mood Analyzer Class

public class MoodAnalyzer {
	String message;

	// Constructor created to pass message as mentioned in UC.
	public MoodAnalyzer(String message) {

		this.message = message;
	}

	// Function to Check Mood of a String Entered
	public String moodCheck() throws MoodAnalysisException {
		// Created Try and Catch Blocks to Handle Exception if Occurs.
		try {
			if (message.contains("SAD")) {
				return "SAD";
			} else if (message.contains("HAPPY")) {
				return "HAPPY";
			} else if (message.contains("")) {
				throw new MoodAnalysisException(NullMoodErrors.EMPTYMOOD, "Entered Nothing !!");
			} else {
				return "HAPPY";
			}
		}
		// 1.Don't Know what would be exception, So Took a Normal Exception to Catch,
		// Whatever Exception Occurs.
		// 2.Refactored and Handling by Custom Exception
		catch (Exception exception) {
			throw new MoodAnalysisException(NullMoodErrors.NULLMOOD, "Please Enter Something !!");
		}
	}
}