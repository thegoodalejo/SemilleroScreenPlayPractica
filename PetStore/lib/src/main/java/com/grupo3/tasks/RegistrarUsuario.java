package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.model.Usuario;
import com.grupo3.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarUsuario implements Task
{
	private Usuario usuario;
	
	public RegistrarUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Enter.theValue(this.usuario.getStrUserId()).into(RegisterPage.TXT_USER_ID),
			Enter.theValue(this.usuario.getStrPassword()).into(RegisterPage.TXT_NEW_PASS),
			Enter.theValue(this.usuario.getStrPassword()).into(RegisterPage.TXT_REPEAT_PASS),
			Enter.theValue(this.usuario.getStrFirstName()).into(RegisterPage.TXT_FIRSTNAME),
			Enter.theValue(this.usuario.getStrLastName()).into(RegisterPage.TXT_LASTNAME),
			Enter.theValue(this.usuario.getStrEmail()).into(RegisterPage.TXT_EMAIL),
			Enter.theValue(this.usuario.getStrPhone()).into(RegisterPage.TXT_PHONE),
			Enter.theValue(this.usuario.getStrAdsress1()).into(RegisterPage.TXT_ADDRESS1),
			Enter.theValue(this.usuario.getStrAddress2()).into(RegisterPage.TXT_ADDRESS2),
			Enter.theValue(this.usuario.getStrCity()).into(RegisterPage.TXT_CITY),
			Enter.theValue(this.usuario.getStrState()).into(RegisterPage.TXT_STATE),
			Enter.theValue(this.usuario.getStrZip()).into(RegisterPage.TXT_ZIP),
			Enter.theValue(this.usuario.getStrCountry()).into(RegisterPage.TXT_COUNTRY)
			//,Click.on(RegisterPage.BTN_SAVE_ACOUNT)
			);
	}
	
	public static RegistrarUsuario withData(Usuario usuario)
	{
		return instrumented(RegistrarUsuario.class, usuario);
	}
}