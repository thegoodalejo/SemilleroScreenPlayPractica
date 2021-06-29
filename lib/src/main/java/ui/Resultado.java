package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Resultado {
	public static final Target TABLA = Target.the("campo contraseña").located(By.xpath("//tbody"));
	public static final Target CUENTASCREADAS = Target.the("Boton login").located(By.xpath("//tbody//a"));
	

}
