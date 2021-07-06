package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class DarClick implements Task {

	private Target tarBoton;

	public DarClick(Target tarBoton) {
		super();
		this.tarBoton = tarBoton;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(tarBoton));
	}

	public static DarClick on(Target tarBoton) {
		return instrumented(DarClick.class,tarBoton);		
	}
}
