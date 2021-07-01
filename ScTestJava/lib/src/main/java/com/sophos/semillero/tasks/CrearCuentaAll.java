package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.ParaBankHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CrearCuentaAll implements Task{

	public CrearCuentaAll() {
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(CrearCuenta.with("SAVINGS"),ObtenerNumeroC.in(ParaBankHomePage.NC_NEW));
		
	}

	public static CrearCuentaAll on() {
		return instrumented(CrearCuentaAll.class); 
	}
}
