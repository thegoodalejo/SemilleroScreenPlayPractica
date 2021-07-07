package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IdProduc implements Question<String>
{
	private Target IdProduc;

	public IdProduc(Target Idproduc)
	{
		this.IdProduc = Idproduc;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		return Text.of(IdProduc).viewedBy(actor).asString();
	}
	
	public static IdProduc with(Target Idproduc)
	{
		return new IdProduc(Idproduc);
	}
}