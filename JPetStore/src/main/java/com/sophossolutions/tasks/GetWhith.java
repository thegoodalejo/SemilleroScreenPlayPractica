package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.TOKEN_GOREST;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetWhith implements Task
{
	private String strEndpont;
	private String strId;
	
	public GetWhith(String strEndpont, String strId)
	{
		this.strEndpont = strEndpont;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Get.resource(strEndpont.concat(strId)).with(request -> request.auth().oauth2(TOKEN_GOREST)));
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static GetWhith oautn2(String strEndpont, String strId)
	{
		return instrumented(GetWhith.class, strEndpont, strId);
	}
}