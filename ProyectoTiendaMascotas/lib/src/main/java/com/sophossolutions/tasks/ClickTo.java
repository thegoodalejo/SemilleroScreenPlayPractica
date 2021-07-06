package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ClickTo implements Task {

	private Target target;

	public ClickTo(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
	}

	public static ClickTo ElementTarget(Target target) {
		return instrumented(ClickTo.class,target);
	}

}
