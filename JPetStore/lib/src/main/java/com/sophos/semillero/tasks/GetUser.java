package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetUser implements Task {

	String strEndPoint;
	
	public GetUser (String strEndPoint) {
		this.strEndPoint = strEndPoint;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(strEndPoint));
	}
	
	public static GetUser in (String strEndPoint) {
		return instrumented(GetUser.class, strEndPoint);
	}

}
