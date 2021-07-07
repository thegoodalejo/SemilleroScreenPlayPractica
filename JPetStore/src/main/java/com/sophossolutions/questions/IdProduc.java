package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IdProduc implements Question<String>
{
	private Target IdProduc;
	private Target tarNOptions;

	public IdProduc(Target Idproduc,Target tarnoptions)
	{
		this.IdProduc = Idproduc;
		this.tarNOptions = tarnoptions;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		Integer accounts = tarNOptions.resolveAllFor(actor).size();
		return Text.of(IdProduc.of(accounts.toString())).viewedBy(actor).asString();
	}
	
	public static IdProduc with(Target Idproduc,Target tarnoptions)
	{
		return new IdProduc(Idproduc,tarnoptions);
	}
}