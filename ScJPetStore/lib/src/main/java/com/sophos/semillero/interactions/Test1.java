package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.Map;

import com.sophos.semillero.tasks.AddToCart;
import com.sophos.semillero.tasks.SelectItem;
import com.sophos.semillero.tasks.AddThe;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Test1 implements Interaction {

	
	private Map<String,String> mapValues;
	

	public Test1(Map<String, String> mapValues) {
		this.mapValues = mapValues;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		for (int i = 0; i < mapValues.size(); i++) {
			String strCategoria = mapValues.get(i+"").split(",")[0];
			String strProductoId = mapValues.get(i+"").split(",")[1];
			String strItemId = mapValues.get(i+"").split(",")[2];
			
			actor.attemptsTo(SelectItem.with(strCategoria, strProductoId, strItemId),
					AddToCart.with(strCategoria, strProductoId, strItemId));		
		}
	}

	public static Test1 the(Map<String,String> mapValues) {
		return instrumented(Test1.class,mapValues);		
	}


}