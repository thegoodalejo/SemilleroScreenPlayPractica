package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.models.ItemShopCar;
import com.sophossolutions.ui.AnimalPage;
import com.sophossolutions.util.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class GetInfo implements Task {
		
	@Override
	public <T extends Actor> void performAs(T actor) {
		String indexAnimal = actor.recall(Constants.DIR_INDEX_ANIMAL);
		ItemShopCar infoAnimal = new ItemShopCar(
				Text.of(AnimalPage.TEXT_ITEM_ID.of(indexAnimal)).viewedBy(actor).asString(),
				Text.of(AnimalPage.TEXT_PRODUCT_ID.of(indexAnimal)).viewedBy(actor).asString(),
				Text.of(AnimalPage.TEXT_DESCRIPTION.of(indexAnimal)).viewedBy(actor).asString(),
				Text.of(AnimalPage.TEXT_LIST_PRICE.of(indexAnimal)).viewedBy(actor).asString()
				);
		infoAnimal.showAnimal();
	}
	
	public static GetInfo animal() {
		return instrumented(GetInfo.class);
	}

}
