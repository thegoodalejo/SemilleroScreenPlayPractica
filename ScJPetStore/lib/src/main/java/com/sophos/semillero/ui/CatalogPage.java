package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogPage {
	
	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").locatedBy("//div[@id='WelcomeContent']");	
	public static final Target BTN_SIGN_IN =Target.the("Boton ir a iniciar sesion").locatedBy("a[text()='Sign In']");
	public static final Target BTN_CART =Target.the("Boton ir a carrito").locatedBy("//div[@id='MenuContent']//a[1]");
	public static final Target BTN_SIGN_OUT = Target.the("Boton sign out").locatedBy("a[text()='Sign Out']");	
	public static final Target BTN_MY_ACCOUNT = Target.the("Boton my account").locatedBy("//a[text()='My Account']");		
	public static final Target BTN_CATEGORIA = Target.the("Boton categoria").locatedBy("//img[@src='../images/{0}_icon.gif']");
	public static final Target LINK_PRODUCT_ID = Target.the("Boton product ID").locatedBy("//a[text()='{0}']");
	public static final Target LINK_ITEM_ID = Target.the("Boton item ID").locatedBy("//a[text()='{0}']");	
	public static final Target BTN_ADD_TO_CART =Target.the("Boton agregar a carrito").locatedBy("//a[text()='Add to Cart']");	
	public static final Target TXT_ANIMAL_NAME =Target.the("Nombre completo del animal").locatedBy("//font[@size='4']");	
	public static final Target CART_LIST = Target.the("Lista items carrito").locatedBy("//tr[position()>1]");
	public static final Target LOGO_HOME = Target.the("Logo de inicio").locatedBy("//div[@id='LogoContent']/a");	
	public static final Target BTN_REMOVE_ITEM =  Target.the("Boton remover item").locatedBy("//a[@href='/actions/Cart.action?removeItemFromCart=&workingItemId={0}']");		
	public static final Target IMG_ITEM = Target.the("Imagen del Item").locatedBy("//tbody/tr/td/img");

}
