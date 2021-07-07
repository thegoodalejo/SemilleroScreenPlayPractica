package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.models.ItemShopCar;

import com.sophossolutions.ui.CarPage;
import com.sophossolutions.util.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class UpdateCar implements Task{

	private String strIndex;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Integer intAnimals = CarPage.N_ANIMALS_TABLE.resolveAllFor(actor).size();
		actor.attemptsTo(Click.on(CarPage.BTN_UPDATE_CAR));
		for(Integer i = 1; i <= intAnimals; i++) {
			strIndex = i.toString();
			ItemShopCar itemList = new ItemShopCar(
					Text.of(CarPage.TEXT_ITEM_ID.of(strIndex)).viewedBy(actor).asString(),
					Text.of(CarPage.TEXT_PRODUCT_ID.of(strIndex)).viewedBy(actor).asString(),
					Text.of(CarPage.TEXT_DESCRIPTION.of(strIndex)).viewedBy(actor).asString(),
					Text.of(CarPage.TEXT_IN_STOCK.of(strIndex)).viewedBy(actor).asString(),
					Text.of(CarPage.EDIT_TEXT_QUANTITY.of(strIndex)).viewedBy(actor).asString(),
					Text.of(CarPage.TEXT_LIST_PRICE.of(strIndex)).viewedBy(actor).asString(),
					Text.of(CarPage.TOTAL_PRICE_MASCOTA.of(strIndex)).viewedBy(actor).asString()
					);
			itemList.showData();
			actor.remember(Constants.MODEL_CART, itemList);
		}
	}

	public static UpdateCar quantity() {
		return instrumented(UpdateCar.class);
	}
	

}
