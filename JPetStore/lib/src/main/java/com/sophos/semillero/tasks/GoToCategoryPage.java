package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToCategoryPage implements Task {

	private Target tagRandomCategory;

	public GoToCategoryPage(Target tagRandomCategory) {
		this.tagRandomCategory = tagRandomCategory;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(tagRandomCategory));
	}

	public static GoToCategoryPage usingLink(Target tagRandomCategory) {
		return instrumented(GoToCategoryPage.class, tagRandomCategory);
	}

}
