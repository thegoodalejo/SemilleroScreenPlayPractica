package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class VectoriceString implements Interaction {

	private Target strText; 
	private String strKey;
	
	public VectoriceString(Target strText, String strKey) {
		super();
		this.strText = strText;
		this.strKey = strKey;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		String[] arrayText = (Text.of(strText).viewedBy(actor).asString()).split(" ");
		actor.remember(strKey, arrayText);
	}
	
	public static VectoriceString with(Target strText, String strKey) {
		return Tasks.instrumented(VectoriceString.class, strText, strKey);
	}

}
