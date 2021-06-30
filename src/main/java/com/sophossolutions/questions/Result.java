package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Result implements Question<String>{
	
	private String xpath1;
	private String xpath2;
	private String xpath3;
	private String strNumCuenta;
	
	public Result(String xpath1, String xpath2, String xpath3, String strNumCuenta) {
		this.xpath1 = xpath1;
		this.xpath2 = xpath2;
		this.xpath3 = xpath3;
		this.strNumCuenta = strNumCuenta;
	}

	@Override
	public String answeredBy(Actor actor) {
		
		for (int i = 1; i < 100; i++) {
			
			Target ID_ACCOUNT_TABLE = Target.the("ID Account").locatedBy(xpath1+i+xpath2);
			Target AMOUNT_ACCOUNT_TABLE = Target.the("Amount Account").locatedBy(xpath1+i+xpath3);
			
			if (ID_ACCOUNT_TABLE.resolveFor(actor).getText().equals(strNumCuenta)) {
				System.out.println("Saldo de la cuenta "+ ID_ACCOUNT_TABLE.resolveFor(actor).getText() + ": " + AMOUNT_ACCOUNT_TABLE.resolveFor(actor).getText());
				return ID_ACCOUNT_TABLE.resolveFor(actor).getText();
			}
			
		}
		return "";
	}
	
	public static Result in(String xpath1, String xpath2, String xpath3, String strNumCuenta) {
		return new Result(xpath1,xpath2,xpath3,strNumCuenta);
	}

}
