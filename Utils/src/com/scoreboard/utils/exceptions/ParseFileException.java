package com.scoreboard.utils.exceptions;

public class ParseFileException extends Exception {
	public ParseFileException(String message) {
		super(message);
	}
	public ParseFileException(String message, Exception ex)
	{
		super(message, ex);
	}
}
