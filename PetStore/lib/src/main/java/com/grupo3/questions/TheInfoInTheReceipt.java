package com.grupo3.questions;

import com.grupo3.model.Address;
import com.grupo3.model.Animal;
import com.grupo3.model.Purchase;
import com.grupo3.model.ShoppingCart;
import com.grupo3.ui.ReceiptPage;
import com.grupo3.util.Constants;
import com.grupo3.util.Date;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheInfoInTheReceipt implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		
		Date receiptDate = Date.fromString(Text.of(ReceiptPage.RECEIPT_GENERATED_DETAILS).viewedBy(actor).asString().split(" ")[2]);
		
		Purchase p = actor.recall(Constants.NEW_PURCHASE);
		
		Address receiptShippingAddress = new Address(
					Text.of(ReceiptPage.SHIPPING_ADDR_FNAME).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_LNAME).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_1).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_2).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_CITY).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_STATE).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_ZIP_CODE).viewedBy(actor).asString(),
					Text.of(ReceiptPage.SHIPPING_ADDR_COUNTRY).viewedBy(actor).asString()
					
				);
		
		Address receiptBillingAddress = new Address(
				Text.of(ReceiptPage.BILLING_ADDR_FNAME).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_LNAME).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_1).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_2).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_CITY).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_STATE).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_ZIP_CODE).viewedBy(actor).asString(),
				Text.of(ReceiptPage.BILLING_ADDR_COUNTRY).viewedBy(actor).asString()
				
			);
		
		ShoppingCart receiptShoppingCart = new ShoppingCart();
		int itemsInReceipt = ReceiptPage.RECEIPT_ELEMENTS.resolveAllFor(actor).size();
		for (int i = 1; i <= itemsInReceipt; i++) {
			int amountOfItem = Text.of(ReceiptPage.getElementQuantity(i)).viewedBy(actor).asInteger();
			for (int j = 0; j < amountOfItem; j++) {
				Animal a = new Animal(
						Text.of(ReceiptPage.getElementID(i)).viewedBy(actor).asString(),
						"",
						Text.of(ReceiptPage.getElementDescription(i)).viewedBy(actor).asString(),
						Text.of(ReceiptPage.getElementPrice(i)).viewedBy(actor).asString()
					);
				receiptShoppingCart.addToCart(a);
			}
			
		}
		
		return p.billingAddressEquals(receiptBillingAddress) 
				&& p.shippingAddressEquals(receiptShippingAddress) 
				&& p.shoppingCartIsEqualTo(receiptShoppingCart)
				&& receiptDate.isToday();
		
	}

	public static TheInfoInTheReceipt isCongruentWithTheMostRecentPurchase() {
		return new TheInfoInTheReceipt();
	}
	
}
