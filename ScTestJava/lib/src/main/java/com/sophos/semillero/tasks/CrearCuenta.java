package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.ParaBankHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class CrearCuenta implements Task{

	
	private String TipoCuenta;
	
	public CrearCuenta(String tipoCuenta) {
		this.TipoCuenta = tipoCuenta;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		//SelectFromOptions.byVisibleText(Password).from(null)
		int accounts = ParaBankHomePage.NC_OPTIONS.resolveAllFor(actor).size();
		
		int randomValue = 1 + (int)(Math.random() * accounts);
		
		actor.attemptsTo(
				SelectFromOptions.byVisibleText(TipoCuenta).from(ParaBankHomePage.LISTA_TC),
				SelectFromOptions.byIndex(randomValue).from(ParaBankHomePage.LISTA_NC),
				Click.on(ParaBankHomePage.BTN_ONA));
				
	}
	
	public static CrearCuenta with (String tipoCuenta) {
		return instrumented(CrearCuenta.class, tipoCuenta);
	}
	

}
