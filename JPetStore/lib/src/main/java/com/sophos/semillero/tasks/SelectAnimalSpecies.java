package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.sophos.semillero.ui.AnimalSpeciesPage;
import com.sophos.semillero.ui.CategoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectAnimalSpecies implements Task {

	private int intItemRow;

	public SelectAnimalSpecies(int intItemRow) {
		this.intItemRow = intItemRow;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CategoryPage.BTN_ITEM.of(String.valueOf(intItemRow))));

	}

	public static SelectAnimalSpecies fromTableRowInCategoryPage(int intItemRow) {
		return instrumented(SelectAnimalSpecies.class, intItemRow);
	}

}
