package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.interactions.SaveModel;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class SaveModels implements Task {

	private String strInfo;
	private String strName;


	public SaveModels(String strInfo, String strName) {
		this.strInfo = strInfo;
		this.strName = strName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SaveModel.user(strInfo, strName));
	}
	
	public static SaveModels user(String strInfo,String strName){
		return instrumented(SaveModels.class,strInfo,strName);		
	}
}