package com.sophos.semillero.questions;

import com.sophos.semillero.interactions.Validation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class OrderVerification implements Question<Boolean> {

	private Target orderList;
	
	
	public OrderVerification(Target car_list) {
		this.orderList = car_list;
	}

	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			
			return Validation.orderInvoice(actor, orderList);				
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static OrderVerification in(Target target) {		
		return new OrderVerification(target);
	}
	
}