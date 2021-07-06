package com.sophosolutions.exceptions;

public class ExceptionMessage extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionMessage(String txtMssg, Throwable cause) {
		super( txtMssg, cause);
	}

}