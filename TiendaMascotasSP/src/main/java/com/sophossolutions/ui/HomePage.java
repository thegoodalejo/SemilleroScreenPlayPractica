package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	public static final Target BTN_SIGNIN = Target.the("Boton iniciar secion").locatedBy("//a[text()='Sign In']");
	public static final Target MSG_WELCOME = Target.the("Mensaje de Bienvenida").locatedBy("//div[@id='WelcomeContent']");
	public static final Target OPC_FISH = Target.the("Opcion pescados").locatedBy("(//img[contains(@src, 'fish')])[1]");
	public static final Target OPC_DOGS = Target.the("Opcion perros").locatedBy("(//img[contains(@src, 'dogs')])[1]");
	public static final Target OPC_CATS = Target.the("Opcion gatos").locatedBy("(//img[contains(@src, 'cats')])[1]");
	public static final Target OPC_REPTILES = Target.the("Opcion reptiles").locatedBy("(//img[contains(@src, 'reptiles')])[1]");
	public static final Target OPC_BIRDS = Target.the("Opcion aves").locatedBy("(//img[contains(@src, 'birds')])[1]");
	public static final Target BTN_CARRITO = Target.the("Entrar al carrito").locatedBy("//img[@name='img_cart']");

}
