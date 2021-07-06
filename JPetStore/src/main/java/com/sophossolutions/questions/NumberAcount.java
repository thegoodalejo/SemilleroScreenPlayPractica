package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class NumberAcount implements Question<String>
{
	private Target acountNumberT;

	public NumberAcount(Target acountNumberT)
	{
		this.acountNumberT = acountNumberT;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		return Text.of(acountNumberT).viewedBy(actor).asString();
	}
	
	public static NumberAcount withNumber(Target acountNumberT)
	{
		return new NumberAcount(acountNumberT);
	}
}