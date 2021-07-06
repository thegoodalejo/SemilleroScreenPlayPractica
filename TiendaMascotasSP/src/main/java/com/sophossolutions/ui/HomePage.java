package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	public static final Target BTN_SIGNIN = Target.the("Boton iniciar secion").locatedBy("//a[text()='Sign In']");
	public static final Target MSG_WELCOME = Target.the("Mensaje de Bienvenida").locatedBy("//div[@id='WelcomeContent']");
	public static final Target SELECT_SPECIES = Target.the("Opcion gatos").locatedBy("(//img[contains(@src, '{0}')])[1]");
	public static final Target BTN_CARRITO = Target.the("Entrar al carrito").locatedBy("//img[@name='img_cart']");

}
