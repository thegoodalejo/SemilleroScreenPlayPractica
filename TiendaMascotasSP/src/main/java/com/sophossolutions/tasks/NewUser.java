package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.model.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import com.sophossolutions.ui.RegisterPage;

public class NewUser implements Task{
	
	RegisterUser UserModel = new RegisterUser ("TiendaMascotasGrupo_5",
												"grupo5", "Andres", "Guarnizo",
												"andres.lopez@sophossolutions.com",
												"3131234567", "Carrera 31 C 19 A las",
												"", "Bogota", "Cundinamerca", "12", "Colombia");
	
		@Override
	public <T extends Actor> void performAs(T actor) {
	   
		actor.attemptsTo(
				Enter.theValue(UserModel.getStrUserID()).into(RegisterPage.TXT_USERNAME),
				Enter.theValue(UserModel.getStrNewPass()).into(RegisterPage.TXT_PASSWORD),
				Enter.theValue(UserModel.getStrNewPass()).into(RegisterPage.TXT_PASSWORD2),
				Enter.theValue(UserModel.getStFirstName()).into(RegisterPage.TXT_FIRSTNAME),
				Enter.theValue(UserModel.getStrLastName()).into(RegisterPage.TXT_LASTNAME),
				Enter.theValue(UserModel.getStrEmail()).into(RegisterPage.TXT_EMAIL),
				Enter.theValue(UserModel.getStrPhone()).into(RegisterPage.TXT_PHONE),
				Enter.theValue(UserModel.getStrAddress1()).into(RegisterPage.TXT_ADDRESS1),
				Enter.theValue(UserModel.getStrCity()).into(RegisterPage.TXT_CITY),
				Enter.theValue(UserModel.getStrState()).into(RegisterPage.TXT_STATE),
				Enter.theValue(UserModel.getStrZip()).into(RegisterPage.TXT_ZIP),
				Enter.theValue(UserModel.getStrCountry()).into(RegisterPage.TXT_COUNTRY));
				
	}
	public static NewUser withValues() {

		return instrumented(NewUser.class);
	}
	

}
