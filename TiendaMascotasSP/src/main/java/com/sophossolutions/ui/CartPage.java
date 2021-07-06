package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
	
	public static final Target TXT_UPDATE_QUANTITY = Target.the("Actualizar cantidad").located(By.name("EST-14"));
	public static final Target BTN_REMOVE = Target.the("Eliminar item del carrito").locatedBy("//a[contains(@href, 'EST-14')]//@class");
	public static final Target BTN_PROCEED = Target.the("Proceder a la compra").locatedBy("//a[text()='Proceed to Checkout']");

}
