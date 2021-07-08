package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import io.cucumber.datatable.DataTable;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import java.util.Map;

public class Apis_Post implements Task {

	private static final String CONTENT_TYPE = "application/json";

	private String strEndPoint;
	DataTable userInfo;

	public Apis_Post(String strEndPoint, DataTable userInfo) {
		this.strEndPoint = strEndPoint;
		this.userInfo = userInfo;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		Map<String, String> body = userInfo.asMap(String.class, String.class);

	//	actor.attemptsTo(Post.to(strEndPoint));
		
		SerenityRest.
		given().contentType(CONTENT_TYPE).
		when().body(body).post(strEndPoint).
		then().assertThat().statusCode(200);
		SerenityRest.lastResponse().prettyPeek();
  
	}

	public static Apis_Post withValues(String strEndPoint) {

		return instrumented(Apis_Post.class, strEndPoint);
	}

}