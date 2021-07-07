package com.sophos.semillero.questions;

import com.sophos.semillero.interactions.Validation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AddItemCartVerification implements Question<Boolean> {

	private Target car_list;
	
	public AddItemCartVerification(Target target) {
		this.car_list = target;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			
			return Validation.addItemToCart(actor, car_list);					
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static AddItemCartVerification in(Target target) {		
		return new AddItemCartVerification(target);
	}
	
}
