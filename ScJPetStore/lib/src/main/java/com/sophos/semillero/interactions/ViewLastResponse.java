package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ViewLastResponse implements Interaction {

	boolean anData;
	String strAttribute;
	
	public ViewLastResponse() {
		this.anData = false;
	}
	
	public ViewLastResponse(boolean anData, String strAttribute) {
		this.anData = true;
		this.strAttribute = strAttribute;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		if (anData) {
			 SerenityRest.lastResponse().jsonPath().get(strAttribute);
		}else {
			SerenityRest.lastResponse().prettyPeek();
			}
	}
	
	public static ViewLastResponse with() {
		return instrumented(ViewLastResponse.class);
	}
	
	public static ViewLastResponse with(boolean anData, String strAttribute) {
		return instrumented(ViewLastResponse.class,anData,strAttribute);
	}
}
