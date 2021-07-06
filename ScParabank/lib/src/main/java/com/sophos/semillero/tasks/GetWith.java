package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.sophos.semillero.util.ConstantsUtil.TOKEN_API_GOREST;

import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GetWith implements Task {

	private String strEndpoint;
	private String strIdUser;

	public GetWith(String strEndpoint, String strIdUser) {
		this.strEndpoint = strEndpoint;
		this.strIdUser = strIdUser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(strEndpoint.concat(strIdUser)).with(
				request -> request.auth().oauth2(TOKEN_API_GOREST)));
	}

	public static GetWith oAuth2(String strEndpoint, String strIdUser) {
		return instrumented(GetWith.class, strEndpoint, strIdUser);
	}
	
}
