package com.sophossolutions.exceptions;

public class ExceptiionMesage extends AssertionError
{
	private static final long serialVersionUID = 1L;
	
	public ExceptiionMesage(String strMessage, Throwable twCause)
	{
		super(strMessage, twCause);	
	}
	
	public ExceptiionMesage(Throwable twCause)
	{
		super("Mensage quemado", twCause);	
	}
}