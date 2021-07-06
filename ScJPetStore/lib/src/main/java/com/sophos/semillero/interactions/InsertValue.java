package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class InsertValue implements Interaction {

	private String strValue;
	private Target tarCampo;
	
	
	public InsertValue(String strValue, Target tarCampo) {
		this.strValue = strValue;
		this.tarCampo = tarCampo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String[] strValues=strValue.split(",");
		for(int i=1;i<=strValues.length;i++) {
			actor.attemptsTo(Enter.theValue(strValues[i-1]).into(tarCampo.of(String.valueOf(i))));
		}
	}
	

	public static InsertValue with(String strValue, Target tarCampo) {
		return instrumented(InsertValue.class, strValue, tarCampo);
	}


}
