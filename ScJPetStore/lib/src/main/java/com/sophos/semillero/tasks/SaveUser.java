package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.interactions.SaveModel;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class SaveUser implements Task {

	private String strInfo;
	private String strName;


	public SaveUser(String strInfo, String strName) {
		this.strInfo = strInfo;
		this.strName = strName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SaveModel.user(strInfo, strName));
	}
	
	public static SaveUser user(String strInfo,String strName){
		return instrumented(SaveUser.class,strInfo,strName);		
	}
}