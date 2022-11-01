package com.moodAnalyzer.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * To Check the Mood of the Person by String Entered. Emphasis on - Junit Test
 * Cases - Exception Handling - Custom Exceptions Author
 *
 * Testing Class of MoodAnalyzerTest Created Object of Mood Analyzer Created a
 * Test Function and Imported Assertions and checking SAD or HAPPY
 */

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyze = new MoodAnalyzer();

	@Test
	public void if_MessageWasSad_ShouldReturnSad() {

		String message = "I am in Sad Mood";
		String result = moodAnalyze.moodCheck(message);
		Assertions.assertEquals("SAD", result);
	}
} 