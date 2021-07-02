package com.sophossolutions.tasks;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static com.sophossolutions.util.ConstantsUtil.TOKEN_GOREST;

public class GetWith implements Task {

	private String strEndPoint;
	private String strId;
	
	public GetWith(String strEndPoint, String strId) {
		super();
		this.strEndPoint = strEndPoint;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Get.resource(strEndPoint.concat("?page="+ strId)).with(request -> request.auth().oauth2(TOKEN_GOREST)));
	}
	
	public static GetWith oauth2(String strEndPoint, String strId) {
		return Tasks.instrumented(GetWith.class, strEndPoint, strId);
	}

}
