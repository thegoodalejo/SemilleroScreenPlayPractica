package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.interactions.InsertValue;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;


public class InsertThe implements Task {

	private String strUserValue;
	private Target tarValue;

	
	public InsertThe(String strUserValue, Target tarValue) {
		this.strUserValue = strUserValue;
		this.tarValue = tarValue;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(InsertValue.with(strUserValue, tarValue));
	}

	public static InsertThe data(String strUserValue, Target tarValue) {
		return instrumented(InsertThe.class,strUserValue,tarValue);		
	}

}
