package com.jsp.springboot1.exception;

public class NoSuchUserIdFoundException extends Exception{
	
	public NoSuchUserIdFoundException() {
		super("No such user found with the mentioned id");
	}

}
