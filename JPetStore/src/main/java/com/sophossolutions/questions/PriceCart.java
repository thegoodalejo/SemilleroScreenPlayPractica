package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class PriceCart implements Question<String>{

	private Target tarTotalPrice;
	
	public PriceCart(Target tarTotalPrice) {
		this.tarTotalPrice = tarTotalPrice;
		
	}
	
	@Override
	public String answeredBy(Actor actor) {
		String[] strText = Text.of(tarTotalPrice).viewedBy(actor).asString().split(" ");
		System.out.println(strText[strText.length - 1]);
		return strText[ strText.length - 1 ];
	}

	public static PriceCart with(Target tarTotalPrice) {
		// TODO Auto-generated method stub
		return new PriceCart(tarTotalPrice);
	}

}
