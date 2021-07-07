package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.model.UserJPetStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SaveModels implements Task {

	private String strName;
	private Object objModel;


	public SaveModels(String strName,Object objModel) {
		this.strName = strName;
		this.objModel = objModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(strName,objModel);
	}
	
	public static SaveModels user(String strValue1,String strValue2,String strValue3,String strName) {
		String value=strValue1+strValue2+","+strValue3;
		String[] values=value.split(",");
		UserJPetStore dataUser=new UserJPetStore(values);
		return instrumented(SaveModels.class,strName,dataUser);		
	}


}