package com.moodAnalyzer.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyze = new MoodAnalyzer();

	@Test
	public void if_MessageWasSad_ShouldReturnSad() {
		String message = "I am in Sad Mood";
		String result1 = moodAnalyze.moodCheck(message);
		Assertions.assertEquals("SAD", result1);
	}

	@Test
	public void if_MessageWasHAppy_ShouldReturnHappy() {
		String message = "I am in Happy Mood";
		String result2 = moodAnalyze.moodCheck(message);
		Assertions.assertEquals("HAPPY", result2);

	}
}