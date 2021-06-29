package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class NumberAcount implements Question<String>
{
	private Target acountNumberT;
	private Target acountBalanceT;
	public static String acountNumber;

	public NumberAcount(Target acountNumberT, Target acountBalanceT)
	{
		this.acountNumberT = acountNumberT;
		this.acountBalanceT = acountBalanceT;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		return Text.of(acountNumberT).viewedBy(actor).asString();
	}
	
	public static NumberAcount in(Target acountNumberT, Target acountBalanceT)
	{
		return new NumberAcount(acountNumberT, acountBalanceT);
	}
}