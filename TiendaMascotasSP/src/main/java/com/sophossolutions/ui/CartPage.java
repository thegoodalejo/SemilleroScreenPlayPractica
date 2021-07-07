package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
	
	public static final Target TXT_UPDATE_QUANTITY = Target.the("Actualizar cantidad").locatedBy("//input[@name='{0}']");
	public static final Target BTN_REMOVE = Target.the("Eliminar item del carrito").locatedBy("//a[contains(@href, '{0}')]//@class");
	public static final Target BTN_PROCEED = Target.the("Proceder a la compra").locatedBy("//a[text()='Proceed to Checkout']");
	public static final Target ID_ITEM = Target.the("id del item en el carrito").locatedBy("//a[text()='{0}']");
	public static final Target TABLE = Target.the("tabla de items agregados").locatedBy("//tbody");
	public static final Target BTN_UPDATE = Target.the("Actualizar cantidad").locatedBy("//input[@value='Update Cart']");
	public static final Target TXT_PRICE_U = Target.the("Actualizar cantidad").locatedBy("//input[@name='{0}']/ancestor::td/following-sibling::td");
	public static final Target TXT_PRICE_T = Target.the("Actualizar cantidad").locatedBy("//input[@name='{0}']/ancestor::td/following-sibling::td/following-sibling::td");
	
}
