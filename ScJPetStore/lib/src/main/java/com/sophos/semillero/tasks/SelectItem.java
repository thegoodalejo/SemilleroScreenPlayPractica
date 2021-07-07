package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.CatalogPage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectItem implements Task {

	private String strCategoria;
	private String strProductoId;
	private String strItemId;		

	public SelectItem(String strCategoria, String strProductoId, String strItemId) {
		super();
		this.strCategoria = strCategoria;
		this.strProductoId = strProductoId;
		this.strItemId = strItemId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CatalogPage.LOGO_HOME),
				Click.on(CatalogPage.BTN_CATEGORIA.of(strCategoria)),
				Click.on(CatalogPage.LINK_PRODUCT_ID.of(strProductoId)),
				Click.on(CatalogPage.LINK_ITEM_ID.of(strItemId))
				);
		
	}

	public static SelectItem with(String strCategoria, String strProductoId, String strItemId) {
		return instrumented(SelectItem.class, strCategoria, strProductoId, strItemId);		
	}

}