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

	// Test Case To Check If Message contains SAD
	@Test
	public void if_MessageWasSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is SAD message");
		String result1 = moodAnalyze.moodCheck();
		Assertions.assertEquals("SAD", result1);
	}

	// Test Case To Check If Message contains HAPPY
	@Test
	public void if_MessageWasHappy_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is HAPPY message");
		String result2 = moodAnalyze.moodCheck();
		Assertions.assertEquals("HAPPY", result2);
	}

	// Test Case To Check If Message was Null
	@Test
	public void ifMessageWasNULL_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyze = new MoodAnalyzer(null);
		String result3 = moodAnalyze.moodCheck();
		Assertions.assertEquals(NullMoodErrors.EMPTYMOOD, result3);

	}

	// Test Case To check if Message was Empty
	@Test
	public void ifMessageWasEMPTY_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyze = new MoodAnalyzer("");
		String result4 = moodAnalyze.moodCheck();
		Assertions.assertEquals(NullMoodErrors.NULLMOOD, result4);
	}
}