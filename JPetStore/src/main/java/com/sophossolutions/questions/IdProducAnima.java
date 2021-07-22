package com.sophossolutions.questions;

import com.sophossolutions.ui.BillPaymentPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IdProducAnima implements Question<String>
{
	private Target IdProduc;

	public IdProducAnima(Target Idproduc)
	{
		this.IdProduc = Idproduc;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		return Text.of(IdProduc).viewedBy(actor).asString();
	}
	
	public static IdProducAnima with(Target Idproduc)
	{
		return new IdProducAnima(Idproduc);
	}
}