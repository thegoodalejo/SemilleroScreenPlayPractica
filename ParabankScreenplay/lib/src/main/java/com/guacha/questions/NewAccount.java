package com.guacha.questions;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class NewAccount implements Question<String>{
	
	// Check if the table in this XPath is present
	private final Target ACCOUNT_ID_HOLDER = Target.the("Account ID number").located(By.id("newAccountId"));
	public final Target CREATION_TITLE = Target.the("Page title").locatedBy("//h1");
	private final int SELECTOR;
	
	public NewAccount(int s) {
		this.SELECTOR = s;
	}
	
	
	@Override
	public String answeredBy(Actor actor) {
		if (this.SELECTOR == 1) {
			return ACCOUNT_ID_HOLDER.resolveFor(actor).getText();			
		} else {
			return this.CREATION_TITLE.resolveFor(actor).getText();
		}
	}
	
	public static NewAccount id() {
		return new NewAccount(1);
	}
	
	public static NewAccount title() {
		return new NewAccount(0);
	}

	
	

}
