package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.Beginning;
import com.sophos.semillero.ui.OpenAccount;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Create implements Task{
	
	private String value1;
	private String value2;
	
	public Create (String value1,String value2) {
		this.value1=value1;
		this.value2=value2;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Beginning.BTN_CREATE_ACCOUNT),
				SelectFromOptions.byValue(value1).from(OpenAccount.BTN_TYPE_ACCOUNT),
				SelectFromOptions.byValue(value2).from(OpenAccount.BTN_NUM_ACCOUNT),
				Click.on(OpenAccount.BTN_OPEN));
	}
	
	public static Create with(String value1,String value2) {
		return instrumented(Create.class,value1,value2);
	}
}
