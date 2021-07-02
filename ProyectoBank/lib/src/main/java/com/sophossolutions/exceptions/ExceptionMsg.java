package com.sophossolutions.exceptions;

public class ExceptionMsg extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionMsg (String strTxtMsg, Throwable trbCause) {
		super(strTxtMsg,trbCause);
	}
}
