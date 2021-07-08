package com.sophossolutions.questions;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDataPetsFacture implements Question {

	private String strKeyDataPetsOrder;

	public ValidateDataPetsFacture(String strKeyDataPetsOrder) {
		super();
		this.strKeyDataPetsOrder = strKeyDataPetsOrder;
	}


	@Override
	public Object answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		List<List<String>> listDataPetsOrder = actor.recall(strKeyDataPetsOrder);
		List<List<String>> listDataPetsFacture = actor.recall("dataPetsFacture");
 
		return listDataPetsOrder.equals(listDataPetsFacture);
	}
	
	
	public static ValidateDataPetsFacture with(String strKeyDataPetsOrder) {
		return new ValidateDataPetsFacture(strKeyDataPetsOrder);
	}

}
