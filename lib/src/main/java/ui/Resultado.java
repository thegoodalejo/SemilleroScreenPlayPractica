package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Resultado {
	public static final Target CUENTAS_CREADA = Target.the("Cuenta Creada").locatedBy("//td//a[contains(text(),{0})]");
	public static final Target SALDO_CUENTA = Target.the("Cuenta Creada").locatedBy("//*[contains(text(),{0})]/ancestor::td/following-sibling::td");
}
