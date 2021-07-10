package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import com.sophos.semillero.util.Token;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostWithAuth implements Task {
	
	String strEndPoint;
	DataTable dataUserInfo;
	
	public PostWithAuth (String strEndPoint, DataTable dataUserInfo) {
		this.strEndPoint = strEndPoint;
		this.dataUserInfo = dataUserInfo;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Map<String, String> body= dataUserInfo.asMap(String.class, String.class);
		actor.attemptsTo(Post.to(strEndPoint).with(request -> request.body(body).auth().oauth2(Token.TOKEN_GOREST)));
		SerenityRest.lastResponse().prettyPeek();
	}

	public static PostWithAuth with (String strEndPoint, DataTable dataUserInfo) {
		return instrumented(PostWithAuth.class, strEndPoint, dataUserInfo);
	}
}
