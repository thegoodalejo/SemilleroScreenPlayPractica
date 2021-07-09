package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AddCart implements Task {
	
	Target target;

	public AddCart(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
		
	}
	
	public static AddCart in ( Target target ) {
		return instrumented(AddCart.class, target);
	}

}
