package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetUsers implements Task{
	
	private final String strPage, strEndPoint;	

	public GetUsers(String strPage, String strEndPoint) {
		super();
		this.strPage = strPage;
		this.strEndPoint = strEndPoint;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(strEndPoint+strPage).with(request -> request.contentType(ContentType.JSON)));
		actor.remember("strResponse", SerenityRest.lastResponse().prettyPeek().asString());
	}
	
	public static Performable fromPage(String strPage,String strEndPoint) {
		return instrumented(GetUsers.class, strPage,strEndPoint);
	}

}
