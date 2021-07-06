package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.CatalogPage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Task {

	private String strCategoria;
	private String strProductoId;
	private String strItemId;		

	public AddToCart(String strCategoria, String strProductoId, String strItemId) {
		super();
		this.strCategoria = strCategoria;
		this.strProductoId = strProductoId;
		this.strItemId = strItemId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(				
				Click.on(CatalogPage.BTN_CATEGORIA.of(strCategoria)),
				Click.on(CatalogPage.LINK_PRODUCT_ID.of(strProductoId)),
				Click.on(CatalogPage.LINK_ITEM_ID.of(strItemId)),
				Click.on(CatalogPage.BTN_ADD_TO_CART)
				);
	}

	public static AddToCart withCategoriaProductoItem(String strCategoria, String strProductoId, String strItemId) {
		return instrumented(AddToCart.class, strCategoria, strProductoId, strItemId);		
	}

}