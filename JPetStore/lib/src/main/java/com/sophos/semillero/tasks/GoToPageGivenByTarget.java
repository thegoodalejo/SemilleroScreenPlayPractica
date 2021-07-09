package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

/*
 * This class can replace any of the task classes named "GoTo_Page" since this class takes the target as parameter.
 * Because of time constraints, this class has not yet replaced all of the other classes.
 */
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
		return instrumented(GoToPageGivenByTarget.class);
	}

}
