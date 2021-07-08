package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.sophossolutions.util.Constants.INDEX_STATUS_CODE;
import net.serenitybdd.rest.SerenityRest;


public class GetUserApi implements Task {

	private String strEndPoint;
	private String strNumUser;
	
	public GetUserApi(String strEndPoint, String strNumUser) {
		this.strEndPoint = strEndPoint;
		this.strNumUser = strNumUser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo( Get.resource(strEndPoint.concat(strNumUser)) );
		SerenityRest.lastResponse().body().prettyPeek();
		actor.remember(INDEX_STATUS_CODE, SerenityRest.lastResponse().getStatusCode());		
	}

	public static GetUserApi withGet(String strEndPoint, String strNumUser) {
		// TODO Auto-generated method stub
		return instrumented(GetUserApi.class, strEndPoint, strNumUser);
	}
	
	
	
}
