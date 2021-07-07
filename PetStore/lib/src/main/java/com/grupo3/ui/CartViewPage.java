package com.grupo3.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartViewPage {

	public static final Target ITEMS_IN_CART = Target.the("Element IDs in cart").locatedBy("//table//tr[position()>1 and position() < last()][count(*)>1]/td[1]/a");
	private static final String ITEM_SELECTOR = "//table//tr[position()>1 and position() < last()][count(*)>1][%d]";
	
	
	public static Target getItemID(int i) {
		return Target.the("Item ID").locatedBy(String.format(ITEM_SELECTOR, i) + "/td[1]/a");
	}
	
	public static Target getListPrice(int i) {
		return Target.the("Item Price").locatedBy(String.format(ITEM_SELECTOR, i) + "/td[6]");
	}
	
	public static Target getRemoveButton(int i) {
		return Target.the("Item Remove button").locatedBy(String.format(ITEM_SELECTOR, i) + "/td[8]/a");
	}
	
}
