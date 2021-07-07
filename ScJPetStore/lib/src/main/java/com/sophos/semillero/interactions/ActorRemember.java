package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.model.UserJPetStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ActorRemember implements Interaction {

	private String strKey;
	private Target target;
	
	public ActorRemember(String strKey, Target target) {
		this.strKey = strKey;
		this.target = target;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		if(target!=null) {
		actor.remember(strKey, target);}
		
	}
	
	public static ActorRemember value(String strKey, Target target) {
		return instrumented(ActorRemember.class, strKey, target);
	}
	

}
