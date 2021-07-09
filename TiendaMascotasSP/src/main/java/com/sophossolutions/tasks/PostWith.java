package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.util.Map;

import com.sophossolutions.util.TokenGoRest;

public class PostWith implements Task{
	
	private static final String CONTENT_TYPE = "application/json";
	private String strEndPoint;
	private DataTable userData;
	
	public PostWith(String strEndPoint, DataTable userData) {
		this.strEndPoint = strEndPoint;
		this.userData = userData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Map<String, String> body = userData.asMap(String.class, String.class);
		
		SerenityRest.given().auth().oauth2(TokenGoRest.TOKEN_GOREST).contentType(CONTENT_TYPE).when().body(body).post("https://gorest.co.in/".concat(strEndPoint));
		SerenityRest.lastResponse().prettyPeek();
		
	}

	public static PostWith oAuth(String strEndPoint, DataTable userData) {
		return instrumented(PostWith.class, strEndPoint, userData);
	}

}
