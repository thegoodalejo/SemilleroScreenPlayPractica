package com.grupo3.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostWithoutAuth implements Question<Boolean>
{

	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static PostWithoutAuth shouldHave(Integer id)
	{
		return new PostWithoutAuth();
	}
}