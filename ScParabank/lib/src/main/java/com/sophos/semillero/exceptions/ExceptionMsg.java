package com.sophos.semillero.exceptions;

public class ExceptionMsg extends AssertionError {
	
	private static final long serialVersionIUD = 11;
	
	public ExceptionMsg (String strMsg, Throwable trbCause) {
		super(strMsg, trbCause);
	}
	
	public ExceptionMsg (Throwable trbCause) {
		super("F, ¡hay un error!", trbCause);
	}

}
