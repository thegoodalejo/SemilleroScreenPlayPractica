package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.util.Token;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetCommentsWithAuth implements Task{

	
	String strEndPoint;
	String strGender;
	
	public GetCommentsWithAuth (String strEndPoint, String strGender) {
		this.strEndPoint = strEndPoint;
		this.strGender = strGender;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(strEndPoint).with(request-> request.auth().oauth2(Token.TOKEN_GOREST).queryParam("gender", strGender)));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static GetCommentsWithAuth in (String strEndPoint, String strGender) {
		return instrumented(GetCommentsWithAuth.class, strEndPoint,strGender);
	}

}
