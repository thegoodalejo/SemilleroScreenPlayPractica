package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {	
		
	public static final Target CART_LIST = Target.the("Lista items carrito").locatedBy("//tr[position()>1]");			
	public static final Target TXT_QUANTITY = Target.the("Campo cantidad del item").locatedBy("//input[@name='{0}']");
	public static final Target BTN_REMOVE_ITEM =  Target.the("Boton remover item").locatedBy("//a[@href='/actions/Cart.action?removeItemFromCart=&workingItemId={0}']");
	public static final Target BTN_UPDATE_CART = Target.the("Boton actualizar carrito").locatedBy("//input[@name='updateCartQuantities']");

}
