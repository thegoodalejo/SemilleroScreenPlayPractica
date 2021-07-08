package com.sophos.semillero.tasks;

import com.sophos.semillero.interactions.SaveModel;
import com.sophos.semillero.ui.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Clear;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateCartItem implements Task {

	private String strItemId;
	private String newQuantity;	

	public UpdateCartItem(String strItemId, String newQuantity) {
		super();
		this.strItemId = strItemId;
		this.newQuantity = newQuantity;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Clear.field(CartPage.TXT_QUANTITY.of(strItemId)),
				Enter.keyValues(newQuantity).into(CartPage.TXT_QUANTITY.of(strItemId)),				
				SaveModel.updatedItemCart("CART", strItemId, newQuantity),
				Click.on(CartPage.BTN_UPDATE_CART)
				);
		
	}

	public static UpdateCartItem itemQuantity(String strItemId, String newQuantity) {		
		return instrumented(UpdateCartItem.class, strItemId, newQuantity);		
	}

}