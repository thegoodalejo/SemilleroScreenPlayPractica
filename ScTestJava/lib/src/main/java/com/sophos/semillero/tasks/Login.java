package com.sophos.semillero.tasks;


import com.sophos.semillero.ui.ParaBankLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task{

	
	private String Usuario;
	private String Password;

	
	public Login (String usuario, String password) {		
		this.Usuario = usuario;
		this.Password = password;	
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(Usuario).into(ParaBankLoginPage.TXT_USER),
				Enter.theValue(Password).into(ParaBankLoginPage.TXT_PASSWORD),
				Click.on(ParaBankLoginPage.BTN_LOGIN));		
		
	}
	
	public static Login in (String usuario ,String password ) {
		return instrumented(Login.class, usuario,password);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}