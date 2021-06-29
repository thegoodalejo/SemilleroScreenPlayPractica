package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CrearCuenta {
	public static final Target CREAR_CUENTA_NUEVA = Target.the("Opcion crear cuenta nueva").located(By.xpath("//a[@href='/parabank/openaccount.htm']"));
	public static final Target LISTA_TIPOS = Target.the("Lista tipos de cuenta").located(By.xpath("//select[@id='type']"));
	public static final Target LISTA_CUENTAS = Target.the("Lista de numeros de cuentas").located(By.xpath("//select[@id='fromAccountId']"));
	public static final Target BTN_CREAR = Target.the("Boton Abrir nueva cuenta").located(By.xpath("//input[@type='submit']"));
	public static final Target VISTA_CUENTAS = Target.the("Boton Abrir nueva cuenta").located(By.xpath("//a[@href='/parabank/overview.htm']"));

}
