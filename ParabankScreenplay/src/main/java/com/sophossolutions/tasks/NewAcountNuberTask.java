package com.sophossolutions.tasks;

import com.sophossolutions.questions.NumberAcount;
import com.sophossolutions.ui.RegisterAcount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class NewAcountNuberTask implements Task
{
	private Target acountNumber;
	
	public NewAcountNuberTask(Target acountNumber)
	{
		this.acountNumber = acountNumber;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		NumberAcount.acountNumber = Text.of(acountNumber).viewedBy(actor).asString();
		System.out.println(NumberAcount.acountNumber);
		actor.attemptsTo(Click.on(RegisterAcount.LINK_ACOUNT_LIST));
	}
	
	public static NewAcountNuberTask in (Target acountNumber)
	{
		return instrumented(NewAcountNuberTask.class, acountNumber);
	}
}