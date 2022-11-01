package com.moodAnalyzer.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * To Check the Mood of the Person by String Entered. Emphasis on - Junit Test
 * Cases - Exception Handling - Custom Exceptions Author
 *
 * Testing Class of MoodAnalyzerTest 
 * Created Object of Mood Analyzer 
 * Created a Test Function and Imported Assertions and checking SAD or HAPPY
 */

public class MoodAnalyzerTest {
	

	 @Test
	    public void if_MessageWasSad_ShouldReturnSad(){
		 	MoodAnalyzer moodAnalyze = new MoodAnalyzer("I am in Sad Mood");
	        
		 	
	        String result1 = moodAnalyze.moodCheck();
	        Assertions.assertEquals("SAD",result1);
	}
	 @Test
	    public void if_MessageWasHappy_ShouldReturnHappy() {
		 	MoodAnalyzer moodAnalyze = new MoodAnalyzer("I am in Happy Mood");

		 	String result2 = moodAnalyze.moodCheck();
		 	Assertions.assertEquals("HAPPY", result2);
	 }
	 //Test Case To Check If Message was Null
	 @Test
	 public void ifMessageWasNULL_ShouldReturnHappy() {
		 	MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		 	String result3 = moodAnalyzer.moodCheck();
		 	Assertions.assertEquals("HAPPY", result3);		//HaPPY this will be show no error in Junit
	 }
}