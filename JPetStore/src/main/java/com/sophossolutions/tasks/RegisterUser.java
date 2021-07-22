package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.sophossolutions.ui.RegisterPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterUser implements Task
{
	private String strTypeAcount;
	
	public RegisterUser(String strTypeacount)
	{
		this.strTypeAcount = strTypeacount;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		String datos[] = strTypeAcount.split(",");
		//SelectFromOptions.byVisibleText(strTypeAcount).from(HomePage.TYPE_ACOUNT_OPTIONS
		actor.attemptsTo(Enter.theValue(datos[0]).into(TXT_USER),
				Enter.theValue(datos[1]).into(TXT_PASSWORD),
				Enter.theValue(datos[1]).into(TXT_REPEAT_PASSWORD),
				Enter.theValue(datos[0]).into(TXT_USER_NAME),
				Enter.theValue(datos[2]).into(TXT_USER_LASTNAME),
				Enter.theValue(datos[3]).into(TXT_EMAIL),
				Enter.theValue(datos[4]).into(TXT_PHONE),
				Enter.theValue(datos[5]).into(TXT_ADDRESS1),
				Enter.theValue(datos[6]).into(TXT_ADDRESS2),
				Enter.theValue(datos[7]).into(TXT_CITY),
				Enter.theValue(datos[8]).into(TXT_STATE),
				Enter.theValue(datos[9]).into(TXT_ZIP),
				Enter.theValue(datos[10]).into(TXT_COUNTRY),
				SelectFromOptions.byVisibleText(datos[11]).from(TXT_FAVORITE_CATEGORY));
	}
	
	public static RegisterUser with(String strTypeacount)
	{
		return instrumented(RegisterUser.class, strTypeacount);
	}

	
}