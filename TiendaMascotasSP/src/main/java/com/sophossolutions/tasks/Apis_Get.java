package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;

public class Apis_Get implements Task {
	private String strEndPoint;

	public Apis_Get(String strEndPoint) {
		this.strEndPoint = strEndPoint;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Get.resource(strEndPoint));
		SerenityRest.lastResponse().prettyPeek();

	}

	public static Apis_Get withValues(String strEndPoint) {

		return instrumented(Apis_Get.class, strEndPoint);
	}

}
