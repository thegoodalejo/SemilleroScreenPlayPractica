package com.sophos.semillero.questions;

import com.sophos.semillero.interactions.ValidationOperation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class UpdatedItemCartVerification implements Question<Boolean> {

	private Target listCart;
	
	
	public UpdatedItemCartVerification(Target listCart) {
		this.listCart = listCart;
	}

	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			
			return ValidationOperation.updatedItemInCart(actor, listCart);				
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static UpdatedItemCartVerification in(Target target) {		
		return new UpdatedItemCartVerification(target);
	}
	
}