package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.util.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class CallTheGetApiNoAuth implements Task
{
	private String endpoint;
	
	public CallTheGetApiNoAuth(String endpoint)
	{
		this.endpoint = endpoint;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Get.resource(endpoint));
		String json = SerenityRest.lastResponse().jsonPath().prettyPrint();
		actor.remember(Constants.TEXT_ID, json);
		System.out.println("============================================== \n " + json);
	}
	
	public static CallTheGetApiNoAuth onEndpoint(String endpoint)
	{
		return instrumented(CallTheGetApiNoAuth.class, endpoint);
	}
}