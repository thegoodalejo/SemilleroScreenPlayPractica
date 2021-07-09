package com.sophossolutions.exceptions;

public class ExceptionMsg extends AssertionError{

	private static final long serialVersionIUD = 11;
	
	public ExceptionMsg (String strMsg, Throwable trbCause) {
		super(strMsg, trbCause);
	}
	
	public ExceptionMsg (Throwable trbCause) {
		super("Invalid username or password.  Signon failed.", trbCause);
	}
}
