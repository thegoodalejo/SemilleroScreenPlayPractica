package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.model.ApiPost;
import com.grupo3.model.ApiUser;

import net.serenitybdd.rest.SerenityRest;

import static com.grupo3.util.Constants.AUTH_TOKEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class CallThePostApi implements Task{

	private String endpoint;
	private String postTitle;
	private String postBody;
	
	public CallThePostApi(String endpoint) {
		this.endpoint = endpoint;
	}
	
	public CallThePostApi toCreatePostWithTitle(String title) {
		this.postTitle = title;
		return this;
	}
	
	public CallThePostApi andBody(String body) {
		this.postBody = body;
		return this;
	}
	 
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		assert  postTitle != null && postBody != null;
		
		actor.attemptsTo(
					Post.to(endpoint).with(
								req -> req.header("Content-Type", "application/json")
								.body(new ApiPost(postTitle, postBody))
								.auth().oauth2(AUTH_TOKEN)
							)
				);
	}
	
	public static CallThePostApi onEndpoint(String endpoint) {
		
		return instrumented(CallThePostApi.class, endpoint);
		
	}
	
}
