package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.ListAcounts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class VerificarCuenta implements Task {
	

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(ListAcounts.BTN_LISTA));

	}

	public static VerificarCuenta verifyAccount() {
		return instrumented(VerificarCuenta.class);
	}

}