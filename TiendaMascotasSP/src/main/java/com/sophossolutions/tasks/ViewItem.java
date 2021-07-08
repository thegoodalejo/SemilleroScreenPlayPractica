package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ProductsPage;
import com.sophossolutions.ui.ItemsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ViewItem implements Task {

	private String strIdProducto;
	private String strIdItem;

	public ViewItem(String strIdProducto, String strIdItem) {
		this.strIdProducto = strIdProducto;
		this.strIdItem = strIdItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(ProductsPage.PRODUCT_ID.of(strIdProducto)),
				Click.on(ItemsPage.BTN_ITEM_ID.of(strIdItem)));
		actor.remember("ID_ITEM", strIdItem);

	}

	public static ViewItem info(String strIdProducto, String strIdItem) {

		return instrumented(ViewItem.class, strIdProducto, strIdItem);
	}

}
