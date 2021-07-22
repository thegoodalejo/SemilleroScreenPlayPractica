package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.models.ItemShopCar;

import static com.sophossolutions.ui.CarPage.*;
import static com.sophossolutions.util.Constants.MODEL_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class UpdateCar implements Task{

	private String strIndex;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Integer intAnimals = N_ANIMALS_TABLE.resolveAllFor(actor).size();
		actor.attemptsTo(Click.on(BTN_UPDATE_CAR));
		for(Integer i = 1; i <= intAnimals; i++) {
			strIndex = i.toString();
			ItemShopCar itemList = new ItemShopCar(
					Text.of(TEXT_ITEM_ID.of(strIndex)).viewedBy(actor).asString(),
					Text.of(TEXT_PRODUCT_ID.of(strIndex)).viewedBy(actor).asString(),
					Text.of(TEXT_DESCRIPTION.of(strIndex)).viewedBy(actor).asString(),
					Text.of(TEXT_IN_STOCK.of(strIndex)).viewedBy(actor).asString(),
					Text.of(EDIT_TEXT_QUANTITY.of(strIndex)).viewedBy(actor).asString(),
					Text.of(TEXT_LIST_PRICE.of(strIndex)).viewedBy(actor).asString(),
					Text.of(TOTAL_PRICE_MASCOTA.of(strIndex)).viewedBy(actor).asString()
					);
			itemList.showData();
			actor.remember(MODEL_CART, itemList);
		}
	}

	public static UpdateCar quantity() {
		return instrumented(UpdateCar.class);
	}
	

}
