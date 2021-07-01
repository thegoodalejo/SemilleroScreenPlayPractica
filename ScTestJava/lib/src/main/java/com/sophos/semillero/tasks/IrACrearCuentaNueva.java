package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.ParaBankHomePage;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrACrearCuentaNueva implements Task {

	Target Enlace;
	
	public IrACrearCuentaNueva(Target enlace) {
		this.Enlace = enlace;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Enlace));
	}

	public static IrACrearCuentaNueva in(Target enlace) {
		return  instrumented(IrACrearCuentaNueva.class,enlace);
	}
	
	
}
