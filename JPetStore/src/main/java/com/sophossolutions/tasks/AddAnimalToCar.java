package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.TOKEN_GOREST;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.targets.Target;

public class AddAnimalToCar implements Task
{
	private Target linkPage;

	public AddAnimalToCar(Target linkpage){
		this.linkPage = linkpage;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		//actor.attemptsTo(Get.resource(strEndpont.concat(strId)).with(request -> request.auth().oauth2(TOKEN_GOREST)));
	}
	
	public static AddAnimalToCar oautn2(String strEndpont, String strId)
	{
		return instrumented(AddAnimalToCar.class, strEndpont, strId);
	}
}