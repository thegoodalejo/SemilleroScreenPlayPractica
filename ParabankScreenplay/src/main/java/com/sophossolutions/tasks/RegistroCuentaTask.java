package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.RegisterAcount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistroCuentaTask implements Task
{
	private String strAcount;
	
	public RegistroCuentaTask(String strAcount)
	{
		this.strAcount = strAcount;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Click.on(RegisterAcount.LINK_OPEN_ACOUNT),
			SelectFromOptions.byVisibleText("SAVINGS").from(RegisterAcount.TYPE_ACOUNT_OPTIONS),
			SelectFromOptions.byValue(strAcount).from(RegisterAcount.NUMBER_ACOUNT_OPTIONS),
			Click.on(RegisterAcount.BTN_NEW_ACOUNT));
	}
	
	public static RegistroCuentaTask in (String numeroCuenta )
	{
		return instrumented(RegistroCuentaTask.class, numeroCuenta);
	}

	
}