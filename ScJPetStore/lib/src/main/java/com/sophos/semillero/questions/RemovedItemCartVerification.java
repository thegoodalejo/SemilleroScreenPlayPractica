package com.sophos.semillero.questions;

import com.sophos.semillero.interactions.ValidationOperation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class RemovedItemCartVerification implements Question<Boolean> {

	private Target car_list;
	
	public RemovedItemCartVerification(Target target) {
		this.car_list = target;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			
			return ValidationOperation.removedItemFromCart(actor, car_list);					
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static RemovedItemCartVerification in(Target target) {		
		return new RemovedItemCartVerification(target);
	}
	
}
