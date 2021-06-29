package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DataPage {

	public static final Target SALDO_CUENTA = Target.the("Saldo en la cuenta").located(By.id("availableBalance"));
	
}
