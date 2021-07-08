package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SendThat implements Task{
	
	private String strEndPoint;
	private DataTable userInfo;
	
	public SendThat(String strEndPoint, DataTable userInfo) {
		this.strEndPoint = strEndPoint;
		this.userInfo = userInfo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Map<String, String> body = userInfo.asMap(String.class, String.class);		
		actor.attemptsTo(Post.to(strEndPoint)
				.with(request -> request
						.contentType(ContentType.JSON)
						.body("{\r\n"
								+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
								+ "    \"password\": \"cityslicka\"\r\n"
								+ "}")));
	}
	
	public static SendThat info(String strEndPoint, DataTable userInfo) {
		return instrumented(SendThat.class, strEndPoint, userInfo);
	}

}
