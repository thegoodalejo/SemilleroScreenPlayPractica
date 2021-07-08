package com.sophos.semillero.tasks;

import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.interactions.ViewLastResponse;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class MakeAGetRequest implements Task{
	
	private String strEndPoint;
	private String id;
	
	public MakeAGetRequest(String strEndPoint, String id) {
		this.strEndPoint = strEndPoint;
		this.id = id;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(strEndPoint.concat(id)),
				ViewLastResponse.with());
		actor.remember("STATUS_CODE", SerenityRest.lastResponse().getStatusCode());
	
	}
	
	public static MakeAGetRequest withoutAuthentication(String strEndPoint,String strIdUser) {
		return instrumented(MakeAGetRequest.class,strEndPoint,strIdUser);
	}
}
