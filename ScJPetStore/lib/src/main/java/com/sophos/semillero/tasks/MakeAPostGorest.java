package com.sophos.semillero.tasks;

import static com.sophos.semillero.util.ConstantToken.GOREST_TOKEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.interactions.ActorRememberString;
import com.sophos.semillero.interactions.ViewLastResponse;

public class MakeAPostGorest implements Task{

	private String endPoint;
	private String strUserId;
		
	public MakeAPostGorest(String endPoint, String strUserId) {		
		this.endPoint = endPoint;
		this.strUserId = strUserId;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Get.resource(endPoint.concat(strUserId)).with(request -> request.auth().oauth2(GOREST_TOKEN)),
				ActorRememberString.the("USER_ID", strUserId),
				ViewLastResponse.with()
				);
		
	}	
	
	public static MakeAPostGorest oauth(String endPoint, String strUserId) {
		return instrumented(MakeAPostGorest.class, endPoint, strUserId);
	}
	
}
