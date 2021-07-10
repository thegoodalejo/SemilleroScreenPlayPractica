package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.Map;

public class PostRegister implements Task  {

	String strEndPoint;
	DataTable dataUserInfo;
	
	public PostRegister (String strEndPoint, DataTable dataUserInfo) {
		this.strEndPoint = strEndPoint;
		this.dataUserInfo = dataUserInfo;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Map<String, String> body= dataUserInfo.asMap(String.class, String.class);
		actor.attemptsTo(Post.to(strEndPoint).with(request -> request.body(body)));
		//actor.should(seeThatResponse("User details should be correct", response -> response.statusCode(200).body("data.id", equalTo("2"))));
		SerenityRest.lastResponse().prettyPeek();
	}

	public static PostRegister with (String strEndPoint, DataTable dataUserInfo) {
		return instrumented(PostRegister.class, strEndPoint, dataUserInfo);
	}
}
