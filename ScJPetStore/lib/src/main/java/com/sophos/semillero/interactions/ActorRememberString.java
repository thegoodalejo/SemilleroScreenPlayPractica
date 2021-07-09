package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ActorRememberString implements Interaction {
	
	private String strKey;
	private String strValue;
	
	public ActorRememberString(String strKey, String strValue) {
		super();
		this.strKey = strKey;
		this.strValue = strValue;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(strKey, strValue);
	}

	public static ActorRememberString the(String strKey, String strValue) {
		return instrumented(ActorRememberString.class, strKey, strValue);		
	}


}