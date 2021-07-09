package com.sophos.semillero.tasks;

import net.serenitybdd.screenplay.Task;

import static com.sophos.semillero.util.ConstantToken.GOREST_TOKEN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.sophos.semillero.interactions.ViewLastResponse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class MakeAGetGorest implements Task{
	
	private String strEndPoint;
	private String strUserId;
	private String strResource;
	
	public MakeAGetGorest(String strEndPoint, String strUserId, String strResource) {
		this.strEndPoint = strEndPoint;
		this.strUserId = strUserId;
		this.strResource = strResource;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Get.resource(strEndPoint.concat(strUserId).concat(strResource)).with(request -> request.auth().oauth2(GOREST_TOKEN)),
				ViewLastResponse.with()	
				);
	}
	
	public static MakeAGetGorest oauth(String strEndPoint,String strUserId, String strResource) {
		return instrumented(MakeAGetGorest.class, strEndPoint, strUserId, strResource);
	}
}
