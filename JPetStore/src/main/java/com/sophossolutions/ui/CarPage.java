package com.sophossolutions.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarPage {

	
	public static final Target TEXT_ITEM_ID = Target.the("Text of Product Id").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//td)[1]");
	public static final Target TEXT_PRODUCT_ID = Target.the("Text of Item Id").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//td)[2]");
	public static final Target TEXT_DESCRIPTION = Target.the("Text of description").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//td)[3]");
	public static final Target TEXT_IN_STOCK = Target.the("Text of description").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//td)[4]");
	public static final Target EDIT_TEXT_QUANTITY = Target.the("Edit text for quantity").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//input)");
	public static final Target TEXT_LIST_PRICE = Target.the("Total price of pet").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//td)[6]");
	public static final Target TOTAL_PRICE_MASCOTA = Target.the("Total price of pet").locatedBy("((//tr[position()>1 and position() < last()])[{0}]//td)[7]");
		
	public static final Target N_ANIMALS_TABLE = Target.the("Number of Animals").locatedBy("//tr[position()>1 and position() < last()]//a[@class]");
	public static final Target BTN_REMOVE = Target.the("Number of Animals").locatedBy("((//tr[position()>1 and position() < last()])[1]//td)[8]");
	public static final Target BTN_UPDATE_CAR = Target.the("Button to update").located(By.name("updateCartQuantities"));
	public static final Target TITLE_EMPTY = Target.the("Title when car is empty").locatedBy("//b[text()='Your cart is empty.']");
	public static final Target TOTAL_PRICE_SHOP = Target.the("Total price of shop").locatedBy("//td[contains(text(),'Sub Total')]");
}
