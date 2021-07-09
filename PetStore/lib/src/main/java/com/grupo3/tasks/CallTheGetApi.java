package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.grupo3.util.Constants.AUTH_TOKEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class CallTheGetApi implements Task{

	String endpoint;
	String param;
	
	public CallTheGetApi(String endpoint) {
		this.endpoint = endpoint;
	}
	
	public CallTheGetApi withParameter(String param) {
		this.param = param;
		return this;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		assert param != null;
		
		actor.attemptsTo(
					Get.resource(endpoint + param).with(request -> request.auth().oauth2(AUTH_TOKEN))
				);
	}
	
	public static CallTheGetApi onEndpoint(String endpoint) {
		
		return instrumented(CallTheGetApi.class, endpoint);
		
	}
	
}
