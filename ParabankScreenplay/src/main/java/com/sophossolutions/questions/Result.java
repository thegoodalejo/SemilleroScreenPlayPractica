package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Result implements Question<String>
{
	private Target strObtenido;

	public Result(Target stObtenido)
	{
		this.strObtenido = stObtenido;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		return Text.of(strObtenido).viewedBy(actor).asString();
	}
	
	public static Result in(Target text)
	{
		return new Result(text);
	}
}