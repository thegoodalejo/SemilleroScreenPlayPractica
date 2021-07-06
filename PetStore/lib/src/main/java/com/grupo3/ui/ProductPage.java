package com.grupo3.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
	
	private static final String ELEMENT_SELECTOR = "//div[@id='Catalog']/table//tr[position()>1 and position() < last()][%d]";
	public static final Target ELEMENTS_AVAILABLE = Target.the("Possible elements").locatedBy("//div[@id='Catalog']/table//tr[position()>1 and position() < last()]");

	
	public static Target getItemIDNo(int elementNumber) {
		return Target.the("Item ID").locatedBy(String.format(ELEMENT_SELECTOR, elementNumber) + "/td[1]/a");
	}
	public static Target getProductIDNo(int elementNumber) {
		return Target.the("Product ID").locatedBy(String.format(ELEMENT_SELECTOR, elementNumber) + "/td[2]");
	}
	public static Target getDescriptionNo(int elementNumber) {
		return Target.the("Item Description").locatedBy(String.format(ELEMENT_SELECTOR, elementNumber) + "/td[3]");
	}
	public static Target getListPriceNo(int elementNumber) {
		return Target.the("Item Price").locatedBy(String.format(ELEMENT_SELECTOR, elementNumber) + "/td[4]");
	}
	public static Target getAddToCartButtonNo(int elementNumber) {
		return Target.the("Add to cart button").locatedBy(String.format(ELEMENT_SELECTOR, elementNumber) + "/td[5]/a");
	}
}
