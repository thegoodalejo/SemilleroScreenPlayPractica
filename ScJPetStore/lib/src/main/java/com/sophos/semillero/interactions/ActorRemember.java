package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
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
		String value = Text.of(target).viewedBy(actor).asString();
		actor.remember(strKey, value);
		
	}
	
	/**
     * Método que almacena en Actor el valor string de un elemento target.
     * @param strKey String del KEY_NAME del valor a guardar en el mapa del Actor.
     * @param target Elemento tipo Target a obtener su valor
     */
	public static ActorRemember value(String strKey, Target target) {
		return instrumented(ActorRemember.class, strKey, target);
	}

}
