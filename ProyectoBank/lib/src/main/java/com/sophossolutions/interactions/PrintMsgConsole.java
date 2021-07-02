package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class PrintMsgConsole implements Interaction {

	private String strMsg;
	
	public PrintMsgConsole(String strMsg) {
		super();
		this.strMsg = strMsg;
	}
	
	public static PrintMsgConsole of(String strMsg) {
		return new PrintMsgConsole(strMsg);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(strMsg);
	}
	
	

}
