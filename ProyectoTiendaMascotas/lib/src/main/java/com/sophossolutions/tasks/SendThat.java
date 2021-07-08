package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sophossolutions.models.LoginPostModel;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
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
		List<String> dataInfo = userInfo.asList();	
		JsonObject login = new JsonObject();
		JsonElement jsonElement1 = JsonParser.parseString(dataInfo.get(1));
		JsonElement jsonElement2 = JsonParser.parseString(dataInfo.get(3));
		login.add(dataInfo.get(0), jsonElement1);
		login.add(dataInfo.get(2), jsonElement2);
		System.out.println(login);
		actor.attemptsTo(Post.to(strEndPoint)
				.with(request -> request
						.contentType(ContentType.JSON)
						.body(login)));
		actor.remember("Response", SerenityRest.lastResponse().prettyPeek().asString());
	}
	
	public static SendThat info(String strEndPoint, DataTable userInfo) {
		return instrumented(SendThat.class, strEndPoint, userInfo);
	}

}
