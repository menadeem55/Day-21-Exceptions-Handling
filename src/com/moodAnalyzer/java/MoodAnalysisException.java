package com.moodAnalyzer.java;

public class MoodAnalysisException extends Exception {
	NullMoodErrors error;
	
	public MoodAnalysisException(NullMoodErrors error, String message) {
		super(message);
		this.error = error;
		
	}
	

}
