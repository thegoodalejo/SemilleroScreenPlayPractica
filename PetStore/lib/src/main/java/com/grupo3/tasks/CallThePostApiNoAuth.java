package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import com.grupo3.util.Constants;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class CallThePostApiNoAuth implements Task
{
	private String endpoint;
	private DataTable user;
	
	public CallThePostApiNoAuth(String endpoint, DataTable user)
	{
		this.endpoint = endpoint;
		this.user = user;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		System.out.println("============================================== \n ");
		Map<String, String> body = user.asMap(String.class,String.class);
		System.out.println("MAAP============================================== \n ");
		actor.attemptsTo(Post.to(endpoint));
		System.out.println("Enpoint============================================== \n ");
		String s = SerenityRest.lastResponse().jsonPath().prettyPrint();
		System.out.println(s);
	}
	
	public static CallThePostApiNoAuth onEndpoint(String endpoint, DataTable user)
	{
		return instrumented(CallThePostApiNoAuth.class, endpoint, user);
	}
}