package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.RegisterAcount;
import com.sophossolutions.util.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterAcountTask implements Task
{
	private String strTypeAcount;
	
	public RegisterAcountTask(String strTypeAcount)
	{
		this.strTypeAcount = strTypeAcount;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Click.on(RegisterAcount.LINK_OPEN_ACOUNT),
			SelectFromOptions.byVisibleText(strTypeAcount).from(RegisterAcount.TYPE_ACOUNT_OPTIONS),
			SelectFromOptions.byIndex(2).from(RegisterAcount.NUMBER_ACOUNT_OPTIONS),
			Click.on(RegisterAcount.BTN_NEW_ACOUNT));
		actor.remember(Constants.REMEMBER, Text.of(RegisterAcount.NEW_ACOUNT).viewedBy(actor).asString());
	}
	
	public static RegisterAcountTask withType(String strTypeAcount)
	{
		return instrumented(RegisterAcountTask.class, strTypeAcount);
	}

	
}