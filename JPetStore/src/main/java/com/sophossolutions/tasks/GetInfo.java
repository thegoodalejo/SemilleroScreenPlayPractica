package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.models.ItemAnimal;
import com.sophossolutions.ui.AnimalPage;
import com.sophossolutions.util.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class GetInfo implements Task {
		
	@Override
	public <T extends Actor> void performAs(T actor) {
		String indexAnimal = actor.recall(Constants.DIR_INDEX_ANIMAL);
		ItemAnimal infoAnimal = new ItemAnimal(
				Text.of(AnimalPage.TEXT_ITEM_ID.of(indexAnimal)).viewedBy(actor).asString(),
				Text.of(AnimalPage.TEXT_PRODUCT_ID.of(indexAnimal)).viewedBy(actor).asString(),
				Text.of(AnimalPage.TEXT_DESCRIPTION.of(indexAnimal)).viewedBy(actor).asString(),
				Text.of(AnimalPage.TEXT_LIST_PRICE.of(indexAnimal)).viewedBy(actor).asString()
				);
		infoAnimal.showAnimal();
		theActorInTheSpotlight().remember(Constants.MODEL_ANIMAL, infoAnimal);
		
	}
	
	public static GetInfo animal() {
		return instrumented(GetInfo.class);
	}

}
