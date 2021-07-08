package com.sophossolutions.questions;

import com.sophossolutions.ui.BillPaymentPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class InfoOfDateToday implements Question<String>
{
	private Target IdProduc;
	private int nIndex;

	public InfoOfDateToday(Target Idproduc,int nindex)
	{
		this.IdProduc = Idproduc;
		this.nIndex = nindex;
	}

	@Override
	public String answeredBy(Actor actor)
	{
		String infoOrder[] = Text.of(IdProduc).viewedBy(actor).asString().split(" ");
		return infoOrder[nIndex];
	}
	
	public static InfoOfDateToday with(Target Idproduc, int nindex)
	{
		return new InfoOfDateToday(Idproduc,nindex);
	}
}