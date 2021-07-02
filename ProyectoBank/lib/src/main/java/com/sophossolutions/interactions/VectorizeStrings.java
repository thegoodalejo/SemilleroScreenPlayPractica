package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class VectorizeStrings implements Interaction{
	
	private String strTexto;
	

	public VectorizeStrings(String strTexto) {
		super();
		this.strTexto = strTexto;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		// Almacena los elementos de una cadena
		
		String[] strVector= strTexto.split("-");
		
		for(int i=0; i< strVector.length;i ++ ) {
			String strKey = "STRING_VECTOR_"+i;
			actor.remember(strKey, strVector[i]);
		}
	}
	
	
	public static VectorizeStrings of(String strTexto) {
		return new VectorizeStrings(strTexto);
	}

}
