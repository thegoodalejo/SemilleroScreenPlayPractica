package com.sophossolutions.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.sophossolutions.ui.LoginBankPage;
import com.sophossolutions.interactions.VectorizeStrings;

public class LoginBank implements Task {
	
	private String strUserData;
	
	
	public LoginBank(String strUserData) {
		this.strUserData = strUserData;
	}
	
	public static LoginBank withCredetianl(String strUserData) {
		return Tasks.instrumented(LoginBank.class, strUserData);
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
			
			actor.attemptsTo(VectorizeStrings.of(strUserData));			
			actor.attemptsTo(Enter.theValue(actor.recall("STRING_VECTOR_0").toString()).into(LoginBankPage.TXT_USERNAME),
					Enter.theValue(actor.recall("STRING_VECTOR_1").toString()).into(LoginBankPage.TXT_PASSWORD),
					Click.on(LoginBankPage.BTN_LOGIN));
	}
	
	

}
