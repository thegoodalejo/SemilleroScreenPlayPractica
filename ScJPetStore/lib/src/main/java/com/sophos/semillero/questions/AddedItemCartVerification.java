package com.sophos.semillero.questions;

import com.sophos.semillero.interactions.ValidationOperation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AddedItemCartVerification implements Question<Boolean> {

	private Target cartList;
	
	public AddedItemCartVerification(Target target) {
		this.cartList = target;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			
			return ValidationOperation.addedItemToCart(actor, cartList);					
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static AddedItemCartVerification in(Target target) {		
		return new AddedItemCartVerification(target);
	}
	
}
