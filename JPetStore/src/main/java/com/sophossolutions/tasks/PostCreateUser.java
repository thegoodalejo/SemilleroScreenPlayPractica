package com.sophossolutions.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

public class PostCreateUser implements Task{

	private String strEndPoint;
	private DataTable dataTableUser;
	
	public PostCreateUser(String strEndPoint, DataTable dataTableUser) {
		this.strEndPoint = strEndPoint;
		this.dataTableUser = dataTableUser;
	}
	public <T extends Actor> void performAs(T actor) {
		Map<String, String> body = dataTableUser.asMap(String.class,String.class);
		actor.attemptsTo(
				Post.to(strEndPoint)
				.with(request -> request.header("Content-Type", "application/json").body(body))
				);
		SerenityRest.lastResponse().prettyPeek();
	}

	public static PostCreateUser with(String strEndPoint, DataTable dataTableUser) {
		return instrumented(PostCreateUser.class, strEndPoint, dataTableUser);
	}

}
