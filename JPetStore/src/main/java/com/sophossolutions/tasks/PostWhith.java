package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.TOKEN_GOREST;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostWhith implements Task
{
	private String strEndpont;
	private DataTable dataTable;
	
	public PostWhith(String strEndpont,DataTable datatable)
	{
		this.strEndpont = strEndpont;
		this.dataTable = datatable;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		Map<String, String> body = dataTable.asMap(String.class,String.class);
		System.out.println(body.get("name"));
		actor.attemptsTo(Post.to(strEndpont).with(request -> request.auth().oauth2(TOKEN_GOREST).
				header("Content-Type", "application/json").body(body)));
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static PostWhith oautn2(String strEndPont,DataTable datatable)
	{
		return instrumented(PostWhith.class, strEndPont,datatable);
	}
}