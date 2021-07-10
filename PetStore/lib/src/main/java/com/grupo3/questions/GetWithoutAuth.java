package com.grupo3.questions;

import com.grupo3.util.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetWithoutAuth implements Question<Boolean>
{
	private String id;
	
	public GetWithoutAuth(String id)
	{
		this.id = id;
	}

	@Override
	public Boolean answeredBy(Actor actor)
	{
		String json = actor.recall(Constants.TEXT_ID);
		if (!json.contains("\"id\": " + id))
		{
			System.out.println("====ERROR============================");
			return false;
		}
		System.out.println("OK \n============================================== \n");
		return true;
	}
	
	public static GetWithoutAuth shouldHave(Integer id)
	{
		return new GetWithoutAuth("" + id);
	}
}