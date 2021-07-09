package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectRandomCategoryAndAnimal implements Task {

	private int intRandomCategory;

	public SelectRandomCategoryAndAnimal() {
		intRandomCategory = (int) (Math.random() * 5 + 1);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on());
	}

	public static SelectRandomCategoryAndAnimal givenByRandomlySelectedCategory(Target tagRandomCategory) {
		return instrumented(SelectRandomCategoryAndAnimal.class);
	}

}
