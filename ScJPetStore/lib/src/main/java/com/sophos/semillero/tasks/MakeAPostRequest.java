package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import com.sophos.semillero.interactions.ViewLastResponse;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class MakeAPostRequest implements Task{
	
	private String strEndPoint;
	private Map<String,String> mapData;
	private static final String CONTENT_TYPE="application/json";
	
	public MakeAPostRequest(String strEndPoint,Map<String,String> mapData) {
		this.strEndPoint = strEndPoint;
		this.mapData=mapData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Post.to(strEndPoint).
				with(request -> request.contentType(CONTENT_TYPE).body(mapData)),
				ViewLastResponse.with());
		actor.remember("STATUS_CODE", SerenityRest.lastResponse().getStatusCode());
		actor.remember("ID", SerenityRest.lastResponse().getBody().jsonPath().get("id").toString());
		actor.remember("TOKEN", SerenityRest.lastResponse().getBody().jsonPath().get("token").toString());
	
	}
	
	public static MakeAPostRequest withoutAuthentication(String strEndPoint,Map<String,String> strIdUser) {
		return instrumented(MakeAPostRequest.class,strEndPoint,strIdUser);
	}
}
