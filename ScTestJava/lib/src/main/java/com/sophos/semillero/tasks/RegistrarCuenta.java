package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.questions.Text;

import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrarCuenta implements Task {

	private String strValor;

	public RegistrarCuenta(String strValor) {
		this.strValor = strValor;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER),
				SelectFromOptions.byVisibleText(strValor).from(RegisterPage.FORM_OPTIONS),
				SelectFromOptions.byIndex(3).from(RegisterPage.FORM_NUMBER_OPTIONS),
				Click.on(RegisterPage.BTN_OPEN));

		actor.remember("NUMERO_DE_CUENTA", Text.of(RegisterPage.NEW_ACOUNT).viewedBy(actor).asString());

	}

	public static RegistrarCuenta withValue(String strValor) {
		return instrumented(RegistrarCuenta.class, strValor);
	}

}
