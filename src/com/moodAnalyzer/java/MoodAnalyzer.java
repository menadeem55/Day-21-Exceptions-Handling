package com.moodAnalyzer.java;

/**
 * To Check the Mood of the Person by String Entered. Emphasis on - Junit Test
 * Cases - Exception Handling - Custom Exceptions
 */

//Mood Analyzer Class

public class MoodAnalyzer {
String message;
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	 //Function to Check Mood of a String Entered
    public String moodCheck(){
        if(message.contains("Sad")) {
            System.out.println("In SAD Mood");
            return "SAD";
        }
        else{
            System.out.println("In HAPPY Mood");
            return "HAPPY";
        }
	}
}