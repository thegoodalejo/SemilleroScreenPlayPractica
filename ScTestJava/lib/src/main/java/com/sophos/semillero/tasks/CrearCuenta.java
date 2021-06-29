package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.ParaBankHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CrearCuenta implements Task{

	private String NumeroCuenta;
	
	
	public CrearCuenta(String numeroCuenta) {
		this.NumeroCuenta = numeroCuenta;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		//SelectFromOptions.byVisibleText(Password).from(null)
		actor.attemptsTo(
				Click.on(ParaBankHomePage.ENLA_NEW_ACCOUNT),
				SelectFromOptions.byVisibleText("SAVINGS").from(ParaBankHomePage.LISTA_TC),
				SelectFromOptions.byVisibleText(NumeroCuenta).from(ParaBankHomePage.LISTA_NC),
				Click.on(ParaBankHomePage.BTN_ONA));
				//, Click.on(ParaBankHomePage.ENLA_AO
	}
	
	public static CrearCuenta in (String numeroCuenta ) {
		return instrumented(CrearCuenta.class, numeroCuenta);
	}

}
