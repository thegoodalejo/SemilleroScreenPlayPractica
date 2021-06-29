package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

import com.sophossolutions.ui.NewAccountPage;

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
		String[] strAccountData1 = strAccountData.toString().split("-");
		actor.attemptsTo(Click.on(NewAccountPage.BTN_OPENACCOUNT),
				SelectFromOptions.byVisibleText(strAccountData1[0]).from(NewAccountPage.SELECT_TYPEACCOUNT),
				SelectFromOptions.byVisibleText(strAccountData1[1]).from(NewAccountPage.SELECT_EXISTINGACCOUNT),
				Click.on(NewAccountPage.BTN_NEWACCOUNT));
		NewAccountPage.strNumberAccount = Text.of(NewAccountPage.TEXT_IDNEWACCOUNT).viewedBy(actor).asString();
		actor.attemptsTo(Click.on(NewAccountPage.BTN_ACCOUNTS));		
	}

}
