package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.sophos.semillero.ui.AnimalSpeciesPage;
import com.sophos.semillero.ui.CategoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectItem implements Task {

	private int intItemRow;

	public SelectItem(int intItemRow) {
		this.intItemRow = intItemRow;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AnimalSpeciesPage.BTN_ITEM_DETAIL.of(String.valueOf(intItemRow))));

	}

	public static SelectItem fromTableRowInCategoryPage(int intItemRow) {
		return instrumented(SelectItem.class, intItemRow);
	}

}
