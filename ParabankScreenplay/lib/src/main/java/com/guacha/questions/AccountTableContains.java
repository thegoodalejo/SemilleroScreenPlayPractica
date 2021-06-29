package com.guacha.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AccountTableContains implements Question<Boolean>{
	
	private final Target accountFinder;

	public AccountTableContains(String s) {
		this.accountFinder = Target.the("Account with given id").locatedBy(String.format("//td/a[text()='%s']", s));
	}
	
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return this.accountFinder.resolveAllFor(actor).size() > 0;
	}
	
	public static AccountTableContains accountWithId(String id) {
		return new AccountTableContains(id);
	}
	
	

}
