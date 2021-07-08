package com.sophossolutions.tasks;

import java.util.Map;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import static com.sophossolutions.utils.ConstantToken.GOREST_TOKEN;

public class PostWithAuth implements Task {

	private DataTable tableDataNewUser;
	private String strEndPoint;

	public PostWithAuth(DataTable tableDataNewUser, String strEndPoint) {
		super();
		this.tableDataNewUser = tableDataNewUser;
		this.strEndPoint = strEndPoint;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		Map<String, String> bodyDataNewUser = tableDataNewUser.asMap(String.class, String.class);
		actor.attemptsTo(Post.to(strEndPoint).with(
				request -> request.auth().oauth2(GOREST_TOKEN).contentType(ContentType.JSON).body(bodyDataNewUser)));
	}

	public static PostWithAuth withData(DataTable tableDataNewUser, String strEndPoint) {
		return new PostWithAuth(tableDataNewUser, strEndPoint);
	}

}
