package com.sophossolutions.semillero.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;

import static  net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;


public class Login implements Task {
	
	private String userName;
	private String password;
	
	public Login(String username, String password) {
		this.userName = username;
		this.password = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(userName).into(LoginPage.TXT_USER_NAME),
				Enter.theValue(password).into(LoginPage.TXT_USER_PASWORD),
				Click.on(LoginPage.BTN_LOGIN)
				);
		actor.remember("TXT_TITLE_WELCOME", Text.of(HomePage.TXT_TITLE_PAGE).viewedBy(actor).asString());
		//HomePage.TXT_TITLE_PAGE.resolveFor(actor).getText().toString();
	}
	
	public static Login whitCredentials (String userName, String password) {
		return instrumented(Login.class, userName, password);
	}

}
