package com.sophossolutions.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static com.sophossolutions.utils.ConstantToken.GOREST_TOKEN;

import com.google.gson.JsonObject;

public class GetWithAuth implements Task {

	private String strEndPoint, strStatus;

	public GetWithAuth(String strEndPoint, String strStatus) {
		super();
		this.strEndPoint = strEndPoint;
		this.strStatus = strStatus;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Get.resource(strEndPoint)
				.with(request -> request.auth().oauth2(GOREST_TOKEN).queryParam("status", strStatus)));
		
		actor.remember("strResponseData", SerenityRest.lastResponse().prettyPeek().asString());

	}

	public static GetWithAuth with(String strEndPoint, String strStatus) {
		return Tasks.instrumented(GetWithAuth.class, strEndPoint, strStatus);
	}

}
