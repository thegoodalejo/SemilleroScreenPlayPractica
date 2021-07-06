package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
	
	public static final Target PRODUCT_ID = Target.the("Producto a seleccionar").locatedBy("//a[text()='RP-SN-01']");

}
