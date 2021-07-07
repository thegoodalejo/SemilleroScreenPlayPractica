package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ItemsInCar implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

		String strPrecioUnitario = theActorInTheSpotlight().recall("PRECIO_U");

		int IntCantidad = theActorInTheSpotlight().recall("CANTIDAD");

		float intPrecioUnitario = Float.parseFloat(strPrecioUnitario.replace("$", ""));

		float intTotal = intPrecioUnitario * IntCantidad;
		String strTotal = "$" + Float.toString(intTotal) + "0";

		return strTotal;
	}

	public static ItemsInCar in() {
		return new ItemsInCar();
	}

}
