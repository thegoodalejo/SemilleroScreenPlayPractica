package com.sophos.semillero.tasks;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToPageGivenByTarget implements Task {

	private Target tarPage;

	public GoToPageGivenByTarget(Target tarPage) {
		this.tarPage = tarPage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(tarPage));
	}

	public static GoToPageGivenByTarget usingButtonOrLink(Target tarPage) {
		return instrumented(GoToPageGivenByTarget.class, tarPage);
	}

}
