package com.moodAnalyzer.java;

/**
 * To Check the Mood of the Person by String Entered. Emphasis on - Junit Test
 * Cases - Exception Handling - Custom Exceptions
 */

//Mood Analyzer Class

public class MoodAnalyzer {
	String message;
	
	//Constructor created to pass message as mentioned in UC.
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	 //Function to Check Mood of a String Entered
    public String moodCheck() {
    	// Created Try and Catch Blocks to Handle Exception if Occurs.
    	try {
    		
    		if (message.contains("Sad")) {
    				System.out.println("In SAD Mood");
    				return "SAD";
    	}else if (message.contains("NULL")) {
    				return "HAPPY";
    				
    	} else {
    		System.out.println("In HAPPY Mood");
    		return "HAPPY";
    	}
    }
    	//Don't know what would be exception, So Took a Normal Exception to Catch,
    	//What Exception Occurs.
    	catch (Exception exception) {
    		return "HaPPY";
    	}
    }
}
