package com.sophossolutions.questions;

import com.sophossolutions.models.AccountModel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDataAccountFacture implements Question {

	private String dataAcccountFacture;

	public ValidateDataAccountFacture(String dataAcccountFacture) {
		super();
		this.dataAcccountFacture = dataAcccountFacture;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		AccountModel dataAcccountFacture1 = actor.recall(dataAcccountFacture);
		AccountModel dataCurrentAccountOrder = actor.recall("dataCurrentAccountOrder");

		if (dataAcccountFacture1.getStrAddress1().equals(dataCurrentAccountOrder.getStrAddress1())
				&& dataAcccountFacture1.getStrAddress2().equals(dataCurrentAccountOrder.getStrAddress2())
				&& dataAcccountFacture1.getStrFirstName().equals(dataCurrentAccountOrder.getStrFirstName())
				&& dataAcccountFacture1.getStrLastName().equals(dataCurrentAccountOrder.getStrLastName())
				&& dataAcccountFacture1.getStrCity().equals(dataCurrentAccountOrder.getStrCity())
				&& dataAcccountFacture1.getStrState().equals(dataCurrentAccountOrder.getStrState())
				&& dataAcccountFacture1.getStrCountry().equals(dataCurrentAccountOrder.getStrCountry())
				&& dataAcccountFacture1.getStrZip().equals(dataCurrentAccountOrder.getStrZip())) {
			return true;

		} else {
			return false;
		}
	}

	public static ValidateDataAccountFacture with(String dataAcccountFacture) {
		return new ValidateDataAccountFacture(dataAcccountFacture);
	}

}
