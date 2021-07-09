package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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
		SerenityRest.lastResponse().statusCode();
		System.out.println("==============================================");
		System.out.println("ENPOINT: " + endpoint);
		System.out.println("============================================== \n");	
	}
	
	public static CallTheGetApiNoAuth onEndpoint(String endpoint)
	{
		return instrumented(CallTheGetApiNoAuth.class, endpoint);
	}
}