package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import com.sophossolutions.ui.NewAccountPage;
import com.sophossolutions.interactions.VectorizeStrings;
import com.sophossolutions.ui.AccountsPage;

public class NewAccount implements Task {
	
	private String strAccountData;
	
	 public NewAccount(String strAccountData) {
		 this.strAccountData = strAccountData;
	 }
	 
	 public static NewAccount withData(String strAccountData) {
		 return Tasks.instrumented(NewAccount.class, strAccountData);
	 }

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(VectorizeStrings.of(strAccountData));
		actor.attemptsTo(Click.on(NewAccountPage.BTN_OPENACCOUNT),
				SelectFromOptions.byVisibleText(actor.recall("STRING_VECTOR_0")).from(NewAccountPage.SELECT_TYPEACCOUNT),
				SelectFromOptions.byIndex(Integer.parseInt(actor.recall("STRING_VECTOR_1"))).from(NewAccountPage.SELECT_EXISTINGACCOUNT),
				Click.on(NewAccountPage.BTN_NEWACCOUNT));
		
		actor.remember("ACCOUNT_NUMBER", Text.of(NewAccountPage.TEXT_IDNEWACCOUNT).viewedBy(actor).asString());
		
		actor.attemptsTo(Click.on(NewAccountPage.BTN_ACCOUNTS));
	}

}
