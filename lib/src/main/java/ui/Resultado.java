package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Resultado {
	public static final Target TABLA = Target.the("campo contrase�a").located(By.xpath("//tbody"));
	public static final Target CUENTASCREADAS = Target.the("Boton login").located(By.xpath("//tbody//a"));
	

}
