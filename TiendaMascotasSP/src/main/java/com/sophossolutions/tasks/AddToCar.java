package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.LoginPage;
import com.sophossolutions.ui.ProductsPage;
import com.sophossolutions.ui.ItemsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddToCar implements Task {

	private String strIdProducto;
	private String strIdItem;

	public AddToCar(String strIdProducto, String strIdItem) {
		this.strIdProducto = strIdProducto;
		this.strIdItem = strIdItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(ProductsPage.PRODUCT_ID.of(strIdProducto)),
				Click.on(ItemsPage.BTN_PRUEBA));
				//Click.on(ItemsPage.BTN_ITEM_ID.of(strIdItem)),
				//Click.on(ItemsPage.BTN_ADD_TO_CART));

	}

	public static AddToCar the(String strIdProducto, String strIdItem) {

		return instrumented(AddToCar.class, strIdProducto, strIdItem);
	}

}
