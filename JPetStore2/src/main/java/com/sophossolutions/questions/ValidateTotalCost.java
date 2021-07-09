package com.sophossolutions.questions;

import com.sophossolutions.ui.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTotalCost implements Question<Boolean> {

	int cantidad;
	
	public ValidateTotalCost ( String cantidad) {
		this.cantidad = Integer.parseInt(cantidad);
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		String textoUnitario = CartPage.TXT_PRICE.resolveFor(actor).getText();
		textoUnitario = (textoUnitario.substring(1));
		
		String textoTotal = CartPage.TXT_TOTAL_COST.resolveFor(actor).getText();
		
		double resultado = Double.parseDouble(textoUnitario) * cantidad;
		double resultado2 = Double.parseDouble(textoTotal.substring(1));

		if (resultado == resultado2) {
			return true;
		}
		return false;
	}

	public static ValidateTotalCost in(String cantidad ) {
		return new ValidateTotalCost(cantidad );
	}
	
}
