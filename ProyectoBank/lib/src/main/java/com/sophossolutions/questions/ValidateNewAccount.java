package com.sophossolutions.questions;

import java.util.List;

import com.sophossolutions.ui.AccountsPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.model.LastElement;

public class ValidateNewAccount implements Question {

	private Target strIdNewAccount;
	
	public ValidateNewAccount(Target strIdNewAccount) {
		this.strIdNewAccount = strIdNewAccount;
	}
	
	public static ValidateNewAccount withId(Target strIdNewAccount) {
		return new ValidateNewAccount(strIdNewAccount);
	}
	
	public  String answeredBy(Actor actor) {
		
		//Recorrer conjunto de elementos con Serenity
		/*List<WebElementFacade> dataAccounts = AccountsPage.TABLE_ACCOUNTS.resolveAllFor(actor);
		
		for(int i=1; i< dataAccounts.size(); i++) {
			List<WebElementFacade> dataAccount = AccountsPage.DATA_ACCOUNTS.of(String.valueOf(i)).resolveAllFor(actor);
			System.out.println(dataAccount.get(0).getText());
			System.out.println(dataAccount.get(1).getText());
			System.out.println(dataAccount.get(2).getText());
		}*/
		
		
		///VALIDO
		String strAccountNumber = actor.recall("ACCOUNT_NUMBER");
		actor.remember("ACCOUNT_BALANCE", Text.of(AccountsPage.ACCOUNT_BALANCE.of(strAccountNumber)).viewedBy(actor).asString());
		return Text.of(strIdNewAccount).viewedBy(actor).asString();	
	}

}
