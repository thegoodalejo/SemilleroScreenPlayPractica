package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.sophos.semillero.ui.ParaBankHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;



public class ObtenerNumeroC implements Task{

	private Target NumeroCuenta;
	public ObtenerNumeroC(Target numeroCuenta) {
		this.NumeroCuenta = numeroCuenta;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember("NumeroCuentaNew", Text.of(NumeroCuenta).viewedBy(actor).asString());
		actor.attemptsTo(Click.on(ParaBankHomePage.ENLA_AO));
	}
	public static ObtenerNumeroC in (Target numeroCuenta) {
		return instrumented(ObtenerNumeroC.class, numeroCuenta);
	}

}
