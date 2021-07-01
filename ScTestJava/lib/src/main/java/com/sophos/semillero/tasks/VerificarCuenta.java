package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.ui.ListAcounts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class VerificarCuenta implements Task {

	String strNumeroCuenta = "";

	@Override
	public <T extends Actor> void performAs(T actor) {
		String strNumeroCuenta = theActorInTheSpotlight().recall("NUMERO_DE_CUENTA");
		System.out.println(strNumeroCuenta);

		actor.attemptsTo(Click.on(ListAcounts.BTN_LISTA));
		String strValorCuenta = ListAcounts.VALOR_CUENTA.of(strNumeroCuenta).resolveFor(theActorInTheSpotlight())
				.getTextValue();
		System.out.println(strValorCuenta);
		
		
	}

	public static VerificarCuenta verifyAccount() {
		return instrumented(VerificarCuenta.class);
	}

}