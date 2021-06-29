package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.Beginning;
import com.sophos.semillero.ui.OpenAccount;
import com.sophos.semillero.ui.OverviewP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Overview implements Task{

	
	public Overview () {
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OverviewP.BTN_OVERVIEW));
	}
	
	public static Overview with() {
		return instrumented(Overview.class);
	}
}
