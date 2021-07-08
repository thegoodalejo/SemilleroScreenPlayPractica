package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.util.TokenGoRest;

public class GetWith implements Task{
	
	private String strEndPoint;
	private String strIdUser;
	
	

	public GetWith(String strEndPoint, String strIdUser) {
		this.strEndPoint = strEndPoint;
		this.strIdUser = strIdUser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		//String strParametro = "Amaranaath Pothuvaal Jr.";
		actor.attemptsTo(Get.resource(strEndPoint.concat(strIdUser)).with(request -> request.auth().oauth2(TokenGoRest.TOKEN_GOREST)));
		//actor.attemptsTo(Get.resource(strEndPoint).with(request -> request.auth().oauth2(TokenGoRest.TOKEN_GOREST).queryParam("name", strParametro)));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static GetWith oAuth(String strEndPoint, String strIdUser) {
		return instrumented(GetWith.class, strEndPoint, strIdUser);
	}

}
