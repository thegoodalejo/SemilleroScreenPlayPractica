package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogPage {
	
	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").locatedBy("//div[@id='WelcomeContent']");	
	public static final Target BTN_SIGN_IN =Target.the("Boton ir a iniciar sesion").locatedBy("a[text()='Sign In']");
	public static final Target BTN_CART =Target.the("Boton ir a carrito").locatedBy("//div[@id='MenuContent']//a[1]");
	public static final Target BTN_SIGN_OUT = Target.the("Boton sign out").locatedBy("a[text()='Sign Out']");	
	public static final Target BTN_MY_ACCOUNT = Target.the("Boton my account").locatedBy("//a[text()='My Account']");		
	public static final Target BTN_CATEGORIA = Target.the("Boton categoria").locatedBy("//div[@id='SidebarContent']//a[@href='/actions/Catalog.action?viewCategory=&categoryId={0}']");
	public static final Target LINK_PRODUCT_ID = Target.the("Boton categoria").locatedBy("//a[@href='/actions/Catalog.action?viewProduct=&productId={0}']");
	public static final Target LINK_ITEM_ID = Target.the("Boton categoria").locatedBy("a[@href='/actions/Catalog.action?viewItem=&itemId={0}']");	
	public static final Target BTN_ADD_TO_CART =Target.the("Boton agregar a carrito").locatedBy("//a[text()='Add to Cart']");
	

}
